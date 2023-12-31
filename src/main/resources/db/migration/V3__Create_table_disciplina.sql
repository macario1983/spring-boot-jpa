CREATE TABLE IF NOT EXISTS escola.disciplina (
    id BINARY(16) DEFAULT (UUID_TO_BIN(UUID(), 1)) NOT NULL,
    nome VARCHAR(255) NOT NULL,
    data_insercao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_alteracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);