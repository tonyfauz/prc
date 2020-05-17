alter table PRC_CLIENTI add constraint FK_PRC_CLIENTI_ON_COMUNE foreign key (COMUNE_ID) references PCBB_BASE_COMUNI(codice_istat);
create index IDX_PRC_CLIENTI_ON_COMUNE on PRC_CLIENTI (COMUNE_ID);
