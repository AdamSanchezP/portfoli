use dbuoc;


delimiter //
create trigger prjinsert_dbuoc after insert on dbuoc.projectes for each row
begin
if(select count(nom_proj) from dbuoc.projectesfinalitzats, dbuoc.projectes where new.nom_proj=nom_projecte)=0 and (new.data_fi is not null)
then 
insert dbuoc.projectesfinalitzats(nom_projecte) values (new.nom_proj);
update dbuoc.projectesfinalitzats set estat_fin="SI" where nom_projecte=new.nom_proj;
else if(select count(nom_proj) from dbuoc.projectesfinalitzats, dbuoc.projectes where new.nom_proj=nom_projecte)=0 and (new.data_fi  is null)then
insert dbuoc.projectesfinalitzats(nom_projecte) values (new.nom_proj);

end if;
end if;
end //
delimiter ;

##Trigger calc sous insert
delimiter //
create trigger calcsous after insert on dbuoc.projectes for each row 
begin
if ((select data_fi from dbuoc.projectes where codi_proj=new.codi_proj) is not null)  then
update dbuoc.projectes set cost_proj=cost_proj+(new.sou*(timestampdiff(MONTH,(select data_inici from dbuoc.projectes where codi_proj=new.num_proj), (select data_fi from dbuoc.projectes where codi_proj=new.num_proj)) ))where codi_proj=new.num_proj;

end if;
end //
delimiter ;
select * from dbuoc.projectes;

##Trigger contar empleados insert


delimiter //
create trigger contempleados after insert on dbuoc.empleats for each row
begin

update dbuoc.projectes set nombre_treballadors=(select count(codi_empl) from dbuoc.empleats where num_proj=new.num_proj) where codi_proj=new.num_proj;


end //
delimiter ;


##Trigger contar empleados update
delimiter //
create trigger contempleadosupd after update on dbuoc.empleats for each row
begin
if (old.codi_empl!=new.codi_empl) then
update dbuoc.projectes set nombre_treballadors=(select count(codi_empl) from dbuoc.empleats where num_proj=new.num_proj) where codi_proj=new.num_proj;

end if ;
end //
delimiter ;



##Operaciones:
select * from dbuoc.projectes;
select * from dbuoc.projectesfinalitzats;
select * from dbuoc.empleats;
delete from dbuoc.projectes;
delete from dbuoc.projectesfinalitzats;
delete from dbuoc.empleats;
drop trigger prjinsert_dbuoc;
drop trigger calcsous;
delete from dbuoc.empleats;
drop trigger contempleados;
drop trigger dbuoc4;
show triggers;


delimiter //

create trigger dbuoc4 before insert on empleats for each row
begin 

if((select count(*) from empleats where nom_dpt=new.nom_dpt and ciutat_dpt=new.ciutat_dpt)=10)
 then

 call raise_application_error (-2000,"Departament ple");

end if ;
end //
delimiter ;

delimiter //
create trigger contrproj after insert on projectes




delimiter ;

INSERT INTO dbuoc.empleats
VALUES (9, 'Sergi', 'Grau', 18000.00, 'PROG', 'Tarragona', NULL);
INSERT INTO dbuoc.empleats
VALUES (10, 'Sergi', 'Grau', 18000.00, 'PROG', 'Tarragona', NULL);
INSERT INTO dbuoc.empleats
VALUES (11, 'Sergi', 'Grau', 18000.00, 'PROG', 'Tarragona', NULL);
INSERT INTO dbuoc.empleats
VALUES (12, 'Sergi', 'Grau', 18000.00, 'PROG', 'Tarragona', NULL);
INSERT INTO dbuoc.empleats
VALUES (13, 'Sergi', 'Grau', 18000.00, 'PROG', 'Tarragona', NULL);
INSERT INTO dbuoc.empleats
VALUES (14, 'Sergi', 'Grau', 18000.00, 'PROG', 'Tarragona', NULL);
INSERT INTO dbuoc.empleats
VALUES (15, 'Sergi', 'Grau', 18000.00, 'PROG', 'Tarragona', NULL);
INSERT INTO dbuoc.empleats
VALUES (16, 'Sergi', 'Grau', 18000.00, 'PROG', 'Tarragona', NULL);
INSERT INTO dbuoc.empleats
VALUES (17, 'Sergi', 'Grau', 18000.00, 'PROG', 'Tarragona', NULL);
INSERT INTO dbuoc.empleats
VALUES (18, 'Sergi', 'Grau', 18000.00, 'PROG', 'Tarragona', NULL);
INSERT INTO dbuoc.empleats
VALUES (19, 'Sergi', 'Grau', 18000.00, 'PROG', 'Tarragona', NULL);
