(:Mostrar els anys de publicació utilitzant "for". Etiquetar la sortida amb "publicacio".:)
for $any in doc("bookstore.xml")/bookstore/book/year
return <publicacio>{$any}</publicacio>