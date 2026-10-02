create table tb_condominio (
   cd_condominio number(9,0) primary key,
   nm_condominio varchar(20) not null,
   ds_bloco varchar(5)
);

create sequence sq_tb_condominio start with 1 increment by 1 nocache;

create table tb_apartamento (
                                cd_apartamento number(9,0) primary key,
                                nr_area number(9,2) not null,
                                nr_apartamento number(9,0) not null,
                                dt_ocupacao date,
                                st_ocupado number(1,0),
                                cd_condominio number(9,2) not null,
                                constraint fk_condominio foreign key(cd_condominio)
                                    references tb_condominio(cd_condominio)
)

create sequence sq_tb_apartamento start with 1 increment by 1 nocache;