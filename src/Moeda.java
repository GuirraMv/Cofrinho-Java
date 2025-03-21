public abstract class Moeda {
    double valor;
    double cotacao;

    public Moeda(double valor) {
        this.valor = valor;
    }

    abstract public void info();


    public double converter(double cotacao, double valor) {
        this.valor = valor;
        this.cotacao = cotacao;
        return valor * cotacao;
    }


//    public abstract double converter(float cotacao, float valor);
}