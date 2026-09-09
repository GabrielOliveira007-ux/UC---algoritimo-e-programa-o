import java.util.Scanner;

public class ClassificacaoNadador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da idade
        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        // Classificação
        if (idade <= 12) {
            System.out.println("Categoria: Infantil");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Categoria: Juvenil");
        } else {
            System.out.println("Categoria: Adulto");
        }

    }
}
