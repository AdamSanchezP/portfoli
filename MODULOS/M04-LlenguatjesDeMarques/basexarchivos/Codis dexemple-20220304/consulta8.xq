(:Mostrar els llibres ordenats primer per "category" i després per "title" en una sola consulta.:)
for $llibre in doc("bookstore.xml")/bookstore/book
(:Ordena els resultats primer per la primera expressió XPath i després per la segona, així tantes expressions com vulguem separades per una coma:)
order by $llibre/@category,$llibre/title 
return $llibre