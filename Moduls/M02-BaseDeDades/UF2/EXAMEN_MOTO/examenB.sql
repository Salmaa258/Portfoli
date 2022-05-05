use motoGP;

/*B*/

/*1*/ 
/*Mostra quins pilots no han pujat mai al podium (1a, 2a, 3a posició).*/
select distinct p.nombre from pilotos p, resultados r where p.codigo=r.codpiloto and r.puesto>=4;

/*2*/ 
/*MOstra quins pilots ¡, i en quina cursa, han quedat en última posició (sense tenir en compte els abandonaments)*/
select distinct p.nombre, c.nombrecircuito from pilotos p, resultados r, carreras c where p.codigo=r.codpiloto and r.nombregp=c.nombregp and r.puesto in (select max(puesto) from resultados) ;


/*3*/
/*Mostra el dissenyador, en el cas de què es sàpiga, del circuit amb major longitud.*/
select max(longitud), disenyador from circuitos group by disenyador;
select longitud, disenyador from circuitos where longitud = (select max(longitud) from circuitos);

/*4*/ 
/*Mostra el nom dels pilots i la seva escuderia d'aquells que han quedat primers més d'un cop.*/
select p.nombre, p.nombreescuderia, r.puesto from pilotos p, resultados r where p.codigo=r.codpiloto and r.puesto=1 group by p.nombre having count(r.puesto)>1;

/*5*/ 
/*Mostra el nom dels pilots, majors de 30 anys, que no han guanyat cap cursa (posició 1ra) en 2011.*/
select p.nombre, r.puesto, r.anyo, p.fechanacimiento from pilotos p, resultados r where p.codigo=r.codpiloto and r.puesto<>1 and r.anyo=2011 /*and year(1990)-p.fechanacimiento)>30*/; 

/*6*/ 
/*Mostra els circuits en els quals no ha guanyat cap pilot español.*/
select distinct c.nombre from circuitos c, carreras ca, resultados r, pilotos p where p.codigo=r.codpiloto and ca.nombregp=r.nombregp and c.nombre=ca.nombrecircuito and p.nacionalidad<>'Española';

/*7*/ 
/*MOstra per a cadascun dels pilots, el seu codi i quants cops ha quedat primer al 2010 (ordenats del nombre de vegades de major a menor).*/
select p.codigo, count(r.puesto) from pilotos p, resultados r where p.codigo=r.codpiloto and r.anyo=2010 group by p.codigo having count(r.puesto)=1;



/*A*/

/*1*/ 
/*Mostra quins pilots no han abandonat mai en cap cursa.*/
select p.nombre from pilotos p, resultados r where r.distanciaganador<>'Abandono' group by p.nombre;

/*2*/ 
/*Mostra quin pilots, i en quina cursa, han quedat en última posició (tenint en compte els abandonaments).*/
select distinct p.nombre, c.nombrecircuito from pilotos p, resultados r, carreras c where p.codigo=r.codpiloto and r.nombregp=c.nombregp and r.puesto in (select max(puesto) from resultados) and r.distanciaganador<>'Abandono' ;

/*3*/ 
/*Mostra el dissenyador, en el cas de què es sàpiga, del circuit amb menor longitud.*/
select longitud, disenyador from circuitos where longitud = (select min(longitud) from circuitos);

/*4*/
/*Mostra el nom dels pilots i la seva escuderia d'aquells que han quedat primers més d'un cop.*/
select p.nombre, p.nombreescuderia, r.puesto from pilotos p, resultados r where p.codigo=r.codpiloto and r.puesto=1 group by p.nombre having count(r.puesto)>1;

/*5*/
/*Mostra el nom dels pilots, menors de 30 anys, que no han guanyat cap cursa (posició 1a) en el 2011.*/
select p.nombre, r.puesto, r.anyo, p.fechanacimiento from pilotos p, resultados r where p.codigo=r.codpiloto and r.puesto<>1 and r.anyo=2011 /*and year(1990)-p.fechanacimiento)<30*/; 

/*6*/
/*Mostra els circuits en els quals no ha guanyat cap pilot alemany.*/
select distinct c.nombre from circuitos c, carreras ca, resultados r, pilotos p where p.codigo=r.codpiloto and ca.nombregp=r.nombregp and c.nombre=ca.nombrecircuito and p.nacionalidad<>'Alemana';

/*7*/
/*Mostra per a cadascun dels pilots, el seu codi i quants cops ha quedat tercers al 2010 (ordenats del nombre de vegades de major a menor).*/
select p.codigo, count(r.puesto) from pilotos p, resultados r where p.codigo=r.codpiloto and r.anyo=2010 group by p.codigo having count(r.puesto)=3;





