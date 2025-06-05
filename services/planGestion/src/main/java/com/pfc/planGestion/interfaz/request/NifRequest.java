package com.pfc.planGestion.interfaz.request;

public class NifRequest {
    private String nif;

    public NifRequest() {
    }

    public NifRequest(String nif) {
        this.nif = nif;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}