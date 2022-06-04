-- LEER
-- muestra las bd que tenemos
SHOW DATABASES;
-- CTRL + ENTER ES COMO DARLE AL RAYO EN LINEA

-- Seleccionar la bd a usar
USE sakila;

-- leer todos los datos de una tabla
SELECT* FROM actor;
SELECT* FROM city;

-- leer partes de una tabla
SELECT first_name, last_name FROM actor;

-- limitar la cantidad de datos
SELECT * FROM actor LIMIT 10;

-- Ordenar los datos dependiendo de una columna
-- DESC - Ordenar de forma descendente
-- ASC -- Ordenar de forma ascendente

SELECT *FROM city ORDER BY country_id DESC;

/*
Operadores de comparación
Igual -->  =
Dstintintivo --> !=
Mayor -->   >
Menor -->   <
Mayor o igual -->  =>
Menor o igual -->  <=

*/

SELECT * FROM city WHERE city = "Cuman";
SELECT* FROM actor WHERE first_name = "Penelope";

SELECT * FROM actor WHERE first_name != 'Penelope';

SELECT * FROM actor WHERE actor_id > 50 && actor_id < 100;
SELECT * FROM actor WHERE actor_id > 50;
SELECT * FROM actor WHERE actor_id < 100;
SELECT * FROM actor WHERE actor_id >= 50;
SELECT * FROM actor WHERE actor_id <= 100;

SELECT* FROM actor WHERE first_name LIKE "Penelope";

-- Se utiiza para realizar busquedas
-- Selecciona de la tabla todas las personas que termine su first_name con 'ope'
SELECT* FROM actor WHERE first_name LIKE "%an";

-- Seleccionar de la tablat¿ todas las personas cuyo 'first_name' empece con 'an'
SELECT * FROM actor WHERE first_name LIKE "an%";

-- Seleccionar de la tabla todas as personas que contengan 'n'
SELECT * FROM actor WHERE first_name LIKE '%nn%';
SELECT * FROM actor WHERE last_name LIKE "%ll%";

-- Seleccionar un patrón
SELECT * FROM actor WHERE first_name LIKE "%k_r%";

-- Seleccionar un patron
SELECT * FROM actor WHERE first_name LIKE "%a__e%";

-- Uniendo todo
SELECT * FROM actor WHERE first_name LIKE "%nn%" ORDER BY last_name ASC LIMIT 5;

/*
Operadores logicos
AND		Debe cumplir ambas condiciones
OR		Basta con que se cumpla una de ellas
*/
SELECT * FROM actor WHERE actor_id > 50 AND first_name LIKE "%n%";
SELECT * FROM actor WHERE first_name LIKE "%n%";

