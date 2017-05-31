/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author EAD
 */
public class Mulher {

    private String nome;
    private int idade;
    private String tipo;
    private String data;
    private String proxima;

    public Mulher() {
    }

    public Mulher(String nome, int idade, String tipo, String data) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.data = arrumaData(data);
        this.proxima = montaProx(data);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getProxima() {
        return proxima;
    }

    private String arrumaData(String data) {
        char[] dataQuebrada = data.toCharArray();

        String ano = dataQuebrada[0] + "" + dataQuebrada[1] + "" + dataQuebrada[2] + "" + dataQuebrada[3] + "";
        String mes = dataQuebrada[5] + "" + dataQuebrada[6] + "";
        String dia = dataQuebrada[8] + "" + dataQuebrada[9] + "";

        String dataFormatada = dia + "/" + mes + "/" + ano;
        return dataFormatada;
    }

    private String montaProx(String dat) {
        
        String dat2 = arrumaData(dat);
        
        String dataProximaMes = null;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataUltimaMesDate = null;

        try {
            dataUltimaMesDate = formato.parse(dat2);
        } catch (ParseException ex) {
            System.out.println("Erro!!!!!");;
        }

        if (tipo.equals("Normal")) {
            Calendar calen = Calendar.getInstance();
            calen.setTime(dataUltimaMesDate);
            calen.add(Calendar.DAY_OF_MONTH, 28);
            Date dataFinal = calen.getTime();
            dataProximaMes = formato.format(dataFinal);

        } else {
            Calendar calen = Calendar.getInstance();
            calen.setTime(dataUltimaMesDate);
            calen.add(Calendar.DAY_OF_MONTH, 26);
            Date dataFinal = calen.getTime();
            String tempData1 = formato.format(dataFinal);

            calen.setTime(dataUltimaMesDate);
            calen.add(Calendar.DAY_OF_MONTH, 30);
            Date dataFinal2 = calen.getTime();
            String tempData2 = formato.format(dataFinal2);

            dataProximaMes = "Entre " + tempData1 + " e " + tempData2;
        }
        return dataProximaMes;
    }

}