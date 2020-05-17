-- begin PRC_CLIENTI
create table PRC_CLIENTI (
    ID integer,
    --
    NOME varchar(255),
    COGNOME varchar(255),
    INDIRIZZO varchar(255),
    COMUNE_CODICEISTAT varchar(6),
    --
    primary key (ID)
)^
-- end PRC_CLIENTI
-- begin PRC_APPUNTAMENTI
create table PRC_APPUNTAMENTI (
    ID integer,
    --
    CLIENTE_ID integer,
    DATA_E_ORA timestamp,
    OPERATORE_ID uuid,
    --
    primary key (ID)
)^
-- end PRC_APPUNTAMENTI
-- begin PRC_SEDUTA
create table PRC_SEDUTA (
    ID integer,
    --
    CLIENTE_ID integer,
    NUMERO integer,
    SEDIA integer,
    DATA_SEDUTA date,
    STATO integer,
    --
    primary key (ID)
)^
-- end PRC_SEDUTA

-- begin PRC_SERVIZI
create table PRC_SERVIZI (
    ID integer,
    --
    DESCRIZIONE varchar(500),
    PREZZO double precision,
    --
    primary key (ID)
)^
-- end PRC_SERVIZI
-- begin PRC_OPERATORI
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
)^
-- end PRC_OPERATORI

-- begin PRC_SEDUTA_SERVIZI
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
    NOTE text,
    OPERATORE_ID uuid,
    --
    primary key (ID)
)^
-- end PRC_SEDUTA_SERVIZI
-- begin PCBB_BASE_COMUNI
create table PCBB_BASE_COMUNI (
    codice_istat varchar(6),
    --
    descrizione varchar(100),
    cap varchar(6),
    cod_belfiore varchar(4),
    provincia varchar(2),
    --
    primary key (codice_istat)
)^
-- end PCBB_BASE_COMUNI
