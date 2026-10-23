
public class recursividad {

    public static void main(String[] args) {
        imprimirInvCiclo(5);
        imprimirInvRecursivo(5);
    }

    public static void imprimirInvCiclo(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Fin del ciclo");
    }

    // Mismo proceso con recursividad
    public static void imprimirInvRecursivo(int n) {
        // Caso base: detener la recursividad
        if (n <= 1) {
            System.out.println("Fin de la recursividad");
            return;
        }

        System.out.println(n + " - ");
        imprimirInvRecursivo(n - 1);
    }
}
