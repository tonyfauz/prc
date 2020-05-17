package com.ls.prc.entity;

import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "PRC_SEDUTA")
@Entity(name = "prc_Seduta")
public class Seduta extends BaseIntegerIdEntity {
    private static final long serialVersionUID = 4098940755711768654L;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @OnDeleteInverse(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENTE_ID")
    protected Clienti cliente;

    @Column(name = "NUMERO")
    protected Integer numero;

    @Column(name = "SEDIA")
    protected Integer sedia;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_SEDUTA")
    protected Date dataSeduta;

    @Column(name = "STATO")
    protected Integer stato;

    @OneToMany(mappedBy = "seduta")
    protected List<SedutaServizi> servizi;

    public List<SedutaServizi> getServizi() {
        return servizi;
    }

    public void setServizi(List<SedutaServizi> servizi) {
        this.servizi = servizi;
    }

    public StatoSeduta getStato() {
        return stato == null ? null : StatoSeduta.fromId(stato);
    }

    public void setStato(StatoSeduta stato) {
        this.stato = stato == null ? null : stato.getId();
    }

    public Date getDataSeduta() {
        return dataSeduta;
    }

    public void setDataSeduta(Date dataSeduta) {
        this.dataSeduta = dataSeduta;
    }

    public Integer getSedia() {
        return sedia;
    }

    public void setSedia(Integer sedia) {
        this.sedia = sedia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Clienti getCliente() {
        return cliente;
    }

    public void setCliente(Clienti cliente) {
        this.cliente = cliente;
    }
}