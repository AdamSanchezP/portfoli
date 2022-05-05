CREATE DATABASE EXCERCICI8;
USE EXCERCICI8;



CREATE TABLE CATEGORIA(
codi_categoria int(50) auto_increment NOT NULL PRIMARY KEY,
categoriaa text(30) NOT NULL UNIQUE
);


CREATE TABLE PELICULA(
codi_pelicula int PRIMARY KEY auto_increment NOT NULL,
titol text(30) NOT NULL UNIQUE,
director text(30) NOT NULL,
actors text(50) NOT NULL,
productora text(30) NOT NULL,
any_filmació int(4) NOT NULL CHECK(any_filmació >1900),
argument varchar(50),
durada int(3) NOT NULL DEFAULT "Data d'avui" NOT NULL CHECK (data_alta>'01/01/2011'),
nacionalitat text(30) NOT NULL,
baixa ENUM('S', 'N'), 
codi_categoria int not null,
foreign key (codi_categoria) REFERENCES CATEGORIA(codi_categoria)
);

CREATE TABLE COPIA(
codi_copia int NOT NULL PRIMARY KEY,
codi_pelicula int NOT NULL,
foreign key (codi_pelicula) REFERENCES PELICULA(codi_pelicula)
);

CREATE TABLE USUARI(
codi_usuari int auto_increment NOT NULL PRIMARY KEY,
dni varchar(9) NOT NULL UNIQUE,
nom text(20) NOT NULL,
cognoms text(40) NOT NULL,
adreca text(50) NOT NULL,
poblacio text(20)  NOT NULL,
sexe ENUM('H', 'D') NOT NULL,
telefon text(9),
mòbil text(9),
correu_electronic text(30) UNIQUE,
data_naixement DATE NOT NULL CHECK(data_naixement <'1900/1/1')
);

CREATE TABLE LLOGA(
codi_usuari int NOT NULL,
codi_copia int NOT NULL,
codi_pelicula int NOT NULL,
data_lloguer DATE DEFAULT "Data d'avui" NOT NULL,
data_retorn DATE,
PRIMARY KEY(codi_usuari, codi_copia, codi_pelicula),
FOREIGN KEY (codi_usuari) REFERENCES USUARI(codi_usuari),
FOREIGN KEY (codi_copia, codi_pelicula) REFERENCES COPIA(codi_copia, codi_pelicula)
);



