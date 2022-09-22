package exercicio1;

public class CalculoDistancia {
    public static void main(String[] args) {
        int tempo = 4;
        float velocidade = 80;
        float distancia = tempo * velocidade;

        float litros_usados = distancia / 12;

        System.out.printf("De acordo com os dados informados, o tempo gasto em viagem foi de %d horas, sendo realizada em velocidade média de %.2fkm/h, a distancia percorrida foi de %.2fkm/h e foram gastos %.2f litros de combustível.", tempo, velocidade, distancia, litros_usados);
    }
}
