CREATE TABLE receitas (
  cod INT NOT NULL AUTO_INCREMENT,
  nomeDaReceita VARCHAR(60) NOT NULL,
  nomeAutor VARCHAR(20),
  rendimentoPorcao INT,
  categoria VARCHAR(20) NOT NULL,
  tempo time NOT NULL,
  passos VARCHAR(1024),
  ingredientes VARCHAR(1024),
  PRIMARY KEY(cod)
);