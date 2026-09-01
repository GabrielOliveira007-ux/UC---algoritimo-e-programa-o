import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso;
        double altura;


        System.out.print("Digite seu peso (em kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        double altura = sc.nextDouble();

        // Fórmula do IMC: peso dividido pela altura ao quadrado
        double imc = peso / (altura * altura);

    }
}