(:Mostrar els llibres escrits en anys que acabin en "3".:)

(:El predicat XPath ends-with, retorna els nodes resultants de l'expressió passada com a primer paràmetre, que finalitzen amb el valor passat com a segon paràmetre:)

for $llibre in doc("bookstore.xml")/bookstore/book
where ends-with($llibre/year, "3")
return $llibre