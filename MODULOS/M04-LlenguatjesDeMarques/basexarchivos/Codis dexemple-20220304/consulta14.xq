(:Mostrar cadascun dels preus dels llibres, i al final una nova etiqueta amb la suma dels preus.:)

(:Podem fer més d'una consulta dins d'una mateixa consulta si són el resultat d'aquesta. Cada consulta ha d'estar dins de claus:)

<llibres>

{
  (:Pimera consulta:)
  
  for $llibre in doc("bookstore.xml")/bookstore/book
  return $llibre/price
}

{
  (:Segona consulta:)
  
  let $llibres := doc("bookstore.xml")/bookstore/book
  return <total>{sum($llibres/price)}</total>
}

</llibres>