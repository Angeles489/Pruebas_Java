package comangeles.pruebas.controlador;

import comangeles.pruebas.obj.Nodo;

public class ArbolBinario {

    private Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertar(raiz, valor);
    }

    private Nodo insertar(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }
        if (valor < raiz.getValor()) {
            raiz.setNodoIzquierdo(insertar(raiz.getNodoIzquierdo(), valor));
        } else if (valor > raiz.getValor()) {
            raiz.setNodoDerecho(insertar(raiz.getNodoDerecho(), valor));
        }
        return raiz;
    }

    private void preOrden(Nodo raiz) {
        if (raiz != null) {
            System.out.println("" + raiz.getValor());
            preOrden(raiz.getNodoIzquierdo());
            preOrden(raiz.getNodoDerecho());
        }
    }

    public void preorden() {
        this.preOrden(this.raiz);
    }

    private void inOrden(Nodo raiz) {
        if (raiz != null) {
            inOrden(raiz.getNodoIzquierdo());
            System.out.println(" " + raiz.getValor());
            inOrden(raiz.getNodoDerecho());
        }
    }

    public void inorden() {
        this.inOrden(this.raiz);
    }
    
    private void postOrden(Nodo raiz){
        if(raiz!=null){
            postOrden(raiz.getNodoIzquierdo());
            postOrden(raiz.getNodoDerecho());
            System.out.println(" "+raiz.getValor());
        }
    }
    
    public void postorden(){
        this.postOrden(this.raiz);
    }

    private int busqueda(Nodo raiz, int numero, int indice) {

        if (raiz == null) {
            System.out.println("No se encontro");
            return -1;
        }
        if (raiz.getValor() == numero) {
            return indice;
        } else if (numero < raiz.getValor()) {
            return busqueda(raiz.getNodoIzquierdo(), numero, indice + 1);

        } else {
            return busqueda(raiz.getNodoDerecho(), numero, indice + 1);
        }

    }

    public int busquedaNum(int numero) {
        return busqueda(this.raiz, numero, 1);

    }
}
