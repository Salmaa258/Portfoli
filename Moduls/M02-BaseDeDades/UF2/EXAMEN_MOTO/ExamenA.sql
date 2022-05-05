use motoGP;

/*1*/ select p.nombre from pilotos p, resultados r where p.codigo=r.codpiloto and r.distanciaganador<>'Abandono' group by p.nombre;

/*2*/ select p.nombre, c.nombregp from pilotos p, resultados r, carreras c where p.codigo=r.codpiloto and c.nombregp=r.nombregp and c.año=r.anyo and r.puesto in (select max(puesto) from resultados) ;

/*3*/ select longitud, disenyador from circuitos where longitud = (select min(longitud) from circuitos);
   
/*4*/ select p.nombre, e.nombre from pilotos p, escuderias e, resultados r where e.nombre=p.nombreescuderia group by p.nombre having count(r.puesto)>1;
select p.nombre, e.nombre, r.puesto from pilotos p, resultados r, escuderias e where p.codigo=r.codpiloto and e.nombre=p.nombreescuderia group by p.nombre having count(r.puesto)>1;


/*5*/ select p.nombre, r.puesto, r.anyo, p.fechanacimiento from pilotos p, resultados r where p.codigo=r.codpiloto and r.puesto<>1 and r.anyo=2011 and year(now())-year(p.fechanacimiento)<30; 

/*6*/ select c.nombregp, p from pilotos p, resultados r, carreras c where p.codigo=r.codpiloto and c.nombregp=r.nombregp and c.año=r.anyo and p.nacionalidad not in (select p.nombre from pilotos p, resultados r where p.codigo=r.codpiloto and p.nacionalidad='Alemana' and r.puesto=1);
select c.nombrecircuito from carreras c, resultados r where c.nombregp=r.nombregp and c.año=r.anyo and r.codpiloto not in(select p.codigo from pilotos p, resultados r where r.codpiloto=p.codigo and p.nacionalidad='Alemana' and r.puesto=1);
/*7*/


/*DDL*/
/*1.*/ update resultados set distanciaganador='00:00.00' where puesto=1;
 
 
/*2.*/ insert into resultados(nombregp, anyo, codpiloto, puesto) values('GP de Africa','2012','1',1);
insert into resultados(nombregp, anyo, codpiloto, puesto) values('GP de Africa','2012','2',2);
insert into resultados(nombregp, anyo, codpiloto, puesto) values('GP de Africa','2012','3',3);


/*3.*/ alter table resultados add puntuacio int ;
 