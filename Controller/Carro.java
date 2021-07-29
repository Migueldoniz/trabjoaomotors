/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. ola galera do mau
 */

package Controller;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Carro extends Veiculo {
    private int cPotencia;
    private int cCilindros;
    private int cOcupantes;
    private String cTipo;
    private double altura;
    private double largura;
    private double comprimento;

    public Carro(int cPotencia, int cCilindros, int cOcupantes, String cTipo, double altura, double largura, double comprimento, String veicNumChassi, String veicMarca, String veicModelo, int veicAno, double veicKm, String veicTipoCombustivel, double veicPeso, String veicStatus) {
        super(veicNumChassi, veicMarca, veicModelo, veicAno, veicKm, veicTipoCombustivel, veicPeso, veicStatus);
        this.cPotencia = cPotencia;
        this.cCilindros = cCilindros;
        this.cOcupantes = cOcupantes;
        this.cTipo = cTipo;
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public Carro(String veicNumChassi) {
        super(veicNumChassi);
    }

    public int getcPotencia() {
        return cPotencia;
    }

    public void setcPotencia(int cPotencia) {
        this.cPotencia = cPotencia;
    }

    public int getcCilindros() {
        return cCilindros;
    }

    public void setcCilindros(int cCilindros) {
        this.cCilindros = cCilindros;
    }

    public int getcOcupantes() {
        return cOcupantes;
    }

    public void setcOcupantes(int cOcupantes) {
        this.cOcupantes = cOcupantes;
    }

    public String getcTipo() {
        return cTipo;
    }

    public void setcTipo(String cTipo) {
        this.cTipo = cTipo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    
    
    @Override
    public void cadastrar() 
    {
        try
        {
            File arq = new File(".//src//Model//carros.txt");
            FileWriter escritor = new FileWriter(arq, true);
            escritor.write(this.getVeicNumChassi() + ";" + this.getVeicMarca() + ";" + this.getVeicModelo() + ";" + this.getVeicAno() + ";" + this.getVeicKm() + ";" + this.getVeicTipoCombustivel() + ";" + this.getVeicPeso() + ";" + this.getVeicStatus() + ";" + this.getcPotencia() + ";" + this.getcCilindros() + ";" + this.getcOcupantes() + ";" + this.getcTipo() + ";" + this.getAltura() + ";" + this.getLargura() + ";" + this.getComprimento() + "\n");
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
        boolean flag = false; //indica se achou ou nao numero do chassi
        
        try
        {
            FileReader arq = new FileReader(".//src//Model//carros.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            while(lerArq.ready())
            {
                String linha = lerArq.readLine();
                String[] dadoSeparado = linha.split(";");
                if(!dadoSeparado[0].equals(this.getVeicNumChassi()))
                    salvar.add(linha);
                
                else
                    flag = true;
            }
            
            lerArq.close();
            
            if(flag == false)
                JOptionPane.showMessageDialog(null, "Número do Chassi inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
            
            else
            {
                File arq2 = new File(".//src//Model//carros.txt");
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
