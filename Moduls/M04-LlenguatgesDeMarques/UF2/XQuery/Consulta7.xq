(:Heu d’afegir un nou atribut vip amb valor 1 en els serveis de pass preferent.:)

for $vip in doc("parc.xml")/parc/atraccions/zona/atraccio
where $vip/servei = "PassPreferent"
return
insert node <vip>1</vip> into $vip