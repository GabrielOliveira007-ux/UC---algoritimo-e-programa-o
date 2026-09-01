import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.class);
        int idadeAnos;

        System.out.print("Digite sua idade em anos: ");
        int idadeAnos = sc.nextInt();

        // Conversão: 1 ano = 12 meses
        int idadeMeses = idadeAnos * 12;

        System.out.println("Sua idade em meses é: " + idadeMeses + " meses.");
    }
}