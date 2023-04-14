package exercios;

import java.util.Scanner;

public class vendcarros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de carros vendidos");
        int carros = sc.nextInt();

        System.out.println("Digite o valor total das vendas: ");
        double venda = sc.nextFloat();

        System.out.println("Digite o valor da comissao por carro vendido: ");
        double comissao = sc.nextFloat();

        System.out.println("Digite o salario fixo: ");
        double salario = sc.nextFloat();

        double comissaotot = comissao * carros;
        double valortot = salario + comissaotot + (venda * 0.5);

        System.out.println("O valor total sera de: " + valortot);

    }
}
