public class fibonacci{
    public static void main(String[] args) {
        int posicion = 7; //Al cambiar este posicion, se puede obtener el número Fibonacci en la posición deseada
        int resultado = fibonacci(posicion); // Llamada a la función para obtener el número Fibonacci en la posición deseada
        System.out.println("El número Fibonacci en la posición " + posicion + " es: " + resultado);    
    }

    public static int fibonacci(int posicion) {
        // Caso base: si el posicion es menor o igual a 0, el número Fibonacci es 1
        if (posicion <= 0) {
            return 1;
        }
        // Caso base: si el posicion es 1, el número Fibonacci es 1
        if (posicion == 1) {
            return 1;
        }
        // Llamada recursiva: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
        return fibonacci(posicion - 1) + fibonacci(posicion - 2);
    }
}