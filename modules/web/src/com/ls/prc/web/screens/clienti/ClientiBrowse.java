package com.ls.prc.web.screens.clienti;

import com.haulmont.cuba.gui.screen.*;
import com.ls.prc.entity.Clienti;

@UiController("prc_Clienti.browse")
@UiDescriptor("clienti-browse.xml")
@LookupComponent("clientisTable")
@LoadDataBeforeShow
public class ClientiBrowse extends StandardLookup<Clienti> {
}