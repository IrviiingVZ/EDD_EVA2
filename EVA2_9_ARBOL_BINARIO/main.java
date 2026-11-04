
public class main {
    public static void main(String[] args) {

        // Agregamos nodos al arbol
        Arbol arbolito = new Arbol();

        arbolito.agregarNodo(13);
        arbolito.agregarNodo(10);
        arbolito.agregarNodo(18);
        arbolito.agregarNodo(2);
        arbolito.agregarNodo(11);
        arbolito.agregarNodo(17);
        arbolito.agregarNodo(20);
        arbolito.agregarNodo(16);

        // Recorrido en preorden
        System.out.println("Recorrido en preorden:");
        arbolito.preOrden();

        // Recorrido en inorden
        System.out.println("Recorrido en inorden:");
        arbolito.inOrden();

        // Recorrido en postorden
        System.out.println("Recorrido en postorden:");
        arbolito.postOrden();
    }
}
    