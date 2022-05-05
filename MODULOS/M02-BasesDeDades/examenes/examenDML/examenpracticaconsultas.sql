use hospital;

/*1. Mostra per a cada àrea el número total d'infermes i el total de metges que té.*/

select a.numArea, count(inf.codInf), count(me.codMetge) from area a, infermer inf, metge me group by (a.numArea);

/*2. Mostra quin ha sigut el diagnòstic més freqüent durant el mes de març.*/

select  vi.diagnostic  from visita vi where month(data)=03  group by vi.diagnostic order by count(vi.diagnostic) desc limit 1;

/*3. Mostra el pacient i el número de proves que s'ha fet, el pacient que més visities ha tingut.*/

 select pa.dni, count(re.dniPac) from pacient pa,  realitzacio re where  pa.dni=re.dniPac and re.dniPac=(select dniPac from visita group  by dniPac order by count(*) desc limit 1);

/*4. Mostra el nom de les àrees on hi ha algun metge que cobra un sou per baix de la mitjana de tots els metges.*/
select ar.nomArea from area ar, metge me where ar.numArea=me.numArea and me.sou<(select avg(sou) from metge);

/*5.Digues la diferència de llits que hi ha entre la planta que més llits té i la planta que menys llits té. */
select count(numLlit) from llit group by  numPl order by count(numLlit) desc limit 1 ; 
select count(numLlit) from llit group by  numPl order by count(numLlit) asc limit 1  ;


select (select count(numLlit) from llit group by  numPl order by count(numLlit) desc limit 1) -(select count(numLlit) from llit group by  numPl order by count(numLlit) asc limit 1);