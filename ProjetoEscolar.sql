
-- TABELA ESCOLA

CREATE TABLE IF NOT EXISTS escola (
    id_escola SERIAL PRIMARY KEY,
    nome_escola VARCHAR(100) NOT NULL,
    endereco TEXT
);


-- TABELA DISCIPLINA

CREATE TABLE IF NOT EXISTS disciplina (
    id_disciplina SERIAL PRIMARY KEY,
    nome_disc VARCHAR(100) NOT NULL UNIQUE
);


-- TABELA PROFESSOR

CREATE TABLE IF NOT EXISTS professor (
    id_professor SERIAL PRIMARY KEY,
    nome_professor VARCHAR(100) NOT NULL,
    salario NUMERIC(10,2)
);


-- TABELA ALUNO

CREATE TABLE IF NOT EXISTS aluno (
    id_aluno SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    matricula INTEGER,
    turma VARCHAR(50)
);

ALTER TABLE aluno ADD COLUMN IF NOT EXISTS matricula INTEGER;
ALTER TABLE aluno ADD COLUMN IF NOT EXISTS turma VARCHAR(50);

-- RELAÇÃO ESCOLA x PROFESSOR

CREATE TABLE IF NOT EXISTS escola_prof (
    id_professor INTEGER,
    id_escola INTEGER,
    data_entrada DATE,
    PRIMARY KEY (id_professor, id_escola),
    FOREIGN KEY (id_professor) REFERENCES professor(id_professor),
    FOREIGN KEY (id_escola) REFERENCES escola(id_escola)
);


-- RELAÇÃO PROFESSOR x DISCIPLINA

CREATE TABLE IF NOT EXISTS prof_disc (
    id_professor INTEGER,
    id_disciplina INTEGER,
    data_entrada DATE,
    PRIMARY KEY (id_professor, id_disciplina),
    FOREIGN KEY (id_professor) REFERENCES professor(id_professor),
    FOREIGN KEY (id_disciplina) REFERENCES disciplina(id_disciplina)
);


-- RELAÇÃO ALUNO x DISCIPLINA

CREATE TABLE IF NOT EXISTS aluno_disc (
    id_aluno INTEGER,
    id_disciplina INTEGER,
    data_entrada DATE,
    PRIMARY KEY (id_aluno, id_disciplina),
    FOREIGN KEY (id_aluno) REFERENCES aluno(id_aluno),
    FOREIGN KEY (id_disciplina) REFERENCES disciplina(id_disciplina)
);

