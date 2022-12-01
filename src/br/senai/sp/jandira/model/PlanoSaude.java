package br.senai.sp.jandira.model;

public class PlanoSaude {

    private static int contador = 100;
    private Integer codigo;
    private String operadora;
    private String tipoDoplano;

    public PlanoSaude(String operadora) {
        this.operadora = operadora;

        atualizarCodigo();
    }

    public PlanoSaude(String operadora, String tipoDoPlano) {
        this.operadora = operadora;
        this.tipoDoplano = tipoDoPlano;

        atualizarCodigo();
    }
    
    public PlanoSaude(Integer codigo, String operadora, String tipoDoPlano) {
        this.codigo = codigo;
        this.operadora = operadora;
        this.tipoDoplano = tipoDoPlano;
        this.contador = this.codigo;

        atualizarCodigo();
    }

    public PlanoSaude() {
        atualizarCodigo();
    }

    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getOperadora() {
        return this.operadora;
    }

    public void setTipoPlano(String tipoDoPlano) {
        this.tipoDoplano = tipoDoPlano;

    }

    public String getTipoDoPlano() {
        return this.tipoDoplano;
    }

    public String getDadoDoPlano() {
        return "Plano:" + this.operadora + "," + this.tipoDoplano;
    }

    public static int getContador() {
        return contador;
    }

    public String getPlanoSaudeSeparadoPontoVirgula() {
        return this.codigo + ";" + this.operadora + ";" + this.tipoDoplano;
    }
}
