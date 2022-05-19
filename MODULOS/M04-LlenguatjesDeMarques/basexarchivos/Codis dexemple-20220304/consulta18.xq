(:Mostrar el títol i el nombre de caràcters que té cada títol, cadascun amb la seva pròpia etiqueta.:)

for $llibre in doc("bookstore.xml")/bookstore/book
return 
(:La funció string-length, retorna els nombre de caràcterss dels nodes resultants de l'expressió XPath    	passada per paràmetre:)
  <llibre>
    {$llibre/title}
    <length>{string-length($llibre/title)}</length>
  </llibre>