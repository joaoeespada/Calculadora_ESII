import java.lang.Math;

public class Calculadora {

    float resultado;

    // Operacoes aritmeticas

    public void soma (float a, float b){
        resultado = a + b;
        System.out.println(a + " + " + b + " = " + resultado);
    }

    public void subtracao (float a, float b){
        resultado = a - b;
        System.out.println(a + " - " + b + " = " + resultado);
    }

    public void multiplicacao (float a, float b){
        resultado = a * b;
        System.out.println(a + " * " + b + " = " + resultado);
    }

    public void divisao (float a, float b){
        resultado = a / b;
        System.out.println(a + " / " + b + " = " + resultado);
    }


    // Operacoes de Sistema numerico

    public void decToBin (int dec) {
        System.out.println("O número decimal " + dec + " convertido para binário é: " + Integer.toBinaryString(dec));
    }

    public void decToHex (int dec) {
        System.out.println("O número decimal " + dec + " convertido para hexadecimal é: " + Integer.toHexString(dec));
    }

    public void decToOctal (int dec) {
        System.out.println("O número decimal " + dec + " convertido para octal é: " + Integer.toOctalString(dec));
    }

    public void binToDec (String bin) {
        int decimal = Integer.parseInt(bin,2);

        System.out.println("O número binário " + bin + " convertido para decimal é: " + Integer.toBinaryString(decimal));
    }

    public void hexToDec (String hex) {
        int decimal = Integer.parseInt(hex,16);

        System.out.println("O número hexadecimal " + hex + " convertido para decimal é: " + Integer.toBinaryString(decimal));
    }

    public void octalToDec (String octal) {
        int decimal = Integer.parseInt(octal,8);

        System.out.println("O número octal " + octal + " convertido para decimal é: " + Integer.toBinaryString(decimal));
    }

    // Conversoes de Moeda

    public void euroToDollar (float euro) {
       resultado = (float) (1.21 * euro);

        System.out.println( euro + " euros convertido para dólares dos EUA, são: " + resultado);
    }

    public void euroToReal (float euro) {
        resultado = (float) (6.53 * euro);

        System.out.println( euro + " euros convertido para reais, são: " + resultado);
    }

    public void euroToYen (float euro) {
        resultado = (float) (126.65 * euro);

        System.out.println( euro + " euros convertido para yens japoneses, são: " + resultado);
    }

    public void euroToPound (float euro) {
        resultado = (float) (0.88 * euro);

        System.out.println( euro + " euros convertido para libras, são: " + resultado);
    }

    public void euroToFranc (float euro) {
        resultado = (float) (1.08 * euro);

        System.out.println( euro + " euros convertido para francos suíços, são: " + resultado);
    }

    // Calculos de Geometria plana

    public void areaTriangulo (float altura, float base) {
        resultado = (base * altura) / 2;

        System.out.println("A área do triângulo com base de: " + base + "cm e altura de: " + altura + "cm é de: " + resultado);
    }

    public void areaQuadrado (float lado) {
        resultado = (float) Math.pow(lado, 2);

        System.out.println("A área do quadrado com lado de: " + lado + "cm é de: " + resultado);
    }

    public void areaRetangulo (float comprimento, float largura) {
        resultado = comprimento * largura;

        System.out.println("A área do retângulo com comprimento de: " + comprimento + "cm e largura de: " + largura + "cm é de: " + resultado);
    }

    public void areaCirculo (float raio) {
        resultado = (float) (Math.PI * Math.pow(raio, 2));

        System.out.println("A área do círculo com raio de: " + raio + "cm é de: " + resultado);
    }

}
