USE tienda;
-- JOINS nos permiten combinar datos de distintas tablas
-- Inner join

SELECT
p.idProducto,
p.nombre AS producto,
p.idCategoria,
c.nombre AS categoria
FROM producto p
INNER JOIN categoria c
ON p.idCategoria = c.idCategoria
ORDER BY clave;

-- LEFT JOIN
-- Siempre devuelve las filas de la primer tabla, aunque la condicion no se cuumpla

SELECT
cliente.nombre AS nombre,
factura.idFactura
FROM cliente
LEFT JOIN factura ON cliente.idCliente = factura.idCliente
ORDER BY nombre;

-- RIGHT JOIN
-- Siempre devuelve las filas de la segunda tabla, aunque la condicion no se cuumpla
SELECT
cliente.nombre AS nombre,
factura.idFactura
FROM cliente
RIGHT JOIN factura ON cliente.idCliente = factura.idCliente
ORDER BY idFactura;












