alter table PRC_CLIENTI add constraint FK_PRC_CLIENTI_ON_COMUNE foreign key (COMUNE_ID) references PRC_BASE_COMUNI(ID);
create index IDX_PRC_CLIENTI_ON_COMUNE on PRC_CLIENTI (COMUNE_ID);
