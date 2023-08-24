CREATE TABLE IF NOT EXISTS escola.disciplina_serie (
    id BINARY(16) DEFAULT (UUID_TO_BIN(UUID(), 1)) NOT NULL,
    id_disciplina BINARY(16) NOT NULL,
    id_serie BINARY(16) NOT NULL,
    data_insercao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_alteracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id),
    FOREIGN KEY (id_disciplina) REFERENCES escola.disciplina(id),
    FOREIGN KEY (id_serie) REFERENCES escola.serie(id),
    INDEX idx_disciplina_serie_id_disciplina (id_disciplina),
    INDEX idx_disciplina_serie_id_serie (id_serie)
);
