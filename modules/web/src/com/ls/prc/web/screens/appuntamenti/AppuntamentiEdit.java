package com.ls.prc.web.screens.appuntamenti;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.security.global.UserSession;
import com.ls.prc.entity.Appuntamenti;
import com.ls.prc.entity.Operatori;
import com.ls.prc.service.CommonService;

import javax.inject.Inject;

@UiController("prc_Appuntamenti.edit")
@UiDescriptor("appuntamenti-edit.xml")
@EditedEntityContainer("appuntamentiDc")
@LoadDataBeforeShow
public class AppuntamentiEdit extends StandardEditor<Appuntamenti> {
    @Inject
    private UserSession userSession;

    @Inject
    private CommonService commonService;

    @Subscribe
    public void onAfterInit(AfterInitEvent event) {

    }

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {

        User user = userSession.getUser();

        Operatori operatore = commonService.getOperatore(user);

        getEditedEntity().setOperatore(operatore);

    }


}