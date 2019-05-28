package com.gos.demo.seller;

public enum Seller implements EnumElement {
    A,B,C,D,E,F;

    private String code;

    Seller() {
        this.code = this.name();
    }

    @Override
    public String getCode() {
        return code;
    }
}
