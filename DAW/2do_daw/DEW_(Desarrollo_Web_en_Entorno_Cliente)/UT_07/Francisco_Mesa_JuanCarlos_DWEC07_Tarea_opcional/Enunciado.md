# Partiendo del fichero.html que se te proporciona en Información de Interés, se pide realizar los siguientes apartados:
---
- Descargamos el fichero.xml de la predicción detalla del tiempo en la página AETMET sobre el municipio que queramos. Ver enlace en Información de interés.
- Creamos una función obtener fecha, que nos calcule la fecha de hoy y le sume 2 días, devolviéndola con el formato aaaa-mm-dd.
- Comprobamos en el fichero.xml el atributo fecha de la etiqueta día que sea igual que el valor devuelto por la función del apartado anterior.Encontramos la fecha moviéndonos por los nodos.
- Procesamos el fichero.xml para obtener la temperatura máxima y mínima de dicho municipio dos días posteriores al de hoy. La etiqueta temperatura es hija de la etiqueta día, se debe acceder con children.
- Mostramos la siguiente información en el id="parrafo" del html. Municipio: nombre_municipio, La predicción dentro de 2 días con fecha fecha en dos días es de: Tª máxima = valor1, Tª mínima = valor2 ". Y deshabilitamos el botón Consultar Tª en municipios.