/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import javax.swing.JOptionPane;

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

    public double calculaValor(String pagtipo,double valor)
    {
        switch (pagtipo){
            case "A vista":
            {
              double aux=valor;
              double value;
              value=(valor+(aux*0.1));
              return value;
            }
            case "A prazo(12x)":
            {
             double aux=valor;
             double valore;
             valore=(aux/24)*1.87;
             return valore;
            }
            case "A prazo(24x)":
            {
             double aux=valor;
             double valoree;
             valoree=(aux/12)*1.2;
             return valoree;
            }
            
            case "A prazo(36x)":
            {
             double aux=valor;
             double valoreeee;
             valoreeee=(aux/36)*2.44;
             return valoreeee;
            }
            default:
            {
                JOptionPane.showMessageDialog(null,"Forma de pagamento errônea","Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }
        return 0;
    }
}
