package Controller;

import java.io.*;
import javax.swing.JOptionPane;

public abstract class Funcionario extends Operacoes{
    private String funcRG;
    private String funcNome;
    Data funcDataNasc = new Data();
    Data funcDataAdmissao = new Data();
    private double funcSalario;
    private String funcGouV;
    private String funcEmail;
    private String funcSenha;

    public Funcionario(String funcEmail, String funcSenha) {
        this.funcEmail = funcEmail;
        this.funcSenha = funcSenha;
    }

    public String getFuncRG() {
        return funcRG;
    }

    public void setFuncRG(String funcRG) {
        this.funcRG = funcRG;
    }

    public String getFuncNome() {
        return funcNome;
    }

    public void setFuncNome(String funcNome) {
        this.funcNome = funcNome;
    }

    public Data getFuncDataNasc() {
        return funcDataNasc;
    }

    public void setFuncDataNasc(Data funcDataNasc) {
        this.funcDataNasc = funcDataNasc;
    }

    public Data getFuncDataAdmissao() {
        return funcDataAdmissao;
    }

    public void setFuncDataAdmissao(Data funcDataAdmissao) {
        this.funcDataAdmissao = funcDataAdmissao;
    }

    public double getFuncSalario() {
        return funcSalario;
    }

    public void setFuncSalario(double funcSalario) {
        this.funcSalario = funcSalario;
    }

    public String getFuncGouV() {
        return funcGouV;
    }

    public void setFuncGouV(String funcGouV) {
        this.funcGouV = funcGouV;
    }

    public String getFuncEmail() {
        return funcEmail;
    }

    public void setFuncEmail(String funcEmail) {
        this.funcEmail = funcEmail;
    }

    public String getFuncSenha() {
        return funcSenha;
    }

    public void setFuncSenha(String funcSenha) {
        this.funcSenha = funcSenha;
    }

    public Funcionario(String funcRG)
    {
        this.funcRG = funcRG;
    }
    
    public Funcionario(String funcRG, String funcNome, Data funcDataNasc, Data funcDataAdmissao, double funcSalario, String funcEmail, String funcSenha) {
        this.funcRG = funcRG;
        this.funcNome = funcNome;
        this.funcDataNasc = funcDataNasc;
        this.funcDataAdmissao = funcDataAdmissao;        
        this.funcSalario = funcSalario;
        this.funcEmail = funcEmail;
        this.funcSenha = funcSenha;
    }

    public Funcionario(String funcRG, String funcNome, Data funcDataNasc, Data funcDataAdmissao, double funcSalario, String funcGouV, String funcEmail, String funcSenha) {
        this.funcRG = funcRG;
        this.funcNome = funcNome;
        this.funcDataNasc = funcDataNasc;
        this.funcDataAdmissao = funcDataAdmissao;
        this.funcSalario = funcSalario;
        this.funcGouV = funcGouV;
        this.funcEmail = funcEmail;
        this.funcSenha = funcSenha;
    }
            
    public abstract boolean verificaLogin();

}