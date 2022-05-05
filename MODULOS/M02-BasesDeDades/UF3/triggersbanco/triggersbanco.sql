create database triiggersbanco;
use triiggersbanco;



/*CREACION DE TABLAS*/

CREATE TABLE moviment
(compte VARCHAR(10) NOT NULL,
data TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP(),
descripcio VARCHAR(30) NOT NULL,
tipus ENUM('H','D') NOT NULL,
valor DECIMAL(7,2) NOT NULL
);


CREATE TABLE seguretat
(compte VARCHAR(10) NOT NULL,
data TIMESTAMP NOT NULL,
usuari VARCHAR(20) NOT NULL,
descripcio_valor VARCHAR(30) NOT NULL
);

CREATE TABLE saldo
(compte VARCHAR(10) PRIMARY KEY,
saldo DECIMAL(7,2) NOT NULL default 0
);

CREATE TABLE saldo_diari
(data  DATE PRIMARY KEY,
saldo DECIMAL(7,2) NOT NULL default 0
);

/*TRIGGERS*/
delimiter //
CREATE TRIGGER trigseguretat after insert on moviment for each row
begin



if(new.tipus='H')

then
insert seguretat values (right(new.compte,4), now(), current_user(), concat(new.descripcio, " ", new.valor));

else if(new.tipus='D')
then
insert seguretat values (right(new.compte,4), now(), current_user(), concat(new.descripcio, " ", "-",new.valor));
end if;
end if;

if(((select count(compte) from saldo where compte=new.compte)=0) and (new.tipus='H'))
then
insert saldo(compte) values (new.compte);
update saldo set saldo=saldo+new.valor where compte=new.compte;

else if(((select count(compte) from saldo where compte=new.compte)=0) and (new.tipus='D'))
then
insert saldo(compte) values (new.compte);
update saldo set saldo=saldo-new.valor where compte=new.compte;

else if(new.tipus="H")
then
update saldo set saldo=saldo+new.valor where compte=new.compte;

else if (new.tipus="D")
then
update saldo set saldo=saldo-new.valor where compte=new.compte;

/*tabla saldo banco total*/
if ((select count(data) from saldo_diari where data=date(new.data)) = 0 ) and (new.tipus='H')  then
insert saldo_diari(data) values (current_date);
update saldo_diari set saldo = saldo + new.valor where data=date(new.data);
else if ((select count(data) from saldo_diari where data=date(new.data)) = 0) and (new.tipus='D') then
insert saldo_diari(data) values (current_date);
update saldo_diari set saldo = saldo - new.valor where data=date(new.data);
else if (date(new.data)=current_date() and (new.tipus='H')) then
update saldo_diari set saldo=saldo+new.valor where data=date(new.data);
else if (date(new.data)=current_date() and (new.tipus='D')) then
update saldo_diari set saldo=saldo-new.valor where data=date(new.data);


end if;
end if;
end if;
end if;
end if;
end if;
end if;
end if;
end //
delimiter ;

/*operaciones*/
select*from moviment;
select*from seguretat;
select*from saldo;
select * from saldo_diari;
drop trigger trigseguretat;
delete from moviment;
delete from seguretat;
delete from saldo_diari;
delete from saldo;
select date(data) from moviment;
select current_date();
/*inserts*/
insert into moviment values (1234567890, now(), "ingres",'H',100 );



