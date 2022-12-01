package br.senai.sp.jandira.model;


public class Paciente extends Pessoa {

    private PlanoSaude planoSaude;


    public void setPlanoSaude(PlanoSaude planoDeSaude) {
        this.planoSaude = planoSaude;
    }

    public PlanoSaude getPlanoDeSaude() {
        return planoSaude;
    }

}
