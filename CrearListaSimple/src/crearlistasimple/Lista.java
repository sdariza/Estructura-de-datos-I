/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crearlistasimple;

/**
 *
 * @author s_eba
 */
public class Lista {

    Nodo ptr1, ptr2;

    public Lista() {
        this.ptr1 = null;
        this.ptr2 = null;
    }

    public void setPtr1(Nodo ptr1) {
        this.ptr1 = ptr1;
    }

    public void setPtr2(Nodo ptr2) {
        this.ptr2 = ptr2;
    }

    public Nodo addPila(int dato) {
        Nodo newNodo = new Nodo(dato);
        newNodo.link = ptr1;
        setPtr1(newNodo);
        return ptr1;
    }

    public Nodo addCola(int dato) {
        Nodo newNodo = new Nodo(dato);
        if (ptr2 == null) {
            setPtr2(newNodo);
        } else {
            Nodo q = ptr2;
            while (q.link != null) {
                q = q.link;
            }
            q.link = newNodo;
        }
        return ptr2;
    }

}
