package classes_encapsulamento.Exercicios.Exercicio_2;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        Carro carro = new Carro();
        int option;

        do {
            System.out.println("\n=== Escolha uma opção para seguirmos ===");
            System.out.println("1 - Ligar o Carro");
            System.out.println("2 - Acerelar " + carro.getVelocidadeAtual() + "km/h");
            System.out.println("3 - Freiar");
            System.out.println("4 - Ponto Morto");
            System.out.println("5 - Virar a direita");
            System.out.println("6 - Virar a esquerda");
            System.out.println("7 - Desligar o carro");
            System.out.println("0 - Sair");
            System.out.println("Digite a opção: ");

            option = scanner.nextInt();

            switch (option){
                case 1 -> carro.ligar();
                case 2 -> carro.acelerar();
                case 3 -> carro.frear();
                case 4-> carro.pontoMorto();
                case 5 -> carro.virarEsquerda();
                case 6 -> carro.virarDireita();
                case 7 -> carro.desligar();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção Inválida!");
            }
        } while (option != 0);
        scanner.close();
     }
}