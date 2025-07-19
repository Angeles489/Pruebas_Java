package comangeles.pruebas.obj;

import java.util.HashSet;
import java.util.Scanner;

public class Nodo {
    
    private Nodo nodoIzquiero;
    private Nodo nodoDerecho;
    private int valor;
    
    
    public Nodo(int valor){
        this.valor = valor;
    }
    
    public void setNodoIzquierdo(Nodo nodo){
        this.nodoIzquiero = nodo;
    }
    
    public Nodo getNodoIzquierdo(){
        return nodoIzquiero;
    }
    
    public void setNodoDerecho(Nodo nodo){
        this.nodoDerecho = nodo;
    }
    
    public Nodo getNodoDerecho(){
        return nodoDerecho;
    }
    
     public void setValor(int valor) {
         this.valor = valor;
    }
     
     
    public int getValor(){
        return this.valor;
    }
    
}

