package Desafios;
import java.math.BigDecimal;
import java.util.Scanner;

public class PromocaoRelampago {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valorCompra = scanner.nextLine();
        System.out.println(calcularDesconto(valorCompra));
        scanner.close();
    }

    public static String calcularDesconto(String valorCompra) {
        BigDecimal valor = new BigDecimal(valorCompra);
        BigDecimal descontoPercentual;

        // TODO: Verifique se o valor é menor que 50.00:
        if(valor.compareTo(new BigDecimal("49.99")) <= 0){
            descontoPercentual = BigDecimal.valueOf(0);
        }
        // TODO: Verifique se o valor é entre 50.00 e 100.00 (inclusive):
        else if (valor.compareTo(new BigDecimal("50.00")) >= 0 && valor.compareTo(new BigDecimal("100.00")) <= 0) {
            descontoPercentual = BigDecimal.valueOf(10);
        }
        // TODO: Caso contrário, o valor é maior que 100.00:
        else {
            descontoPercentual =  BigDecimal.valueOf(20);
        }

        // TODO: Retorne a string formatada com o desconto aplicado, conforme exigido no desafio:
        return "Desconto de " + descontoPercentual.toPlainString() + "%";

    }
}