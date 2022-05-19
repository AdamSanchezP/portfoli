(:Mostrar el títol i l'autor dels llibres de l'any 2005, i etiquetar cadascun d'ells amb "lib2005".:)
for $llibre in doc("bookstore.xml")/bookstore/book
where $llibre/year=2005
return <lib2005>{$llibre/title,$llibre/author}</lib2005> (:també és vàlid {$llibre/title}{$llibre/author}:)
