package Estructura;

import Estructura.NodoDoble;
import javax.swing.JOptionPane;

public class ABB {

    private NodoDoble raiz;
    int s = 0;
    int comprobador = 0;
    int contador = 0;
    int x = 196;
    int y = 0;
    int[] A;
    int[] B;
    String[] S;
    int i = 0;

    public ABB() {
        raiz = null;
        A = new int[100];
        B = new int[100];
        S = new String[100];
    }

    public NodoDoble getRaiz() {
        return raiz;
    }

    public int ingresar(Object elemento) {
        int r = 196;
        int f = 0;
        NodoDoble nuevo = new NodoDoble(elemento);
        NodoDoble aux = null;
        Producto p1 = (Producto) nuevo.getInfo();
        Producto p2 = null;
        int a = 0;
        if (raiz == null) {//Si el arbol no tiene ningun nodo
            raiz = nuevo;//Asigna el nodo nuevo como raiz
            contador = contador + 1;
            // A[i] = r;
            // B[i] = f;
            // i = i + 1;
            return r;
        } else {
            aux = raiz;
            while (aux.getIzquierda() != null || aux.getDerecha() != null) {//Este ciclo se cumplira cuando haya un nodo a su derecha o izquierda
                p2 = (Producto) aux.getInfo();//Coge la informacion del nodo al que aux apunta
                a = p1.getNombre().compareTo(p2.getNombre());//Compara la cadena a ingresar si es mayor o menor con la cadena del nodo aux
                if (a > 0 && aux.getDerecha() == null) {//En caso de ser mayor y no tenga nodos a su derecha
                    aux.setDerecha(nuevo);//Este nuevo nodo se enlaza en el arbol a la derecha
                    r = r + 40;
                    f = f + 40;
                    //   A[i] = r;
                    //  B[i] = f;
                    //  i = i + 1;
                    s = f;
                    comprobador = 1;
                    contador = contador + 1;
                    return r;//Como el nodo ya se ingreso se termina el metodo

                } else {
                    if (a > 0) {//En caso de que la cadena sea mayor pero a la derecha del nodo actual hayan nodos
                        aux = aux.getDerecha();//aux apunta al nodo de la derecha del nodo actual
                        r = r + 40;
                        f = f + 40;
                        s = f;
                    } else {
                        if (a < 0 && aux.getIzquierda() == null) {//Compara la cadena a ingresar si es mayor o menor con la cadena del nodo aux
                            aux.setIzquierda(nuevo);//En caso de ser menor y no tenga nodos a su izquierda
                            r = r - 40;
                            f = f + 40;
                            //    A[i] = r;
                            //  B[i] = f;
                            //  i = i + 1;
                            s = f;
                            comprobador = 2;
                            contador = contador + 1;
                            return r;//Como el nodo ya se ingreso se termina el metodo

                        } else {
                            if (a < 0) {//En caso de que la cadena sea menor pero a la izquierda del nodo actual hayan nodos
                                aux = aux.getIzquierda();
                                r = r - 40;//aux apunta al nodo de la derecha del nodo actual
                                f = f + 40;
                            } else {
                                if (a == 0) {//En caso de que la informacion del nodo a ingresar sea igual a la informacion de algun nodo que ya haya sido ingresada o exista
                                    JOptionPane.showMessageDialog(null, "ERROr...ya existe el nombre...☺☺☺");//Nos devuelve error
                                    System.exit(1);
                                }
                            }
                        }

                    }
                }
            }
            //Estas instrucciones cumple lo mismo que las anteriores y se cumplen cuando no dentra al ciclo o se sale del ciclo sin hacer nada
            p2 = (Producto) aux.getInfo();
            a = p1.getNombre().compareTo(p2.getNombre());
            if (a > 0) {
                aux.setDerecha(nuevo);
                r = r + 40;
                f = f + 40;
                comprobador = 1;
                contador = contador + 1;
                s = f;
                // A[i] = r;
                // B[i] = f;
                // i = i + 1;
                return r;

            } else {
                if (a < 0) {

                    aux.setIzquierda(nuevo);
                    r = r - 40;
                    f = f + 40;
                    s = f;
                    comprobador = 2;
                    contador = contador + 1;
                    // A[i] = r;
                    //  B[i] = f;
                    //  i = i + 1;
                    return r;
                } else {
                    if (a == 0) {
                        JOptionPane.showMessageDialog(null, "ERROr...ya existe el nombre...☺☺☺");
                        System.exit(1);
                    }
                }
            }
        }
        s = f;
        return r;
    }

    public int getVerificador() {
        return comprobador;
    }

    public int getalto() {
        return s;
    }

    public String inOrder(NodoDoble r) {
        String result = "";
        if (r != null) {
            result += inOrder(r.getIzquierda());
            result = result + ((Producto) r.getInfo()).getNombre() + "  ";
            result += inOrder(r.getDerecha());
        }
        return result;
    }

    public String posOrden(NodoDoble r) {
        String result = "";
        if (r != null) {
            result += posOrden(r.getIzquierda());
            result += posOrden(r.getDerecha());
            result = result + ((Producto) r.getInfo()).getNombre() + "  ";
        }
        return result;
    }

    public String preOrden(NodoDoble r) {
        String result = "";
        if (r != null) {
            result = result + ((Producto) r.getInfo()).getNombre() + "  ";
            result += preOrden(r.getIzquierda());
            result += preOrden(r.getDerecha());

        }
        return result;
    }

    public int tamanio() {

        return contador;

    }

    public String InordenNR(NodoDoble arbol) {
        i = 0;
        int j = 1;
        x = 196;
        y = 0;
        int k = 1;
        int control=0;
        int gt=1;
        Pila pila = new Pila(this.tamanio());
        NodoDoble aux = arbol;
        String r = "";
        while (aux != null || !pila.Vacio()) {
            while (aux != null) {
                pila.Apilar(aux);
                aux = aux.getIzquierda();
                if (aux != null) {
                    x = x - 40;//Parametro para señalar nodos a la izquierda
                    y = y + 40;
                  //if(control==0){//esta condicion se cumple cuando un nodo de la derecha
                    j = 1;//tiene nodos a su izquierda
                    k=1;
                    gt=0;
                   //}

                     
                }
            }
            if(control==0 && gt==1){//se cumple cuando no hay nodos a la derecha
                    j = 1;
                    k=1;
                   }
            A[i] = x;//alamcenan los parametros de la ubicacion de los nodos
            B[i] = y;
            aux = (NodoDoble) pila.Desapliar();
            r += ((Producto) aux.getInfo()).getNombre() + " ";
            S[i] = r + " ";
            i = i + 1;
            aux = aux.getDerecha();
            if (aux != null) {
                x = x + 40;//parametro para señalar nodos a la derecha
                y = y + 40;
                k = k + 1;
                j = j - 1;
                control=1;
                
               
            } else {
                gt=1;
                control=0;
                if (j<0)
                {
                x=x+(40*j);//parametros para señalar nodos hoja
                y = y - (40 * k);
                j = 0;
                }else{
                   x = x + 40;
                   y = y - (40 * k);//parametros para señalar nodos hoja
                   k = 1;
                   
                }

                            
            }
        }
        return r;
    }
    //Retorna la posicion de cada nodo en X y Y

    public int posX(int ps) {
        return A[ps];
    }

    public int posy(int ps) {
        return B[ps];
    }

    public String dt(int ps) {
        return S[ps];
    }
}
