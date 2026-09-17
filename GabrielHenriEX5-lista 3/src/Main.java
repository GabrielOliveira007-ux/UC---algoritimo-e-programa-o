//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro:");
        int numero = sc.nextInt();
        System.out.println("tabuada"+ numero + ":");

        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;

            System.out.println(numero + "x" + i + "=" + resultado);


        }
}
}

