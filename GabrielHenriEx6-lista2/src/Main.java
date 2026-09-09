import java.util.Scanner;

public class NotaFiscal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double precoUnitario;


        if (codigo >= 1 && codigo <= 10) {
            precoUnitario = 10.00;
        } else if (codigo >= 11 && codigo <= 20) {
            precoUnitario = 15.00;
        } else if (codigo >= 21 && codigo <= 30) {
            precoUnitario = 20.00;
        } else if (codigo >= 31 && codigo <= 40) {
            precoUnitario = 30.00;
        } else {
            System.out.println("Código inválido!");
            scanner.close();
            return;
        }

        // Cálculo do preço total
        double precoTotal = precoUnitario * quantidade;

        // Determinação do desconto pela Tabela II
        double percentualDesconto;
        if (precoTotal <= 250) {
            percentualDesconto = 5;
        } else if (precoTotal <= 500) {
            percentualDesconto = 10;
        } else {
            percentualDesconto = 15;
        }

        double valorDesconto = precoTotal * (percentualDesconto / 100);
        double precoFinal = precoTotal - valorDesconto;

        // Saída dos resultados
        System.out.printf("Preço unitário: R$ %.2f%n", precoUnitario);
        System.out.printf("Preço total da nota: R$ %.2f%n", precoTotal);
        System.out.printf("Desconto aplicado (%.0f%%): R$ %.2f%n", percentualDesconto, valorDesconto);
        System.out.printf("Preço final da nota: R$ %.2f%n", precoFinal);

        scanner.close();
    }
}
