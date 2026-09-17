//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class CadastroSenha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int SENHA_CORRETA = 2026; // senha pré-definida
        int senhaDigitada;
        int tentativas = 0;

        do {
            System.out.print("Digite a senha de 4 dígitos: ");
            senhaDigitada = entrada.nextInt();
            tentativas++;

            if (senhaDigitada != SENHA_CORRETA) {
                System.out.println("Senha Incorreta! Tente novamente.");
            }

        } while (senhaDigitada != SENHA_CORRETA);

        System.out.println("Acesso Autorizado!");
        System.out.println("Total de tentativas: " + tentativas);

        entrada.close();
    }
}
