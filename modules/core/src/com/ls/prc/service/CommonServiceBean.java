package com.ls.prc.service;

import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.security.entity.User;
import com.ls.prc.entity.Operatori;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

@Service(CommonService.NAME)
public class CommonServiceBean implements CommonService {

    @Inject
    private DataManager dataManager;

    @Override
    public Operatori getOperatore(User user) {

        Map<String,Object> parametri = new HashMap<>();

        parametri.put("utente",user);

        Operatori operatore = dataManager.load(Operatori.class)
                .query("select o from prc_Operatori o where o.utente = :utente").setParameters(parametri)
                .one();

        return operatore;
    }
}