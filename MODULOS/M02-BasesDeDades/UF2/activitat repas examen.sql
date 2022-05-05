/*92. Trobar el nom de l’equip, el nom dels jugadors i el nom de l’entrenador dels equips que han guanyat com a
mínim dos partits fora de casa.*/

select  e.nom, ju.nom from equip e, partit pa, jugador ju, membre_equip me  where ju.nom=me.nom and me.equip=e.nom and pa.punts_visitant>pa.punts_local and e.nom=pa.equip_visitant group by pa.equip_visitant, ju.nom having count(*)>=2

UNION

select  e.nom, en.nom from equip e, partit pa, entrenador en, membre_equip me  where pa.punts_visitant>pa.punts_local and en.nom=me.nom and me.equip=e.nom and e.nom=pa.equip_visitant group by pa.equip_visitant, en.nom having count(*)>=2;

/*93. Mostra el nom i el president dels equips que han aconseguit una puntuació com a visitants superior a la mitjana
dels equips que han jugat fora.*/

select d.nom, e.nom from directiu d, membre_equip me, equip e, partit p where d.carrec='President' and d.nom=me.nom and me.equip=e.nom and e.nom=p.equip_visitant and p.punts_visitant>(SELECT AVG(punts_visitant) from partit) ;

/* 94.Mostra el nom i la posició on juga dels jugadors que són entrenadors a la vegada. Mostra també l’equip on juga i
ordena-ho tot per l’equip i pel nom del jugador. */

select en.nom, ju.posicio, me.equip from entrenador en, jugador ju, membre_equip me where en.nom=me.nom and me.nom=ju.nom and en.nom=ju.nom order by me.equip, ju.nom;

/*95. Mostra el nom i l’equip de tots els membres d’algun equip que el seu cognom és Brunet*/

select me.nom, me.equip from membre_equip me where me.nom like ("%Brunet");

/*96. Mostra el nom i l’equip al que pertanyen de les persones que són directius però no són presidents.*/

select me.nom, me.equip from membre_equip me, directiu di where di.carrec not in ("President") and me.nom=di.nom;

/*97.Mostra la quantitat de fitxes que tenim de cada equip. */

select me.equip, count(ju.fitxa) from membre_equip me, jugador ju where me.nom=ju.nom group by me.equip;

/*98. */
select equip_visitant, sum(punts_visitant) from partit  where punts_visitant>punts_local group by equip_visitant;

/*99.Mostra la quantitat de punts obtinguts per cada equip jugant com a local.*/
select equip_local, sum(punts_visitant) from partit   group by equip_local;
/*100. Digues el nom i l’equip on juguen dels jugadors que tenen una fitxa superior al número 400*/
select me.nom, me.equip from jugador ju, membre_equip me  where me.nom=ju.nom and fitxa>400;

/*101.De l’exercici anterior ordena els equips en ordre ascendent i digues quantes fitxes té cada equip.*/
select me.nom, me.equip, count(fitxa) from jugador ju, membre_equip me  where me.nom=ju.nom and fitxa>400 group by me.equip order by me.nom asc;

/*102.Mostra el nom dels equips que tenen el pressupost més alt.*/
select e.nom, max(e.pressupost) from equip e;

/*103. Digues el nom dels àrbitres que han nascut a Olot i també els que porten més de 5 anys arbitrant.*/

select ar.nom from arbitre ar where ar.ciutat_naixement='Olot' union select ar.nom from arbitre ar where year(now())-ar.antiguitat>5;




