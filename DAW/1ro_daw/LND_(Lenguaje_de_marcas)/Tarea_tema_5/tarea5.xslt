<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<!--Preparamos la plantilla-->
  <xsl:template match="/">
  <!--Abrimos etiquetas html, head y body-->
    <html>
      <head>
      <!--Agregamos la etiqueta meta para definir la codificación y el título de la página-->
        <meta charset="UTF-8"/>
        <title>Tabla de artistas</title>
      </head>
      <body>
      <!--Agregamos una etiqueta h2 con texto alineado al centro para indicar un título para la tabla.-->
        <h2 style="text-align:center">Tabla de artistas</h2>
        <!--Agregamos una tabla con borde 1, padding 2 y los márgenes derecho e izquierdo 
        en automático para que la tabla quede centrada en la página-->
        <table border="1" style="padding:2;margin: 0 auto">
        <!--Definimos en este punto el encabezado de la tabla-->
          <thead>
            <tr>
              <th>Código</th>
              <th>Nombre</th>
              <th>Año de nacimiento</th>
              <th>Año de fallecimiento</th>
              <th>País</th>
              <th>Página web</th>
            </tr>
          </thead>
          <!--Para el cuerpo de la tabla vamos a hacer un bucle con la instrucción for-each para 
          que nos muestre cada artista del elemento raíz artistas, le decimos que los ordene 
          por año de nacimiento con la instrucción sort y que los muestre sólo si el  año de 
          nacimiento es mayor a 1500 con la instrucción if-->
          <tbody>
            <xsl:for-each select="/artistas/artista">
              <xsl:sort select="nacimiento"/>
              <xsl:if test="nacimiento &gt; 1500">
              <!--Procedemos a crear cada línea de registro con la etiqueta tr, la cual contiene las 
              etiquetas td que son las que definen cada celda, alineamos los números a la 
              derecha y a todas las celdas se les dio un padding de 5.  Para el valor de cada 
              celda se usa la instrucción value-of select="NOMBRE_DE_ELEMENTO", con la 
              particularidad que cuando el elemento es un atributo es precedido por el 
              símbolo @ como es el caso de @cod. Para agregar la palabra desconocido en el 
              caso que el año de fallecimiento no estuviese establecido usamos el conjunto de 
              instrucciones choose, when, otherwise-->
                <tr>
                  <td style="text-align:right; padding:5">
                    <xsl:value-of select="@cod"/>
                  </td>
                  <td style="padding:5">
                    <xsl:value-of select="nombreCompleto"/>
                  </td>
                  <td style="text-align:right; padding:5">
                    <xsl:value-of select="nacimiento"/>
                  </td>
                  <xsl:choose>
                    <xsl:when test="fallecimiento">
                      <td style="text-align:right; padding:5">
                        <xsl:value-of select="fallecimiento"/>
                      </td>
                    </xsl:when>
                    <xsl:otherwise>
                      <td style="text-align:right; padding:5">Desconocido</td>
                    </xsl:otherwise>
                  </xsl:choose>
                  <td style="padding:5">
                    <xsl:value-of select="pais"/>
                  </td>
                  <!--Por último para que la celda de la columna Pagina Web nos muestre un enlace 
                  con el texto Saber más, creamos la etiqueta a y definimos su atributo href con 
                  el valor del campo fichaCompleta-->
                  <td style="padding:5">
                    <a><xsl:attribute name="href"><xsl:value-of select="fichaCompleta"/></xsl:attribute>
                      Saber más
                    </a>
                  </td>
                </tr>
              </xsl:if>
            </xsl:for-each>
          </tbody>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
