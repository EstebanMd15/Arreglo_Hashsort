

package com.mycompany.algoritmo_hashsort;

import java.util.*;

public class Algoritmo_HashSort {

    public static void main(String[] args) {
        int cantidad = 10_000_000;
        double[] arreglo = new double[cantidad];
        Random random = new Random();
        
        System.out.println("Generando los 10 miloones de datos...");;
        
        for(int i = 0; i < cantidad; i ++){
            arreglo[i] = random.nextDouble(); // Genera numeros entre 0.0 y 1.0
        }
        
        System.out.println("Iniciando ordenamiento...");
        long tiempoInicial = System.currentTimeMillis();
        
        casillero(arreglo, cantidad);
        
        long tiempoFinal = System.currentTimeMillis();
        System.out.println("Ordenamiento completo en: " + (tiempoFinal - tiempoInicial) + " ms");
        
        System.out.println("Primer dato: " + arreglo[0]);
        System.out.println("Ultimo dato: " + arreglo[cantidad - 1]);
    }
    
    public static void casillero(double[] arreglo, int cantidad){
        if(cantidad <= 0 ) return;
        
        // creamos los casilleros
        // usamos una lista de ArrayList
        
        List<Double>[] casillero = new ArrayList[cantidad];
        for (int i = 0; i < cantidad; i++){
            casillero[i] = new ArrayList<>();
        }
        
        // Distribuir los elementos en las casillas (Función hash)
        for(int i = 0; i < cantidad; i++){
            int casillaIndex = (int) (arreglo[i] * cantidad);
            casillero[casillaIndex].add(arreglo[i]);
        }
        
        // Ordenar cada casilla individualmente y unir
        int index = 0;
        for(int i = 0; i < cantidad; i++){
            Collections.sort(casillero[i]);// Ordenamiento interno
            for(double val : casillero[i]){
                arreglo[index++] = val;
            }
        }
    }
        
}
