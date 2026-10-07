import java.util.Scanner;


class Faturamento{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

       double [] vendas = new double[5];
       double total = 0;
       double mediaVendas = 0;


       for (int i = 0; i < 5;  i++){
           System.out.println(" Digite o valor total das vendas do dia " + (i + 1) + ":");
           vendas[i] = entrada.nextDouble();
           total += vendas[i];
       }

       mediaVendas = total / 5;

        System.out.printf("\nFaturamento total da semana: R$ %.2f\n", total);
        System.out.printf("Média diária de vendas: R$ %.2f\n\n", mediaVendas);

        for (int i = 0; i < 5; i++){
           if (vendas[i] < mediaVendas){
               System.out.printf("Dia %d ficou abaixo da média com R$ %.2f\n", (i + 1), vendas[i]);
           }
        }



    }

}
