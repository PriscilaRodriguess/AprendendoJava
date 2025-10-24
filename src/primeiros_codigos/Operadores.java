package primeiros_codigos;

import java.util.Scanner;

    public class Operadores {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um número inicial: ");
            int numeroInicial = scanner.nextInt();
            System.out.println("Agora informe outro número para a verificação: ");
            int outroNumero = scanner.nextInt();
            boolean verificador = true;

            while(verificador) {
                if (outroNumero >= numeroInicial) {
                    if (outroNumero % numeroInicial == 0) {
                        System.out.println("O número " + outroNumero + " é divisível por " + numeroInicial + ". Informe outro número: ");
                        outroNumero = scanner.nextInt();
                    } else {
                        System.out.println("O número " + outroNumero + " não é divisível por " + numeroInicial + ". Encerrando o programa.");
                        verificador = false;
                    }
                } else {
                    System.out.println("Número menor que o inicial, por favor informe outro número: ");
                    outroNumero = scanner.nextInt();
                }
            }

        }
    }
