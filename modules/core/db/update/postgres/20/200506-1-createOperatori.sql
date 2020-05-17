create table PRC_OPERATORI (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    UTENTE_ID uuid,
    NOME varchar(255),
    COGNOME varchar(255),
    RUOLO integer,
    --
    primary key (ID)
);