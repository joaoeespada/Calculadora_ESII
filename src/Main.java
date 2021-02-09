import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int menu = 0;
        int submenu = 0;

        Calculadora calculadora = new Calculadora();
        Scanner sc = new Scanner(System.in);
        
        do {
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
                                calculadora.soma(a, b);
                                break;
                            case 2:
                                System.out.println("Introduza os dois operandos: ");
                                a = sc.nextFloat();
                                b = sc.nextFloat();
                                calculadora.subtracao(a, b);
                                break;
                            case 3:
                                System.out.println("Introduza os dois operandos: ");
                                a = sc.nextFloat();
                                b = sc.nextFloat();
                                calculadora.multiplicacao(a, b);
                                break;
                            case 4:
                                System.out.println("Introduza os dois operandos: ");
                                a = sc.nextFloat();
                                b = sc.nextFloat();
                                calculadora.divisao(a, b);
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
                                calculadora.hexToDec(hex);
                                break;
                            case 6:
                                System.out.println("Introduza o número em Octal: ");
                                octal = sc.nextLine();
                                calculadora.octalToDec(octal);
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
                        System.out.println("------- Conversões de Moeda -------");
                        System.out.println("Escolha a operação a efetuar: ");
                        System.out.println("1 - Euro para Dolár EUA");
                        System.out.println("2 - Euro para Real");
                        System.out.println("3 - Euro para Yen Japonês");
                        System.out.println("4 - Euro para Libra");
                        System.out.println("5 - Euro para Franco Suiço");
                        System.out.println("0 - Sair do programa");
                        submenu = sc.nextInt();

                        float euro;


                        switch (submenu) {
                            case 1:
                                System.out.println("Introduza a quantia em euros para converter: ");
                                euro = sc.nextFloat();
                                calculadora.euroToDollar(euro);
                                break;
                            case 2:
                                System.out.println("Introduza a quantia em euros para converter: ");
                                euro = sc.nextFloat();
                                calculadora.euroToReal(euro);
                                break;
                            case 3:
                                System.out.println("Introduza a quantia em euros para converter: ");
                                euro = sc.nextFloat();
                                calculadora.euroToYen(euro);
                                break;
                            case 4:
                                System.out.println("Introduza a quantia em euros para converter: ");
                                euro = sc.nextFloat();
                                calculadora.euroToPound(euro);
                                break;
                            case 5:
                                System.out.println("Introduza a quantia em euros para converter: ");
                                euro = sc.nextFloat();
                                calculadora.euroToFranc(euro);
                                break;
                            case 0:
                                System.out.println("A encerrar calculadora...");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Insira uma opção válida!");
                        }
                        break;
                    case 4:
                        System.out.println("------- Calculos de Geometria plana -------");
                        System.out.println("Escolha a operação a efetuar: ");
                        System.out.println("1 - Área de um Triângulo");
                        System.out.println("2 - Área de um Quadrado");
                        System.out.println("3 - Área de um Retângulo");
                        System.out.println("4 - Área de um Círculo");
                        System.out.println("0 - Sair do programa");
                        submenu = sc.nextInt();

                        float altura, comprimento, base, largura, lado, raio;

                        switch (submenu) {
                            case 1:
                                System.out.println("Introduza a altura e a base em cm: ");
                                altura = sc.nextFloat();
                                base = sc.nextFloat();
                                calculadora.areaTriangulo(altura, base);
                                break;
                            case 2:
                                System.out.println("Introduza o lado em cm: ");
                                lado = sc.nextFloat();
                                calculadora.areaQuadrado(lado);
                                break;
                            case 3:
                                System.out.println("Introduza o comprimento e a largura em cm: ");
                                comprimento = sc.nextFloat();
                                largura = sc.nextFloat();
                                calculadora.areaRetangulo(comprimento, largura);
                                break;
                            case 4:
                                System.out.println("Introduza o raio em cm: ");
                                raio = sc.nextFloat();
                                calculadora.areaCirculo(raio);
                                break;
                            case 0:
                                System.out.println("A encerrar calculadora...");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Insira uma opção válida!");
                        }
                        break;
                    case 0:
                        System.out.println("A encerrar calculadora...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Insira uma opção válida!");
                }
        }while (menu != 0);
    }
}
