import java.util.Scanner;
// treinando switch sozinho

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        int opcao;
        double resultado;

        System.out.println("Calculadora Simples");

        System.out.println("Digite seu primeiro numero: ");
        n1 = sc.nextInt();
        System.out.println("Digite seu segundo número: ");
        n2 = sc.nextInt();

        System.out.println("Escolha um operação: ");
        System.out.println("1- Adição: ");
        System.out.println("2- Subtração: ");
        System.out.println("3- Multiplicação: ");
        System.out.println("4- Divisão: ");

        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                resultado = n1 + n2;
                System.out.println("Seu resultado é :" + resultado);
                break;
            case 2:
                resultado = n1 - n2;
                System.out.println("Seu resultado é : " + resultado);
                break;
            case 3:
                resultado = n1 * n2;
                System.out.println("Seu resultado é : " + resultado);
                break;
            case 4:
                resultado = n1 / n2;
                System.out.println("Seu resultado é : " + resultado);
                break;
            default:
                System.out.println("Opção invalida");

        }

    }
}
