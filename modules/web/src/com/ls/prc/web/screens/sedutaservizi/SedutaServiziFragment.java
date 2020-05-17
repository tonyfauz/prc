package com.ls.prc.web.screens.sedutaservizi;

import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.Screens;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.security.global.UserSession;
import com.ls.prc.entity.Seduta;
import com.ls.prc.entity.SedutaServizi;
import com.ls.prc.service.CommonService;
import com.ls.prc.service.ServiziService;
import com.ls.prc.web.screens.servizi.ServiziEdit;

import javax.inject.Inject;
import java.util.List;

@UiController("prc_SedutaServiziFragment")
@UiDescriptor("seduta-servizi-fragment.xml")
public class SedutaServiziFragment extends ScreenFragment {

    private Seduta seduta;
    @Inject
    private CollectionLoader<SedutaServizi> sedutaServizisDl;
    @Inject
    private ServiziService serviziService;
    @Inject
    private Screens screens;
    @Inject
    private ScreenBuilders screenBuilders;
    @Inject
    private GroupTable<SedutaServizi> sedutaServizisTable;
    @Inject
    private Metadata metadata;
    @Inject
    private CommonService commonService;
    @Inject
    private UserSession userSession;

    public void setSeduta(Seduta sed) {
        this.seduta = sed;
    }

    public void setEnabled(boolean enabled){
        getFragment().setEnabled(enabled);
    }

    public void loadServizi(){
        sedutaServizisDl.setView("sedutaServizi-view");
        sedutaServizisDl.setQuery("select e from prc_SedutaServizi e where e.seduta = :sed");
        sedutaServizisDl.setParameter("sed",this.seduta);
        sedutaServizisDl.load();
    }


    public void loadServizi2(){
        sedutaServizisDl.setParameter("sed",this.seduta);
        sedutaServizisDl.load();
    }
    public void loadServizi3(){
        // con il delegate e servizio
        sedutaServizisDl.load();

    }

    @Subscribe("sedutaServizisTable.create")
    public void onSedutaServizisTableCreate(Action.ActionPerformedEvent event) {

        SedutaServizi sedutaServizi = metadata.create(SedutaServizi.class);



        sedutaServizi.setSeduta(this.seduta);

        sedutaServizi.setOperatore(commonService.getOperatore(userSession.getUser()));

        openEdit(this.seduta,sedutaServizi);

    }
    @Subscribe("sedutaServizisTable.edit")
    public void onSedutaServizisTableEdit(Action.ActionPerformedEvent event) {

        openEdit(this.seduta,sedutaServizisTable.getSingleSelected());
    }

    public void openEdit(Seduta seduta, SedutaServizi sedutaServizi) {

        screenBuilders.editor(SedutaServizi.class, this)
                .withScreenClass(SedutaServiziEdit.class)
                .editEntity(sedutaServizi)
                .withAfterCloseListener(listener -> {
                    loadServizi();
                }).build().show();

    }

/*
    @Install(to = "sedutaServizisDl", target = Target.DATA_LOADER)
    private List<SedutaServizi> sedutaServizisDlLoadDelegate(LoadContext<SedutaServizi> loadContext) {
       loadContext.getQuery().setParameter("sed",this.seduta);
       return serviziService.getServiziSeduta(this.seduta); // alternative
     //  return  serviziService.getServiziSeduta(loadContext);
    }
    */







}