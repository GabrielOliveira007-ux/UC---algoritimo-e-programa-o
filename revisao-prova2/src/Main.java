//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class restaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroPedido;
        System.out.println("1 - Feijoada:");
        System.out.println("2 - Lasanha");
        System.out.println("3 - Peixe grelhado");
        System.out.println("4 - salada");
        System.out.print(" Escolha o pedido:");
        numeroPedido = sc.nextInt();

        System.out.print("Prato escolhido");
        switch (numeroPedido){

            case  1:
                System.out.println("Feijoada");
                break;

            case  2:
                System.out.println("Lasanha");
                break;


            case  3:
                System.out.println("Peixe grelhado");
                break;

            case  4:
                System.out.println("Salada");
                break;
            default:
                System.out.println("a opção escolhida não é válida");
                break;
        }





    }
}