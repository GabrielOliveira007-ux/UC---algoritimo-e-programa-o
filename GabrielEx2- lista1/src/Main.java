import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = sc.nextInt();

        int soma = num1 + num2 + num3;
        double media = soma / 3.0;

        System.out.println("\n--- Resultados ---");
        System.out.println("Soma: " + soma);
        System.out.println("Média aritmética: " + media);
    }
}