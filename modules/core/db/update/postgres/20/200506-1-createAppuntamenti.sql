create table PRC_APPUNTAMENTI (
    ID integer,
    --
    CLIENTE_ID integer,
    DATA_E_ORA timestamp,
    OPERATORE_ID uuid,
    --
    primary key (ID)
);