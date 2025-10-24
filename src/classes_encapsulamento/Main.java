package classes_encapsulamento;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    private final static PetShop petShop = new PetShop();

    public static void main(String[] args) {
    scanner.useDelimiter("\\n");
    var option = -1;

    do {
        System.out.println("===Escolha uma opção para proceguir===");
        System.out.println("1 - Dar banho no pet");
        System.out.println("2 - Abastecer a máquina com água");
        System.out.println("3 - Abastecer a máquina com Shampoo");
        System.out.println("4 - Verificar água da maquina");
        System.out.println("5 - Verificar shampoo da máquina");
        System.out.println("6 - Verificar se tem um pet na máquina");
        System.out.println("7 - Colocar o pet na máquina");
        System.out.println("8 - Retirar o pet da máquina");
        System.out.println("9 - Limpar a máquina");
        System.out.println("0 - Sair");
        option = scanner.nextInt();

        switch (option){
            case 1 -> petShop.banhoPet();
            case 2 -> completandoAgua();
            case 3 -> completandoShampoo();
            case 4 -> verificadorAgua();
            case 5 -> verificadorShampoo();
            case 6 -> seTemPetNaMaquina();
            case 7 -> colocarPetNaMaquina();
            case 8 -> petShop.tirarPet();
            case 9 -> petShop.limparMaquina();
            case 0 -> System.exit(0);
            default -> System.out.println("Opção Inválida!");

        }
    } while (option != 0);
    }

    private static void completandoShampoo(){
        System.out.println("Tentando colocar shampoo na máquina!");
        petShop.adicionarShampoo();
    }

    private static void completandoAgua(){
        System.out.println("Tentando colocar água na máquina!");
        petShop.adicionarAgua();
    }

    private static void verificadorAgua() {
        var quantidadeDeAgua = petShop.getAgua();
        System.out.println("A máquina está no momento com " + quantidadeDeAgua + " Litro(s) de água");
    }

    private static void verificadorShampoo() {
        var quantidadeDeShampoo = petShop.getShampoo();
        System.out.println("A máquina está no momento com " + quantidadeDeShampoo + " Litro(s) de shampoo");
    }

    private static void seTemPetNaMaquina() {
        var temPet = petShop.temPetNoBanho();
        System.out.println(temPet ? "Tem pet na máquina" : "Não tem pet na máquina!");
    }

    public static void colocarPetNaMaquina(){
        var name = "";
        while ( name == null || name.isEmpty()){
            System.out.println("Informe o nome do pet: ");
            name = scanner.next();
        }
        var pet = new Pet(name);
        petShop.setPet(pet);
    }

}