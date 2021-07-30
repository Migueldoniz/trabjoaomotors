package Controller;
//import package View;

public class Hora
{
    private String horaFormatada;
    private String[] aux;
    private int hora;
    private int minuto;
    public void setHora(String nometext)
    {   
        horaFormatada=nometext;
        aux=horaFormatada.split(":");
        hora=Integer.parseInt(aux[0]);
        minuto=Integer.parseInt(aux[1]);
        if((hora > -1 && hora < 24) && (minuto > -1 && minuto < 60))
            this.horaFormatada = hora + ":" + minuto;
        else
            System.out.println("Horario invalido!");
    }
    public String getHora()
    {
        return this.horaFormatada;
    }
}
