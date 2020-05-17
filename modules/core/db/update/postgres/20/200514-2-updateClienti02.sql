alter table PRC_CLIENTI rename column comune_id to comune_id__u09869 ;
alter table PRC_CLIENTI drop constraint FK_PRC_CLIENTI_ON_COMUNE ;
drop index IDX_PRC_CLIENTI_ON_COMUNE ;
