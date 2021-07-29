/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Motocicleta extends Veiculo{
    private double motoCilindradas;
    private String motoTipo;

    public Motocicleta(double motoCilindradas, String motoTipo, String veicNumChassi, String veicMarca, String veicModelo, int veicAno, double veicKm, String veicTipoCombustivel, double veicPeso, String veicStatus) {
        super(veicNumChassi, veicMarca, veicModelo, veicAno, veicKm, veicTipoCombustivel, veicPeso, veicStatus);
        this.motoCilindradas = motoCilindradas;
        this.motoTipo = motoTipo;
    }

    public Motocicleta(String veicNumChassi) {
        super(veicNumChassi);
    }

    public double getMotoCilindradas() {
        return motoCilindradas;
    }

    public void setMotoCilindradas(double motoCilindradas) {
        this.motoCilindradas = motoCilindradas;
    }

    public String getMotoTipo() {
        return motoTipo;
    }

    public void setMotoTipo(String motoTipo) {
        this.motoTipo = motoTipo;
    }
    

    @Override
    public void cadastrar() {
        try
        {
            File arq = new File(".//src//Model//motocicletas.txt");
            FileWriter escritor = new FileWriter(arq, true);
            escritor.write(this.getVeicNumChassi() + ";" + this.getVeicMarca() + ";" + this.getVeicModelo() + ";" + this.getVeicAno() + ";" + this.getVeicKm() + ";" + this.getVeicTipoCombustivel() + ";" + this.getVeicPeso() + ";" + this.getVeicStatus() + ";" + this.getMotoCilindradas() + ";" + this.getMotoTipo() + "\n");
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
            FileReader arq = new FileReader(".//src//Model//motocicletas.txt");
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
                File arq2 = new File(".//src//Model//motocicletas.txt");
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
