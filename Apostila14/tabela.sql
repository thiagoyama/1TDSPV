create table t_tdspv_cliente (
    cd_cliente number(6,0) primary key,
    nm_cliente varchar(100),
    nr_telefone varchar(20),
    nr_cpf varchar(24),
    st_ativo number,
    vl_peso number(5,2)
)