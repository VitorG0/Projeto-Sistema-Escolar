
CREATE TABLE if not exists escola (
id_escola SERIAL PRIMARY KEY,
nome_escola VARCHAR (100) NOT NULL,
endereco TEXT 
);

CREATE TABLE if not exists disciplina (
id_disciplina SERIAL PRIMARY KEY,
nome VARCHAR (100) NOT NULL
);

CREATE TABLE if not exists professor (
id_professor SERIAL PRIMARY KEY,
nome_professor VARCHAR (100) NOT NULL,
salario NUMERIC (10,2)
);

CREATE TABLE if not exists aluno(
id_aluno SERIAL PRIMARY KEY,
nome VARCHAR (100) NOT NULL,
id_disciplina INTEGER,
 CONSTRAINT fk_disciplina
        FOREIGN KEY (id_disciplina)
        REFERENCES disciplina(id_disciplina)
);

CREATE TABLE if not exists escola_prof (
id_professor INTEGER,
id_escola INTEGER,
data_entrega DATE,
PRIMARY KEY (id_professor, id_escola),
FOREIGN KEY (id_professor) REFERENCES professor (id_professor),
FOREIGN KEY (id_escola) REFERENCES escola (id_escola)
);

CREATE TABLE if not exists prof_disc (
id_professor INTEGER,
id_disciplina INTEGER,
data_entrada DATE,
PRIMARY KEY (id_professor, id_disciplina),
FOREIGN KEY (id_professor) REFERENCES professor (id_professor),
FOREIGN KEY (id_disciplina) REFERENCES disciplina (id_disciplina)
);



CREATE TABLE if not exists aluno_disc (
    id_aluno INTEGER,
    id_disciplina INTEGER,
    data_entrada DATE,
    PRIMARY KEY (id_aluno, id_disciplina),
    FOREIGN KEY (id_aluno) REFERENCES aluno (id_aluno),
    FOREIGN KEY (id_disciplina) REFERENCES disciplina(id_disciplina)
);

