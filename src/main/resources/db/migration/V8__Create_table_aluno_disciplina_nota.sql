CREATE TABLE IF NOT EXISTS escola.aluno_disciplina_nota (
    id BINARY(16) DEFAULT (UUID_TO_BIN(UUID(), 1)) NOT NULL,
    id_aluno_serie BINARY(16) NOT NULL,
    id_disciplina_serie BINARY(16) NOT NULL,
    nota DECIMAL(5, 2) DEFAULT 0.0 NOT NULL,
    periodo int NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    data_insercao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_alteracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id),
    FOREIGN KEY (id_aluno_serie) REFERENCES escola.aluno_serie(id),
    FOREIGN KEY (id_disciplina_serie) REFERENCES escola.disciplina_serie(id),
    CHECK (nota >= 0.0 AND nota <= 10.0),
    INDEX idx_aluno_disciplina_nota_id_aluno_serie (id_aluno_serie),
    INDEX idx_aluno_disciplina_nota_id_disciplina_serie (id_disciplina_serie)
);