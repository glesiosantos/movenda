CREATE TABLE IF NOT EXISTS colaboradores (
    id VARCHAR(150) NOT NULL PRIMARY KEY DEFAULT REPLACE(uuid_generate_v4()::text, '-',''),
    nm_completo VARCHAR(150) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    senha VARCHAR(150) NOT NULL,
    avatar VARCHAR(150) NOT NULL,
    ativo BOOLEAN NOT NULL DEFAULT 'false',
    perfil CHAR(2) NOT NULL DEFAULT 'RE',
    dt_criado_em DATE NOT NULL DEFAULT 'now()',
    dt_atualizado_em DATE
);