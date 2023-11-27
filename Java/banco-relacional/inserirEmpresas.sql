insert into empresas 
    (nome, cnpj)
values
    ('Badesco', 95694186000132),
    ('Vale', 27887148000156),
    ('Cielo', 01598317000134);


alter table empresas MODIFY cnpj VARCHAR(14);

desc empresas;
desc prefeitos;
select * from empresas;
select * from cidades;

insert into empresas_unidades
    (empresa_id, cidade_id, sede)
values
    (1,1,1),
    (1,2,0),
    (2,1,0),
    (2,2,1);