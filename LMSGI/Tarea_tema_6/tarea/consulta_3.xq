(: Nombre de los artistas para los que no hay año de fallecimiento. :)
for $x in doc("artistas.xml")/artistas/artista
where empty($x/fallecimiento)
return  <artista>{$x/nombreCompleto}</artista>