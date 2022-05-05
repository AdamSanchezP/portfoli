create database lligafutbol;
use lligafutbol;

CREATE TABLE partit
(jornada INT,
equip_local  VARCHAR(20),
equip_visitant VARCHAR(20),
gols_local INT,
gols_visitant INT,
PRIMARY KEY(jornada,equip_local)
);

CREATE TABLE classificacio
(equip VARCHAR(20) PRIMARY KEY,
partits_guanyats INT DEFAULT 0,
partits_empatats INT DEFAULT 0,
partits_perduts INT DEFAULT 0,
gols_favor INT DEFAULT 0,
gols_contra INT DEFAULT 0,
punts int default 0
);

/*triggers*/
delimiter //
create trigger insclassificacio after insert on partit for each row
begin
if ((select count(equip) from classificacio where new.equip_local=equip)=0)
 then 
insert classificacio (equip) values (new.equip_local);
end if;


if ((select count(equip) from classificacio where new.equip_visitant=equip)=0)
 then 
insert classificacio (equip) values (new.equip_visitant);
end if;


if ( new.gols_local > new.gols_visitant)
then
update classificacio set partits_guanyats=partits_guanyats+1 where new.equip_local=equip;
update classificacio set gols_favor=gols_favor+new.gols_local where new.equip_local=equip;
update classificacio set gols_contra=gols_contra+new.gols_visitant where new.equip_local=equip;
update classificacio set partits_perduts=partits_perduts+1 where new.equip_visitant=equip;
update classificacio set gols_favor=gols_favor+new.gols_visitant where new.equip_visitant=equip;
update classificacio set gols_contra=gols_contra+new.gols_local where new.equip_visitant=equip;
update classificacio set punts=punts+3 where new.equip_local=equip;

elseif (new.gols_local=new.gols_visitant)
then 
update classificacio set partits_empatats=partits_empatats+1 where new.equip_local=equip;
update classificacio set gols_favor=gols_favor+new.gols_local where new.equip_local=equip;
update classificacio set gols_contra=gols_contra+new.gols_visitant where new.equip_local=equip;
update classificacio set partits_empatats=partits_empatats+1 where new.equip_visitant=equip;
update classificacio set gols_favor=gols_favor+new.gols_visitant where new.equip_visitant=equip;
update classificacio set gols_contra=gols_contra+new.gols_local where new.equip_visitant=equip;
update classificacio set punts=punts+1 where new.equip_local=equip;
update classificacio set punts=punts+1 where new.equip_visitant=equip;
elseif (new.gols_local < gols_visitant)
then
update classificacio set partits_perduts=partits_perduts+1 where new.equip_local=equip;
update classificacio set gols_favor=gols_favor+new.gols_local where new.equip_local=equip;
update classificacio set gols_contra=gols_contra+new.gols_visitant where new.equip_local=equip;
update classificacio set partits_guanyats=partits_guanyats+1 where new.equip_visitant=equip;
update classificacio set gols_favor=gols_favor+new.gols_visitant where new.equip_visitant=equip;
update classificacio set gols_contra=gols_contra+new.gols_local where new.equip_visitant=equip;
update classificacio set punts=punts+3 where new.equip_visitant=equip;
end if;


end //
delimiter ;

delimiter //
create trigger delclassificacio after delete on partit for each row
begin
if ((select count(equip) from classificacio where new.equip_local=equip)=0)
 then 
insert classificacio (equip) values (new.equip_local);
end if;


if ((select count(equip) from classificacio where new.equip_visitant=equip)=0)
 then 
insert classificacio (equip) values (new.equip_visitant);
end if;


if ( new.gols_local > new.gols_visitant)
then
update classificacio set partits_guanyats=partits_guanyats+1 where new.equip_local=equip;
update classificacio set gols_favor=gols_favor+new.gols_local where new.equip_local=equip;
update classificacio set gols_contra=gols_contra+new.gols_visitant where new.equip_local=equip;
update classificacio set partits_perduts=partits_perduts+1 where new.equip_visitant=equip;
update classificacio set gols_favor=gols_favor+new.gols_visitant where new.equip_visitant=equip;
update classificacio set gols_contra=gols_contra+new.gols_local where new.equip_visitant=equip;
update classificacio set punts=punts+3 where new.equip_local=equip;

elseif (new.gols_local=new.gols_visitant)
then 
update classificacio set partits_empatats=partits_empatats+1 where new.equip_local=equip;
update classificacio set gols_favor=gols_favor+new.gols_local where new.equip_local=equip;
update classificacio set gols_contra=gols_contra+new.gols_visitant where new.equip_local=equip;
update classificacio set partits_empatats=partits_empatats+1 where new.equip_visitant=equip;
update classificacio set gols_favor=gols_favor+new.gols_visitant where new.equip_visitant=equip;
update classificacio set gols_contra=gols_contra+new.gols_local where new.equip_visitant=equip;
update classificacio set punts=punts+1 where new.equip_local=equip;
update classificacio set punts=punts+1 where new.equip_visitant=equip;
elseif (new.gols_local < gols_visitant)
then
update classificacio set partits_perduts=partits_perduts+1 where new.equip_local=equip;
update classificacio set gols_favor=gols_favor+new.gols_local where new.equip_local=equip;
update classificacio set gols_contra=gols_contra+new.gols_visitant where new.equip_local=equip;
update classificacio set partits_guanyats=partits_guanyats+1 where new.equip_visitant=equip;
update classificacio set gols_favor=gols_favor+new.gols_visitant where new.equip_visitant=equip;
update classificacio set gols_contra=gols_contra+new.gols_local where new.equip_visitant=equip;
update classificacio set punts=punts+3 where new.equip_visitant=equip;
end if;


end //
delimiter ;

/*inserts*/
insert into partit values (1, "Atlètic Terrassa", "Ràpid Vacarisses",4,4 );
insert partit values (2, "Atlètic Terrassa", "Ràpid Vacarisses",5,4 );


/*operaciones o comandos*/
select * from classificacio;
delete from classificacio;
delete from partit;
drop table classificacio;
drop trigger updclassificacio;
select * from partit;

