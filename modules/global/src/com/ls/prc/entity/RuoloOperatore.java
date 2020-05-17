package com.ls.prc.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum RuoloOperatore implements EnumClass<Integer> {

    SHAMPISTA(10),
    RECEPTION(20),
    FULL(30);

    private Integer id;

    RuoloOperatore(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static RuoloOperatore fromId(Integer id) {
        for (RuoloOperatore at : RuoloOperatore.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}