package com.mycompany.acuario.parcial;

public class Coral extends Especie {
    private double profundidadIdeal;

    public Coral(String nombre, String tanque, TipoAgua tipoAgua, double profundidadIdeal) {
        super(nombre, tanque, tipoAgua);
        this.profundidadIdeal = profundidadIdeal;
    }

    @Override
    public String getDescripcion() {
        return "Coral - Profundidad ideal: " + profundidadIdeal + " m";
    }  
}
