import java.util.Scanner;

public class Financiamento {
    public static void main(String[]) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite sua renda mensal: R$ ");
        double rendaMensal = scanner.nextDouble();

        System.out.print("Digite o valor da prestação desejada: R$ ");
        double prestacao = scanner.nextDouble();

        // Regra 1: prestação não pode ultrapassar 30% da renda
        double limitePrestacao = rendaMensal * 0.30;

        if (prestacao > limitePrestacao) {
            System.out.println("Financiamento negado por alta prestação");
        } else if (prestacao > 3000 && rendaMensal < 10000) {
            // Regra 2: prestação acima de 3000 exige renda mínima de 10000
            System.out.println("Financiamento negado por baixa renda");
        } else {
            System.out.println("Financiamento aprovado");
        }

        scanner.close();
    }
}
