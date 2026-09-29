import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Fatorial {
    public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);

                int num;
                int fatorial = 1;

        System.out.println("Digite o número:");
        num = entrada.nextInt();

        for (int i = num; i >= 1; i--){
            fatorial = i * num;
            System.out.println("Fatorial do número:" + fatorial);

        }
        System.out.println(" resultado final:" + fatorial);


    }
}