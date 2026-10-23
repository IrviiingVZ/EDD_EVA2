public class factorial {
    public static void main(String[] args) {
        int n = 5;
        int resultado = factorial(n);
        System.out.println("factorial de " + n + " es: " + resultado);
    }

    public static int factorial(int n) {
        for (int i = n - 1; i >= 1; i--) {
            n *= i; 
            
        }
        return n;
    }
    public static int factorialRecursivo(int n) {
        //Lo que resuelve el prbolema de manera recursiva
        //la llamada recursiva (el metodo se llama a si mismo)
        //determinamos un caso base para detener la recursividad
        if (n == 0) {
            return 1; 
        }
        return n * factorialRecursivo(n - 1); // Llamada recursiva
         
    }
}