/*1.Mostra quins pilots no han pujat mai al podium (1a, 2a i 3a posició).*/

select distinct pi.nombre from pilotos pi, resultados re where re.puesto not in (1,2,3) and pi.codigo=re.codpiloto;

/*2.Mostra quins pilots, i en quina cursa, han quedat en última posició (sense tenir en compte els abandonaments).*/

select pi.nombre, re.nombregp, max(puesto) from pilotos pi, resultados re where pi.codigo=re.codpiloto and distanciaganador not in ("Abandono") group by re.nombregp ;

/*3.Mostra el dissenyador, en el cas de què es sàpiga, del circuit amb major longitud.*/

select disenyador, longitud from circuitos  group by disenyador order by longitud desc limit 1;

/*4.Mostra el nom dels pilots i la seva escuderia d'aquells que han quedat primers més d'un cop.*/
select pi.nombre, pi.nombreescuderia from pilotos pi,  resultados re where pi.codigo=re.codpiloto and re.puesto>=( select count(puesto) from resultados where puesto=1);