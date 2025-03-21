import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

    public void adiconar(Moeda moeda) {
        listaMoedas.add(moeda);
        System.out.println(moeda.valor);
        System.out.println(listaMoedas.get(listaMoedas.size() - 1).valor);
    }

    ;

    public void remover(Moeda moeda) {
        listaMoedas.remove(moeda);
    }

    ;

    public void listagemMoedas() {
    }

    ;
//    public float totalConvertido(){};
}