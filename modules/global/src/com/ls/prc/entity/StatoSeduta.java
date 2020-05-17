package com.ls.prc.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum StatoSeduta implements EnumClass<Integer> {

    CHECKIN(10),
    LAVORAZIONE(20),
    CHECKOUT(30);

    private Integer id;

    StatoSeduta(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static StatoSeduta fromId(Integer id) {
        for (StatoSeduta at : StatoSeduta.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}