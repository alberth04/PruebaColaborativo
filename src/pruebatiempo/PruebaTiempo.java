/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatiempo;

/**
 *
 * @author godoy
 */
public class PruebaTiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tiempo1 t = new Tiempo1();
        mostrarTiempo("Despues de crear el objeto del tiempo", t);
        System.out.println();
        t.establecerTiempo(13, 27, 6);
        mostrarTiempo("Despues de llamar a establecerTiempo", t);
        System.out.println();
        try {
            t.establecerTiempo(99, 99, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("Excepcion: %s%n%n", e.getMessage());
        }
        mostrarTiempo("Despues de llamar a establecerTiempo con valores ", t);
    }
    private static void mostrarTiempo(String encabezado, Tiempo1 t){
        System.out.printf("%s%nTiempo Universal: %s%nTiempo Estandar %s%n",encabezado,t.aStringUniversal(),t.toString());
    }
    
}
