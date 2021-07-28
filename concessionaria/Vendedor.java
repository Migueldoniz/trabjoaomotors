/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria;

/**
 *
 * @author migue
 */
public class Vendedor extends Funcionario {
    private int tempotreinamento;
    private String gerenteresp;

    public int getTempotreinamento() {
        return tempotreinamento;
    }

    public String getGerenteresp() {
        return gerenteresp;
    }

    public void setTempotreinamento(int tempotreinamento) {
        this.tempotreinamento = tempotreinamento;
    }

    public void setGerenteresp(String gerenteresp) {
        this.gerenteresp = gerenteresp;
    }
    
    
}
