use plantes;

/*23*/select nom_popular, nom_cientific from planta where floracio='Estiu';

/*24*/select nom_planta from dosi_adob where nom_adob='Casadob';

/*25*/select nom_adob, tipus_adob from adob where nom_firma='PRISADOB';

/*26*/select nom_planta, temperatura from planta_interior where temperatura>16;

/*27*/select sum(quantitat_adob) from dosi_adob;

/*28*/select nom_planta, quantitat_adob from dosi_adob where quantitat_adob between 40 and 50;

/*29*/select nom_planta, nom_estacio from dosi_adob where nom_estacio='Hivern' or nom_estacio='Tardor';

/*30*/select avg(quantitat_adob) from dosi_adob where nom_adob='Casadob';

/*31*/select nom_cientific, nom_popular from planta where nom_popular like '%i%';

/*32*/select avg(temperatura) from planta_interior;

/*33*/select nom_adob, nom_firma from adob where nom_firma='CIRSADOB' or nom_firma='TIRSADOB';

/*34*/select count(num_exemplar) from exemplar_planta;

/*35*/select min(quantitat_adob) Minima, max(quantitat_adob) Maxima from dosi_adob;

/*36*/select max(temperatura) from planta_interior;

/*37*/select nom_planta from dosi_adob where quantitat_adob>40 and nom_adob='Casadob';

/*38*/select distinct nom_planta from exemplar_planta where num_exemplar>4; 

/*39*/select sum(quantitat_adob) from dosi_adob where nom_planta='Euphorbia';

/*40*/select nom_planta, nom_estacio, nom_adob from dosi_adob where nom_estacio='Primavera' or nom_adob='Sanexplant';

/*41*/select nom_planta from reproduccio where metode_reproduccio='Esqueix' and grau_exit='Alt';

/*42*/select count(grau_exit) from reproduccio where grau_exit='Mitjà';
