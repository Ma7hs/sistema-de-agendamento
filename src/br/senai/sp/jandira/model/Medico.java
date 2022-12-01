package br.senai.sp.jandira.model;

import br.senai.sp.jandira.dao.EspecialidadeDao;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Medico extends Pessoa {
//    codigo, crm, nomeMedico
    
    private LocalDate dataNascimento;
    private DateTimeFormatter formatador;
    private String dataFormatada = "";

    private static int contador = 100;
    private Integer codigo;
    private String crm;

    private Especialidade especialidade;
    private ArrayList<Especialidade> especialidades;

    public Medico() {
        atualizarCodigo();
    }

    public Medico(Integer codigo, String crm, String nome) {
        this.codigo = codigo;
        this.crm = crm;
        setNome(nome);
        this.contador = this.codigo;

        atualizarCodigo();
    }
    
    public Medico(Integer codigo,String crm, String nome, String telefone, String email, LocalDate dataDeNascimento, ArrayList<Especialidade> especialidades){
        this.crm = crm;
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
        setDataNascimento(dataDeNascimento);
        this.especialidades = especialidades;
        
        this.codigo = codigo;
        this.contador = codigo++;
        
    }
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getDataFormatada() {
        return dataFormatada;
    }
    
    public void setDataFormatada(String data) {
        this.dataFormatada = data;
    }
    
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }
    
     public void setEspecialidades(ArrayList<Especialidade> especialidades) {

        this.especialidades = especialidades;

    }
     
     public Integer getCodigo() {
        return codigo;
    }

    public static int getContador() {
        return contador;
    }

    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
    }

    public String getMedicoSeparadoPontoVirgula() {
        String codigoEspecialidades = "";
        for(Especialidade e : especialidades){    
                   if( e == null){
                
            }else{
                 codigoEspecialidades += e.getCodigo() + ";";
            }
        }
        return this.codigo + ";" + this.crm + ";" + this.getNome() + ";" + this.getTelefone() + ";" + this.getEmail() + ";" + this.getDataNascimento() + ";" + codigoEspecialidades;
    }
    
     public ArrayList<String> getListaDeEspecialidadesDoMedico() {
        ArrayList<String> dados = new ArrayList<>();
        for (Especialidade e : especialidades) {
            if( e == null){
                
            }else{
                dados.add(e.getNome());
            }
            
        }
        DefaultListModel<String> ListaModel = new DefaultListModel<>();
        
        ListaModel.addAll(dados);
        
        return dados;
        
    }
   
  public String getDataDeNascimento() {
        return dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataNascimento = LocalDate.parse(dataDeNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                
                
                //dataDeNascimento;
    }
             
     
}
