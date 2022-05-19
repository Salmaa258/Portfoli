(:Mostra el nom de les atraccions que l’edat mínim per accedir sigui de 10 o menys
sense tenir en compte si es pot accedir sense o amb una persona adulta. Els noms de
les atraccions s’ha de mostrar amb el següent format: "Nom atracció: nomAtraccio",
per exemple "Nom atracció: Pati Mission".:)

for $atraccio in /parc/atraccions/zona/atraccio
where $atraccio/edatMinima <=10
return concat("Nom atracció: ",$atraccio/@nom)