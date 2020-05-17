package com.ls.prc.web.screens.operatori;

import com.haulmont.cuba.gui.screen.*;
import com.ls.prc.entity.Operatori;

@UiController("prc_Operatori.browse")
@UiDescriptor("operatori-browse.xml")
@LookupComponent("operatorisTable")
@LoadDataBeforeShow
public class OperatoriBrowse extends StandardLookup<Operatori> {
}