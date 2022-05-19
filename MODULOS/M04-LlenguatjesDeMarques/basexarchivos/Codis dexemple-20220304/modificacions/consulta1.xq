(:Insertem un nou author Xesca Tomás en els llibres de preu igual o inferior a 30:)

for $llibre in doc("bookstore.xml")/bookstore/book
where $llibre/price <= 30
return
(:Com hi ha més d'un element de tipus book, mitjançant el "for" indiquem que volem fer la inserció en més d'un llibre i amb "where", indiquem en quins llibres volem fer la inserció:)
insert node <author>Xesca Tomás</author> into $llibre