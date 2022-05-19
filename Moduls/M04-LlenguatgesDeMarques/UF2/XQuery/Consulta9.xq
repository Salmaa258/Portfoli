(:Heu de modificar el nom de l’etiqueta menuEspecial dels menús especials de tipus
infantil pel nom petitMenu.:)

for $menu in doc("parc.xml")/parc/restaurants/zona/restaurant/menuEspecial
where $menu = "Infantil"
return
rename node $menu as "petitMenu"