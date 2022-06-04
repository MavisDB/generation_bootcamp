CREATE DATABASE generation_bootcamp;
USE generation_bootcamp;
CREATE TABLE cohorte12 (cohorte12_id int NOT NULL auto_increment, alumnos_id int NOT NULL, primary key(cohorte12_id));
ALTER TABLE `generation_bootcamp`.`cohorte12` 
ADD COLUMN `instructor_id` INT NOT NULL AFTER `alumnos_id`,
ADD COLUMN `num_alumnos` INT NOT NULL AFTER `instructor_id`,
ADD COLUMN `horario` CHAR(10) NOT NULL AFTER `num_alumnos`,
ADD COLUMN `tipo_sesiones` VARCHAR(255) NOT NULL AFTER `horario`,
ADD COLUMN `ciudad` VARCHAR(255) NOT NULL AFTER `tipo_sesiones`;

INSERT INTO `generation_bootcamp`.`cohorte12` (`alumnos_id`, `instructor_id`, `num_alumnos`, `horario`, `tipo_sesiones`, `ciudad`) VALUES ('3', '1', '35', '\'12:00\'', '\'Técnica\'', '\'CDMX\'');

CREATE TABLE `generation_bootcamp`.`alumno` (
  `alumno_id` INT NOT NULL,
  `nom` VARCHAR(255) NOT NULL,
  `edad` INT NOT NULL,
  `RFC` CHAR(13) NULL,
  `nivel_ingles` VARCHAR(255) NOT NULL,
  `amonestaciones` INT NOT NULL,
  PRIMARY KEY (`alumno_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

ALTER TABLE `generation_bootcamp`.`alumno` 
ADD CONSTRAINT `FK1_alumnos_id_cohorte12`
  FOREIGN KEY (`alumno_id`)
  REFERENCES `generation_bootcamp`.`cohorte12` (`alumnos_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;