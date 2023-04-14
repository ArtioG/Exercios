package exercios;

import java.util.Scanner;

public class senso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char sexo;
        char Cordosolhos;
        char Cordoscabelos;
        int idade;
        double salario;
        int totalHabitantes = 0;
        int totalMulheres = 0;

        do {
            System.out.println("Digite o sexo em 'm' & 'f': ");
            sexo = scanner.nextLine().charAt(0);
            if (sexo == 'm' || sexo == 'f') {
                System.out.println("Sexo valido");
            } else {
                System.out.println("Sexo invalido");
                return;
            }
            System.out.println("Digite a cor do olhos em (a (azuis), v (verdes), c (castanhos), p (pretos): ");
            Cordosolhos = scanner.nextLine().charAt(0);
            if (Cordosolhos == 'a') {
                System.out.println("Olhos azuis");
            } else if (Cordosolhos == 'v') {
                System.out.println("Olhos verdes");
            } else if (Cordosolhos == 'c') {
                System.out.println("Olhos castanhos");
            } else if (Cordosolhos == 'p') {
                System.out.println("Olhos pretos");
            } else {
                System.out.println("Olhos invalidos");
                return;
            }
            System.out.println("Digite a cor dos cabelos em (l (loiros), c (castanhos), p (pretos), r (ruivos): ");
            Cordoscabelos = scanner.nextLine().charAt(0);
            if (Cordoscabelos == 'l') {
                System.out.println("Cabelos loiros");
            } else if (Cordoscabelos == 'c') {
                System.out.println("Cabelos castanhos");
            } else if (Cordoscabelos == 'p') {
                System.out.println("Cabelos pretos");
            } else if (Cordoscabelos == 'r') {
                System.out.println("Cabelos ruivos");
            } else {
                System.out.println("Cabelos invalidos");
                return;
            }
            System.out.println("Digite a idade entre 10 a 100 anos: ");
            idade = scanner.nextInt();
            if (idade < 10 || idade > 100) {
                System.out.println("Idade valida");
            } else {
                System.out.println("Idade Invalida");
                return;
            }
            System.out.println("Digite o seu salrio: ");
            salario = scanner.nextDouble();
            scanner.nextLine();

            if (sexo == 'f' && idade >= 18 && idade <= 35 && Cordosolhos == 'c' && Cordoscabelos == 'c') {
                totalMulheres++;
            }

            totalHabitantes++;

        } while (idade != -1);

        double porcentagemMulheres = ((double) totalMulheres / (double) (totalHabitantes - 1)) * 100.0;

        System.out.println("Porcentagem de mulheres entre 18 e 35 anos com olhos e cabelos castanhos: " +
                porcentagemMulheres + "%");
        scanner.close();
    }
}
