CREATE TABLE IF NOT EXISTS escola.serie (
    id BINARY(16) DEFAULT (UUID_TO_BIN(UUID(), 1)) NOT NULL,
    nome VARCHAR(255) NOT NULL,
    idade INTEGER NOT NULL CHECK (idade BETWEEN 3 AND 17),
    data_insercao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_alteracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    id_tipo_serie BINARY(16) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_tipo_serie) REFERENCES escola.tipo_serie(id),
    INDEX idx_serie_id_tipo_serie (id_tipo_serie)
);