public class Dolar extends Moeda {
    static final String nome = "Dolar";
    double cotacao = 5.68;
    double valor;

    public Dolar(double valor) {
        super(nome, valor);
    }

    @Override
    public void info() {
    }

    public double converter(double valor) {
        this.valor = valor;
        return super.converter(cotacao, valor);
    }
}