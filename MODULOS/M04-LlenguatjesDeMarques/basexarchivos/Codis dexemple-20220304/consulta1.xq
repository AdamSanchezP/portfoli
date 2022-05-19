(:Mostrar els títols dels llibres amb l'element "title":)
(:Amb el for fem un recorregut dels nodes de l'expressió XPath posterior a l'in:)
for $titol in doc("bookstore.xml")/bookstore/book/title/text() 
(:Retorn de la consulta. A diferència de SQL, nosaltres decidim quin serà aquest retorn que no té perquè veure amb la consulta feta.:)
return <titol>{$titol}</titol>(:Entre claus posem els valors de la variable que volem que es retornin:)

