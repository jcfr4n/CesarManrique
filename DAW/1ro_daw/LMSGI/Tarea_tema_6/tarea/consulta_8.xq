(: Marca y modelo de las impresoras con tamaño A3 (pueden tener otros). :)
for $x in doc("impresoras.xml")/impresoras/impresora
where $x/tamaño = "A3"
return <impresora>{$x/marca, $x/modelo}</impresora>