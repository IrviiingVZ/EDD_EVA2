
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {

        LinkedList<Integer> numeros = new LinkedList<>();

        // Agregar numeros
        numeros.add(6);
        numeros.add(13);
        numeros.add(4);
        numeros.add(23);

        System.out.println("Lista original: " + numeros);

        // Recorrer hacia adelante
        System.out.println("Recorrer hacia adelante:");

        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Recorrer hacia atras
        System.out.println("Recorrer hacia atras:");

        ListIterator<Integer> it2 =
            numeros.listIterator(numeros.size());

        while (it2.hasPrevious()) {
            System.out.println(it2.previous());
        }

        // Encontrar un numero
        System.out.println("Posicion del numero 13:");
        System.out.println(numeros.indexOf(13));

        // Insertar un numero
        numeros.add(2, 10);

        System.out.println("Despues de insertar 10:");
        System.out.println(numeros);

        // Eliminar un numero
        numeros.remove(Integer.valueOf(6));

        System.out.println("Despues de eliminar 6:");
        System.out.println(numeros);

        
        // Crear una cola (Queue) usando LinkedList
        Queue<Integer> cola = new LinkedList<>();
        
        System.out.println("Cola original:  " + cola ["6, 13, 4, 23"]);

        cola.add(6);
        cola.add(13);
        cola.add(4);
        cola.add(23);

        // Consultar el primer número
        System.out.println("Primer numero (peek): " + cola.peek());

        // Empujar (agregar) un número a la cola
        System.out.println("Empujar el numero (offer): " + cola.offer(10));

        // Eliminar el primer número
        System.out.println("Numero eliminado (poll): " + cola.poll());

        // Mostrar la cola
        System.out.println("Despues de poll: " + cola);
            }
}
