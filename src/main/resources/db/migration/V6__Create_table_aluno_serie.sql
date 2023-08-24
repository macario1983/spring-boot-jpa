CREATE TABLE IF NOT EXISTS escola.aluno_serie (
    id BINARY(16) DEFAULT (UUID_TO_BIN(UUID(), 1)) NOT NULL,
    id_aluno BINARY(16) NOT NULL,
    id_serie BINARY(16) NOT NULL,
    data_insercao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_alteracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id),
    FOREIGN KEY (id_aluno) REFERENCES escola.aluno(id),
    FOREIGN KEY (id_serie) REFERENCES escola.serie(id),
    INDEX idx_aluno_serie_id_aluno (id_aluno),
    INDEX idx_aluno_serie_id_serie (id_serie)
 );
