(:Heu d’eliminar el servei de seients vip dels espectacles.:)

for $vip in doc("parc.xml")/parc/espectacles/zona/espectacle/servei
where $vip = "Seient VIP"
return
delete node $vip