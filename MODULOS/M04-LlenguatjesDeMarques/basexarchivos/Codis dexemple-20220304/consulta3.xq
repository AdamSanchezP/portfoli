(:Mostrar els llibres el preu dels quals sigui menor o igual a 30 mitjançant un predicat XPath:)
for $llibre in doc("bookstore.xml")/bookstore/book[price<=30]
return $llibre
