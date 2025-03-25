public abstract class Moeda {
    String nome;
    double valor;
    double cotacao;

    public Moeda(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    abstract public void info(double valor);

    public double converter(double cotacao, double valor) {
        this.valor = valor;
        this.cotacao = cotacao;
        return valor * cotacao;
    }
}