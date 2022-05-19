(:Insertem un nou element <editorial> amb l'editorial "Bloomsbury Publishing" abans de l'element preu en el llibre "Harry Potter":)

let $llibre :=  doc("bookstore.xml")/bookstore/book[title/text()="Harry Potter"]
return
(:"before" indica que la inserció ha de ser després del node que el segueix:)
insert node <editorial>Bloomsbury Publishing</editorial> before $llibre/price