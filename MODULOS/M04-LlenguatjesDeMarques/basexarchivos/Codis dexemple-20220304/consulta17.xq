(:Mostrar els llibres que tinguin una "X" majúscula o minúscula en el títol ordenats de manera descendent.:)

for $llibre in doc("bookstore.xml")/bookstore/book
(:El predicat XPath contains, retorna els nodes resultants de l'expressió passada com a primer paràmetre, que contenen el valor passat com a segon paràmetre:)
where contains($llibre/title, "x") or contains($llibre/title, "X")
(:Si volem que l'ordre sigui descendent, afegim la paraula reservada descending:)
order by $llibre/title descending 
return $llibre