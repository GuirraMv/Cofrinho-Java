import java.util.ArrayList;
import java.util.Objects;

public class Cofrinho {
    private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
        System.out.println("Moeda de " + moeda.nome + " no valor de " + moeda.valor + " adicionada com sucesso!");
    }

    public void remover(Moeda moeda) {
        // verifica se a moeda inserida existe no array
        if (listaMoedas.contains(moeda)) {
            // verifica se o valor da moeda inserida é igual à moeda armazenada
            if (moeda.valor == listaMoedas.get(listaMoedas.size() - 1).valor) {
                listaMoedas.remove(moeda);
                System.out.println(moeda.nome + " " + moeda.valor + " removido com sucesso.");
            } else {
                System.out.println("Não existe " + moeda.nome + " armazenado no valor de " + moeda.valor);
            }
        } else {
            System.out.println("Moeda não encontrada. Digite uma moeda existente para remover.");
        }
    }

    public void listagemMoedas() {
        // se listaMoedas não estiver vazia irá exibir todos os elementos pelo for
        if (!listaMoedas.isEmpty()) {
            for (Moeda moeda : listaMoedas) {
                moeda.info(moeda.valor);
            }
        } else {
            System.out.println("Não há moedas no cofrinho! Adicione uma moeda para o cofrinho.");
        }
    }

    public void totalConvertido() {
        double dolarConvertido = 0;
        double euroConvertido = 0;
        double realConvertido = 0;
        double totalConvertido;

        // para cada moeda armazenada confere se o nome é igual e faz a conversão conforme definido na classe
        for (Moeda moeda : listaMoedas) {
            if (Objects.equals(moeda.nome, "Dolar")) {
                Dolar dolar = new Dolar(moeda.valor);
                dolarConvertido += dolar.converter(moeda.valor);
            } else if (Objects.equals(moeda.nome, "Euro")) {
                Euro euro = new Euro(moeda.valor);
                euroConvertido += euro.converter(moeda.valor);
            } else {
                Real real = new Real(moeda.valor);
                realConvertido += real.converter(moeda.valor);
            }
        }

        totalConvertido = (dolarConvertido + euroConvertido + realConvertido);
        System.out.println("O total convertido em Reais é de R$: " + totalConvertido);
    }
}