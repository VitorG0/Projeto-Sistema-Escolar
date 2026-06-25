# SISTEMA ESCOLAR – DESCRIÇÃO ATUALIZADA DO PROJETO

## Objetivo

O Sistema Escolar é uma aplicação desenvolvida em Java com integração ao banco de dados PostgreSQL, cujo objetivo é realizar o gerenciamento básico de informações acadêmicas. O sistema permite cadastrar e consultar alunos, além de manter a estrutura necessária para o gerenciamento de professores, disciplinas e seus relacionamentos.

O projeto foi desenvolvido para aplicar conceitos de Programação Orientada a Objetos (POO), modelagem de banco de dados relacional, JDBC e padrão DAO, proporcionando uma experiência prática no desenvolvimento de sistemas integrados a banco de dados.

---

## Evolução do Projeto

Inicialmente, o projeto possuía um escopo mais amplo, incluindo entidades como Escola e outros relacionamentos administrativos. Durante o desenvolvimento, o escopo foi reduzido para concentrar os esforços nas funcionalidades acadêmicas essenciais.

Essa alteração permitiu uma implementação mais consistente das funcionalidades principais, priorizando a integração com banco de dados e a organização da arquitetura do sistema.

As entidades relacionadas à gestão escolar foram removidas, mantendo o foco em:

* Alunos
* Professores
* Disciplinas
* Relacionamentos acadêmicos

---

## Funcionalidades Implementadas

### Cadastro de Alunos

O sistema permite registrar alunos no banco de dados armazenando:

* Nome
* Matrícula
* Turma

### Consulta de Alunos

É possível realizar buscas de alunos através do identificador único (ID), retornando suas informações cadastradas.

### Persistência de Dados

O sistema realiza:

* Conexão com PostgreSQL através de JDBC.
* Inserção de registros no banco de dados.
* Consulta de registros armazenados.
* Tratamento básico de exceções.
* Encerramento seguro da conexão.

---

## Modelagem do Sistema

O projeto segue os princípios da Programação Orientada a Objetos.

### Classe Aluno

Representa os dados dos alunos.

Atributos:

* id_aluno
* nome
* matricula
* turma

### Classe AlunoDao

Responsável pelo acesso aos dados dos alunos.

Funcionalidades:

* Salvar aluno.
* Buscar aluno por ID.

### Classe Conexao

Responsável por estabelecer a comunicação entre a aplicação Java e o banco PostgreSQL.

### Classe App

Classe principal utilizada para executar e testar as funcionalidades do sistema.

---

## Modelagem do Banco de Dados

### Tabela aluno

* id_aluno (PK)
* nome
* matricula
* turma

### Tabela professor

* id_professor (PK)
* nome_professor

### Tabela disciplina

* id_disciplina (PK)
* nome_disciplina

---

## Relacionamentos

### Aluno × Disciplina

Relacionamento muitos para muitos (N:N).

Um aluno pode cursar várias disciplinas e uma disciplina pode possuir vários alunos.

Tabela associativa:

* aluno_disc

Campos:

* id_aluno
* id_disciplina
* data_entrada
* data_saida

### Professor × Disciplina

Relacionamento muitos para muitos (N:N).

Um professor pode lecionar várias disciplinas e uma disciplina pode possuir vários professores.

Tabela associativa:

* prof_disc

Campos:

* id_professor
* id_disciplina
* data_entrada
* data_saida

---

## Tecnologias Utilizadas

* Java
* PostgreSQL
* JDBC
* SQL
* Programação Orientada a Objetos
* Padrão DAO

---

## Considerações Finais

O projeto evoluiu de uma proposta mais abrangente para uma solução focada nas funcionalidades acadêmicas essenciais. Essa redução de escopo permitiu concentrar o desenvolvimento na implementação prática da persistência de dados e na aplicação de boas práticas de programação.

Atualmente, o sistema já realiza operações de cadastro e consulta de alunos em banco de dados real, representando uma base sólida para futuras expansões, como a implementação de CRUD completo, gerenciamento de professores e disciplinas, além de interfaces gráficas ou web.
