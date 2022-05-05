/*Mostra el nom dels pilots, de les escuderies amb seu a Itàlia, i que hagin guanyat més d'una carrera.*/
use motogp;
select p.nombre, count(r.puesto) from pilotos p, escuderias e, resultados r where e.nombre=p.nombreescuderia and r.puesto>1 and p.codigo=r.codpiloto and e.sede like ("%(Italia)") group by r.puesto having count(r.puesto=1)>1 ;

/*Mostra els pilots, i les seves corresponents escuderies, i el nombre de carreres guanyades, d'aquells pilots que han guanyat més d'una carrera celebrada a partir de les 15:00h*/



/*Mostra el número de pilots de cada escuderia, incloent les que no tinguin cap*/

select e.nombre, count(p.codigo) from escuderias e, pilotos p where e.nombre=p.nombreescuderia   group by e.nombre

union

select e.nombre , count(p.codigo) from escuderias e, pilotos p where e.nombre=p.nombreescuderia ;

/*8.Mostra quina nacionalitat/s hi ha més pilots.*/
select p.nacionalidad, count(p.nacionalidad) from pilotos p group by p.nacionalidad;

/*7.Mostra amb quina/es quines escuderia/es s’han guanyat més curses*/

select p.nombreescuderia, count(r.puesto)from  pilotos p, resultados r where r.puesto=1 and p.codigo=r.codpiloto group by p.nombreescuderia;

/*5. Mostra el nom i l'any de debut (solament l'any) del pilot que ha guanyat més grans premis.*/

select p.nombre, right(p.carreradebut, 4) from resultados r, pilotos p where p.codigo=r.codpiloto and r.puesto=1 group by p.nombre order by count(r.puesto)  desc limit 1;

/*6.Mostra el nom dels pilots que han arribat en més de 10 segons de diferència del guanyador en la cursa del 2010 que s'han recorregut menys voltes.*/

select p.nombre from pilotos p, resultados r, carreras c where p.codigo=r.codpiloto and r.anyo=c.año and r.nombregp=c.nombregp and c.año=2010 and numvueltas=(select min(numvueltas) from carreras) and distanciaganador>"00:10.00"  group by p.nombre ;

/*9.Explica quines dades mostra la següent consulta:*/
select distinct c.nombrecircuito from resultados r, carreras c
where (r.nombregp=c.nombregp) and (c.año=r.anyo) and (r.puesto=1) and r.codpiloto NOT IN (select codigo from pilotos
where nacionalidad='Española');

/*10.Afegeix una taula a la BD:*/

create table mecanicos (

nombre varchar(30) primary key,

escuderia varchar(30),

primary key(nombre),

foreign key (escuderia) references Escuderias(nombre)

);