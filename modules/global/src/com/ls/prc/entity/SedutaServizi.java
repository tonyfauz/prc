package com.ls.prc.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;

@Table(name = "PRC_SEDUTA_SERVIZI")
@Entity(name = "prc_SedutaServizi")
public class SedutaServizi extends StandardEntity {
    private static final long serialVersionUID = -8716560556503138458L;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SEDUTA_ID")
    protected Seduta seduta;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SERVIZIO_ID")
    protected Servizi servizio;

    @Lob
    @Column(name = "NOTE")
    protected String note;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OPERATORE_ID")
    protected Operatori operatore;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Operatori getOperatore() {
        return operatore;
    }

    public void setOperatore(Operatori operatore) {
        this.operatore = operatore;
    }

    public Servizi getServizio() {
        return servizio;
    }

    public void setServizio(Servizi servizio) {
        this.servizio = servizio;
    }

    public Seduta getSeduta() {
        return seduta;
    }

    public void setSeduta(Seduta seduta) {
        this.seduta = seduta;
    }
}