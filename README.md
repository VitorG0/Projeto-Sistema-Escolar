# Projeto-Sistema-Escolar

°OBJETIVO:

O objetivo do sistema é realizar o gerenciamento básico de uma instituição de ensino, permitindo o cadastro e controle de alunos, professores, escolas e disciplinas, além de organizar os relacionamentos entre essas entidades.

O sistema busca facilitar a organização acadêmica, permitindo associar alunos e professores às disciplinas e escolas de forma estruturada.

°FUNCIONALIDADES DO SISTEMA

O sistema possui as seguintes funcionalidades principais:

Cadastro de alunos
Cadastro de professores
Cadastro de escolas
Cadastro de disciplinas
Associação de:
Professores com escolas
Professores com disciplinas
Alunos com disciplinas
Exibição das informações cadastradas no sistema
Manipulação de dados através de getters e setters

°MODELAGEM DE SISTEMA:
A modelagem foi feita utilizando o paradigma de Programação Orientada a Objetos (POO).

°Classes principais:

Aluno:
nome
matrícula
turma

Professor:
nome
disciplina
salário

Escola:
nome
id_escola
endereço

Disciplina:
nome
id_disciplina

App (Main):
Responsável por executar o sistema e testar os objetos

°RELACIONAMENTOS

O sistema possui diversos relacionamentos importantes:

ALUNO ↔ DISCIPLINA
Um aluno pode estar em várias disciplinas
Uma disciplina pode ter vários alunos
(Relacionamento N:N)

PROFESSOR ↔ DiSCIPLINA
Um professor pode lecionar várias disciplinas
Uma disciplina pode ter vários professores
(Relacionamento N:N)

PROFESSOR ↔ ESCOLA
Um professor pode trabalhar em várias escolas
Uma escola pode ter vários professores
(Relacionamento N:N)

°REGRAS DE NEGÓCIO

Todo aluno deve possuir um nome válido
Toda disciplina deve ter um nome definido
Um professor pode lecionar mais de uma disciplina
Um aluno pode estar matriculado em várias disciplinas
Não é permitido cadastrar entidades sem identificação básica
Os relacionamentos devem respeitar as chaves estrangeiras no banco

°BANCO DE DADOS

O banco de dados foi estruturado utilizando modelo relacional com as seguintes tabelas:

°TABELAS PRINCIPAIS:
escola
professor
aluno
disciplina

TABELA DE RELACIONAMENTO:
escola_prof (Professor x Escola)
prof_disc (Professor x Disciplina)
aluno_disc (Aluno x Disciplina)

°CARACTERÍSTICA:
Uso de PRIMARY KEY
Uso de FOREIGN KEY
Relacionamentos N:N resolvidos com tabelas associativas
Tipos de dados adequados (VARCHAR, NUMERIC, DATE, etc.)

°TECNOLOGIAS UTILIZADAS

Java
Programação Orientada a Objetos
SQL (PostgreSQL ou compatível)
Criação e gerenciamento do banco de dados
Estrutura em pacotes (package entidade)

°CONSIDERAÇÕES FINAIS

O sistema desenvolvido apresenta uma base sólida para um sistema de gestão escolar, aplicando conceitos importantes como:

Programação Orientada a Objetos
Encapsulamento (getters e setters)
Modelagem de banco de dados relacional
Uso de relacionamentos complexos (N:N)

Apesar de ser um sistema simples, ele pode ser expandido futuramente com:

Interface gráfica
Integração com banco de dados real via JDBC
Funcionalidades de login e autenticação
CRUD completo (Create, Read, Update, Delete)
