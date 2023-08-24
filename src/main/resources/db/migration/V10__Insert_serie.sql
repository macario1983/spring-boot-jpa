INSERT INTO escola.serie (nome, idade, id_tipo_serie)
VALUES
    ('Berçário', 3, (SELECT id FROM escola.tipo_serie WHERE nome = 'Educação Infantil (Pré-ESCOLA ou Jardim de Infância)')),
    ('Maternal ou Creche', 4, (SELECT id FROM escola.tipo_serie WHERE nome = 'Educação Infantil (Pré-ESCOLA ou Jardim de Infância)')),
    ('Jardim de Infância', 5, (SELECT id FROM escola.tipo_serie WHERE nome = 'Educação Infantil (Pré-ESCOLA ou Jardim de Infância)')),
    ('1º Ano', 6, (SELECT id FROM escola.tipo_serie WHERE nome = 'Ensino Fundamental')),
    ('2º Ano', 7, (SELECT id FROM escola.tipo_serie WHERE nome = 'Ensino Fundamental')),
    ('3º Ano', 8, (SELECT id FROM escola.tipo_serie WHERE nome = 'Ensino Fundamental')),
    ('4º Ano', 9, (SELECT id FROM escola.tipo_serie WHERE nome = 'Ensino Fundamental')),
    ('5º Ano', 10, (SELECT id FROM escola.tipo_serie WHERE nome = 'Ensino Fundamental')),
    ('6º Ano', 11, (SELECT id FROM escola.tipo_serie WHERE nome = 'Ensino Médio (ou Colegial)')),
    ('7º Ano', 12, (SELECT id FROM escola.tipo_serie WHERE nome = 'Ensino Médio (ou Colegial)')),
    ('8º Ano', 13, (SELECT id FROM escola.tipo_serie WHERE nome = 'Ensino Médio (ou Colegial)')),
    ('9º Ano', 14, (SELECT id FROM escola.tipo_serie WHERE nome = 'Ensino Médio (ou Colegial)')),
    ('10º Ano', 15, (SELECT id FROM escola.tipo_serie WHERE nome = 'Ensino Médio (ou Colegial)')),
    ('11º Ano', 16, (SELECT id FROM escola.tipo_serie WHERE nome = 'Ensino Médio (ou Colegial)')),
    ('12º Ano', 17, (SELECT id FROM escola.tipo_serie WHERE nome = 'Ensino Médio (ou Colegial)'));
