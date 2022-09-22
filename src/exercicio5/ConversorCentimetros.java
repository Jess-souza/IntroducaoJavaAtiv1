package exercicio5;

public class ConversorCentimetros {
    public static void main(String[] args) {
        double polegadas = 25;
        double cm = polegadas * 2.54;

        System.out.printf("A conversão de %.0f polegadas em centimetros, resulta em %.1fcm", polegadas, cm);
    }
}
