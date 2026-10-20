import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class restaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int resultado;


        System.out.println("Tabuada UNA:");
        System.out.println("Informe o número:");
        n= sc.nextInt();

        for (int i = 0; i < 11; i++) {

            resultado = i * n;
            System.out.println(" %d % %d = %d\n"n , i, resultado);

        }






    }


}