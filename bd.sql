create database if not exists universidade;
show databases;
use universidade;

CREATE TABLE if not exists aluno(
id_aluno int primary key auto_increment,
nome varchar(100) not null,
ra int not null,
nota decimal (3,1) /*primeiro argumento: quantidade de algorismo, segundo argumento: quantidade de casas decimais*/
);

SHOW TABLES;
describe aluno;

alter table aluno add column telefone varchar(20);
alter table aluno add column senha varchar(20);