package com.mycompany.acuario.parcial;

import java.util.*;

public class Acuario {
    private final List<Especie> especies = new ArrayList<>();

    public void agregarEspecie(Especie especie) throws EspecieDuplicadaException {
        for (Especie e : especies) {
            if (e.getNombreComun().equalsIgnoreCase(especie.getNombreComun()) &&
                e.getTanque().equalsIgnoreCase(especie.getTanque())) {
                throw new EspecieDuplicadaException("La especie '" + especie.getNombreComun() +
                    "' ya existe en el tanque '" + especie.getTanque() + "'.");
            }
        }
        especies.add(especie);
    }

    public void mostrarEspecies() {
        for (Especie e : especies) {
            System.out.println(e.getNombreComun() + " | Tanque: " + e.getTanque() + 
                " | Agua: " + e.getTipoAgua() + " | " + e.getDescripcion());
        }
    }

    @SuppressWarnings("null")
    public void alimentarEspecies() {
        for (Especie e : especies) {
            if (e instanceof Alimentable alimenta) {
                alimenta.alimentar();
            } else {
                System.out.println(e.getNombreComun() + " no necesita ser alimentado.");
            }
        }
    }

    public void filtrarPorTipoAgua(TipoAgua tipo) {
        for (Especie e : especies) {
            if (e.getTipoAgua() == tipo) {
                System.out.println(e.getNombreComun() + " - " + e.getDescripcion());
            }
        }
    }
    
    public void reiniciar() {
        especies.clear();
        System.out.println("El acuario ha sido reiniciado. No hay especie registrada");
    }
}
