package com.ls.prc.web.screens.seduta;

import com.haulmont.cuba.gui.screen.*;
import com.ls.prc.entity.Seduta;

@UiController("prc_Seduta.browse")
@UiDescriptor("seduta-browse.xml")
@LookupComponent("sedutasTable")
@LoadDataBeforeShow
public class SedutaBrowse extends StandardLookup<Seduta> {
}