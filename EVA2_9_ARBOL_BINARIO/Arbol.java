public class Arbol { // Recomendado con mayúscula: Arbol

    private nodo root;

    public Arbol() {
        root = null;
    }

    // AGREGAMOS NODOS AL ARBOL
    public void agregarNodo(int valor) {
        if (root == null) {
            root = new nodo(valor);
        } else {
            agregarNodoRecursivo(root, valor);
        }
    }

    // METODO RECURSIVO PARA AGREGAR NODOS
    private void agregarNodoRecursivo(nodo nodoActual, int valor) {
        if (valor < nodoActual.valor) {
            if (nodoActual.izquierda == null) {
                nodoActual.izquierda = new nodo(valor);
            } else {
                agregarNodoRecursivo(nodoActual.izquierda, valor);
            }
        } else if (valor > nodoActual.valor) {
            if (nodoActual.derecha == null) {
                nodoActual.derecha = new nodo(valor);
            } else {
                agregarNodoRecursivo(nodoActual.derecha, valor);
            }
        }
    }

    // RECORRIDO PREORDEN
    public void preOrden() {
        preOrdenRecursivo(root);
    }

    // METODO RECURSIVO PARA EL RECORRIDO PREORDEN
    private void preOrdenRecursivo(nodo nodoActual) {
        if (nodoActual == null) return;
        System.out.print(nodoActual.valor + " ");
        preOrdenRecursivo(nodoActual.izquierda);
        preOrdenRecursivo(nodoActual.derecha);
    }

    // RECORRIDO INORDEN
    public void inOrden() {
        inOrdenRecursivo(root);
    }

    // METODO RECURSIVO PARA EL RECORRIDO INORDEN
    private void inOrdenRecursivo(nodo nodoActual) {
        if (nodoActual == null) return;
        inOrdenRecursivo(nodoActual.izquierda);
        System.out.print(nodoActual.valor + " ");
        inOrdenRecursivo(nodoActual.derecha);
    }

    // RECORRIDO POSTORDEN
    public void postOrden() {
        postOrdenRecursivo(root);
    }   

    // METODO RECURSIVO PARA EL RECORRIDO POSTORDEN
    private void postOrdenRecursivo(nodo nodoActual) {
        if (nodoActual == null) return;
        postOrdenRecursivo(nodoActual.izquierda);
        postOrdenRecursivo(nodoActual.derecha);
        System.out.print(nodoActual.valor + " ");
    }

    // RECORRIDO EN ORDEN INVERSO
    public void inOrdenInverso() {
        inOrdenInversoRecursivo(root);
    }

    // METODO RECURSIVO PARA EL RECORRIDO INORDEN INVERSO
    private void inOrdenInversoRecursivo(nodo nodoActual) {
        if (nodoActual == null) return;
        inOrdenInversoRecursivo(nodoActual.derecha);
        System.out.print(nodoActual.valor + " ");
        inOrdenInversoRecursivo(nodoActual.izquierda);
    }
}