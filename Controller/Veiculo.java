package Controller;

public abstract class Veiculo extends Operacoes {
    private String veicNumChassi;
    private String veicMarca;
    private String veicModelo;
    private int veicAno;
    private double veicKm;
    private String veicTipoCombustivel;
    private double veicPeso;
    private String veicStatus;

    public Veiculo(String veicNumChassi, String veicMarca, String veicModelo, int veicAno, double veicKm, String veicTipoCombustivel, double veicPeso, String veicStatus) {
        this.veicNumChassi = veicNumChassi;
        this.veicMarca = veicMarca;
        this.veicModelo = veicModelo;
        this.veicAno = veicAno;
        this.veicKm = veicKm;
        this.veicTipoCombustivel = veicTipoCombustivel;
        this.veicPeso = veicPeso;
        this.veicStatus = veicStatus;
    }

    public Veiculo(String veicNumChassi) {
        this.veicNumChassi = veicNumChassi;
    }
  

    public String getVeicNumChassi() {
        return veicNumChassi;
    }

    public void setVeicNumChassi(String veicNumChassi) {
        this.veicNumChassi = veicNumChassi;
    }

    public String getVeicMarca() {
        return veicMarca;
    }

    public void setVeicMarca(String veicMarca) {
        this.veicMarca = veicMarca;
    }

    public String getVeicModelo() {
        return veicModelo;
    }

    public void setVeicModelo(String veicModelo) {
        this.veicModelo = veicModelo;
    }

    public int getVeicAno() {
        return veicAno;
    }

    public void setVeicAno(int veicAno) {
        this.veicAno = veicAno;
    }

    public double getVeicKm() {
        return veicKm;
    }

    public void setVeicKm(double veicKm) {
        this.veicKm = veicKm;
    }

    public String getVeicTipoCombustivel() {
        return veicTipoCombustivel;
    }

    public void setVeicTipoCombustivel(String veicTipoCombustivel) {
        this.veicTipoCombustivel = veicTipoCombustivel;
    }

    public double getVeicPeso() {
        return veicPeso;
    }

    public void setVeicPeso(double veicPeso) {
        this.veicPeso = veicPeso;
    }

    public String getVeicStatus() {
        return veicStatus;
    }

    public void setVeicStatus(String veicStatus) {
        this.veicStatus = veicStatus;
    }
}
