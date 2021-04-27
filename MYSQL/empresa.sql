-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema empresa
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Table `RH`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `RH` (
  `idRH` INT NOT NULL,
  PRIMARY KEY (`idRH`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `funcionario` (
  `nome` VARCHAR(30) GENERATED ALWAYS AS () VIRTUAL,
  `Salario` VARCHAR(30) NULL,
  `data de nascimento` VARCHAR(30) NULL,
  `matricula` VARCHAR(30) NULL,
  `cargo` VARCHAR(30) NULL,
  PRIMARY KEY (`nome`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `RH da empresa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `RH da empresa` (
  `Responsavel RH` VARCHAR(30) GENERATED ALWAYS AS (),
  `funcionario_nome` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`Responsavel RH`, `funcionario_nome`),
  INDEX `fk_RH da empresa_funcionario_idx` (`funcionario_nome` ASC) VISIBLE,
  CONSTRAINT `fk_RH da empresa_funcionario`
    FOREIGN KEY (`funcionario_nome`)
    REFERENCES `funcionario` (`nome`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
