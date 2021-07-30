package Controller;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public abstract class Venda extends Operacoes{
    private int vndId;
    private double pgtoValor;
    private String pgtoTipo;
    Data vndData = new Data();
    Hora vndHora = new Hora();
    private String veicNumChassi;
    private String veicModelo;
    private String funcRG;
    private String cliCPF;
    private boolean desconto;
    private double juros;

    public int getVndId() {
        return vndId;
    }

    public void setVndId(int vndId) {
        this.vndId = vndId;
    }

    public double getPgtoValor() {
        return pgtoValor;
    }

    public void setPgtoValor(double pgtoValor) {
        this.pgtoValor = pgtoValor;
    }

    public String getPgtoTipo() {
        return pgtoTipo;
    }

    public void setPgtoTipo(String pgtoTipo) {
        this.pgtoTipo = pgtoTipo;
    }

    public Data getVndData() {
        return vndData;
    }

    public void setVndData(Data vndData) {
        this.vndData = vndData;
    }

    public Hora getVndHora() {
        return vndHora;
    }

    public void setVndHora(Hora vndHora) {
        this.vndHora = vndHora;
    }

    public String getVeicNumChassi() {
        return veicNumChassi;
    }

    public void setVeicNumChassi(String veicNumChassi) {
        this.veicNumChassi = veicNumChassi;
    }

    public String getVeicModelo() {
        return veicModelo;
    }

    public void setVeicModelo(String veicModelo) {
        this.veicModelo = veicModelo;
    }

    public String getFuncRG() {
        return funcRG;
    }

    public void setFuncRG(String funcRG) {
        this.funcRG = funcRG;
    }

    public String getCliCPF() {
        return cliCPF;
    }

    public void setCliCPF(String cliCPF) {
        this.cliCPF = cliCPF;
    }

    public boolean isDesconto() {
        return desconto;
    }

    public void setDesconto(boolean desconto) {
        this.desconto = desconto;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public Venda(int vndId, double pgtoValor, String pgtoTipo, Data vndData, Hora vndHora, String veicNumChassi, String veicModelo, String funcRG, String cliCPF, boolean desconto, double juros) {
        this.vndId = vndId;
        this.pgtoValor = pgtoValor;
        this.pgtoTipo = pgtoTipo;
        this.vndData = vndData;
        this.vndHora = vndHora;
        this.veicNumChassi = veicNumChassi;
        this.veicModelo = veicModelo;
        this.funcRG = funcRG;
        this.cliCPF = cliCPF;
        this.desconto = desconto;
        this.juros = juros;
    }    

 @Override
    public void cadastrar() {
        try
        {
            File arq = new File(".//src//Model//vendas.txt");
            FileWriter escritor = new FileWriter(arq, true);
            escritor.write(this.getVndId()+ ";" + this.getPgtoValor() + ";" + this.getPgtoTipo() + ";" + this.getVndData()+ ";" + this.getVndHora() + ";" + this.getVeicNumChassi()+ ";" + this.getVeicModelo() + this.getFuncRG() + ";" + this.getCliCPF() + ";" + this.isDesconto() + ";" + this.getJuros() + "\n");
            escritor.close();            
        }
        
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados no arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void excluir() {
        ArrayList <String> salvar = new ArrayList<>();
        boolean flag = false; //indica se achou ou nao id da venda
        
        try
        {
            FileReader arq = new FileReader(".//src//Model//vendas.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            while(lerArq.ready())
            {
                String linha = lerArq.readLine();
                String[] dadoSeparado = linha.split(";");
                if(!dadoSeparado[0].equals(this.getVndId()))
                    salvar.add(linha);
                
                else
                    flag = true;
            }
            
            lerArq.close();
            
            if(flag == false)
                JOptionPane.showMessageDialog(null, "ID da venda inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
            
            else
            {
                File arq2 = new File(".//src//Model//vendas.txt");
                FileWriter escritor = new FileWriter(arq2, false);
                for(int i = 0; i < salvar.size(); i++)
                {
                   escritor.write(salvar.get(i) + "\n");
                }
                escritor.close();
                
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
