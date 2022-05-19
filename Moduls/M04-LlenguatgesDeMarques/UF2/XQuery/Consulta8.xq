(:Heu d’afegir un nou element preu en els espectacles que siguin passatges del terror.:)

for $preu in doc("parc.xml")/parc/espectacles/zona/espectacle
where $preu/tipus = "Passatge del terror"
return
insert node <preu></preu> into $preu