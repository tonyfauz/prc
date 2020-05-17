package com.ls.prc.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;

@NamePattern("%s  %s|nome,cognome")
@Table(name = "PRC_CLIENTI")
@Entity(name = "prc_Clienti")
public class Clienti extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -7074297518362369112L;

    @Column(name = "NOME")
    protected String nome;

    @Column(name = "COGNOME")
    protected String cognome;

    @Column(name = "INDIRIZZO")
    protected String indirizzo;

    @Lookup(type = LookupType.DROPDOWN, actions = {})
    @OnDeleteInverse(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMUNE_CODICEISTAT")
    protected BaseComuni comune;

    public BaseComuni getComune() {
        return comune;
    }

    public void setComune(BaseComuni comune) {
        this.comune = comune;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}