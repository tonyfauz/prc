package com.ls.prc.web.screens.servizi;

import com.haulmont.cuba.gui.screen.*;
import com.ls.prc.entity.Servizi;

@UiController("prc_Servizi.edit")
@UiDescriptor("servizi-edit.xml")
@EditedEntityContainer("serviziDc")
@LoadDataBeforeShow
public class ServiziEdit extends StandardEditor<Servizi> {
}