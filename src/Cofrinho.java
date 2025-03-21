import java.util.ArrayList;

public class Cofrinho {
    int nomeMoeda;
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

    public float totalConvertido() {
        return 1;
    }
}