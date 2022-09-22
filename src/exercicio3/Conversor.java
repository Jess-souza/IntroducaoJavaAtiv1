package exercicio3;

public class Conversor {

    public static void main(String[] args) {
        final double fator2 = 32;
        final double fator1 = 9.0 / 5.0;
        double fahrenheit;
        double celsius = 64;
        fahrenheit = (celsius * fator1) + fator2;
        System.out.println("A conversão de " + celsius + " graus Celsius em Fahrenheit é: " + fahrenheit);
    }
}
