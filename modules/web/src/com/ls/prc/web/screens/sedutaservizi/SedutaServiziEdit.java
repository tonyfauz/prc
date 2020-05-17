package com.ls.prc.web.screens.sedutaservizi;

import com.haulmont.cuba.gui.screen.*;
import com.ls.prc.entity.Seduta;
import com.ls.prc.entity.SedutaServizi;

@UiController("prc_SedutaServizi.edit")
@UiDescriptor("seduta-servizi-edit.xml")
@EditedEntityContainer("sedutaServiziDc")
@LoadDataBeforeShow
public class SedutaServiziEdit extends StandardEditor<SedutaServizi> {


}