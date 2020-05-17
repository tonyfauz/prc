package com.ls.prc.web.screens.seduta;

import com.haulmont.cuba.core.global.EntityStates;
import com.haulmont.cuba.gui.components.Fragment;
import com.haulmont.cuba.gui.screen.*;
import com.ls.prc.entity.Seduta;
import com.ls.prc.web.screens.sedutaservizi.SedutaServiziFragment;

import javax.inject.Inject;

@UiController("prc_Seduta.edit")
@UiDescriptor("seduta-edit.xml")
@EditedEntityContainer("sedutaDc")
@LoadDataBeforeShow
public class SedutaEdit extends StandardEditor<Seduta> {


    @Inject
    private SedutaServiziFragment serviziFragment;
    @Inject
    private EntityStates entityStates;


    @Subscribe
    public void onInit(InitEvent event) {



    }


    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        if(entityStates.isNew(getEditedEntity())){

            serviziFragment.setEnabled(false);
        }else{
            serviziFragment.setEnabled(true);
            serviziFragment.setSeduta(getEditedEntity());
            serviziFragment.loadServizi();
          //  ((SedutaServiziFragment)serviziFragment).loadServizi2();
          //  ((SedutaServiziFragment)serviziFragment).loadServizi3();
        }

    }

    @Subscribe
    public void onAfterCommitChanges(AfterCommitChangesEvent event) {

        if(!entityStates.isNew(getEditedEntity())){
            serviziFragment.setEnabled(true);
        }
    }






}