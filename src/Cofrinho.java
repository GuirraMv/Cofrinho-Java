import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

    public void adiconar(Moeda moeda) {
        listaMoedas.add(moeda);
    }

    public void remover(Moeda moeda) {
        listaMoedas.remove(moeda);
    }

    public void listagemMoedas() {
        for (Moeda moeda : listaMoedas) {
            System.out.println(moeda.nome + " " + moeda.valor);
        }
    }

    public double totalConvertido() {
        double dolarConvertido = 0;
        double euroConvertido = 0;
        double realConvertido = 0;
        double totalConvertido;

        for (Moeda moeda : listaMoedas) {
            if (moeda.nome == "Dolar") {
                Dolar dolar = new Dolar(moeda.valor);
                dolarConvertido = dolar.converter(moeda.valor);
            } else if (moeda.nome == "Euro") {
                Euro euro = new Euro(moeda.valor);
                euroConvertido = euro.converter(moeda.valor);
            } else {
                Real real = new Real(moeda.valor);
                realConvertido = real.converter(moeda.valor);
            }
        }

        totalConvertido = (dolarConvertido + euroConvertido + realConvertido);
        System.out.println("O total convertido em reais: " + totalConvertido);
        return totalConvertido;
    }
}