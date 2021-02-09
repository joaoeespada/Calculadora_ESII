import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int menu = 0;
        int submenu = 0;

        Calculadora calculadora = new Calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.println("------- Calculadora multitarefa -------");
        System.out.println("Escolha a operação a efetuar: ");
        System.out.println("1 - Operações aritméticas");
        System.out.println("2 - Operações de Sistema numérico");
        System.out.println("3 - Conversões de Moeda");
        System.out.println("4 - Cálculos de Geometria plana");
        System.out.println("0 - Sair do programa");
        menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.println("------- Operações aritméticas -------");
                System.out.println("Escolha a operação a efetuar: ");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("0 - Sair do programa");
                submenu = sc.nextInt();

                float a, b;

                switch (submenu) {
                    case 1:
                        System.out.println("Introduza os dois operandos: ");
                        a = sc.nextFloat();
                        b = sc.nextFloat();
                        calculadora.soma(a,b);
                        break;
                    case 2:
                        System.out.println("Introduza os dois operandos: ");
                        a = sc.nextFloat();
                        b = sc.nextFloat();
                        calculadora.subtracao(a,b);
                        break;
                    case 3:
                        System.out.println("Introduza os dois operandos: ");
                        a = sc.nextFloat();
                        b = sc.nextFloat();
                        calculadora.multiplicacao(a,b);
                        break;
                    case 4:
                        System.out.println("Introduza os dois operandos: ");
                        a = sc.nextFloat();
                        b = sc.nextFloat();
                        calculadora.divisao(a,b);
                        break;
                    case 0:
                        System.out.println("A encerrar calculadora...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Insira uma opção válida!");
                }

                break;
            case 2:
                System.out.println("------- Operações de Sistema numérico -------");
                System.out.println("Escolha a operação a efetuar: ");
                System.out.println("1 - Decimal para Binário");
                System.out.println("2 - Decimal para Hexadecimal");
                System.out.println("3 - Decimal para Octal");
                System.out.println("4 - Binário para Decimal");
                System.out.println("5 - Hexadecimal para Decimal");
                System.out.println("6 - Octal para Decimal");
                System.out.println("0 - Sair do programa");
                submenu = sc.nextInt();

                int dec;
                String bin, hex, octal;

                switch (submenu) {
                    case 1:
                        System.out.println("Introduza o número em Decimal: ");
                        dec = sc.nextInt();
                        calculadora.decToBin(dec);
                        break;
                    case 2:
                        System.out.println("Introduza o número em Decimal: ");
                        dec = sc.nextInt();
                        calculadora.decToHex(dec);
                        break;
                    case 3:
                        System.out.println("Introduza o número em Decimal: ");
                        dec = sc.nextInt();
                        calculadora.decToOctal(dec);
                        break;
                    case 4:
                        System.out.println("Introduza o número em Binário: ");
                        bin = sc.nextLine();
                        calculadora.binToDec(bin);
                        break;
                    case 5:
                        System.out.println("Introduza o número em Hexadecimal: ");
                        hex = sc.nextLine();
                        calculadora.binToDec(hex);
                        break;
                    case 6:
                        System.out.println("Introduza o número em Octal: ");
                        octal = sc.nextLine();
                        calculadora.binToDec(octal);
                        break;
                    case 0:
                        System.out.println("A encerrar calculadora...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Insira uma opção válida!");
                }
                break;
            case 3:
                // code block
                break;
            case 4:
                // code block
                break;
            case 0:
                System.out.println("A encerrar calculadora...");
                System.exit(0);
                break;
            default:
                System.out.println("Insira uma opção válida!");
        }
    }
}
