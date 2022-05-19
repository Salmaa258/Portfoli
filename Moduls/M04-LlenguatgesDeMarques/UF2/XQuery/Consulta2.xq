(:Mostra les atraccions d’intensitat forta que l’edat mínima per accedir sense adults sigui
més de 12.:)

for $intensitat in /parc/atraccions/zona/atraccio
where $intensitat/intensitat = "Forta"
and $intensitat/edatMinima/@adult = "no"
and $intensitat/edatMinima >12
return $intensitat/@nom