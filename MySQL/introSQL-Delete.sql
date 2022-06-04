-- Borrar una fila
DELETE FROM mascotita WHERE mascota_id = 4;

-- Borrar una columna
ALTER TABLE mascotita DROP COLUMN cumpleanos;
ALTER TABLE mascotita DROP COLUMN especie;

SELECT * FROM mascotita;

-- Borrar una table
DROP TABLE mascotita;

-- Borrar la base de datos
DROP DATABASE familia;