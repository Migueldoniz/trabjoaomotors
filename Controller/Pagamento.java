package Controller;
import javax.swing.JOptionPane;

public class Pagamento {
    private char pgtoTipo;
    private double pgtoValor;

    public char getPgtoTipo() {
        return pgtoTipo;
    }

    public void setPgtoTipo(char pgtoTipo) {
        this.pgtoTipo = pgtoTipo;
    }

    public double getPgtoValor() {
        return pgtoValor;
    }

    public void setPgtoValor(double pgtoValor) {
        this.pgtoValor = pgtoValor;
    }

    public Pagamento(char pgtoTipo, double pgtoValor) {
        this.pgtoTipo = pgtoTipo;
        this.pgtoValor = pgtoValor;
    }

    public double[] calculaValor(char pagtipo,double valor)
    {
        switch (pagtipo){
            case 'V':
            {
              double aux=valor;
              double[] value = null;
              value[0]=(valor+(aux*0.1));
              return value;
            }
            case 'P':
            {
             double aux=valor;
             double[] valores = null;
             valores[0]=(aux/12)*1.2;
             valores[1]=(aux/24)*1.87;
             valores[2]=(aux/36)*2.44;
             return valores;
            }
            default:
            {
                JOptionPane.showMessageDialog(null,"Forma de pagamento errônea","Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }
        return null;
    }
}
