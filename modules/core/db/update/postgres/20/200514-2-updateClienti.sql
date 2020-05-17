alter table PRC_CLIENTI rename column comune_id to comune_id__u62755 ;
drop index IDX_PRC_CLIENTI_ON_COMUNE ;
alter table PRC_CLIENTI rename column comune_id to comune_id__u09829 ;
drop index IDX_PRC_CLIENTI_ON_COMUNE ;
alter table PRC_CLIENTI add column COMUNE_ID varchar(6) ;
alter table PRC_CLIENTI add column COMUNE_ID varchar(6) ;
