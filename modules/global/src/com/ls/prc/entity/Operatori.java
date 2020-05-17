package com.ls.prc.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;

@NamePattern("%s |nome,cognome")
@Table(name = "PRC_OPERATORI")
@Entity(name = "prc_Operatori")
public class Operatori extends StandardEntity {
    private static final long serialVersionUID = -8607933341182225753L;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.UNLINK)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UTENTE_ID")
    protected User utente;

    @Column(name = "NOME")
    protected String nome;

    @Column(name = "COGNOME")
    protected String cognome;

    @Column(name = "RUOLO")
    protected Integer ruolo;

    public RuoloOperatore getRuolo() {
        return ruolo == null ? null : RuoloOperatore.fromId(ruolo);
    }

    public void setRuolo(RuoloOperatore ruolo) {
        this.ruolo = ruolo == null ? null : ruolo.getId();
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

    public User getUtente() {
        return utente;
    }

    public void setUtente(User utente) {
        this.utente = utente;
    }
}