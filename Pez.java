package com.mycompany.acuario.parcial;

public class Pez extends Especie implements Alimentable {
    private final double longitudMaxima;

    public Pez(String nombre, String tanque, TipoAgua tipoAgua, double longitudMaxima) {
        super(nombre, tanque, tipoAgua);
        this.longitudMaxima = longitudMaxima;
    }

    public double getlongitudMaxima()  {
        return longitudMaxima;
    }
    
    @Override
    public void alimentar() {
        System.out.println(nombreComun + " ha sido alimentado.");
    }

    @Override
    public String getDescripcion() {
        return "Pez - Longitud máxima: " + longitudMaxima + " cm";
    }
}
