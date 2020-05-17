package com.ls.prc.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|descrizione")
@Table(name = "PRC_SERVIZI")
@Entity(name = "prc_Servizi")
public class Servizi extends BaseIntegerIdEntity {
    private static final long serialVersionUID = 8332888065685193813L;


    @Column(name = "DESCRIZIONE", length = 500)
    protected String descrizione;

    @Column(name = "PREZZO")
    protected Double prezzo;

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}