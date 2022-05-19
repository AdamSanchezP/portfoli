(:Insertem un nou element a la base de dades amb el nom de la llibreria:)
(:Insertem el node que hi ha a continuació de "node" en l'última posició del contingut del node que em retorna l'expressió XPath que hi ha a continuació de "into":)
(:Com només hi ha un element bookstore ho podem fer la iserció directament, sino hauriem d'indicar exactament en quin element de tipus bookstore volem inserir-ho :)

insert node <nom>Nom de la llibreria</nom> into doc("bookstore.xml")/bookstore