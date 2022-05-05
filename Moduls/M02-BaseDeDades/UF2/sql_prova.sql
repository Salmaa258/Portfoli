CREATE DATABASE prova4;

USE prova4;

CREATE TABLE treball
(nom varchar(20) PRIMARY KEY,
edat INTEGER(2),
càrrec VARCHAR(50)
);


CREATE TABLE ciutat (
nom varchar(25) PRIMARY KEY,
comarca VARCHAR(25) NOT NULL,
provincia VARCHAR(25) NOT NULL,
habitants INTEGER ); 


CREATE TABLE cliente (
id INT auto_increment,
nom VARCHAR(25),
cognoms VARCHAR(25),
datanaixement DATE,
tipus VARCHAR(25) default 'habitual',
primary key (id),
unique (nom,cognoms)
);


CREATE TABLE departament (
numero INTEGER(2),
nom CHAR(9) unique,
localitzacio CHAR(10)
);

CREATE TABLE departament2 (
numero NUMERIC(2) PRIMARY KEY,
nom CHAR (9) unique,
localitzacio CHAR (10)
);


CREATE TABLE producte (
codi_producte numeric primary key,
nom char,
descripcio varchar(20), 
categoria varchar(20),
preu decimal,
codi_fabricants int,
foreign key (codi_fabricants) references fabricants (codi_fabricants)
);

CREATE TABLE fabricants (
codi_fabricants int PRIMARY KEY,
nom char,
adreça varchar(20),
telefon integer
);


CREATE TABLE assignatura (
codi_assignatura varchar(3) PRIMARY KEY,
nom char,
cicle char,
curs varchar(20),
codi_professor int,
codi_alumne int
); 

CREATE TABLE professor (
codi_professor int PRIMARY KEY,
nom char,
cognoms char,
datanaixement DATE,
adreça varchar(20),
telefon integer
);

CREATE TABLE alumne (
codi_alumne int PRIMARY KEY,
nom char,
cognoms char,
datanaixement date,
adreça varchar(20),
telefon integer
);

CREATE TABLE clase (
alumne int,
professor int,
assignatura int(3),
PRIMARY KEY (alumne, professor, assignatura),
FOREIGN KEY (professor) references professor(codi_professor),
FOREIGN KEY (alumne) references alumne(codi_alumne),
FOREIGN KEY (assignatura) references assignatura(codi_assignatura)
); 