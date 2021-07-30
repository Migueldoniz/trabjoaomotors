package Controller;

public class Pagamento {
    private String pgtoTipo;
    private double pgtoValor;

    public String getPgtoTipo() {
        return pgtoTipo;
    }

    public void setPgtoTipo(String pgtoTipo) {
        this.pgtoTipo = pgtoTipo;
    }

    public double getPgtoValor() {
        return pgtoValor;
    }

    public void setPgtoValor(double pgtoValor) {
        this.pgtoValor = pgtoValor;
    }

    public Pagamento(String pgtoTipo, double pgtoValor) {
        this.pgtoTipo = pgtoTipo;
        this.pgtoValor = pgtoValor;
    }

    public double calculaValor(double valor)
    {
        double soma=0;
        soma+=valor;
        return soma;
    }
}
