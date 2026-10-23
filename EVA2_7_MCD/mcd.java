public class mcd {
    public static void main(String[] args) {
    System.out.println("El MCD de 48 y 18 es: " + mcd(48, 18));

    }

    public static int mcd(int dividiendo, int divisor) {
        // Caso base: si divisor es 0, el MCD es dividiendo
        if (divisor == 0) {
            return dividiendo;
       }
        // Llamada recursiva: MCD(dividendo, divisor) = MCD(divisor, dividiendo % divisor)
        return mcd(divisor, dividiendo % divisor);
    }
}




