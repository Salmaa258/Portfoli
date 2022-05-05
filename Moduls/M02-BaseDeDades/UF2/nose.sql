use plantes;

select nom_popular, nom_cientific from planta where floracio='Estiu';

select nom_cientific from adob where adob='Casadob';

select nom_adob, tipus_adob from adob where nom_firma='PRISADOB';

select nom_planta, temperatura from planta_interior where temperatura>16;

select nom_planta, quantitat_adob from dosi_adob;

select nom_planta, quantitat_adob from dosi_adob where quantitat_adob between 40 and 50;

