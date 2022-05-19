(:Eliminem tots els autors "Xesca Tomás" dels llibres de la llibreria:)

for $author in doc("bookstore.xml")/bookstore/book/author
where $author/text()="Xesca Tomás"
return
delete node doc("bookstore.xml")/bookstore/book/$author