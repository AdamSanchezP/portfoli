(:Mostrar els anys de publicació utilitzant "let". Etiquetar la sortida amb "publicacio".:)
(:A diferència de for, guarda tots els resultats en la variable que l'acompanya, en el nostre cas $any:)
let $year := doc("bookstore.xml")/bookstore/book/year 
return <publicacio>{$year}</publicacio>