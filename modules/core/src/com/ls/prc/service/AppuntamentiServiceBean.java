package com.ls.prc.service;

import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import com.ls.prc.entity.Appuntamenti;
import com.ls.prc.entity.Clienti;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

@Service(AppuntamentiService.NAME)
public class AppuntamentiServiceBean implements AppuntamentiService {

    @Inject
    DataManager dataManager;
    @Inject
    private Persistence persistence;

    @Override
    public List<Appuntamenti> getAppuntamenti() {

        LoadContext<Appuntamenti> ldcAppuntamenti = LoadContext.create(Appuntamenti.class)
                                                    .setQuery(LoadContext.createQuery("select e from prc_Appuntamenti e where e.dataEOra = :data ")
                                                    .setParameter("data",new Date()))
                                                    .setView("appuntamenti-view");


       List<Appuntamenti>  listaAppuntamentiGiorno = dataManager.loadList(ldcAppuntamenti);

       return listaAppuntamentiGiorno;
    }

    @Override
    public List<Appuntamenti> getAppuntamenti2() {
        return null;
    }

    @Override
    public String saveAppuntamenti(Appuntamenti appuntamento) {
        return null;
    }

}