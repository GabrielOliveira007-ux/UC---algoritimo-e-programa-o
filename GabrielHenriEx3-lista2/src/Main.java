import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();


        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
            int quadrado = numero * numero;
            System.out.println("O quadrado de " + numero + " é: " + quadrado);
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
            int cubo = numero * numero * numero;
            System.out.println("O cubo de " + numero + " é: " + cubo);
        }

        scanner.close();
    }
}

