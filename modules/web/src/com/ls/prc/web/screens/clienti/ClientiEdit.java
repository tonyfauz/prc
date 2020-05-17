package com.ls.prc.web.screens.clienti;

import com.haulmont.cuba.gui.screen.*;
import com.ls.prc.entity.Clienti;

@UiController("prc_Clienti.edit")
@UiDescriptor("clienti-edit.xml")
@EditedEntityContainer("clientiDc")
@LoadDataBeforeShow
public class ClientiEdit extends StandardEditor<Clienti> {
}