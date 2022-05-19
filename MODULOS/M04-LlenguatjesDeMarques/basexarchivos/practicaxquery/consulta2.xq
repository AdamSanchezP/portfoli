for $forta in doc("parc.xml")/parc/atraccions/zona/atraccio
where ($forta/edatMinima>=12 and $forta/edatMinima/@adult="no" and $forta/intensitat="Forta")
return concat("Nom atraccio :",$forta/@nom)