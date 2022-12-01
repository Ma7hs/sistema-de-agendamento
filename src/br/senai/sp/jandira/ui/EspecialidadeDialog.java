package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDao;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;

public class EspecialidadeDialog extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Especialidade especialidade;

    public EspecialidadeDialog(java.awt.Frame parent, boolean modal, TipoOperacao tipoOperacao, Especialidade especialidade) {
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.especialidade = especialidade;

        if (tipoOperacao == tipoOperacao.ALTERAR) {
            preencherFormulario();
        }
    }

    private void preencherFormulario() {
        textFieldCodigo.setText(especialidade.getCodigo().toString());
        textFieldNomeEspecialidade.setText(especialidade.getNome());
        textFieldDescricao.setText(especialidade.getDescricao());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelCodigo = new javax.swing.JLabel();
        labelNomeEspecialidade = new javax.swing.JLabel();
        textFieldNomeEspecialidade = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        textFieldDescricao = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Especialidades - Adicionar");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 20, 436, 48);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 990, 80);

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
        textFieldCodigo.setBounds(40, 140, 130, 40);

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(60, 63, 65));
        labelCodigo.setText("Código");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(40, 100, 90, 30);

        labelNomeEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelNomeEspecialidade.setForeground(new java.awt.Color(60, 63, 65));
        labelNomeEspecialidade.setText("Nome da especialidade");
        jPanel2.add(labelNomeEspecialidade);
        labelNomeEspecialidade.setBounds(40, 190, 290, 30);

        textFieldNomeEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeEspecialidadeActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldNomeEspecialidade);
        textFieldNomeEspecialidade.setBounds(40, 230, 530, 50);

        labelDescricao.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelDescricao.setForeground(new java.awt.Color(60, 63, 65));
        labelDescricao.setText("Descrição");
        jPanel2.add(labelDescricao);
        labelDescricao.setBounds(40, 290, 150, 30);

        textFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDescricaoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldDescricao);
        textFieldDescricao.setBounds(40, 330, 760, 50);

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
        buttonCancelar.setBounds(740, 440, 80, 60);

        buttonSalvar.setBackground(new java.awt.Color(204, 204, 255));
        buttonSalvar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonSalvar.setForeground(new java.awt.Color(204, 0, 255));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/save-32.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(840, 440, 80, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 80, 990, 600);

        setBounds(0, 0, 1005, 683);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldNomeEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeEspecialidadeActionPerformed

    private void textFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDescricaoActionPerformed

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

    private void atualizar() {
        especialidade.setNome(textFieldNomeEspecialidade.getText());
        especialidade.setDescricao(textFieldDescricao.getText());

        if (validarCadastro()) {
            EspecialidadeDao.atualizar(especialidade);

            JOptionPane.showMessageDialog(null, "Especialidade atualizada com sucesso", "Especialidade", JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }

    private void gravar() {
        Especialidade especialidade = new Especialidade();
        especialidade.setNome(textFieldNomeEspecialidade.getText());
        especialidade.setDescricao(textFieldDescricao.getText());

        if (validarCadastro()) {
            EspecialidadeDao.gravar(especialidade);
            JOptionPane.showMessageDialog(this, "Especialidade gravado com sucesso", "Especialidade", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    private boolean validarCadastro() {

        if (textFieldNomeEspecialidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o nome da especialidade!", "Especialidade", JOptionPane.ERROR_MESSAGE);
            textFieldNomeEspecialidade.requestFocus();
            return false;
        }
        if (textFieldDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha a descrição!", "Especialidade", JOptionPane.ERROR_MESSAGE);
            textFieldDescricao.requestFocus();
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelNomeEspecialidade;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldDescricao;
    private javax.swing.JTextField textFieldNomeEspecialidade;
    // End of variables declaration//GEN-END:variables
}
