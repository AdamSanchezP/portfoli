use bdpropia;
/*Mostra a quina sala es fa la pel·licula "El mago de OZ" i mostra també quants seients té aquesta sala*/

select id, seients from sales, reprodueixen where nom_pel·licula="El mago de OZ" and id=id_sala;

/*Mostra el dni del client que anira a veure la pel·licula "El padrino"*, tambe has de mostrar el genere d'aquesta pel·licula*/

select dni_clients, Génere from pel·licules, veure where nom_peli="El padrino" and nom_peli=nom;

/*Digues el nom del actor que actua a la pelicula el padrino 2 */
select nom from actors, actuen where nom_pelis="El padrino: Parte II" and id_actors=ID;

/*Mostra els seients i el id de sala que la direccio del edifici es 'mare de deu de la merce 94', mostra tambe tots els dni dels clients amb tots els generes de pelicules que tenim al nostre cinema*/

select seients, ID from Sales, Edifici where direccio_edifici='mare de deu de la merce 94' and direccio_edifici=direccio union select dni_clients, nom from veure, pel·licules where nom_peli=nom;

/*Mostra el nom y el telefon del client que tingui una reserva a la sala 1*/

select nom, telefon from clients, reserva where id_sales=1 and DNI=dni_clients;

/*Mostra la quantitat de clients que es diuen "Adam Sánchez Portero", y la pelicula que anira a veure el primer*/
select count(nom), nom_peli from clients, veure where DNI=dni_clients GROUP BY nom;

