create table t_tdspv_produto (
    cd_produto number(6,0) primary key,
    nm_produto varchar2(80) not null,
    qt_produto number(6,0) not null,
    vl_produto number(10,2) not null,
    dt_validade date
);

alter table t_tdspv_produto add cd_categoria number(6,0);
alter table t_tdspv_produto add constraint
    fk_cd_categoria foreign key (cd_categoria) references t_tdspv_categoria(cd_categoria);

create sequence sq_tdspv_produto start with 1 increment by 1 nocache;

create table t_tdspv_categoria (
    cd_categoria number(6,0) primary key,
    nm_categoria varchar2(20) not null
);

create sequence sq_tdspv_categoria start with 1 increment by 1 nocache;