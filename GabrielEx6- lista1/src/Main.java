import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.class);
        double salarioAtual;
        double porcentagemAumento;
        double valorAumento;
        double novoSalario;

        System.out.print("Digite o salário atual do funcionário: R$ ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite a porcentagem de aumento (ex: 15): ");
        double porcentagemAumento = scanner.nextDouble();

        // Calcula o valor em reais do aumento
        double valorAumento = salarioAtual * (porcentagemAumento / 100.0);
        double novoSalario = salarioAtual + valorAumento;

        // Exibe os resultados formatados
        System.out.println("\n--- Resumo do Reajuste ---");
        System.out.printf("Valor do aumento concedido: R$ %.2f\n", valorAumento);
        System.out.printf("Novo salário final: R$ %.2f\n", novoSalario);


    }
}