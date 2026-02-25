
package com.mycompany.algoritmo_hashsort;


public class Nodo {
    int valor;
    String dato;
    Nodo sig;

    public Nodo() {
    }

    public Nodo(int valor, String dato) {
        this.valor = valor;
        this.dato = dato;
    }

    public Nodo(int valor, String dato, Nodo sig) {
        this.valor = valor;
        this.dato = dato;
        this.sig = sig;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
}
