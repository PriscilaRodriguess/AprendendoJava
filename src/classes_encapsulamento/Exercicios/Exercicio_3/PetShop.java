package classes_encapsulamento.Exercicio_3;

public class PetShop {

    private boolean clean = true;

    private int shampoo = 10;

    private int agua = 30;

    private Pet pet;

    public PetShop() {

    }
    //Dar banho

    public void banhoPet(){
        if(this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho!");
            return;
        }
        this.agua -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName()  + " está limpo!");
    }

    //Verificar nível de água, Abastecer com água,
    public void adicionarAgua(){
        if(agua == 30) {
            System.out.println("A capacidade de água está no máximo de 30L!");
            return;
        }
        agua += 2;
    }
// Verificar nível de Shampoo, Abastecer com shampoo,
    public void adicionarShampoo(){
        if(shampoo == 10) {
            System.out.println("A capacidade de shampoo está no máximo de 10L!");
            return;
        }
        shampoo += 2;
    }

    public int getAgua() { return agua; }

    public int getShampoo() { return shampoo; }

//Verificar se tem pet no banho,
    public boolean temPetNoBanho() { return pet != null; }

// Colocar pet na máquina,
    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A máquina está suja, para colocar o pet precisa limpa-la!");
            return;
        }
        if (temPetNoBanho()){
            System.out.println("O pet " + this.pet.getName() + " Está tomando banho no momento!");
            return;
        }

        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina!");
    }
//  - Retirar o pet da máquina,
    public void tirarPet(){
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " foi tirado da máquina!");
        this.pet = null;
    }
//    - Limpar a máquina.
        public void limparMaquina(){
            this.agua -=10;
            this.shampoo -= 2;
            this.clean = true;
            System.out.println("A máquina foi limpa!");
        }

}
