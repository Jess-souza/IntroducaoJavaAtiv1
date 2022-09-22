package exercicio4;

public class ConversorMoeda {
    public static void main(String[] args) {
        double dolar = 5.17;
        double real = 532.50;
        double conversao = real/dolar;

        System.out.printf("A conversão de R$%.2f em dólar, resulta em $%.2f", real, conversao);
    }
}
