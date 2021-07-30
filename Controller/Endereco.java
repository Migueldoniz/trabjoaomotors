package Controller;

public class Endereco {
    private String endRua;
    private int endNum;
    private String endBairro;
    private String endCidade;

    public String getEndRua() {
        return endRua;
    }

    public void setEndRua(String endRua) {
        this.endRua = endRua;
    }

    public int getEndNum() {
        return endNum;
    }

    public void setEndNum(int endNum) {
        this.endNum = endNum;
    }

    public String getEndBairro() {
        return endBairro;
    }

    public void setEndBairro(String endBairro) {
        this.endBairro = endBairro;
    }

    public String getEndCidade() {
        return endCidade;
    }

    public void setEndCidade(String endCidade) {
        this.endCidade = endCidade;
    }

    public Endereco(String endRua, int endNum, String endBairro, String endCidade) {
        this.endRua = endRua;
        this.endNum = endNum;
        this.endBairro = endBairro;
        this.endCidade = endCidade;
    }    
}
