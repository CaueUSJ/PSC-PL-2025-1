create database if not exists universidade;
show databases;
use universidade;

CREATE TABLE if not exists aluno(
id_aluno int primary key auto_increment,
nome varchar(100) not null,
ra int not null,
nota decimal (3,1) /*primeiro parametro: quantidade de algorismo, segundo argumento: quantidade de casas decimais*/
);

ALTER TABLE aluno ADD senha VARCHAR(255);

SHOW TABLES;
describe aluno;

INSERT INTO Produtos
VALUES (1, 'Notebook', 1200.00);

alter table aluno add column telefone varchar(20);