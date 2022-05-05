use plantes;

/*43*/select p.nom_popular from planta p, exemplar_planta ep where p.floracio='Estiu' and p.nom_cientific=ep.nom_planta;

/*44*/select pe.nom_planta, pe.tipus_planta from planta_exterior pe, planta p where (p.floracio='Primavera') and (pe.nom_planta=nom_cientific);

/*45*/select pe.nom_planta, a.nom_adob from planta_exterior pe, adob a, planta p, dosi_adob da where (a.nom_firma='CIRSADOB') and (a.nom_adob=da.nom_adob) and (da.nom_planta=p.nom_cientific) and (p.nom_cientific=pe.nom_planta);

/*46*/select distinct r.metode_reproduccio from reproduccio r, exemplar_planta ep, planta p where r.nom_planta=p.nom_cientific and p.nom_cientific=ep.nom_planta;

/*47*/select concat(p.nom_popular,'(',da.quantitat_adob,')')from planta p, adob a, dosi_adob da where a.nom_firma='UOCADOB' and p.nom_cientific=da.nom_planta and da.nom_adob=a.nom_adob;

/*48*/select p.nom_popular, r.metode_reproduccio from planta p, reproduccio r where p.floracio='Hivern' and r.nom_planta=p.nom_cientific;

/*49*/select distinct nom_cientific, nom_popular from planta p, planta_interior pi, reproduccio r, planta_exterior pe where (pe.nom_planta=p.nom_cientific) and (r.metode_reproduccio='esqueix') or (pi.nom_planta=p.nom_cientific) and (p.nom_cientific=r.nom_planta) and (r.grau_exit='Baix');

/*50*/select distinct p.nom_popular, p.floracio from planta p, dosi_adob da where da.nom_planta=p.nom_cientific and da.quantitat_adob>40;

/*51*/select p.nom_popular from planta p, planta_interior pi, planta_exterior pe where (pi.ubicacio='Llum indirecta' and pi.nom_planta=p.nom_cientific)  or (pe.tipus_planta='T' and pe.nom_planta=p.nom_cientific);

/*52*/select p.nom_cientific, p.floracio from planta p, exemplar_planta ep where ep.nom_planta=p.nom_cientific;

/*53*/select a.nom_adob, a.nom_firma from adob a, dosi_adob da where da.quantitat_adob between 20 and 40 and a.nom_adob=da.nom_adob;

/*54*/select distinct upper(p.nom_popular) from planta p, exemplar_planta ep, dosi_adob da, adob a where a.tipus_adob='AI' and ep.nom_planta=p.nom_cientific and a.nom_adob=da.nom_adob and p.nom_cientific=da.nom_planta;

/*55*/select p.nom_popular, pi.ubicacio from planta p, planta_interior pi, exemplar_planta ep where ep.nom_planta=p.nom_cientific and pi.nom_planta=p.nom_cientific;

/*56*/select p.nom_popular, a.nom_adob, da.quantitat_adob+10 from planta p, adob a, dosi_adob da where (da.nom_planta=p.nom_cientific) and (a.nom_adob=da.nom_adob) and (da.quantitat_adob<=30 or a.nom_firma='PRISADOB') ;  

/*57*/select p.nom_popular from planta p, adob a, dosi_adob da where a.tipus_adob='AI' and a.nom_adob=da.nom_adob and p.floracio='Primavera' and da.nom_planta=p.nom_cientific;

/*58*/select p.nom_cientific, r.metode_reproduccio from planta p, reproduccio r, dosi_adob da where r.nom_planta=p.nom_cientific and da.nom_adob<>'Casadob' and da.nom_planta=p.nom_cientific;

/*59*/select distinct p.floracio from planta p, exemplar_planta ep where p.nom_cientific=ep.nom_planta; 

/*60*/select p.nom_popular, r.metode_reproduccio, left(r.grau_exit,1) from planta p, reproduccio r where r.grau_exit<>'Alt' and r.nom_planta=p.nom_cientific;

/*61*/select distinct p.nom_cientific from planta p, dosi_adob da where da.nom_estacio=p.floracio;

/*62*/select distinct lower(p.nom_cientific) from planta p, planta_exterior pe, adob a, dosi_adob da, reproduccio r, planta_interior pi where (pe.nom_planta=p.nom_cientific and p.nom_cientific=da.nom_planta and da.nom_adob=a.nom_adob and a.nom_firma='CIRSADOB') or (pi.nom_planta=p.nom_cientific and p.nom_cientific=r.nom_planta and r.metode_reproduccio='Capficats');




