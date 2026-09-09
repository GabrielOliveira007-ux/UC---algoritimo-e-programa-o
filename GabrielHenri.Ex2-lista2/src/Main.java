import java.util.Scanner;

public class ContaEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a quantidade de kWh consumidos: ");
        int consumo = scanner.nextInt();

        double valorConta;


        if (consumo <= 100) {
            valorConta = consumo * 0.50;
        } else if (consumo <= 200) {
            valorConta = consumo * 0.70;
        } else {
            valorConta = consumo * 0.90;
        }


        System.out.printf("Valor da conta de energia:", valorConta);

        scanner.close();
    }
}
