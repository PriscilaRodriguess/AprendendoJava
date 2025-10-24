package primeiros_codigos;

import java.time.LocalDate;
import java.util.Scanner;

public class primeiros_codigos {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá! Seja bem vindo ao meu primeiro programa em Java!");
        Scanner scanner = new Scanner(System.in);
        int anoAtual = LocalDate.now().getYear();
        System.out.print("Por favor, digite seu nome: \n");
        String nome = scanner.nextLine();
        System.out.printf("Olá, %s! Agora digite o ano do seu nascimento: \n", nome);
        int anoNascimento = scanner.nextInt();
        int idade = anoAtual - anoNascimento;
        System.out.printf("No ano de %d, %s, você tem %d anos. \n", anoAtual, nome, idade);
        System.out.println("--------------------------------");
        System.out.print("Agora iremos calcular o tamanho de um lado de um quadrado!\n ");
        System.out.println("Digite o primeiro lado do quadrado:");
        double lado1 = scanner.nextDouble();
        System.out.println("Digite o segundo lado do quadrado: ");
        double lado2 = scanner.nextDouble();
        double areaLateral = lado1 * lado2;
        System.out.printf("A área do quadrado é: %.2f \n", areaLateral);
        System.out.println("--------------------------------");
        System.out.print("Agora iremos calcular a área de um retângulo!\n ");
        System.out.println("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        double areaDoRetangulo = base * altura;
        System.out.printf("A área do retângulo é: %.2f \n", areaDoRetangulo);
        System.out.println("--------------------------------");
        System.out.printf("Agora iremos calcular a diferencia de idade entre %s e um numero aleatório!\n", nome);
        System.out.printf("Sua idade é de %d anos.\n", idade);
        int idadeAleatoria = (int)(Math.random() * (double)100.0F);
        System.out.printf("A idade aleatória é de %d anos.\n", idadeAleatoria);
        System.out.println(idade >= idadeAleatoria);
        int diferencaIdade = Math.abs(idade - idadeAleatoria);
        System.out.printf("A diferença de idade entre %s e o número aleatório é de %d anos.\n", nome, diferencaIdade);
        scanner.close();
    }
}