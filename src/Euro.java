public class Euro extends Moeda {
    static final String nome = "Euro";
    double cotacao = 6.16;
    double valor;

    public Euro(double valor) {
        super(nome, valor);
    }

    @Override
    public void info(double valor) {
        this.valor = valor;
        System.out.println("Moeda de Euro no valor de: " + valor);
    }

    @Override
    public boolean equals(Object objeto) {
        // Verifica se é o mesmo objeto na memória
        if (this == objeto) return true;
        // Garante que o objeto não é nulo e é do mesmo tipo
        if (objeto == null || getClass() != objeto.getClass()) return false;
        Euro other = (Euro) objeto;
        return Double.compare(valor, other.valor) == 0;
    }

    public double converter(double valor) {
        this.valor = valor;
        return super.converter(cotacao, valor);
    }
}