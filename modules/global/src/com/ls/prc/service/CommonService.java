package com.ls.prc.service;

import com.haulmont.cuba.security.entity.User;
import com.ls.prc.entity.Operatori;

public interface CommonService {
    String NAME = "prc_CommonService";

    public Operatori getOperatore(User user);
}