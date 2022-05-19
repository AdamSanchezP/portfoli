(:Mostrar els títols dels llibres i al final una etiqueta amb el nombre total de llibres:)
(:Let pot contenir més d'una variable per assignar-lis diferents valors separades per una coma:)
let $total := count (doc("bookstore.xml")/bookstore/book),
    (:En aquest cas el valor que li assignem a la variable és el resultat d'una consulta:)
    $titols := (
      for $llibre in doc("bookstore.xml")/bookstore/book/title 
      return <titol>{$llibre/text()}</titol>
    ) 
return 
      <resultat>
        {$titols}
        <totalLlibres>{$total}</totalLlibres>
      </resultat>