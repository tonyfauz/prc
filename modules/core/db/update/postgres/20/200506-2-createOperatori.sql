alter table PRC_OPERATORI add constraint FK_PRC_OPERATORI_ON_UTENTE foreign key (UTENTE_ID) references SEC_USER(ID);
create index IDX_PRC_OPERATORI_ON_UTENTE on PRC_OPERATORI (UTENTE_ID);
