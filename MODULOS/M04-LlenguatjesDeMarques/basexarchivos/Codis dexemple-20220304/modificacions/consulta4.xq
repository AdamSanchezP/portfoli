(:Insertem un nou author Xesca Tomás en els llibres de preu igual o inferior a 30 després de l'autor que ja tenen:)

for $llibre in doc("bookstore.xml")/bookstore/book
where $llibre/price <= 30
return
(:"after" indica que la inserció ha de ser abans del node que el segueix:)
insert node <author>Xesca Tomás</author> after $llibre/author