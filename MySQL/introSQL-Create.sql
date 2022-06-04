-- Crear
-- Crear una bd
-- CREATE SCHEMA familia; OTRA FORMA
CREATE DATABASE familia;

-- Seleccionar bd
USE familia;

-- Crear tabla de persona, es necesario poner inimo una columna
-- No es necesario poner NOT NULL en llave primaria
-- Por defecto el valor asignado es NULL
-- Debeos especificar cual es la llave primaria
-- Para agrega valores unicos se utliza UNIQUE
CREATE TABLE persona(
	persona_id int AUTO_INCREMENT,
    nom VARCHAR(255) NOT NULL,
    correo VARCHAR (255) NOT NULL,
    edad int NOT NULL,
    estado VARCHAR (255) DEFAULT "Desconocido",
    cumpleanos DATE,
    PRIMARY KEY(persona_id),
    CONSTRAINT correo_unico UNIQUE (correo)
);

-- Insertar datos en una tabla
-- Tienen que ser en el orden indicado
-- No se necesita colocar el id porque es auto incrementable
INSERT INTO persona(nom, correo, edad, estado,cumpleanos) values
('Daniela','mitzi_miz@hotmail.com', 23, 'Bah','1998-07-13'),
('Bruno', 'bruno_diaz@hotmail.com', 27, 'Triste', '1994-04-22');

-- Error 1062: dato unico repetido
INSERT INTO persona(nom, correo, edad, estado, cumpleanos) values
('David','mitzi_miz@hotmail.com', 24, 'Feliz', '1997-11-04');

-- Error 1364: De no llenar un dato NOT NULL
INSERT INTO persona(correo, edad, estado, cumpleanos) values
('elian_2006@hotmail.com', 16, 'Desanimada', '2006-01-13');

-- INGRESAR DATOS QUE NO SON NECESARIOS (no tiene cumpleaños)
INSERT INTO persona(nom, correo, edad, estado) value
('Elian', 'elian_2006@hotmail.com', 16, 'Desanimada');

-- Ingresar datos con valor por defecto (no tiene estado)
INSERT INTO persona(nom, correo, edad, cumpleanos) value 
('Raquel', 'raquelita09@hotmail.com', 17, '2005-08-30');

SELECT* FROM persona;

CREATE TABLE mascota(
	mascota_id int AUTO_INCREMENT,
    nom VARCHAR(255) NOT NULL,
    edad int NOT NULL,
    fk1_persona int NOT NULL,
    PRIMARY KEY (mascota_id),
    FOREIGN KEY (fk1_persona) REFERENCES persona(persona_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

SELECT* FROM mascota;

INSERT INTO mascota (nom, edad, fk1_persona) values
('leo', 3, 1),
('Tobi', 9, 1),
('Beni', 12, 2),
('Patitas', 3, 4);
