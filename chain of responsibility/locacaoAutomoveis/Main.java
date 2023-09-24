package locacaoAutomoveis;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void cliente(Handler handler) {
        List<String> categoriaDeCarros = new ArrayList<>();

        categoriaDeCarros.add("mais caros");
        categoriaDeCarros.add("médios");
        categoriaDeCarros.add("mais baratos");

        for (String valor : categoriaDeCarros) {
            System.out.println("Veja os carros disponíveis por " + valor);
            String escolha = handler.handle(valor);

            if (!escolha.isEmpty()) {
                System.out.println("Os carros são: " + escolha);
            } else {
                System.out.println("Nenhum carro disponível para " + valor);
            }
        }
    }

    public static void main(String[] args) {
        Handler esportivo = new tipoEsportivo(null);
        Handler classic = new tipoClassic(null);
        Handler offRoad = new tipoOffRoad(null);

        esportivo.next(classic).next(offRoad);

        System.out.println("Cadeias: Esportivos > Clássicos > Off-Road");
        cliente(esportivo);
        System.out.println("");
        System.out.println("Subcadeia: Clássicos > Off-Road");
        cliente(classic);
        System.out.println("");
        System.out.println("Subcadeia: Off-Road");
        cliente(offRoad);
    }
}
