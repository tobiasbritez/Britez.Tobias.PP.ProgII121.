package com.mycompany.acuario.parcial;

public class Main {
        public static void main(String[] args) {
            Acuario acuario = new Acuario();
        try {
            acuario.agregarEspecie(new Pez("Pez Payaso", "T1", TipoAgua.AGUA_SALADA, 12));
            acuario.agregarEspecie(new Molusco("Caracol Marino", "T2", TipoAgua.AGUA_SALADA, "Espiralada"));
            acuario.agregarEspecie(new Coral("Coral Rojo", "T3", TipoAgua.AGUA_DULCE, 3.5));
        } catch (EspecieDuplicadaException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\n--- Todas las especies ---");
        acuario.mostrarEspecies();

        System.out.println("\n--- Alimentación ---");
        acuario.alimentarEspecies();

        System.out.println("\n--- Especies en AGUA SALADA ---");
        acuario.filtrarPorTipoAgua(TipoAgua.AGUA_SALADA);
        
        System.out.println("\n--- Especies en AGUA DULCE ---");
        acuario.filtrarPorTipoAgua(TipoAgua.AGUA_DULCE);
        
        System.out.println("\n--- Reiniciando Acuario ---");
        acuario.reiniciar();
    }
}