USE world;
SELECT 5 + 5;
SELECT * FROM country;
SELECT `Name`, Population FROM country ORDER BY Population ASC;
SELECT population country WHERE `Name` = 'Mexico';
SELECT * FROM country WHERE Population > 50000000 and population < 70000000 ORDER BY Population;

-- BETWEEN regresa datos dentro de  un rango que nosotros especifiquemos
SELECT * FROM country WHERE population between 50000000 and 70000000 ORDER BY population;

SELECT * FROM country WHERE Continent = 'North America' OR Continent = 'Asia' OR Continent = 'Ocean' ORDER BY Continent;

-- IN nos permite especificar condiciones
SELECT * FROM country WHERE Continent IN ('Asia', 'North America', 'Oceania') ORDER BY Continent;

-- LIKE nos permite buscar patron especifico
SELECT * FROM country WHERE `Name` like '%and';
SELECT * FROM country WHERE `Name` like '%e__a';

-- DISTINCT selecciona los elementos distintos dentro de una lista de valores
SELECT Continent from country;
SELECT DISTINCT Continent FROM country;