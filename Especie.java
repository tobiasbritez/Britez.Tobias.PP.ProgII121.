package com.mycompany.acuario.parcial;

public abstract class Especie {
    protected String nombreComun;
    protected String tanque;
    protected TipoAgua tipoAgua;

    public Especie(String nombreComun, String tanque, TipoAgua tipoAgua) {
        this.nombreComun = nombreComun;
        this.tanque = tanque;
        this.tipoAgua = tipoAgua;
    }

    public String getNombreComun() { return nombreComun; }
    public String getTanque() { return tanque; }
    public TipoAgua getTipoAgua() { return tipoAgua; }

    public abstract String getDescripcion();
}
