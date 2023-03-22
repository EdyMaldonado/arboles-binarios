
package Estructura;

public class NodoDoble {
    private Object info; 
    private NodoDoble izquierda;
    private NodoDoble derecha;

    public NodoDoble (Object elemento){
           this.info=elemento;
           this.izquierda=null;
           this.derecha=null;
    }

    /**
     * @return the info
     */
    public Object getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(Object info) {
        this.info = info;
    }

    /**
     * @return the izquierda
     */
    public NodoDoble getIzquierda() {
        return izquierda;
    }

    /**
     * @param izquierda the izquierda to set
     */
    public void setIzquierda(NodoDoble izquierda) {
        this.izquierda = izquierda;
    }

    /**
     * @return the derecha
     */
    public NodoDoble getDerecha() {
        return derecha;
    }

    /**
     * @param derecha the derecha to set
     */
    public void setDerecha(NodoDoble derecha) {
        this.derecha = derecha;
    }
    

}
