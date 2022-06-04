-- MOSTRAR LAS DIRECCIONES DE CADA PAIS
/*
Address - Adress / City_id
City - city_id / city / country_id
country - country / country_id
*/

SELECT
country.country_id AS clave_de_Pais,
country.country AS Pais,
city.city_id AS clave_de_ciudad,
city.city AS Ciudad,
address.address AS Direccion
FROM country 
INNER JOIN city ON city.country_id = country.country_id
INNER JOIN address ON address.city_id = city.city_id;