alter table PRC_SEDUTA add constraint FK_PRC_SEDUTA_ON_CLIENTE foreign key (CLIENTE_ID) references PRC_CLIENTI(ID);
create index IDX_PRC_SEDUTA_ON_CLIENTE on PRC_SEDUTA (CLIENTE_ID);
