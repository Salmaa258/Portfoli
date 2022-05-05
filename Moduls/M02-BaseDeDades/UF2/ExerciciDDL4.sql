CREATE DATABASE exercici6;

USE exercici6;

CREATE TABLE titol (
codi_titol int primary key,
nom varchar(20)
);
insert into titol(codi_titol, nom) value(001,'titol1');

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
insert into empleat(codi_empleat,dni,nom,cognom) value(01,'45667783R','pau','gomez');

CREATE TABLE titulacions (
data_obtencio date,
codi_titol int,
codi_empleat int,
foreign key (codi_titol) references titol(codi_titol),
foreign key (codi_empleat) references empleat(codi_empleat)
);
insert into titulacions (data_obtencio) value(16/11/1990);

CREATE TABLE categoria (
codi_categoria int primary key,
nom varchar (20),
sou_base decimal,
hores_extres time
);
insert into categoria(codi_categoria,nom,sou_base,hores_extres) value(01,'categoria1',5000,12);

CREATE TABLE centralSindical (
codi_central int primary key,
nom varchar(20),
quota numeric
);
insert into centralSindical(codi_central,nom,quota) value(0001,'central1',2000);

CREATE TABLE agencia (
codi_agencia int primary key,
nom varchar(20),
adreça varchar(40),
telefon varchar(9)
);
insert into agencia(codi_agencia,nom,adreça,telefon) value(01,'agencia1','carrer1',675836546);

CREATE TABLE ciutat (
codi_ciutat int primary key,
nom varchar(20)
);
insert into ciutat(codi_ciutat,nom) value(011,'ciutat1');
