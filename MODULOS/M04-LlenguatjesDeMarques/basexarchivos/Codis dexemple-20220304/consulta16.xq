(:Mostrar els llibres la categoria dels quals comenci per "C".:)

(:El predicat XPath starts-with, retorna els nodes resultants de l'expressió passada com a primer paràmetre, que comencen amb el valor passat com a segon paràmetre:)

for $llibre in doc("bookstore.xml")/bookstore/book
where starts-with($llibre/@category, "C")
return $llibre