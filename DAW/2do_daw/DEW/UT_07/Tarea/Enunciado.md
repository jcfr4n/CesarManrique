# ¿Qué te pedimos que hagas?
Partiendo del fichero.html que se te proporciona en Información de Interés, se pide realizar los siguientes apartados:

- Previamente se debe crear en PhpMyAdmin que nos proporciona Xampp, la BD espana, ejecutar los 3 scripts sql que se proporcionan en Información de interés para crear las 3 tablas en la BD y todas las filas de las tablas con los datos proporcionados.

- Creamos un fichero.php para establecer la conexión a la BD mediante el método POST o GET. Y convertimos la salida del fichero, en JSON con json_encode

- En el fichero.html solo se puede añadir la línea de referencia al fichero JavaScript (js)

- Debemos ocultar el select id="provincias" e id="municipios y cargar con los datos de la BD las comunidades en el select id="comunidades". Todos los select mostrarán el primer campo en blanco.

- Al seleccionar en el select id="comunidades" una opción, cuando detecte un cambio, deberá mostrar las provincias. Es decir, mostrar el select id="provincias" y cargar las provincias de dicha comunidad autónoma seleccionada de la BD.

- Al seleccionar en el select id="provincias" una opción, cuando detecte un cambio, deberá mostrar los municipios. Es decir, mostrar el select id="municipios" y cargar los municipios de dicha provincia seleccionada de la BD

- Si después de estos pasos volvemos a elegir otra provincia, deberemos borrar todo lo que hay en el select id="municipios" y cargarlo con los municipios de la nueva provincia seleccionada.

- Si por el contrario lo que queremos es cambiar la CCAA entonces tendremos que deshabilitar el select id="muncipios" para que no se vea, y borrar los elementos que hay en el select id="provincias" y añadir las provincias de la nueva selección de CCAA.