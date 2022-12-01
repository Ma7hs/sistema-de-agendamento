package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDao {

    private Medico medico;
    private static ArrayList<Medico> medicos = new ArrayList<>();
    private Especialidade especialidade;
    private ArrayList<Especialidade> especialidades;

    public static ArrayList<Medico> getMedicos() {
        return medicos;
    }

    private static final String CAMINHO = "C:\\Users\\22282099\\java\\Medicos\\medicos.txt";
    private static final Path PATH = Paths.get(CAMINHO);
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282099\\java\\Medicos\\medicos__temp.txt";
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public MedicoDao(Medico medico) {
        this.medicos.add(medico);
    }

    public MedicoDao() {

    }

    public static void gravar(Medico medico) {
        try {
            medicos.add(medico);

            BufferedWriter bufferEscrita = Files.newBufferedWriter(PATH, StandardOpenOption.APPEND, StandardOpenOption.WRITE);

            bufferEscrita.write(medico.getMedicoSeparadoPontoVirgula());
            bufferEscrita.newLine();
            bufferEscrita.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "O Arquivo Medico não existe GRAVAR");
        }

    }

    public static boolean excluir(Integer codigo) {

        for (Medico medico : medicos) {
            if (medico.getCodigo().equals(codigo)) {
                medicos.remove(medico);

                break;
            }
        }
        atualizarArquivo();

        return false;
    }

    public static void atualizarArquivo() {
        File arquivoAtual = new File(CAMINHO);
        File arquivoTemp = new File(ARQUIVO_TEMP);

        try {
            arquivoTemp.createNewFile();

            BufferedWriter bufferEscritaTemp = Files.newBufferedWriter(PATH_TEMP, StandardOpenOption.APPEND, StandardOpenOption.WRITE);

            for (Medico medico : medicos) {
                bufferEscritaTemp.write(medico.getMedicoSeparadoPontoVirgula());
                bufferEscritaTemp.newLine();
            }

            bufferEscritaTemp.close();

            arquivoAtual.delete();
            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao criar o arquivo medico", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static Medico getMedico(Integer codigo) {

        for (Medico medico : medicos) {
            if (medico.getCodigo().equals(codigo)) {
                return medico;
            }
        }
        return null;
    }

    public static void atualizar(Medico medico) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(medico.getCodigo())) {
                medicos.set(medicos.indexOf(m), medico);
                break;
            }
            atualizarArquivo();
        }
    }

    public static ArrayList<Medico> listarTodos() {
        return medicos;
    }

    public static void getListaMedicos() {

         try {     
            BufferedReader br = Files.newBufferedReader(PATH);
            
            String linha = " ";
            linha = br.readLine();
            while(linha != null && !linha.isEmpty()){
                String[] linhavetor = linha.split(";");
                
                int i = 0;
                ArrayList<Especialidade> especialidades = new ArrayList<>();
                while(linhavetor.length > i + 6){
                   especialidades.add(EspecialidadeDao.getEspecialidade(Integer.valueOf(linhavetor[6 + i])));
                   i++;
                }
                
                Medico m = new Medico
                (Integer.valueOf(linhavetor[0]), linhavetor[1], linhavetor[2], linhavetor[3], linhavetor[4], LocalDate.now(), especialidades);
                medicos.add(m);
                linha = br.readLine();  
            }
            br.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "O Arquivo Medico não existe LIST");
        }
    }

    public static DefaultTableModel getTableModel() {

        Object[][] dados = new Object[medicos.size()][4];

        int i = 0;
        for (Medico medico : medicos) {
            dados[i][0] = medico.getCodigo();
            dados[i][1] = medico.getCrm();
            dados[i][2] = medico.getNome();
            dados[i][3] = medico.getEmail();
            i++;
        }

        String[] titulos = {"Código", "CRM", "Nome do Médico", "Email"};

        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;
    }

}
