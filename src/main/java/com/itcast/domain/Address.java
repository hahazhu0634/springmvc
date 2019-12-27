package com.itcast.domain;

import java.io.Serializable;

public class Address implements Serializable {
    private String tel;
    private String zoneCode;

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "tel='" + tel + '\'' +
                ", zoneCode='" + zoneCode + '\'' +
                '}';
    }
}
