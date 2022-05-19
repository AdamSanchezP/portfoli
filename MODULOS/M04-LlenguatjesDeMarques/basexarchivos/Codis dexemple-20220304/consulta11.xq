(:Mostrar el preu mínim i màxim dels llibres.:)
(:la funció max retorna el valor màxim dels nodes resultants de l'expressió passada per paràmetre:)
(:la funció min retorna el valor mínim dels nodes resultants de l'expressió passada per paràmetre:)
let $max := max(doc("bookstore.xml")/bookstore/book/price), 
    $min := min(doc("bookstore.xml")/bookstore/book/price)
return
<resultat>
  <max>{$max}</max>
  <min>{$min}</min>
</resultat>