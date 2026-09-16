create table tb_condominio (
                               cd_condominio number(9,0) primary key,
                               nm_condominio varchar(20) not null,
                               ds_bloco varchar(5)
);

create sequence sq_tb_condominio start with 1 increment by 1 nocache;