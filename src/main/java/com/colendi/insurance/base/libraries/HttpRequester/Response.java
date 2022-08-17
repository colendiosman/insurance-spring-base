package com.colendi.insurance.base.libraries.HttpRequester;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "surcharge"
})
@XmlRootElement(name = "SurchargeResponse")
public class Response {
    protected int surcharge;

    public int getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(int value) {
        this.surcharge = value;
    }
}
