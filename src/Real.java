public class Real extends Moeda {
    static final String nome = "Real";
    double valor;
    double cotacao = 1;

    public Real(double valor) {
        super(nome, valor);
    }

    @Override
    public void info(double valor) {
        this.valor = valor;
        System.out.println("Moeda de Real no valor de: " + valor);
    }

    @Override
    public boolean equals(Object objeto) {
        // Verifica se é o mesmo objeto na memória
        if (this == objeto) return true;
        // Garante que o objeto não é nulo e é do mesmo tipo
        if (objeto == null || getClass() != objeto.getClass()) return false;
        Real other = (Real) objeto;
        return Double.compare(valor, other.valor) == 0;
    }

    public double converter(double valor) {
        this.valor = valor;
        return super.converter(cotacao, valor);
    }
}