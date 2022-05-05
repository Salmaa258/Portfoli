CREATE DATABASE exercici2;

Use exercici2;

CREATE TABLE usuaris (
codi_usuari int primary key auto_increment,
dni varchar(9),
nom varchar(20),
cognoms varchar(40),
adreça varchar(50),
ciutat varchar(20),
sexe enum('h','d'),
telefonCasa varchar(9),
mòbil varchar(9),
correuElectronic varchar(30),
dataNaixement date check(dataNaixement > 1/1/1900)
);

CREATE TABLE pelis (
codi_pelicula int primary key auto_increment,
titol varchar(30),
director varchar(30),
actors varchar(30),
companyiaProductora varchar(30),
anyRodada date check(anyRodada > '1900'),
argument varchar(255),
durada tinyint check (durada BETWEEN 1 and 300),
dataAlta date check(dataAlta > 1/1/2021),
nacionalitat varchar(30),
donadaBaixa enum('si','no'),
codi_categoria int,
foreign key (codi_categoria) references categoria (codi_categoria)
);

CREATE TABLE categoria (
codi_categoria int primary key auto_increment,
categoria varchar(30)
);

CREATE TABLE lloga (
data_lloguer int,
data_retorn date,
codi_pelicula int,
codi_copia int,
codi_usuari int,
primary key (codi_usuari, codi_copia, codi_pelicula),
foreign key (codi_usuari) references usuari(codi_usuari),
foreign key (codi_copia, codi_pelicula) references copia(codi_copia, codi_pelicula)
);

CREATE TABLE copia (
codi_copia int,
codi_pelicula int,
primary key (codi_copia, codi_pelicula),
foreign key (codi_pelicula) references pelis (codi_pelicula)
);

 