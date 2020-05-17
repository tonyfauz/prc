create table PRC_SEDUTA_SERVIZI (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SEDUTA_ID integer,
    SERVIZIO_ID integer,
    OPERATORE_ID uuid,
    --
    primary key (ID)
);