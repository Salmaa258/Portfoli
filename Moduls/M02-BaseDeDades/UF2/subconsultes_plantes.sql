use plantes;

/*1*/ select p.nom_cientific from planta p, dosi_adob da where da.nom_estacio not in(select da.nom_planta from dosi_adob da, planta p where da.nom_planta=p.nom_cientific and nom_estacio='Primavera') and da.nom_planta=p.nom_cientific; 

/*2*/ select p.nom_popular from planta p, dosi_adob da where da.nom_estacio not in(select da.nom_planta from dosi_adob da, planta p where da.nom_planta=p.nom_cientific and nom_estacio='Primavera') and da.nom_planta=p.nom_cientific; 

/*3*/ select nom_planta from dosi_adob where quantitat_adob>(select avg(quantitat_adob) from dosi_adob);

/*4*/ select p.nom_popular from planta p, dosi_adob da where da.quantitat_adob=(select avg(quantitat_adob) from dosi_adob) and da.nom_planta=p.nom_cientific;

/*5*/ select p.nom_popular from planta p, exemplar_planta ep where ep.nom_planta=p.nom_cientific and ep.num_exemplar=(select max(num_exemplar) from exemplar_planta);

/*Prova agrupacions*/ 
/*1*/ select nom_planta, sum(quantitat_adob) from dosi_adob group by nom_planta;


















