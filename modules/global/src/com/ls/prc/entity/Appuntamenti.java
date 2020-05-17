package com.ls.prc.entity;

import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.Date;

@Table(name = "PRC_APPUNTAMENTI")
@Entity(name = "prc_Appuntamenti")
public class Appuntamenti extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -4435437262399032823L;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @OnDeleteInverse(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENTE_ID")
    protected Clienti cliente;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_E_ORA")
    protected Date dataEOra;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @OnDeleteInverse(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OPERATORE_ID")
    protected Operatori operatore;

    public Operatori getOperatore() {
        return operatore;
    }

    public void setOperatore(Operatori operatore) {
        this.operatore = operatore;
    }

    public Clienti getCliente() {
        return cliente;
    }

    public void setCliente(Clienti cliente) {
        this.cliente = cliente;
    }

    public Date getDataEOra() {
        return dataEOra;
    }

    public void setDataEOra(Date dataEOra) {
        this.dataEOra = dataEOra;
    }

}