-- ACTUALIZAR

-- Agregar una columna
ALTER TABLE mascota ADD COLUMN especie VARCHAR(255) NOT NULL;


-- Agrega una columna en ua posicion especifica
ALTER TABLE mascota ADD COLUMN cumpleanos DATE AFTER edad;

-- Modificar las caracteristicas de una columna
ALTER TABLE mascota MODIFY edad int;

-- No podeoms cambiar el nombre de una columna
ALTER TABLE mascota CHANGE COLUMN edad edadP int NOT NULL;

-- Renombrar la tabla
ALTER TABLE mascota RENAME mascotita;


-- Actualizar datos de una fila

-- Error 1175: No podemos actualizar si no seleccionamos la llave primaria
UPDATE mascotita SET especie = 'Gato' WHERE nom = 'Leo';

-- Forma correcta
UPDATE mascotita SET especie = 'Gato' WHERE mascota_id = 1;
UPDATE mascotita SET especie = 'Perro', edadP = 10 WHERE mascota_id = 2;
UPDATE mascotita SET nom = 'Leo' WHERE mascota_id = 1;
SELECT* FROM persona;
SELECT* FROM mascotita;

