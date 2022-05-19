(:Mostrar el nom de botigues i restaurants que estiguin en la mateixa zona. El format de
sortida ha de ser: "nomBotiga està en la mateixa zona que nomRestaurant", per
exemple "Fotos Hurakan Truancy està en la mateixa zona que La Cantina del Coper":)

for $botres in doc("parc.xml")
where $botres/parc/restaurants/zona/@nom = $botres/parc/botigues/zona/@nom
return concat($botres/parc/botigues/zona/botiga/nom
," està en la mateixa zona que ", $botres/parc/restaurants/zona/restaurant/nom)