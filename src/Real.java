public class Real extends Moeda {
    static final String nome = "Real";
    double valor;
    double cotacao = 1;

    public Real(double valor) {
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