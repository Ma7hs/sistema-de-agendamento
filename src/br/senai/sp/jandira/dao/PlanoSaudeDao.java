package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoSaudeDao {

    private PlanoSaude planoDeSaude;
    private static ArrayList<PlanoSaude> planos = new ArrayList<>();

    private static final String CAMINHO = "C:\\Users\\22282099\\java\\Plano_De_Saude\\planoDeSaude.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282099\\java\\Plano_De_Saude\\planoDeSaude__temp.txt";
    private static final Path PATH = Paths.get(CAMINHO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public PlanoSaudeDao(PlanoSaude planoDeSaude) {
        this.planos.add(planoDeSaude);
    }

    public PlanoSaudeDao() {

    }

    public static void gravar(PlanoSaude planoDeSaude) {
        try {
            planos.add(planoDeSaude);

            BufferedWriter bufferEscrita = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            bufferEscrita.write(planoDeSaude.getPlanoSaudeSeparadoPontoVirgula());
            bufferEscrita.newLine();
            bufferEscrita.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "O arquivo Plano de Saude não existe",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static boolean excluir(Integer codigo) {

        for (PlanoSaude plano : planos) {
            if (plano.getCodigo().equals(codigo)) {
                planos.remove(plano);

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
        
            for(PlanoSaude plano : planos) {
                bufferEscritaTemp.write(plano.getPlanoSaudeSeparadoPontoVirgula());
                bufferEscritaTemp.newLine();
            }
            
            bufferEscritaTemp.close();
            
            arquivoAtual.delete();
            arquivoTemp.renameTo(arquivoAtual);
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao criar o arquivo", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        
    }

    public static PlanoSaude getPlanoSaude(Integer codigo) {

        for (PlanoSaude plano : planos) {
            if (plano.getCodigo().equals(codigo)) {
                return plano;
            }
        }
        return null;
    }

    public static void atualizar(PlanoSaude planoSaude) {
        for (PlanoSaude plano : planos) {
            if (plano.getCodigo().equals(planoSaude.getCodigo())) {
                planos.set(planos.indexOf(plano), planoSaude);
            }
        }
    }

    public static ArrayList<PlanoSaude> listarTodos() {
        return planos;
    }

    public static void getListaPlanosSaude() {
        try {

            BufferedReader bufferReader = Files.newBufferedReader(PATH);
            String linha = bufferReader.readLine();
            while (linha != null) {
                String[] linhaVetor = linha.split(";");
                planos.add(new PlanoSaude(Integer.valueOf(linhaVetor[0]), linhaVetor[1], linhaVetor[2]));
                linha = bufferReader.readLine();
            }

            bufferReader.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "O arquivo Plano de Saude não existe LIST");
        }

    }

    public static DefaultTableModel getTableModel() {

        Object[][] dados = new Object[planos.size()][3];

        int i = 0;
        for (PlanoSaude p : planos) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getTipoDoPlano();
            i++;
        }

        String[] titulos = {"Código", "Nome da operadora", "Tipo do Plano"};

        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;
    }
}
