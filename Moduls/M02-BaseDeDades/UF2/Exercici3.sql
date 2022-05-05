CREATE DATABASE exercici3;

USE exercici3;

CREATE TABLE titol (
codi_titol int primary key,
nom varchar(20)
);

CREATE TABLE empleat (
codi_empleat int primary key,
dni varchar(9),
nom varchar(20),
cognom varchar(20),
codi_categoria int,
codi_central int,
codi_agencia int,
codi_ciutat int,
foreign key (codi_categoria) references categoria(codi_categoria),
foreign key (codi_central) references centralSindical(codi_central),
foreign key (codi_agencia) references agencia(codi_agencia),
foreign key (codi_ciutat) references ciutat(codi_ciutat)
);

CREATE TABLE titulacions (
data_obtencio date,
codi_titol int,
codi_empleat int,
foreign key (codi_titol) references titol(codi_titol),
foreign key (codi_empleat) references empleat(codi_empleat)
);

CREATE TABLE categoria (
codi_categoria int primary key,
nom varchar (20),
sou_base decimal,
hores_extres time
);

CREATE TABLE centralSindical (
codi_central int primary key,
nom varchar(20),
quota numeric
);

CREATE TABLE agencia (
codi_agencia int primary key,
nom varchar(20),
adreça varchar(40),
telefon varchar(9)
);

CREATE TABLE ciutat (
codi_ciutat int primary key,
nom varchar(20)
);
