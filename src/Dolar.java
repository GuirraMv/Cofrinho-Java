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

    @Override
    public boolean equals(Object objeto) {
        // Verifica se é o mesmo objeto na memória
        if (this == objeto) return true;
        // Garante que o objeto não é nulo e é do mesmo tipo
        if (objeto == null || getClass() != objeto.getClass()) return false;
        Dolar other = (Dolar) objeto;
        return Double.compare(valor, other.valor) == 0;
    }

    public double converter(double valor) {
        this.valor = valor;
        return super.converter(cotacao, valor);
    }
}