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
primary key (direccio)


);

INSERT INTO Edifici (nom, direccio) VALUES ('Edifici1', 'mare de deu de la merce 91');
INSERT INTO Edifici (nom, direccio) VALUES ('Edifici2', 'mare de deu de la merce 92');
INSERT INTO Edifici (nom, direccio) VALUES ('Edifici3', 'mare de deu de la merce 93');
INSERT INTO Edifici (nom, direccio) VALUES ('Edifici4', 'mare de deu de la merce 94');
INSERT INTO Edifici (nom, direccio) VALUES ('Edifici5', 'mare de deu de la merce 95');


create table Sales(
id tinyint(3)  not null  auto_increment,
Seients int (4) not null,
direccio_edifici varchar(40) not null default "direccio" ,
primary key (id, direccio_edifici),
foreign key (direccio_edifici) REFERENCES Edifici(direccio)
);

INSERT INTO Sales (ID, Seients, direccio_edifici) VALUES (ID, 234, "mare de deu de la merce 91");
INSERT INTO Sales (ID, Seients, direccio_edifici) VALUES (ID, 256, "mare de deu de la merce 92");
INSERT INTO Sales (ID, Seients, direccio_edifici) VALUES (ID, 356, "mare de deu de la merce 93");
INSERT INTO Sales (ID, Seients, direccio_edifici) VALUES (ID, 237, "mare de deu de la merce 94");
INSERT INTO Sales (ID, Seients, direccio_edifici) VALUES (ID, 270, "mare de deu de la merce 95");

create table clients(
nom varchar(20) not null,
DNI varchar(9) not null unique primary key,
telefon int (9) not null

);

INSERT INTO clients(nom, DNI, telefon) VALUES ('Adam Sánchez Portero', '12312345A', 622451045);
INSERT INTO clients(nom, DNI, telefon) VALUES ('Adam Sánchez Portero', '12312345B', 622451046);
INSERT INTO clients(nom, DNI, telefon) VALUES ('Adam Sánchez Portero', '12312345C', 622451047);
INSERT INTO clients(nom, DNI, telefon) VALUES ('Adam Sánchez Portero', '12312345D', 622451048);
INSERT INTO clients(nom, DNI, telefon) VALUES ('Adam Sánchez Portero', '12312345F', 622451049);

create table veure (
nom_peli varchar(20),
dni_clients varchar(9),
primary key (nom_peli, dni_clients),
foreign key (nom_peli) References Pel·licules (nom),
foreign key (dni_clients) REFERENCES Clients(DNI)
);

INSERT INTO veure VALUES ('El mago de OZ', '12312345A');
INSERT INTO veure VALUES ('Avengers: Endgame', '12312345B');
INSERT INTO veure VALUES ('El padrino', '12312345C');
INSERT INTO veure VALUES ('Casablanca', '12312345D');
INSERT INTO veure VALUES ('El padrino: Parte II', '12312345F');


create table reserva(
id_sales tinyint(3) auto_increment,
dni_clients varchar(9),
primary key (id_sales, dni_clients),
foreign key (id_sales) REFERENCES Sales(ID),
foreign key (dni_clients) REFERENCES Clients(DNI)
);

INSERT INTO reserva VALUES (id_sales, '12312345A');
INSERT INTO reserva VALUES (id_sales, '12312345B');
INSERT INTO reserva VALUES (id_sales, '12312345C');
INSERT INTO reserva VALUES (id_sales, '12312345D');
INSERT INTO reserva VALUES (id_sales, '12312345F');

create table Reprodueixen(
id_sala tinyint(3) auto_increment,
nom_pel·licula varchar(20),
primary key(id_sala, nom_pel·licula),
foreign key (id_sala) REFERENCES Sales(ID),
foreign key (nom_pel·licula) REFERENCES Pel·licules (nom)
);

INSERT INTO Reprodueixen VALUES (id_sala, 'El mago de OZ');
INSERT INTO Reprodueixen VALUES (id_sala, 'Avengers: Endgame');
INSERT INTO Reprodueixen VALUES (id_sala, 'El padrino');
INSERT INTO Reprodueixen VALUES (id_sala, 'Casablanca');
INSERT INTO Reprodueixen VALUES (id_sala, 'El padrino: Parte II');

create table Actuen(
id_actors tinyint(4) auto_increment,
nom_pelis varchar(20),
primary key(id_actors, nom_pelis),
foreign key (id_actors) REFERENCES Actors(ID),
foreign key (nom_pelis) REFERENCES Pel·licules (nom)
);

INSERT INTO Actuen VALUES (id_actors, 'El mago de OZ');
INSERT INTO Actuen VALUES (id_actors, 'Avengers: Endgame');
INSERT INTO Actuen VALUES (id_actors, 'El padrino');
INSERT INTO Actuen VALUES (id_actors, 'Casablanca');
INSERT INTO Actuen VALUES (id_actors, 'El padrino: Parte II');



