package Controller;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Vendedor extends Funcionario {
    private int vnddTempoTR;
    private String vnddGerenteResp;

    public int getVnddTempoTR() {
        return vnddTempoTR;
    }

    public void setVnddTempoTR(int vnddTempoTR) {
        this.vnddTempoTR = vnddTempoTR;
    }

    public String getVnddGerenteResp() {
        return vnddGerenteResp;
    }

    public void setVnddGerenteResp(String vnddGerenteResp) {
        this.vnddGerenteResp = vnddGerenteResp;
    }
    
    public Vendedor(String funcRG, String funcNome, Data funcDataNasc, Data funcDataAdmissao, double funcSalario, String funcGouV, String funcEmail, String funcSenha, int vnddTempoTR, String vnddGerenteResp) {
        super(funcRG, funcNome, funcDataNasc, funcDataAdmissao, funcSalario, funcGouV, funcEmail, funcSenha);
        this.vnddTempoTR = vnddTempoTR;
        this.vnddGerenteResp = vnddGerenteResp;
    }    
    
    @Override
    public void cadastrar() {
        try
        {
            File arq = new File(".//src//Model//vendedores.txt");
            FileWriter escritor = new FileWriter(arq, true);
            escritor.write(this.getFuncRG() + ";" + this.getFuncNome()+ ";" + this.getFuncDataNasc() + ";" + this.getFuncDataAdmissao() + ";" + this.getFuncSalario() + ";" + this.getFuncGouV() + ";" + this.getFuncEmail() + ";" + this.getFuncSenha() + ";" + this.getVnddTempoTR() + ";" + this.getVnddGerenteResp() + "\n");
            escritor.close();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }
        
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados no arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void excluir() {
        ArrayList <String> salvar = new ArrayList<>();
        boolean flag = false; //indica se achou ou nao RG do vendedor
        
        try
        {
            FileReader arq = new FileReader(".//src//Model//vendedores.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            while(lerArq.ready())
            {
                String linha = lerArq.readLine();
                String[] dadoSeparado = linha.split(";");
                if(!dadoSeparado[0].equals(this.getFuncRG()))
                    salvar.add(linha);                
                else
                    flag = true;
            }            
            lerArq.close();
            
            if(flag == false)
                JOptionPane.showMessageDialog(null, "RG do vendedor inválido!", "Erro", JOptionPane.ERROR_MESSAGE);            
            else
            {
                File arq2 = new File(".//src//Model//vendedores.txt");
                FileWriter escritor = new FileWriter(arq2, false);
                for(int i = 0; i < salvar.size(); i++)
                {
                   escritor.write(salvar.get(i) + "\n");
                }
                escritor.close();
                JOptionPane.showMessageDialog(null, "Vendedor excluído com sucesso!", "Exclusão", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados no arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void alterar() {
        this.excluir();
        this.cadastrar();
    }    
}
