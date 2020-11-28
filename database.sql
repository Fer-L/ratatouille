CREATE DATABASE ratatouille;

USE ratatouille;

CREATE TABLE receitas (
  cod INT NOT NULL AUTO_INCREMENT,
  nomeDaReceita VARCHAR(60) NOT NULL,
  nomeAutor VARCHAR(20),
  rendimentoPorcao INT NOT NULL,
  categoria VARCHAR(20) NOT NULL,
  tempo float NOT NULL,
  passos VARCHAR(1024) NOT NULL,
  ingredientes VARCHAR(1024) NOT NULL,
  PRIMARY KEY(cod)
);