import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutosEntrada;
        int horas;
        int minutos;
        int horasEmminutos = 60;

        System.out.println(" Informe os minutos"
        + "(inteiro positivo):");
        minutosEntrada = sc.nextInt();

        if ( minutosEntrada > 0){
            horas = minutosEntrada / horasEmminutos;
            minutos = minutosEntrada % horasEmminutos;

            System.out.println("\n %d minutos = %d horas e %d minutos \n");

        }else{
            System.out.println("O valor informado é inválido:");
            System.out.println("tente novamente");
        }
}
    }
