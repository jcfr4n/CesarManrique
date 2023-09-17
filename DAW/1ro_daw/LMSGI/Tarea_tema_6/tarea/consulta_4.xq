(: Una lista HTML con el nombre de los artistas nacidos en España. :)
<ul>
{
for $x in doc("artistas.xml")/artistas/artista
where $x/pais = "España"
return  <li>{data($x/nombreCompleto)}</li>
}
</ul>