create table tb_carro (
                          id number(9,0) primary key,
                          ano number(4,0) not null,
                          cor varchar(20),
                          modelo varchar(80) not null,
                          valor number(8,2) not null,
                          automatico number(1,0)
);

--Criar o comando para inserir um carro:
insert into tb_carro (id, ano, cor, modelo, valor, automatico)
values(1, 2020,'Prata', 'Fusca', 40000, 0);

--Comando para selecionar todos os carros
select * from tb_carro;