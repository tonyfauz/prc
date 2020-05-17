package com.ls.prc.web.screens.operatori;

import com.haulmont.cuba.gui.screen.*;
import com.ls.prc.entity.Operatori;

@UiController("prc_Operatori.edit")
@UiDescriptor("operatori-edit.xml")
@EditedEntityContainer("operatoriDc")
@LoadDataBeforeShow
public class OperatoriEdit extends StandardEditor<Operatori> {

}