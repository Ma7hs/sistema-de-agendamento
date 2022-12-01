package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDao;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class MedicoPanel extends javax.swing.JPanel {

    int linha;

    public MedicoPanel() {
        initComponents();
        criarTabelaMedico();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMedico = new javax.swing.JLabel();
        buttonRemover = new javax.swing.JButton();
        buttoneEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMedico = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 153, 255));
        setPreferredSize(new java.awt.Dimension(1090, 490));
        setRequestFocusEnabled(false);
        setLayout(null);

        labelMedico.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelMedico.setText("Medico");
        labelMedico.setToolTipText("");
        add(labelMedico);
        labelMedico.setBounds(20, 10, 110, 20);

        buttonRemover.setBackground(new java.awt.Color(204, 204, 255));
        buttonRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/lixeira.png"))); // NOI18N
        buttonRemover.setToolTipText("delete");
        buttonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverActionPerformed(evt);
            }
        });
        add(buttonRemover);
        buttonRemover.setBounds(800, 380, 70, 60);

        buttoneEditar.setBackground(new java.awt.Color(204, 204, 255));
        buttoneEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/edit.png"))); // NOI18N
        buttoneEditar.setToolTipText("edit");
        buttoneEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoneEditarActionPerformed(evt);
            }
        });
        add(buttoneEditar);
        buttoneEditar.setBounds(880, 380, 70, 60);

        buttonAdicionar.setBackground(new java.awt.Color(204, 204, 255));
        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/new.png"))); // NOI18N
        buttonAdicionar.setToolTipText("new");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        add(buttonAdicionar);
        buttonAdicionar.setBounds(960, 380, 70, 60);

        jScrollPane1.setBackground(new java.awt.Color(255, 102, 255));

        tableMedico.setBackground(new java.awt.Color(204, 204, 255));
        tableMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableMedico.setGridColor(new java.awt.Color(204, 204, 255));
        tableMedico.setSelectionBackground(new java.awt.Color(255, 153, 153));
        jScrollPane1.setViewportView(tableMedico);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 1000, 320);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed
        linha = tableMedico.getSelectedRow();

        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione o médico que você deseja excluir", "Médico", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_buttonRemoverActionPerformed

    private void buttoneEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoneEditarActionPerformed
        linha = tableMedico.getSelectedRow();

        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione o médico que você deseja alterar", "Médico", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_buttoneEditarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        MedicoDialog medicoDialog = new MedicoDialog(null, true, TipoOperacao.ADICIONAR, null);
        medicoDialog.setVisible(true);

        criarTabelaMedico();
    }//GEN-LAST:event_buttonAdicionarActionPerformed


    private void editar() {
        Medico medico = MedicoDao.getMedico(getCodigo());
        MedicoDialog medicoDialog = new MedicoDialog(null, true, TipoOperacao.ALTERAR, medico);
        medicoDialog.setVisible(true);
        criarTabelaMedico();
    }

    private void excluir() {
        int resposta = JOptionPane.showConfirmDialog(this, "Você confirma a exclusão do médico selecionado?", "Médico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            MedicoDao.excluir(getCodigo());
            criarTabelaMedico();
        }
    }
    private Integer getCodigo() {
        String codigoStr = tableMedico.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JButton buttoneEditar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMedico;
    private javax.swing.JTable tableMedico;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaMedico() {
        tableMedico.setModel(MedicoDao.getTableModel());
        tableMedico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        tableMedico.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedico.getColumnModel().getColumn(1).setPreferredWidth(100);
        tableMedico.getColumnModel().getColumn(2).setPreferredWidth(300);
        tableMedico.getColumnModel().getColumn(3).setPreferredWidth(300);

        tableMedico.getTableHeader().setReorderingAllowed(false);

        tableMedico.setDefaultEditor(Object.class, null);
    }
}
