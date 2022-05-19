(:Mostrar el títol dels llibres, el seu preu i el seu preu amb l'IVA inclòs, cadascun amb la seva pròpia etiqueta i ordenats per preu amb IVA.:)
for $llibre in doc("bookstore.xml")/bookstore/book
let $preuIva := ($llibre/price * 1.21)
order by $preuIva
return 
<llibre>
  <titol>{$llibre/title/text()}</titol>
  <preu>{$llibre/price/text()} €</preu>
  <preuIva>{$preuIva} €</preuIva>
</llibre>

(:Una altra manera de fer-ho sense el let:)

(:
for $llibre in doc("bookstore.xml")/bookstore/book
order by $llibre/price * 1.21
return 
<llibre>
  <titol>{$llibre/title/text()}</titol>
  <preu>{$llibre/price/text()} €</preu>
  <preuIva>{$llibre/price * 1.21} €</preuIva>
</llibre>
:)