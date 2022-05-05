use plantes;

/*1*/ select p.nom_popular from planta p, exemplar_planta ep where ep.nom_planta=p.nom_cientific group by nom_popular having count(ep.num_exemplar)<2; 

/*2*/ select p.nom_popular from planta p, exemplar_planta ep where p.nom_cientific not in(select nom_planta from exemplar_planta) group by p.nom_cientific;

/*3*/ select nom_planta, count(nom_estacio) from dosi_adob group by nom_planta; 

/*4*/ select p.nom_popular, max(num_exemplar) from planta p, exemplar_planta ep, planta_interior pi, planta_exterior pe where pi.nom_planta=p.nom_cientific and ep.nom_planta=p.nom_cientific and pi.temperatura=17 or pe.nom_planta=p.nom_cientific and ep.nom_planta=p.nom_cientific group by nom_popular;

/*5*/ select nom_planta from dosi_adob where nom_planta not in(select nom_planta from dosi_adob where nom_estacio='Primavera');

/*6*/ select nom_planta, count(metode_reproduccio) from reproduccio group by nom_planta;

/*7*/ select nom_planta, count(metode_reproduccio) from reproduccio where grau_exit='Alt' group by nom_planta; 

/*8*/ select distinct nom_planta from reproduccio where metode_reproduccio<>'Esqueix';

/*9*/ select pi.nom_planta from planta_interior pi, planta p where pi.nom_planta=p.nom_cientific and p.floracio='Primavera';

/*10*/ select a.nom_firma, count(da.nom_adob) from dosi_adob da, adob a where da.nom_adob=a.nom_adob group by nom_firma; 



