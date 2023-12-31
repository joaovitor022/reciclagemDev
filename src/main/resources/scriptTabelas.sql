DROP TABLE IF EXISTS USUARIO;
DROP TABLE IF EXISTS EMPRESA;
DROP TABLE IF EXISTS POST;
DROP TABLE IF EXISTS PRODUTO;

CREATE TABLE USUARIO (
    IDCONTAUSUARIO INT AUTO_INCREMENT PRIMARY KEY,
    NOME VARCHAR(100),
    SOBRENOME VARCHAR(100),
    CPF VARCHAR(100),
    EMAIL VARCHAR(100),
    SENHA VARCHAR(100),
    ENDERECO VARCHAR(100)
);

CREATE TABLE EMPRESA (
    IDEMPRESA INT AUTO_INCREMENT PRIMARY KEY,
    SENHA VARCHAR(100),
    EMAIL VARCHAR(100),
    ENDERECO VARCHAR(100),
    CNPJ VARCHAR(100),
    NOMEEMPRESA VARCHAR(100)
);

CREATE TABLE POST (
    IDPRODUTO INT AUTO_INCREMENT PRIMARY KEY,
    PESO INT,
    DESCRICAO VARCHAR(200),
    MATERIAL VARCHAR(100),
    NOME VARCHAR(100),
    SOBRENOME VARCHAR(100),
    ENDERECO VARCHAR(100)
);

INSERT INTO EMPRESA (CNPJ, NOMEEMPRESA, EMAIL, SENHA, ENDERECO) VALUES ('12345678901234', 'EmpresaTeste', 'empresa@empresa.com', 'empresa', 'Rua da empresa');
INSERT INTO USUARIO (NOME, SOBRENOME, CPF, EMAIL, SENHA, ENDERECO) VALUES ('Usuario', 'Teste', '12332121321', 'usuario@usuario.com', 'usuario', 'Rua do usuario');
