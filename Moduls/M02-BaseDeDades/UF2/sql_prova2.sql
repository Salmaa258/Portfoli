create database prova;

use prova;


create table clase (
codi_clase int primary key
);


create table matricula (
codi_matricula int primary key,
codi_clase int,
foreign key (codi_clase) references clase(codi_clase)
);

alter table clase add alumnes varchar(20);

alter table clase change codi_clase codii_clase int;

alter table clase modify alumnes char;

insert into clase(codi_clase) value (1);
