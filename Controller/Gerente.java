package Controller;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Gerente extends Funcionario {
    private int grntAnosExp;

    public int getGrntAnosExp() {
        return grntAnosExp;
    }

    public void setGrntAnosExp(int grntAnosExp) {
        this.grntAnosExp = grntAnosExp;
    }

    public Gerente(String funcEmail, String funcSenha) {
        super(funcEmail, funcSenha);
    }

    public Gerente(String funcRG, String funcNome, Data funcDataNasc, Data funcDataAdmissao, double funcSalario, String funcEmail, String funcSenha, int grntAnosExp) {
        super(funcRG, funcNome, funcDataNasc, funcDataAdmissao, funcSalario, funcEmail, funcSenha);
        this.grntAnosExp = grntAnosExp;
    }

    public Gerente(String funcRG) {
        super(funcRG);
    }
    
    @Override
    public void cadastrar() {
        try
        {
            File arq = new File(".//src//Model//gerente.txt");
            FileWriter escritor = new FileWriter(arq, true);
            escritor.write(this.getFuncRG() + ";" + this.getFuncNome()+ ";" + this.getFuncDataNasc().getData() + ";" + this.getFuncDataAdmissao().getData() + ";" + this.getFuncSalario() + ";" + this.getFuncGouV() + ";" + this.getFuncEmail() + ";" + this.getFuncSenha() + ";" + this.getGrntAnosExp() + ";" + "\n");
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
        boolean flag = false; //indica se achou ou nao RG do gerente
        
        try
        {
            FileReader arq = new FileReader(".//src//Model//gerente.txt");
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
                JOptionPane.showMessageDialog(null, "RG do gerente inválido!", "Erro", JOptionPane.ERROR_MESSAGE);            
            else
            {
                File arq2 = new File(".//src//Model//gerente.txt");
                FileWriter escritor = new FileWriter(arq2, false);
                for(int i = 0; i < salvar.size(); i++)
                {
                   escritor.write(salvar.get(i) + "\n");
                }
                escritor.close();
                JOptionPane.showMessageDialog(null, "Gerente excluído com sucesso!", "Exclusão", JOptionPane.INFORMATION_MESSAGE);
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

    @Override
    public boolean verificaLogin() {
        boolean flag = false;
        try
        {
            FileReader arq = new FileReader(".//src//Model//gerente.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            while(lerArq.ready() && flag == false)
            {
                String linha = lerArq.readLine();
                String[] dadoSeparado = linha.split(";");
                if(this.getFuncEmail().equals(dadoSeparado[6]) && this.getFuncSenha().equals(dadoSeparado[7]))
                    flag = true;
            }
            
            lerArq.close();
        }
        
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao cosultar arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return flag;
    }
}