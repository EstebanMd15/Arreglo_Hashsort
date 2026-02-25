
package com.mycompany.algoritmo_hashsort;

public class Crud {
    private Nodo root = null;
    
//creamos un identificador
    private Nodo create(int valor, String dato, Nodo sig){
        return new Nodo(valor, dato, sig);
    }

    public Nodo insert(int valor, String dato){
        if(root != root){
            Nodo p = root;
            while(p.getSig()!= null){
                p = p.getSig();
            }
            p.setSig(this.create(valor, dato, null));
        }else{
            root = this.create(valor, dato, null);
        }
        return root;
    }
    
    public Nodo insertHead(int valor, String dato){
        if(root != null){
            Nodo temp = this.create(valor, dato, root);
            root = temp;
        }else{
            root= this.create(valor, dato, null);
        }
        return root; 
    }
}
