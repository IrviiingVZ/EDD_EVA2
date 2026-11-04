public class colecciones {
    public static void main(String[] args) {
    //LISTAS DOBLEMENTE ENLAZADAS
    linkedList lista = new linkedList();
    lista.add(100);  
    lista.add(200);  
    lista.add(300);  
    lista.add(400);  
    lista.add(500);  
    lista.add(600);  
    lista.add(700);  
    System.out.println(lista);
    System.out.println("Tamaño de la lista: " + lista.size());
    lista.remove(3);
    System.out.println(lista);
    }
   
   
    //ARRAY LIST --> NO ES UNA LISTAM ES UN ARRELO. SI NECESITA CAMBIAR DE TAMAÑO, SE CREA UN NUEVO ARREGLO Y SE COPIA EL CONTENIDO DEL ANTERIOR.
    arrayList <string> arrayList = new arrayList<String>();
    arrayList.add("hola");
    arrayList.add("mundo");
    arrayList.add("!");
    arrayList.add("¡Hola, mundo!");
    System.out.println(arrayList);
    System.out.println(arrayList.size());
    

    //STACK: EL ULTIMO EN LLEGAR ES EL PRIMERO EN SER ATENDIDO (LIFO)
    Stack<integrer> stack = new Stack<>();
    Stack.add(100);
    Stack.add(200);
    Stack.add(300);
    Stack.add(400);
    Stack.add(500);
    system.out.println(stack);
    system.out.println(stack.peek());
    system.out.println(stack.pop());
    system.out.println(stack.pop());

    //QUEUE 
    Queue<integrer> queue = new LinkedList<>();
    queue.add(100);
    queue.add(200);
    queue.add(300);
    queue.add(400);
    queue.add(500);
    system.out.println(queue);
    system.out.println(queue.peek());
    system.out.println(queue.poll());
    system.out.println(queue.poll());
    }   
    