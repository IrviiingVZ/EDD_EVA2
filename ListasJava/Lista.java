
import java.util.LinkedList;
import java.util.Iterator;

public class Lista {
    public static void main(String[] args) {

        LinkedList<Integer> numeros = new LinkedList<>();

        // Agregar numeros (es el metodo para agregar los numeros a la lista ".add") 
        numeros.add(6);
        numeros.add(4);
        numeros.add(13);
        numeros.add(23);
        numeros.add(67);

        System.out.println("Lista original: " + numeros);

        // Recorrer la lista (El metodo iterator se usa para recorrer los numeros de la lista ".it") 
        System.out.println("Recorrer la lista:");

        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Encontrar un numero
        System.out.println("Buscar el numero 4:");

        System.out.println(
            "Posicion: " + numeros.indexOf(4)
        );

        // Insertar un numero en una posicion especifica
        numeros.add(5, 15);
        numeros.add(2, 23);

        System.out.println("Despues insertar:");
        System.out.println(numeros);

        // Eliminar un numero por su valor (.remove)
        numeros.remove(Integer.valueOf(13));
        numeros.remove(Integer.valueOf(6));
        numeros.remove(Integer.valueOf(67));
        
        

        System.out.println("Despues de eliminar 13, 6 y 67:");
        System.out.println(numeros);
    }
}

