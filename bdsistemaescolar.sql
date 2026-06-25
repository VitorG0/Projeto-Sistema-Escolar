
-- tabela da disciplina
CREATE TABLE IF NOT EXISTS disciplina (
	id_disciplina SERIAL PRIMARY KEY,
	nome_disciplina VARCHAR(100) NOT NULL UNIQUE
);

-- tabela dos professor
CREATE TABLE IF NOT EXISTS professor (
	id_professor SERIAL PRIMARY KEY,
	nome_professor VARCHAR(100) NOT NULL
);

-- tabela dos aluno
CREATE TABLE IF NOT EXISTS aluno (
	id_aluno SERIAL PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	matricula INTEGER,
	turma VARCHAR(50)	
);

-- professor x disciplina
CREATE TABLE IF NOT EXISTS prof_disc (
	id_professor INTEGER,
	id_disciplina INTEGER,
	data_entrada DATE,
	data_saida DATE,
	PRIMARY KEY (id_professor, id_disciplina),
	FOREIGN KEY (id_professor) REFERENCES professor(id_professor),
	FOREIGN KEY (id_disciplina) REFERENCES disciplina(id_disciplina)
	);

-- aluno x disciplina
CREATE TABLE IF NOT EXISTS aluno_disc (
	id_aluno INTEGER,
	id_disciplina INTEGER,
	data_entrada DATE,
	data_saida DATE,
	PRIMARY KEY (id_aluno, id_disciplina),
	FOREIGN KEY (id_aluno) REFERENCES aluno(id_aluno),
	FOREIGN KEY (id_disciplina) REFERENCES disciplina(id_disciplina)
);