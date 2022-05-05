create database activitat2triggers;
use activitat2triggers;

create table prova_puntuacio(
lletra enum ('A','B','C','D','E'),
puntuacio enum ('1','2','3','4','5','6','7','8','9','10')
);

create table prova_puntuacio_seg(
lletra enum ('A','B','C','D','E'),
puntuacio enum ('1','2','3','4','5','6','7','8','9','10')


);
delimiter //
create trigger contlentras after insert on prova_puntuacio for each row
begin

update prova_puntuacio_seg set puntuacio=(select count(lletra) from prova_puntuacio where lletra=new.lletra) where lletra=new.lletra;

end //
delimiter ;

delimiter //
create trigger contlentrasdel after delete on prova_puntuacio for each row
begin

update prova_puntuacio_seg set puntuacio=(select count(lletra) from prova_puntuacio where lletra=old.lletra) where lletra=old.lletra;

end //
delimiter ;

delimiter //
create trigger contlentrasupd after update on prova_puntuacio for each row
begin
if (new.lletra <> old.lletra)then (select count(*) from prova_puntuacio where lletra=old.lletra);
update prova_puntuacio_seg set puntuacio=(select count(lletra) from prova_puntuacio where lletra=old.lletra) where lletra=old.lletra;
update prova_puntuacio_seg set puntuacio=(select count(lletra) from prova_puntuacio where lletra=new.lletra) where lletra=new.lletra;
end if;
end //
delimiter ;


drop table prova_puntuacio;

