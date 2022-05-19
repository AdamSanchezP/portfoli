(:Mostrar els llibres el preu dels quals sigui menor o igual a 30 mitjançant una condició en la clàusula "where":)
for $llibre in doc("bookstore.xml")/bookstore/book
where $llibre/price <= 30
return $llibre
