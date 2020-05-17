package com.ls.prc.service;

import com.ls.prc.entity.Appuntamenti;

import java.util.List;

public interface AppuntamentiService {
    String NAME = "prc_AppuntamentiService";

    public List<Appuntamenti> getAppuntamenti();
    public List<Appuntamenti> getAppuntamenti2();
    public String saveAppuntamenti(Appuntamenti appuntamento);

}