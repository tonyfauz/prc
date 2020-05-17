package com.ls.prc.web.screens.servizi;

import com.haulmont.cuba.gui.screen.*;
import com.ls.prc.entity.Servizi;

@UiController("prc_Servizi.browse")
@UiDescriptor("servizi-browse.xml")
@LookupComponent("servizisTable")
@LoadDataBeforeShow
public class ServiziBrowse extends StandardLookup<Servizi> {
}