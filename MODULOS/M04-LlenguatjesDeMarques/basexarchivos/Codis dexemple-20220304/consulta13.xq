(:Mostrar la suma total dels preus dels llibres amb l'etiqueta "total":)
let $llibres := doc("bookstore.xml")/bookstore/book
(:La funció sum suma els valors de tots els nodes per l'expressió passade per paràmetre:)
return <total>{sum($llibres/price)}</total>