package Estructura;

public class Pila {

    private int tamanio;
    private int ne;
    private Object[] A;

    public Pila(int tam) {
        tamanio = tam;
        ne = 0;
        A = new Object[tamanio];
    }

    public boolean Vacio() {
        if (ne == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Llena() {
        if (tamanio == ne) {
            return true;
        } else {
            return false;
        }
    }

    public void Apilar(Object elemento) {
        A[ne] = elemento;
        ne++;
    }

    public Object Desapliar() {
        ne = ne - 1;
        Object d = A[ne];
        A[ne] = null;
        return d;
    } 

    public int getTamanio() {
        return tamanio;
    }

    public int getNe() { 
        return ne;
    }
    public Object cima(){
        Object d = A[ne-1];
        return d;
    }


  
}
