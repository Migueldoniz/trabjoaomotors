package Controller;

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

    public Venda(int vndId, double pgtoValor, String pgtoTipo, String veicNumChassi, String veicModelo, String funcRG, String cliCPF, boolean desconto) {
        this.vndId = vndId;
        this.pgtoValor = pgtoValor;
        this.pgtoTipo = pgtoTipo;
        this.veicNumChassi = veicNumChassi;
        this.veicModelo = veicModelo;
        this.funcRG = funcRG;
        this.cliCPF = cliCPF;
        this.desconto = desconto;
    }
    
    
}
