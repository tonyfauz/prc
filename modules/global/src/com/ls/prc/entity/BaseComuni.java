package com.ls.prc.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseStringIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NamePattern("%s  (%s)|descrizione,provincia")
@Table(name = "PCBB_BASE_COMUNI")
@Entity(name = "pcbb_BaseComuni")
public class BaseComuni extends BaseStringIdEntity {


    @Column(name = "descrizione", length = 100)
    protected String descrizione;

    @Column(name = "cap", length = 6)
    protected String cap;

    @Column(name = "cod_belfiore", length = 4)
    protected String codBelfiore;

    @Column(name = "provincia", length = 2)
    protected String provincia;

    @Id
    @Column(name = "codice_istat", nullable = false, length = 6)
    protected String codiceIstat;

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getCap() {
        return cap;
    }

    public void setCodBelfiore(String codBelfiore) {
        this.codBelfiore = codBelfiore;
    }

    public String getCodBelfiore() {
        return codBelfiore;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setCodiceIstat(String codiceIstat) {
        this.codiceIstat = codiceIstat;
    }

    public String getCodiceIstat() {
        return codiceIstat;
    }

    @Override
    public String getId() {
        return codiceIstat;
    }

    @Override
    public void setId(String id) {
        this.codiceIstat = id;
    }


}