package com.ls.prc.service;

import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import com.ls.prc.entity.Appuntamenti;
import com.ls.prc.entity.Seduta;
import com.ls.prc.entity.SedutaServizi;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

@Service(ServiziService.NAME)
public class ServiziServiceBean implements ServiziService {

    @Inject
    private DataManager dataManager;

    @Override
    public List<SedutaServizi> getServiziSeduta(Seduta seduta) {

        LoadContext<SedutaServizi> ldc = LoadContext.create(SedutaServizi.class)
                .setQuery(LoadContext.createQuery("select e from prc_SedutaServizi e where e.seduta = :sed ")
                        .setParameter("sed",seduta))
                .setView("sedutaServizi-view");

        return dataManager.loadList(ldc);

    }

    @Override
    public List<SedutaServizi> getServiziSeduta(LoadContext<SedutaServizi> ldc) {

        return dataManager.loadList(ldc);

    }
}