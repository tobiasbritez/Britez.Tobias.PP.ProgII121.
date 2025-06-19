package com.mycompany.acuario.parcial;

public class Molusco extends Especie implements Alimentable {
    private final String tipoConcha;

    public Molusco(String nombre, String tanque, TipoAgua tipoAgua, String tipoConcha) {
        super(nombre, tanque, tipoAgua);
        this.tipoConcha = tipoConcha;
    }
    
    public String getTipoConcha() {
        return tipoConcha;
    }
    
    @Override
    public void alimentar() {
        System.out.println(nombreComun + " ha sido alimentado.");
    }

    @Override
    public String getDescripcion() {
        return "Molusco - Tipo de concha: " + tipoConcha;
    }
}
