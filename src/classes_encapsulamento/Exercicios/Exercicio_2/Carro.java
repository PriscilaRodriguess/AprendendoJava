package classes_encapsulamento.Exercicios.Exercicio_2;

public class Carro {
    private double velocidadeAtual = 0.0;
    private final double velocidadeMaxima = 120.0;

    private Marcha marchaAtual = Marcha.neutro;
    private boolean ligado = false;

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    public static enum Marcha {

        primeira(1, 0, 20),
        segunda(2, 21, 40),
        terceira(3, 41, 60),
        quarta(4, 61, 80),
        quinta(5, 81, 100),
        sexta(6, 101, 120),
        neutro(7, 0, 0);

        private final int numero;
        private final double velocidadeMin;
        private final double velocidadeMax;

        Marcha(int numero, double velocidadeMin, double velocidadeMax){
            this.numero = numero;
            this.velocidadeMin = velocidadeMin;
            this.velocidadeMax = velocidadeMax;
        }
        public int getNumero(){
            return numero;
        }

        public boolean dentroDaFaixa(double velocidade) {
            return velocidade >= velocidadeMin && velocidade <= velocidadeMax;
        }

        public static Marcha pegarMarchaPorVelocidade(double velocidade) {
            for (Marcha m : Marcha.values()) {
                if (m.dentroDaFaixa(velocidade)) {
                    return m;
                }
            }
            return neutro; // se nada bater, volta pro neutro
        }

    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("O carro está desligado!");
            return;
        }
        velocidadeAtual += 10;
        if (velocidadeAtual > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
        }
        atualizarMarcha();
    }

    public void atualizarMarcha() {
        marchaAtual = Marcha.pegarMarchaPorVelocidade(velocidadeAtual);
        System.out.println("Marcha atual: " + marchaAtual + " | Velocidade: " + velocidadeAtual + "km/h");
    }

    public void ligar(){
        if (marchaAtual == Marcha.neutro && velocidadeAtual == 0){
            ligado = true;
            System.out.println("Carro ligado!");
        } else {
            System.out.println("Não é possível ligar o carro fora do ponto morto!");
        }

    }

    public void frear() {
        if (velocidadeAtual > 0) {
            velocidadeAtual -= 10;
            if (velocidadeAtual < 0) velocidadeAtual = 0;
            atualizarMarcha();
        }
    }

    public void pontoMorto() {
        if (velocidadeAtual == 0) {
            marchaAtual = Marcha.neutro;
            System.out.println("Carro está em ponto morto.");
        } else {
            System.out.println("Não é possível colocar em ponto morto em movimento!");
        }
    }

    public void virarEsquerda() {
        if (velocidadeAtual >= 1 && velocidadeAtual <= 40) {
            System.out.println("Virando à esquerda...");
        } else {
            System.out.println("Velocidade fora da faixa para virar (1 a 40 km/h).");
        }
    }

    public void virarDireita() {
        if (velocidadeAtual >= 1 && velocidadeAtual <= 40) {
            System.out.println("Virando à direita...");
        } else {
            System.out.println("Velocidade fora da faixa para virar (1 a 40 km/h).");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O carro já está desligado!");
            return;
        }

        if (velocidadeAtual == 0 && marchaAtual == Marcha.neutro) {
            ligado = false;
            System.out.println("Carro desligado!");
        } else {
            System.out.println("Para desligar o carro, pare e coloque em ponto morto.");
        }
    }
}


