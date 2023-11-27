CREATE TABLE IF NOT EXISTS empresas (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    cnpj int unsigned,
    PRIMARY KEY (id),
    UNIQUE KEY (cnpj)
);

-- cidades_empresas

create table if not exists empresas_unidades (
    empresa_id int unsigned not null,
    cidade_id int unsigned not null,
    sede TINYINT(1) not null,
    primary key (empresa_id, cidade_id)

);