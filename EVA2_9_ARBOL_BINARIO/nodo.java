//clase para represetar un nodo del arbol binario
public class nodo {
    int valor;
    nodo derecha;
    nodo izquierda;

    public nodo(int valor) {
        this.valor = valor;
        this.derecha = null;
        this.izquierda = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(nodo derecha) {
        this.derecha = derecha;
    }

    public nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(nodo izquierda) {
        this.izquierda = izquierda;
    }
}

       








 