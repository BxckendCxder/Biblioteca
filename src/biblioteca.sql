-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema biblioteca
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `biblioteca` ;

-- -----------------------------------------------------
-- Schema biblioteca
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `biblioteca` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `biblioteca` ;

-- -----------------------------------------------------
-- Table `biblioteca`.`admins`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `biblioteca`.`admins` ;

CREATE TABLE IF NOT EXISTS `biblioteca`.`admins` (
  `idadmins` INT NOT NULL AUTO_INCREMENT,
  `user` VARCHAR(45) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_bin' NOT NULL,
  `pass` VARCHAR(45) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_bin' NOT NULL,
  PRIMARY KEY (`idadmins`),
  UNIQUE INDEX `idadmins_UNIQUE` (`idadmins` ASC) VISIBLE,
  UNIQUE INDEX `user_UNIQUE` (`user` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `biblioteca`.`cds`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `biblioteca`.`cds` ;

CREATE TABLE IF NOT EXISTS `biblioteca`.`cds` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NOT NULL,
  `artista` VARCHAR(45) NOT NULL,
  `genero` VARCHAR(45) NOT NULL,
  `duracion` TIME NOT NULL,
  `numeroDeCanciones` INT NOT NULL,
  `unidadesDisponibles` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `biblioteca`.`documentos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `biblioteca`.`documentos` ;

CREATE TABLE IF NOT EXISTS `biblioteca`.`documentos` (
  `iddocumentos` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  `catalogo` VARCHAR(45) NOT NULL,
  `numero_paginas` INT NOT NULL,
  PRIMARY KEY (`iddocumentos`),
  UNIQUE INDEX `iddocumentos_UNIQUE` (`iddocumentos` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `biblioteca`.`estudiantes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `biblioteca`.`estudiantes` ;

CREATE TABLE IF NOT EXISTS `biblioteca`.`estudiantes` (
  `idestudiantes` INT NOT NULL AUTO_INCREMENT,
  `user` VARCHAR(45) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_bin' NOT NULL,
  `pass` VARCHAR(45) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_bin' NOT NULL,
  PRIMARY KEY (`idestudiantes`),
  UNIQUE INDEX `idestudiantes_UNIQUE` (`idestudiantes` ASC) VISIBLE,
  UNIQUE INDEX `user_UNIQUE` (`user` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `biblioteca`.`libros`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `biblioteca`.`libros` ;

CREATE TABLE IF NOT EXISTS `biblioteca`.`libros` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NOT NULL,
  `autor` VARCHAR(45) NOT NULL,
  `numeroDePaginas` SMALLINT NOT NULL,
  `editorial` VARCHAR(45) NOT NULL,
  `ISBN` CHAR(17) NOT NULL,
  `yearPub` SMALLINT NOT NULL,
  `unidadesDisponibles` SMALLINT NOT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE INDEX `AutoIncrement_UNIQUE` (`Id` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `biblioteca`.`profesores`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `biblioteca`.`profesores` ;

CREATE TABLE IF NOT EXISTS `biblioteca`.`profesores` (
  `idprofesores` INT NOT NULL AUTO_INCREMENT,
  `user` VARCHAR(45) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_bin' NOT NULL,
  `pass` VARCHAR(45) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_bin' NOT NULL,
  PRIMARY KEY (`idprofesores`),
  UNIQUE INDEX `idprofesores_UNIQUE` (`idprofesores` ASC) VISIBLE,
  UNIQUE INDEX `user_UNIQUE` (`user` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `biblioteca`.`revistas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `biblioteca`.`revistas` ;

CREATE TABLE IF NOT EXISTS `biblioteca`.`revistas` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NOT NULL,
  `autor` VARCHAR(45) NOT NULL,
  `numeroDePaginas` SMALLINT NOT NULL,
  `editorial` VARCHAR(45) NOT NULL,
  `ISBN` CHAR(17) NOT NULL,
  `yearPub` SMALLINT NOT NULL,
  `unidadesDisponibles` SMALLINT NOT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE INDEX `AutoIncrement_UNIQUE` (`Id` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `biblioteca`.`tesis`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `biblioteca`.`tesis` ;

CREATE TABLE IF NOT EXISTS `biblioteca`.`tesis` (
  `idtesis` INT NOT NULL AUTO_INCREMENT,
  `autor` VARCHAR(45) NOT NULL,
  `titulo` VARCHAR(45) NOT NULL,
  `director` VARCHAR(45) NOT NULL,
  `universidad` VARCHAR(45) NOT NULL,
  `year_defensa` INT NOT NULL,
  PRIMARY KEY (`idtesis`),
  UNIQUE INDEX `idtesis_UNIQUE` (`idtesis` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
