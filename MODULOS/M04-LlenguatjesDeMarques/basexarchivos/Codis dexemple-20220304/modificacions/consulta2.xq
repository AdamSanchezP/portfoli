(:Afegim un nou autor Xesca Tomás en l'últim llibre de la base de dades:)
(:Com hi ha més d'un element de tipus book, mitjançant el predicat XPath que indica la posició que ocupa el llibre, indiquem en quin llibre volem fer la inserció, en aquest cas en el llibre que ocupa la posició 4 què és l'últim llibre:)

insert node <author>Xesca Tomás</author> into doc("bookstore.xml")/bookstore/book[4]