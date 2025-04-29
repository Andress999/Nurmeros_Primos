import java.util.Scanner;

public class hola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos números primos deseas ver? ");
        int n = scanner.nextInt();
        
        int count = 0;
        int num = 2;
        
        System.out.println("Los primeros " + n + " números primos son:");
        
        while (count < n) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        
        scanner.close();
    }
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}