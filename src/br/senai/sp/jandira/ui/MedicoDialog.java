    package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDao;
import br.senai.sp.jandira.dao.MedicoDao;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import java.util.List;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListModel;

public class MedicoDialog extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Medico medico;
    private DefaultListModel<String> listaDasEspecialidades = new DefaultListModel<>();
    private ArrayList<String> especialidades = new ArrayList<>();
    private ArrayList<Especialidade> especialidadesNSelecionadas = EspecialidadeDao.listarTodos();
    private DefaultListModel<String> listaDasEspecialidadesDoMedico = new DefaultListModel<>();
    private ArrayList<String> especialidadesSelecionada = new ArrayList<>();
    private ArrayList<Especialidade> especialidadesSelecionadas = new ArrayList<>();
    
    int linha;
    public MedicoDialog( java.awt.Frame parent,  boolean modal, TipoOperacao tipoOperacao, Medico medico ) {
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.medico = medico;
        atualizarListasEspecialidades();

        if (tipoOperacao == tipoOperacao.ALTERAR) {
            preencherFormulario();
        atualizarListasEspecialidades();
        }
    }

    private void preencherFormulario() {
        textFieldCodigo.setText(medico.getCodigo().toString());
        textFieldCrm.setText(medico.getCrm());
        textFieldNomeMedico.setText(medico.getNome());
        textFieldTelefone.setText(medico.getTelefone());
        textFieldEmail.setText(medico.getEmail());
        textFieldDataNascimento.setText(medico.getDataDeNascimento());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelEspecialidadesMedico = new javax.swing.JLabel();
        labelCRM = new javax.swing.JLabel();
        labelNomeMedico = new javax.swing.JLabel();
        textFieldNomeMedico = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        labelCodigo = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        labelDataNascimento = new javax.swing.JLabel();
        labelTelefone1 = new javax.swing.JLabel();
        buttonAdicionarEspecialidadeListaMedico = new javax.swing.JButton();
        buttonRemoverEspecialidadeListaMedico = new javax.swing.JButton();
        labelListaEspecialidades = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listEspecialidadesMedico = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listEspecialidades = new javax.swing.JList<>();
        textFieldTelefone = new javax.swing.JFormattedTextField();
        textFieldDataNascimento = new javax.swing.JFormattedTextField();
        textFieldCrm = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Médicos - Adicionar");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 20, 336, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 880, 80);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(60, 63, 65));
        jLabel5.setText("Sistema de Agendamento");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 30, 300, 40);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCodigo);
        textFieldCodigo.setBounds(40, 140, 100, 40);

        labelEspecialidadesMedico.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelEspecialidadesMedico.setForeground(new java.awt.Color(60, 63, 65));
        labelEspecialidadesMedico.setText("Especialidades do Médico:");
        jPanel2.add(labelEspecialidadesMedico);
        labelEspecialidadesMedico.setBounds(390, 300, 250, 30);

        labelCRM.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelCRM.setForeground(new java.awt.Color(60, 63, 65));
        labelCRM.setText("CRM");
        jPanel2.add(labelCRM);
        labelCRM.setBounds(160, 100, 80, 30);

        labelNomeMedico.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelNomeMedico.setForeground(new java.awt.Color(60, 63, 65));
        labelNomeMedico.setText("Nome do Médico");
        jPanel2.add(labelNomeMedico);
        labelNomeMedico.setBounds(330, 100, 200, 30);

        textFieldNomeMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldNomeMedico);
        textFieldNomeMedico.setBounds(330, 140, 400, 40);

        buttonCancelar.setBackground(new java.awt.Color(204, 204, 255));
        buttonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonCancelar.setForeground(new java.awt.Color(204, 51, 255));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/remove-32.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(670, 580, 80, 60);

        buttonSalvar.setBackground(new java.awt.Color(204, 204, 255));
        buttonSalvar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonSalvar.setForeground(new java.awt.Color(204, 0, 255));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/pacient.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(770, 580, 80, 60);

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(60, 63, 65));
        labelCodigo.setText("Código");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(40, 100, 90, 30);

        labelEmail.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(60, 63, 65));
        labelEmail.setText("E-mail");
        jPanel2.add(labelEmail);
        labelEmail.setBounds(210, 190, 200, 30);

        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldEmail);
        textFieldEmail.setBounds(210, 230, 300, 40);

        labelDataNascimento.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelDataNascimento.setForeground(new java.awt.Color(60, 63, 65));
        labelDataNascimento.setText("Data de Nascimento");
        jPanel2.add(labelDataNascimento);
        labelDataNascimento.setBounds(530, 190, 220, 30);

        labelTelefone1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelTelefone1.setForeground(new java.awt.Color(60, 63, 65));
        labelTelefone1.setText("Telefone");
        jPanel2.add(labelTelefone1);
        labelTelefone1.setBounds(40, 190, 90, 30);

        buttonAdicionarEspecialidadeListaMedico.setBackground(new java.awt.Color(51, 204, 0));
        buttonAdicionarEspecialidadeListaMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/seta-direita-32.png"))); // NOI18N
        buttonAdicionarEspecialidadeListaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadeListaMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(buttonAdicionarEspecialidadeListaMedico);
        buttonAdicionarEspecialidadeListaMedico.setBounds(280, 400, 70, 60);

        buttonRemoverEspecialidadeListaMedico.setBackground(new java.awt.Color(255, 51, 0));
        buttonRemoverEspecialidadeListaMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/seta-esquerda-32.png"))); // NOI18N
        buttonRemoverEspecialidadeListaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverEspecialidadeListaMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(buttonRemoverEspecialidadeListaMedico);
        buttonRemoverEspecialidadeListaMedico.setBounds(280, 490, 70, 60);

        labelListaEspecialidades.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelListaEspecialidades.setForeground(new java.awt.Color(60, 63, 65));
        labelListaEspecialidades.setText("Lista de Especialidades:");
        jPanel2.add(labelListaEspecialidades);
        labelListaEspecialidades.setBounds(40, 300, 250, 30);

        jScrollPane1.setViewportView(listEspecialidadesMedico);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(390, 350, 200, 260);

        jScrollPane2.setViewportView(listEspecialidades);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(40, 350, 200, 260);

        textFieldTelefone.setColumns(12);
        try {
            textFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldTelefone);
        textFieldTelefone.setBounds(40, 230, 150, 40);

        textFieldDataNascimento.setColumns(8);
        try {
            textFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFieldDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDataNascimentoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldDataNascimento);
        textFieldDataNascimento.setBounds(530, 230, 70, 40);

        try {
            textFieldCrm.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFieldCrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCrmActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCrm);
        textFieldCrm.setBounds(160, 140, 150, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 80, 880, 700);

        setBounds(0, 0, 896, 784);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldNomeMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeMedicoActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
    if (tipoOperacao == TipoOperacao.ADICIONAR) {
        gravar();
    } else {
        atualizar();
    }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed

    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void buttonAdicionarEspecialidadeListaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadeListaMedicoActionPerformed
            List<String> especialidadesDoMedico = listEspecialidades.getSelectedValuesList();

        for (String e : especialidadesDoMedico) {
            especialidadesSelecionada.add(e);
        }
        for (Especialidade e : especialidadesNSelecionadas) {
            if (especialidadesDoMedico.contains(e.getNome())) {
                especialidadesSelecionadas.add(e);
            }
        }
        listaDasEspecialidadesDoMedico.clear();
        listaDasEspecialidadesDoMedico.addAll(especialidadesSelecionada);
        listEspecialidadesMedico.setModel(listaDasEspecialidadesDoMedico);

        int[] excluir = listEspecialidades.getSelectedIndices();
        for (int e : excluir) {
            listaDasEspecialidades.remove(e);
            especialidades.remove(e);
        }
    }//GEN-LAST:event_buttonAdicionarEspecialidadeListaMedicoActionPerformed

    private void buttonRemoverEspecialidadeListaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverEspecialidadeListaMedicoActionPerformed
        List<String> removerEspecialidades = listEspecialidadesMedico.getSelectedValuesList();
        for (String e : removerEspecialidades) {
            especialidades.add(e);
        }
        for (Especialidade e : especialidadesNSelecionadas) {
            if (removerEspecialidades.contains(e.getNome())) {
                especialidadesSelecionadas.remove(e);
            }
        }
        listaDasEspecialidades.clear();
        listaDasEspecialidades.addAll(especialidades);
        listEspecialidades.setModel(listaDasEspecialidades);
        
        int[] excluir = listEspecialidadesMedico.getSelectedIndices();
        for (int e : excluir) {
            listaDasEspecialidadesDoMedico.remove(e);
            especialidadesSelecionada.remove(e);
        }
    }//GEN-LAST:event_buttonRemoverEspecialidadeListaMedicoActionPerformed

    private void textFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTelefoneActionPerformed

    }//GEN-LAST:event_textFieldTelefoneActionPerformed

    private void textFieldDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDataNascimentoActionPerformed

    private void textFieldCrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCrmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCrmActionPerformed

    private void atualizar() {
        medico.setCrm(textFieldCrm.getText());
        medico.setNome(textFieldNomeMedico.getText());
        medico.setTelefone(textFieldTelefone.getText());
        medico.setEmail(textFieldEmail.getText());
        medico.setDataFormatada(textFieldDataNascimento.getText());
        if (validarCadastro()) {
            MedicoDao.atualizar(medico);

            JOptionPane.showMessageDialog(null, "Médico atualizado com sucesso", "Médico", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }
    private void gravar() {
        Medico medico = new Medico();
        medico.setCrm(textFieldCrm.getText());
        medico.setNome(textFieldNomeMedico.getText());
        medico.setTelefone(textFieldTelefone.getText());
        medico.setEmail(textFieldEmail.getText());
        medico.setDataNascimento(LocalDate.parse(textFieldDataNascimento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        medico.setEspecialidades(especialidadesSelecionadas);

        if (validarCadastro()) {
            MedicoDao.gravar(medico);
            JOptionPane.showMessageDialog(this, "Médico gravado com sucesso", "Médico", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    private boolean validarCadastro() {
        if (textFieldCrm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o CRM do Médico!", "Médico", JOptionPane.ERROR_MESSAGE);
            textFieldTelefone.requestFocus();
            return false;
        }
        if (textFieldNomeMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o nome do Médico!", "Médico", JOptionPane.ERROR_MESSAGE);
            textFieldNomeMedico.requestFocus();
            return false;
        }     
        if (textFieldTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o telefone do Médico!", "Médico", JOptionPane.ERROR_MESSAGE);
            textFieldTelefone.requestFocus();
            return false;
        }      
        if (textFieldEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o E-mail do Médico!", "Médico", JOptionPane.ERROR_MESSAGE);
            textFieldEmail.requestFocus();
            return false;}           
        if (textFieldDataNascimento.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha a Data de Nascimento do Médico!", "Médico", JOptionPane.ERROR_MESSAGE);
        textFieldEmail.requestFocus();
        return false;
        }     
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEspecialidadeListaMedico;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonRemoverEspecialidadeListaMedico;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCRM;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDataNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEspecialidadesMedico;
    private javax.swing.JLabel labelListaEspecialidades;
    private javax.swing.JLabel labelNomeMedico;
    private javax.swing.JLabel labelTelefone1;
    private javax.swing.JList<String> listEspecialidades;
    private javax.swing.JList<String> listEspecialidadesMedico;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JFormattedTextField textFieldCrm;
    private javax.swing.JFormattedTextField textFieldDataNascimento;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNomeMedico;
    private javax.swing.JFormattedTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables

    private void atualizarListasEspecialidades() {
        especialidades = EspecialidadeDao.getListaDeNomes();
        listaDasEspecialidades.addAll(especialidades);
        listEspecialidades.setModel(listaDasEspecialidades);
        if (tipoOperacao == TipoOperacao.ADICIONAR) {

        } else {
            especialidadesSelecionadas = medico.getEspecialidades();
            especialidadesSelecionada = medico.getListaDeEspecialidadesDoMedico();
            listaDasEspecialidadesDoMedico.clear();
            listaDasEspecialidadesDoMedico.addAll(especialidadesSelecionada);
            listEspecialidadesMedico.setModel(listaDasEspecialidadesDoMedico);

            int i = 0;
            for (String e : especialidadesSelecionada) {
                if (especialidades.contains(e)) {
                    especialidades.remove(e);
                }
            }
            listaDasEspecialidades.clear();
            listaDasEspecialidades.addAll(especialidades);
        }
    }
}
