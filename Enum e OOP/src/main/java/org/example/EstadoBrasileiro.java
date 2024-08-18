package org.example;

public enum EstadoBrasileiro {
    SAO_PAULO("SP","São Paulo", (byte) 11),
    RIO_DE_JANEIRO("RJ","Rio De Janeiro",(byte)12),
    PIAUI("PI","Piauí", (byte) 13),
    MARANHAO("MA","Maranhão", (byte) 14),
    DISTRITO_FEDERAL("DF","Distrito Federal", (byte) 15);

    private String nome;
    private String sigla;
    private byte IBGE;
    private EstadoBrasileiro(String nome, String sigla, byte IBGE){
        this.sigla = sigla;
        this.nome = nome;
        this.IBGE =IBGE;
    }
    public String getSigla(){
        return sigla;
    }

    public String getNome() {
        return nome;
    }



    public byte getIBGE() {
        return IBGE;
    }
}
