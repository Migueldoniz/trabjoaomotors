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
public class Funcionario {
    private String rg;
    private String nome;
    Data data;
    
    //data de nasc
    //data de adms
    private double salario;

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
