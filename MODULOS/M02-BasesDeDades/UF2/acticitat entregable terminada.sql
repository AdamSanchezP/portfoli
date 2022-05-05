create database bdpropia;
use bdpropia;



create table Pel·licules(
nom varchar(20) primary key not null,
Génere varchar(15) 

);

insert into Pel·licules (nom, Génere) VALUES ('El mago de OZ', 'Fantasia');
insert into Pel·licules (nom, Génere) VALUES ('Avengers: Endgame', 'Fantasia');
insert into Pel·licules (nom, Génere) VALUES ('El padrino', 'Mafia');
insert into Pel·licules (nom, Génere) VALUES ('Casablanca', 'Drama');
insert into Pel·licules (nom, Génere) VALUES ('El padrino: Parte II', 'Mafia');



create table Actors(
ID tinyint(4) not null unique auto_increment primary key,
nom varchar(20) not null,
edat tinyint(3) 

);

insert into Actors (ID, nom, edat) VALUES (ID, 'Jack Nicholson', '84');
insert into Actors (ID, nom, edat) VALUES (ID, 'Marlon Brando', '80');
insert into Actors (ID, nom, edat) VALUES (ID, 'Robert de Niro', '78');
insert into Actors (ID, nom, edat) VALUES (ID, 'Robert Mitchum', '79');
insert into Actors (ID, nom, edat) VALUES (ID, 'Tom Hanks', '65');


create table Edifici (
nom varchar(20) not null,
direccio varchar(40)  not null,
id_sala int(3), 
primary key (direccio)

);

INSERT INTO Edifici (nom, direccio) VALUES ('Edifici1', 'mare de deu de la merce 91');
INSERT INTO Edifici (nom, direccio) VALUES ('Edifici2', 'mare de deu de la merce 92');
INSERT INTO Edifici (nom, direccio) VALUES ('Edifici3', 'mare de deu de la merce 93');
INSERT INTO Edifici (nom, direccio) VALUES ('Edifici4', 'mare de deu de la merce 94');
INSERT INTO Edifici (nom, direccio) VALUES ('Edifici5', 'mare de deu de la merce 95');


create table Sales(
ID int(3)  not null unique auto_increment,
Seients int (4) not null,
direccio_edifici varchar(40) default 'direccioedifici', 
primary key (ID, direccio_edifici),
foreign key (direccio_edifici) REFERENCES Edifici(direccio)
);


create table clients(
nom varchar(20) not null,
DNI varchar(9) not null unique primary key,
telefon int (9) unique not null

);

INSERT INTO clients(nom, DNI, telefon) VALUES ('Adam Sánchez Portero', '12312445A', 622451045);
INSERT INTO clients(nom, DNI, telefon) VALUES ('Adam Sánchez Portero', '12312845B', 622451046);
INSERT INTO clients(nom, DNI, telefon) VALUES ('Adam Sánchez Portero', '12312945C', 622451047);
INSERT INTO clients(nom, DNI, telefon) VALUES ('Adam Sánchez Portero', '12312045D', 622451048);
INSERT INTO clients(nom, DNI, telefon) VALUES ('Adam Sánchez Portero', '12312145F', 622451049);

create table veure (
nom_peli varchar(20),
dni_clients varchar(9),
primary key (nom_peli, dni_clients),
foreign key (nom_peli) References Pel·licules (nom),
foreign key (dni_clients) REFERENCES Clients(DNI)
);

create table reserva(
id_sales int(3),
dni_clients varchar(9),
primary key (id_sales, dni_clients),
foreign key (id_sales) REFERENCES Sales(ID),
foreign key (dni_clients) REFERENCES Clients(DNI)
);

create table Reprodueixen(
id_sala int(3),
nom_pel·licula varchar(20),
primary key(id_sala, nom_pel·licula),
foreign key (id_sala) REFERENCES Sales(ID),
foreign key (nom_pel·licula) REFERENCES Pel·licules (nom)
);

create table Actuen(
id_actors tinyint(4),
nom_pelis varchar(20),
primary key(id_actors, nom_pelis),
foreign key (id_actors) REFERENCES Actors(ID),
foreign key (nom_pelis) REFERENCES Pel·licules (nom)
);

UPDATE clients set dni='12312145Z' where dni='12312145F';
UPDATE clients set nom='Marcos Garcia Perez' where dni='12312445A';
UPDATE clients set nom='Oscar Sanchez Garcia' where dni='12312845B';
alter table clients add direccio varchar(40);
DELETE FROM clients where dni='12312845B';



