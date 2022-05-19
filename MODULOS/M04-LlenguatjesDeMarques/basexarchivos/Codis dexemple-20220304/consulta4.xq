(:Mostrar només el títol dels llibres el preu dels quals sigui menor o igual a 30:)
for $llibre in doc("bookstore.xml")/bookstore/book
where $llibre/price <= 30
return <titol>{$llibre/title/text()}</titol>
