use plantes;

/*72*/ select count(nom_planta), nom_adob from dosi_adob group by nom_adob;

/*73*/ select count(da.nom_estacio), p.nom_popular from dosi_adob da, planta p where da.nom_planta=p.nom_cientific group by p.nom_popular having count(da.nom_estacio)>=3;
/*73*/ select count(*), p.nom_popular from dosi_adob da, planta p where da.nom_planta=p.nom_cientific group by p.nom_popular having count(*)>=3 order by count(*), p.nom_popular;

/*74*/ select nom_planta, sum(quantitat_adob) from dosi_adob group by nom_planta desc having sum(quantitat_adob)>=60 and sum(quantitat_adob)<=90;
/*74*/ select nom_planta, sum(quantitat_adob) from dosi_adob group by nom_planta having sum(quantitat_adob) between 60 and 90 order by sum(quantitat_adob) desc;

/*75*/ select nom_planta, floracio, sum(quantitat_adob) from dosi_adob da, planta p where da.nom_planta=p.nom_cientific and da.nom_adob='Casadob' group by nom_planta order by nom_planta;

/*76*/ select nom_planta, floracio, sum(quantitat_adob) from dosi_adob da, planta p where da.nom_planta=p.nom_cientific and da.nom_adob='Casadob' group by nom_adob order by nom_planta;

/*77*/ select p.nom_popular, max(num_exemplar) from planta p, exemplar_planta ep, planta_interior pi, planta_exterior pe where pi.nom_planta=p.nom_cientific and ep.nom_planta=p.nom_cientific and pi.temperatura=17 or pe.nom_planta=p.nom_cientific and ep.nom_planta=p.nom_cientific group by nom_popular;

/*78*/ select nom_planta, count(nom_estacio) from dosi_adob group by nom_planta; 

/*79*/ select nom_cientific, nom_popular from dosi_adob da, planta p where da.nom_planta=p.nom_cientific and da.nom_adob='Casadob' and da.nom_estacio not in (select nom_estacio from dosi_adob where nom_estacio='Primavera') order by nom_cientific;

/*80*/ select distinct nom_popular from planta_interior pi, planta_exterior pe, planta p where pi.nom_planta=p.nom_cientific and pe.nom_planta=p.nom_cientific and pi.ubicacio='Llum directa' or pe.tipus_planta='T' ;

/*81*/ select distinct nom_popular, num_exemplar from dosi_adob da, planta p, exemplar_planta ep where ep.nom_planta=p.nom_cientific and da.nom_planta=p.nom_cientific and da.nom_adob='Casadob' or da.nom_adob='Sanexplant'; 

/*82*/ select nom_cientific, avg(quantitat_adob) from exemplar_planta ep, planta p, dosi_adob da where ep.nom_planta=p.nom_cientific and da.nom_planta=p.nom_cientific and ep.num_exemplar>3 group by quantitat_adob;

/*83*/ select nom_popular, sum(quantitat_adob) from planta p, dosi_adob da where da.nom_planta=p.nom_cientific and da.quantitat_adob>=40 group by nom_popular order by nom_popular;

/*84*/ select sum(quantitat_adob), pi.nom_planta from dosi_adob da, planta p, planta_interior pi where da.nom_planta=p.nom_cientific and p.nom_cientific=pi.nom_planta group by pi.nom_planta;

/*85*/ select da.nom_planta, sum(quantitat_adob), metode_reproduccio from dosi_adob da, planta p, reproduccio r where da.nom_planta=p.nom_cientific and r.nom_planta=p.nom_cientific group by metode_reproduccio having sum(quantitat_adob)>100;

/*86*/ 

/*87*/ select metode_reproduccio from reproduccio r, planta p, planta_interior pi where r.grau_exit='Alt' and r.nom_planta=p.nom_cientific and p.nom_cientific=pi.nom_planta group by r.nom_planta having min(temperatura);

/*88*/ 




