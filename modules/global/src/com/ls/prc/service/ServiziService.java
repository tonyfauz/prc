package com.ls.prc.service;

import com.haulmont.cuba.core.global.LoadContext;
import com.ls.prc.entity.Seduta;
import com.ls.prc.entity.SedutaServizi;

import java.util.List;

public interface ServiziService {
    String NAME = "prc_ServiziService";

    public List<SedutaServizi> getServiziSeduta(Seduta seduta);
    public List<SedutaServizi> getServiziSeduta(LoadContext<SedutaServizi> ldc);

}