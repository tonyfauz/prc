package com.ls.prc.web.screens.appuntamenti;

import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.screen.*;
import com.ls.prc.entity.Appuntamenti;
import com.ls.prc.service.AppuntamentiService;

import javax.inject.Inject;
import java.util.List;

@UiController("prc_Appuntamenti.browse")
@UiDescriptor("appuntamenti-browse.xml")
@LookupComponent("appuntamentisTable")
@LoadDataBeforeShow
public class AppuntamentiBrowse extends StandardLookup<Appuntamenti> {


    @Inject
    private Dialogs dialogs;
    @Inject
    private AppuntamentiService appuntamentiService;

    @Subscribe
    public void onInit(InitEvent event) {



    }

    @Subscribe
    public void onAfterShow(AfterShowEvent event) {

    }

    /*@Install(to = "appuntamentisDl", target = Target.DATA_LOADER)
    private List<Appuntamenti> appuntamentisDlLoadDelegate(LoadContext<Appuntamenti> loadContext) {

        return appuntamentiService.getAppuntamenti();

    }*/





}