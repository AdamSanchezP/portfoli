for $nom in doc("parc.xml")/parc/atraccions/zona/atraccio

where $nom/edatMinima<=10

return concat("Nom Atraccio"," :",$nom/@nom)