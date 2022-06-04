USE sakila;
SELECT * FROM payment;

-- COUNT() contar los elementos o las celdas de una columna
-- AS nos permit darle un alias o nom temporal a la columna
SELECT count(*) AS cantidad_filas FROM payment;
SELECT count(*) AS cantidad_filas FROM payment WHERE staff_id = 1;
SELECT count(distinct customer_id) FROM payment WHERE staff_id = 2;

-- CONTAR FILAS DE LA TABLA world.country
SELECT count(*) FROM world.country;

-- SUM() Realiza una suma de los valores de una columna
SELECT SUM(amount) AS TOTAL FROM payment;

-- CUAL ES EL CLIENTE QUE GASTO MAS EN RENTAS?
SELECT customer_id, SUM(amount) AS total FROM payment GROUP BY customer_id order by total desc;
SELECT SUM(amount), customer_id from payment GROUP BY customer_id ORDER BY amount;

-- GROUP BY agrupa  filas que contengan el mismo valor
-- Normalmente se usa un conjunto con COUNT(), AVG (), SUM()
SELECT customer_id, amount FROM payment GROUP BY customer_id;

-- AVG nos permite obtener un promedio de cantidades en una columna
SELECT AVG (amount) AS promedio FROM payment WHERE customer_id = 248;
SELECT AVG





