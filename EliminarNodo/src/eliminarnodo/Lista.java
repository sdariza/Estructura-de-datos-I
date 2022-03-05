/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eliminarnodo;

/**
 *
 * @author s_eba
 */
public class Lista {

    Nodo ptr;

    public Lista() {
        this.ptr = null;
    }

    public void setPtr(Nodo ptr) {
        this.ptr = ptr;
    }

    public Nodo addCola(int dato) {
        Nodo newNodo = new Nodo(dato);
        if (ptr == null) {
            setPtr(newNodo);
        } else {
            Nodo q = ptr;
            while (q.link != null) {
                q = q.link;
            }
            q.link = newNodo;
        }
        return ptr;
    }

    public Nodo eliminarNodo(int dato) {
        if (ptr != null) {
            Nodo p = ptr;
            Nodo q = null;
            while (p.dato != dato && p.link != null) {
                q = p;
                p = p.link;
            }

            if (p.dato == dato) {
                if (ptr == p) {
                    ptr = p.link;
                } else {
                    q.link = p.link;
                }
            }
        }
        return ptr;
    }
}
