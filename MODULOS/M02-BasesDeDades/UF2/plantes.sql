use plantes;
select nom_popular from  planta, estacio where floracio='Estiu' and num_exemplar<=1;
select * from planta;

select nom_cientific, tipus_planta from planta, planta_exterior where floracio='Primavera' and nom_planta=nom_cientific;

select*from planta_exterior;

select pl.nom_planta , da.quantitat_adob from  planta_exterior pl ,  dosi_adob da ,  adob a , planta p   where a.nom_firma='CIRSADOB'and pl.nom_planta=p.nom_cientific and a.nom_adob=da.nom_adob; 

/*De les plantes que utilitzen adobs de la firma UOCADOB, mostra el nom popular i entre parèntesi la quantitat
d’adob utilitzat (el resultat l'ha de mostrar en un sol camp).*/

select concat(pl.nom_popular,'(',da.quantitat_adob,')')  from planta pl, dosi_adob da, adob a where a.nom_firma='UOCADOB' AND pl.nom_cientific=da.nom_planta and da.nom_adob=a.nom_adob; 

/*Mostra el nom popular i les mètodes de reproducció de les plantes que tenen la floració al hivern*/

/*Mostra el nom popular i la estació de floració de les plantes que utilitzen més de 40 unitats d’adob.*/
select pl.nom_popular, pl.floracio from planta pl, dosi_adob da, adob a where  pl.nom_cientific=da.nom_planta and da.nom_adob=a.nom_adob and da.quantitat_adob>40;
/*Mostra el nom popular de les plantes d’interior que necessiten llum indirecta i les plantes d’exterior que són de temporada.*/

/*Mostra el nom científic i l’estació de floració de les plantes que tenim algun exemplar.*/
select pl.nom_cientific, pl.floracio from planta pl, exemplar_planta epl where epl.num_exemplar>1 and pl.nom_cientific=epl.nom_planta; 

/*Mostra l’adob i la firma comercial que el comercialitza de les plantes que reben una quantitat d’adob entre 20 i
40 unitats (inclosos).*/

select distinct a.nom_adob, a.nom_firma from adob a, dosi_adob da where da.quantitat_adob >=20 and da.quantitat_adob <=40 and  a.nom_adob=da.nom_adob;

/*Mostra en majúscules el nom popular de les plantes que tenim exemplars que utilitzen adobs d’acció immediata.*/


select upper(pl.nom_popular) from planta pl, adob a, exemplar_planta epl, dosi_adob da where num_exemplar>=1 and tipus_adob='AI' and pl.nom_cientific=epl.nom_planta and  pl.nom_cientific=da.nom_planta and da.nom_adob=a.nom_adob;

/*Mostra el nom popular i la ubicació de les plantes d’interior de les que tenim algun exemplar.*/

select pl.nom_popular, pi.ubicacio  from planta pl, planta_interior pi, exemplar_planta ep where ep.num_exemplar>1 and pl.nom_cientific=pi.nom_planta and pl.nom_cientific=ep.nom_planta;

/*Mostra el nom popular, l’adob i la quantitat d’aquest més 10 unitats, de les plantes que utilitzen un adob de la
firma PRISADOB o que la quantitat és menor o igual a 30 unitats.*/

select distinct pl.nom_popular, da.nom_adob, da.quantitat_adob+10, a.nom_firma from planta pl, adob a, dosi_adob da where a.nom_firma='PRISADOB' OR da.quantitat_adob<=30 and pl.nom_cientific=da.nom_planta and da.nom_adob=a.nom_adob;

/*Mostra el nom popular de les plantes que utilitzen un adob de acció immediata i que floreixen a la primavera.*/

select pl.nom_popular from planta pl, adob a, dosi_adob da where pl.floracio='primavera'and pl.nom_cientific=da.nom_planta and da.nom_adob=a.nom_adob and a.tipus_adob='AI';

/*Mostra les estacions de floració de les quals tenim algun exemplar de planta.*/

select distinct pl.floracio from planta pl, exemplar_planta epl where pl.nom_cientific=epl.nom_planta;

/*Mostra el nom popular, el mètode de reproducció i la primera lletra del grau d’èxit de les plantes que no tenen un
grau d’èxit alt.*/

select pl.nom_popular, r.metode_reproduccio, left(r.grau_exit,1) from planta pl, reproduccio r where pl.nom_cientific=r.nom_planta and r.grau_exit!='ALT';

/*Mostra el nom de les plantes que se’ls hi ha afegit adob en la mateixa estació que la seva floració.*/

select distinct da.nom_planta from dosi_adob da, estacio es, planta pl where da.nom_estacio=pl.floracio and da.nom_estacio=es.nom_estacio and es.nom_estacio=pl.floracio;

select distinct*from dosi_adob;


