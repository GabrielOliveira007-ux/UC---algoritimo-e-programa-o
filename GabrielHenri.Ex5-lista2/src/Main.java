import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();


        System.out.println("Digite 1 para converter para Fahrenheit");
        System.out.println("Digite 2 para converter para Kelvin");
        int opcao = scanner.nextInt();


        if (opcao == 1) {
            double fahrenheit = celsius * 1.8 + 32;
            System.out.printf("Temperatura em Fahrenheit:", fahrenheit);
        } else if (opcao == 2) {
            double kelvin = celsius + 273.15;
            System.out.printf("Temperatura em Kelvin:", kelvin);
        } else {
            System.out.println("Opção inválida!");
        }


    }
}
