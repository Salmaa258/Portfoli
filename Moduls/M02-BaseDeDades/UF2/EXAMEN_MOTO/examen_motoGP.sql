use motoGP;

/*Mostra el nom dels pilots, de les escuderies amb seu a Itàlia, i que hagin guanyat més d'una carrera.*/
select p.nombre from pilotos p, escuderias e, resultados r where e.nombre=p.nombreescuderia and p.codigo=r.codpiloto and e.sede like '%Italia%' group by p.nombre having count(r.puesto)>1;

/*Mostra els pilots, i les seves corresponents escuderies, i el nombre de carreres guanyades, d'aquells pilots que han guanyat més d'una carrera celebrada a partir de les 15:00h*/
select p.nombre, p.nombreescuderia from pilotos p, resultados r, carreras c where p.codigo=r.codpiloto and c.nombregp=r.nombregp and c.año=r.anyo and r.puesto>1 and time(c.fechahorarioinicio) > '15:00';

/*Mostra el número de pilots de cada escuderia, incloent les que no tinguin cap*/
select e.nombre, count(p.nombre) from pilotos p, escuderias e where e.nombre=p.nombreescuderia group by e.nombre;

/*Mostra el nombre de carreres guanyades en 2010 per cada pilot, ordenades de major a menor, incloent els pilots que no han guanyat cap.*/
select count(r.puesto), p.nombre from pilotos p, resultados r, carreras c where p.codigo=r.codpiloto and c.nombregp=r.nombregp and c.año=r.anyo and r.anyo=2010 and r.puesto=1 group by p.nombre;

/*Mostra el nom i l'any de debut (solament l'any) del pilot que ha guanyat més grans premis.*/
select p.nombre, p.carreradebut from pilotos p, resultados r where p.codigo=r.codpiloto group by r.codpiloto having count(*)=(select count(*) from resultados group by puesto order by count(*) desc limit 1);

/*Mostra el nom dels pilots que han arribat en més de 10 segons de diferència del guanyador en la cursa del 2010 que s'han recorregut menys voltes.*/
select p.nombre from pilotos p, resultados r, carreras c where p.codigo=r.codpiloto and c.nombregp=r.nombregp and c.año=r.anyo and c.numvueltas=(select min(numvueltas) from carreras) and c.año=2010 and r.distanciaganador-(select distanciaganador from resultados where puesto=1)>10;

/*Mostra amb quina/es quines escuderia/es s’han guanyat més curses*/
select e.nombre, count(*) from escuderias e, pilotos p, resultados r where e.nombre=p.nombreescuderia and p.codigo=r.codpiloto group by r.codpiloto having count(*)=(select count(*) from resultados group by puesto order by count(*) desc limit 1);

/*Mostra quina nacionalitat/s hi ha més pilots.*/
select nacionalidad, count(nombre) from pilotos group by nacionalidad having count(nombre)=(select count(nombre) from pilotos group by codigo order by count(nombre) desc limit 1);


/*Explica quines dades mostra la següent consulta:*/
select distinct c.nombrecircuito from resultados r, carreras c where (r.nombregp=c.nombregp) and (c.año=r.anyo) and (r.puesto=1) and r.codpiloto NOT IN (select codigo from pilotos where nacionalidad='Española');
/*Mostra el nom del circuit dels guanyadors que no siguin de nacionaliat espanyola.*/


/*Afegeix una taula a la BD:

-Caldrà que tingui sentit la informació que s'emmagatzema
-I per supost, haurà d'estar relacionada amb una o més taules.
-Afegeix 2 inserts a la taula creada.

create table entradas (
IDcliente varchar(3) primary key,
horario date,
circuito varchar(30),
foreign key (circuito) references circuitos(nombre)
);

insert into entradas(IDcliente, horario, circuito) values ('001','2004-02-17','Albert Park');
insert into entradas(IDcliente, horario, circuito) values ('002','2005-12-04','Indianapolis');



*/












