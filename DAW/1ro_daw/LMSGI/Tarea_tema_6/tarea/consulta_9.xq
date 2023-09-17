(: Marca y modelo de las impresoras con tamaño A3 como único tamaño. :)
for $x in doc("impresoras.xml")/impresoras/impresora
where $x/tamaño = "A3" and count($x/tamaño) = 1
return <impresora>{$x/marca, $x/modelo}</impresora>