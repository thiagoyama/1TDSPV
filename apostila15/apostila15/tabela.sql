create table t_tdspv_produto (
    cd_produto number(6,0) primary key,
    nm_produto varchar2(80) not null,
    qt_produto number(6,0) not null,
    vl_produto number(10,2) not null,
    dt_validade date
);

create sequence sq_tdspv_produto start with 1 increment by 1 nocache;