package Desafios;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OrganizandoEstoque {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        String saida = organizarEstoque(entrada);
        System.out.println(saida);
        scanner.close();
    }

    public static String organizarEstoque(String entrada) {
        //TODO: Crie um mapa (LinkedHashMap) para armazenar o total de cada código mantendo a ordem de aparição
        Map<String, Integer> estoqueMap = new LinkedHashMap<>();

        String[] lojas = entrada.split(",");

        for (String loja : lojas) {
            String[] partes = loja.split(":");
            String codigo = partes[0].trim(); //remove espaços em branco.
            int quantidade = Integer.parseInt(partes[1].trim());

            // TODO: Atualize a quantidade total no mapa (soma com o valor atual, se já existir)
            estoqueMap.put(codigo, estoqueMap.getOrDefault(codigo, 0) + quantidade);
        }

        StringBuilder sb = new StringBuilder();

        // TODO: Itere sobre os pares do mapa e monta a string no formato "codigo:quantidade"
        for (Map.Entry<String, Integer> entry : estoqueMap.entrySet()) {
            sb.append(entry.getKey()) // codigo da loja
                    .append(":")
                    .append(entry.getValue()) // quantidade total de produtos
                    .append(",");
        }
        // Remove a última vírgula, se existir
        if (!sb.isEmpty()) sb.setLength(sb.length() - 1);
        //retorna a string formatada
        return sb.toString();
    }
}