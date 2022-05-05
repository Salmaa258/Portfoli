use plantes;

/*63*/select distinct nom_cientific, upper(nom_popular) from planta p, reproduccio r where r.nom_planta=p.nom_cientific and r.metode_reproduccio='Esqueix'
      UNION
/*63*/select distinct nom_cientific, upper(nom_popular) from planta p, reproduccio r where r.nom_planta=p.nom_cientific and r.grau_exit='Baix';
/*64*/select nom_planta, temperatura from planta_interior where temperatura>=(select max(temperatura) from planta_interior) -1 order by temperatura, nom_planta;

/*68*/select nom_popular, quantitat_adob from planta p, dosi_adob da where da.nom_planta=p.nom_cientific and da.quantitat_adob<>(select min(quantitat_adob) from dosi_adob) and quantitat_adob<>(select max(quantitat_adob) from dosi_adob) order by quantitat_adob;
/*69*/select nom_cientific from planta p, dosi_adob da where p.nom_popular like 'C%' and da.nom_estacio='Primavera' and da.nom_planta=p.nom_cientific;
/*70*/select distinct nom_cientific from planta p, exemplar_planta ep, dosi_adob da where ep.nom_planta=p.nom_cientific and da.nom_planta not in(select nom_planta from dosi_adob where nom_adob='Casadob');


select nom_cientific from planta where nom_cientific not in(select distinct nom_planta from dosi_adob where nom_adob='Casadob');

select distinct ep.nom_planta from exemplar_planta ep, dosi_adob da, planta p where ep.nom_planta=p.nom_cientific and p.nom_cientific=da.nom_planta and da.quantitat_adob=(select min(quantitat_adob) from dosi_adob);























































