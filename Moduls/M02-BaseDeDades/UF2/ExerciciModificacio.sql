Create database empresa;

use empresa;

create table empleat (
codi_empleat integer(4) primary key,
nom varchar(15),
cognoms varchar(30),
treball varchar(10),
codi_carrec integer(4),
data_contracte date,
salari integer(7),
comissio integer(7),
departament integer(2)
);

alter table empleat modify salari numeric(5,2) not null;

create table departament (
numero_dep integer(2),
nom_dep char(9) primary key,
localitzacio char(10)
);

create table departament2 (
numero_dep numeric(2) primary key,
nom_dep char(9),
localitzacio char(10)
);


create table empleat2 (
codi_empleat numeric(4) primary key,
nom varchar(15),
cognoms varchar(30),
treball varchar(10),
codi_carrec numeric(4),
data_contracte date,
salari integer(7),
comissio integer(7),
departament numeric(2),
foreign key (departament) references departament2(numero_dep)
);

alter table empleat2 add constraint unic_sal_comm unique(salari, comissio);





