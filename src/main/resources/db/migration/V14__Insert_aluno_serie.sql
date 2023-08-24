INSERT INTO escola.aluno_serie (id_aluno, id_serie)
SELECT
    aluno.id,
    serie.id
FROM
    escola.aluno
INNER JOIN serie ON aluno.idade = serie.idade