(:Mostrar tots els anys en què s'ha publicat un llibre eliminant els repetits, etiquetats amb "any":)

(:La funció distinct-values elimina els nodes repetits que retorna l'expressió XPath passada per paràmetre:)

for $any in distinct-values(doc("bookstore.xml")/bookstore/book/year)
return <any>{$any}</any>