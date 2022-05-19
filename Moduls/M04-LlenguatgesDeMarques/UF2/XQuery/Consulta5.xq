(:Mostrar el nom per parelles de les botigues que venen el mateix producte i el producte
que venen. El format de sortida ha de ser "nomBotiga ven el mateix producte que
nomBotiga i el producte és nomProducte", per exemple "Fotos Dual Khan ven el mateix
producte que Fotos Dhambhala i el producte és Fotografies". Heu d’evitar que es
mostrin parelles de botigues relacionades amb elles mateixes, és a dir, per exemple
"Fotos Dual Khan ven el mateix producte que Fotos Dual Khan i el producte és
Fotografies".:)


for $mateix in /parc/botigues/zona/botiga
where $mateix/producte = $mateix/producte
(:per a que no es repeteixin s'utilitza el !=:)
and $mateix/@nom = $mateix/@nom
return concat($mateix/@nom, " ven el mateix producte que ", $mateix/@nom, " i el producte és: ", $mateix/producte)