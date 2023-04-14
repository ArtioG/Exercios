package exercios;

import java.util.Scanner;

public class cardapio {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                int[] caloriasPrato = { 180, 230, 250, 350 };
                int[] caloriasSobremesa = { 75, 110, 170, 200 };
                int[] caloriasBebida = { 20, 70, 100, 65 };

                System.out.println(
                                "Digite o numero de acordo com o cardapio (Prato: 1 - vegetariano, 2 - Peixe, 3 - Frango, 4 - Carne): ");
                int OpcaoPrato = scanner.nextInt();

                System.out.println(
                                "Digite o nuemro de acordo com a sobremsa (Sobremesa: 1 - Abacaxi, 2 - Sorvete diet, 3 - Mouse diet, 4 - Mouse chocolate): ");
                int OpcaoSobremsa = scanner.nextInt();

                System.out.println(
                                "Digite o nuemero de acordo com a bebida (Bebida: 1 - Chá, 2 - Suco de laranja, 3 - Suco de melão, 4 - Refrigerante diet.): ");
                int OpcaoBebida = scanner.nextInt();

                int caloriasTotal = caloriasPrato[OpcaoPrato - 1] + caloriasSobremesa[OpcaoSobremsa - 1]
                                + caloriasBebida[OpcaoBebida - 1];

                System.out.println("O total de calorias: " + caloriasTotal);

        }
}
