package Controller;

public class Data
{
    private String dataFormatada;
    private String[] aux;
    private int dia;
    private int mes;
    private int ano;

    public void setData(String nometext)
    {
        dataFormatada=nometext;
        aux=dataFormatada.split("/");
        dia=Integer.parseInt(aux[0]);
        mes=Integer.parseInt(aux[1]);
        ano=Integer.parseInt(aux[2]);
        if((dia > 0 && dia < 32) && (mes > 0 && mes < 13) && (ano > 1900 && ano < 2022))
            this.dataFormatada = dia + "/" + mes + "/" + ano;
        else
            System.out.println("Data invalida!");
    }

    public String getData()
    {
        return this.dataFormatada;
    }
	
}