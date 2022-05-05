use plantes;

/*1. Mostra el nom popular de les plantes que solament tenim un exemplar.*/

SELECT pl.nom_popular FROM planta pl, exemplar_planta ep where pl.nom_cientific=ep.nom_planta and num_exemplar=1 group by(ep.nom_planta) having ep.nom_planta=1;
select * from exemplar_planta;

/*2. Mostra el nom popular de les plantes les quals no tenim exemplars.*/

SELECT distinct pl.nom_popular FROM planta pl, exemplar_planta ep where pl.nom_cientific=ep.nom_planta and pl.nom_popular not in (select nom_planta from exemplar_planta);
select * from planta;

/*3. Mostra les vegades que hem d’abonar les plantes en cada estació.*/
select nom_planta, nom_estacio, count(nom_estacio) from dosi_adob group by nom_estacio;

/*4. Mostra el nom popular i el nombre d’exemplars de les plantes d’interior que necessiten 17 graus de temperatura i totes les d’exterior.*/

select pl.nom_popular, count(pi.nom_planta) from planta pl, planta_interior pi, planta_exterior pe where pl.nom_cientific=pi.nom_planta  ;

/*5. Mostra quines plantes no reben adob a la primavera.*/

select distinct nom_planta from dosi_adob where nom_estacio not in (select nom_estacio from dosi_adob where nom_estacio="Primavera");

/*6. Mostra quants mètodes de reproducció té cada planta.*/

select nom_planta, count(metode_reproduccio) from reproduccio group by nom_planta;

/*7. Mostra quants mètodes de reproducció té cada planta amb un grau d'èxit alt.*/

select*from reproduccio;
select nom_planta, count(metode_reproduccio) from reproduccio where grau_exit="Alt" group by nom_planta ;

/*8. Mostra quines plantes no es reprodueixen per 'Esqueix'*/

select*from reproduccio;
select distinct nom_planta from reproduccio where nom_planta not in (select nom_planta from reproduccio where metode_reproduccio="Esqueix"); 

/*9. Mostra quines plantes d'interior floreixen a la 'Primavera'*/

select*from planta_interior;
select pi.nom_planta from planta_interior pi, planta pl where pl.floracio="Primavera" and pl.nom_cientific=pi.nom_planta;

/*10. Mostra quants adobs té cada fima comercial.*/

select * from adob;
select nom_firma, count(nom_adob) from adob group by nom_firma;