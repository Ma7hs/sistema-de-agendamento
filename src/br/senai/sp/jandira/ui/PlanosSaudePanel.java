package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoSaudeDao;
import br.senai.sp.jandira.model.PlanoSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PlanosSaudePanel extends javax.swing.JPanel {

    int linha;

    public PlanosSaudePanel() {
        initComponents();
        criarTabelaPlanosDeSaude();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPlanodeSaude = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePlanoDeSaude = new javax.swing.JTable();
        buttonAdicionar = new javax.swing.JButton();
        buttoneEditar = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setPreferredSize(new java.awt.Dimension(1090, 490));
        setRequestFocusEnabled(false);
        setLayout(null);

        labelPlanodeSaude.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelPlanodeSaude.setText("Planos de Saúde");
        labelPlanodeSaude.setToolTipText("");
        add(labelPlanodeSaude);
        labelPlanodeSaude.setBounds(20, 10, 120, 20);

        tablePlanoDeSaude.setBackground(new java.awt.Color(204, 204, 255));
        tablePlanoDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        tablePlanoDeSaude.setSelectionBackground(new java.awt.Color(255, 153, 153));
        jScrollPane1.setViewportView(tablePlanoDeSaude);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 1000, 320);

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
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        PlanosSaudeDialog planoSaudeDialog = new PlanosSaudeDialog(null, true, TipoOperacao.ADICIONAR, null);
        planoSaudeDialog.setVisible(true);

        criarTabelaPlanosDeSaude();
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed

        linha = tablePlanoDeSaude.getSelectedRow();

        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione o plano que você deseja excluir", "Plano de saúde", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_buttonRemoverActionPerformed

    private void buttoneEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoneEditarActionPerformed

        linha = tablePlanoDeSaude.getSelectedRow();

        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione o plano que você deseja alterar", "Plano de saúde", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_buttoneEditarActionPerformed

    private void editar() {
        PlanoSaude planoSaude = PlanoSaudeDao.getPlanoSaude(getCodigo());

        PlanosSaudeDialog planoSaudeDialog = new PlanosSaudeDialog(null, true, TipoOperacao.ALTERAR, planoSaude);
        planoSaudeDialog.setVisible(true);

        criarTabelaPlanosDeSaude();
    }

    private void excluir() {

        int resposta = JOptionPane.showConfirmDialog(this, "Você confirma a exclusão do plano de saúde selecionado?", "Plano de saúde", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            PlanoSaudeDao.excluir(getCodigo());
            criarTabelaPlanosDeSaude();
        }
    }

    private Integer getCodigo() {
        String codigoStr = tablePlanoDeSaude.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JButton buttoneEditar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPlanodeSaude;
    private javax.swing.JTable tablePlanoDeSaude;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaPlanosDeSaude() {

        tablePlanoDeSaude.setModel(PlanoSaudeDao.getTableModel());
        tablePlanoDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        tablePlanoDeSaude.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablePlanoDeSaude.getColumnModel().getColumn(1).setPreferredWidth(300);
        tablePlanoDeSaude.getColumnModel().getColumn(2).setPreferredWidth(300);

        tablePlanoDeSaude.getTableHeader().setReorderingAllowed(false);

        tablePlanoDeSaude
                .setDefaultEditor(Object.class,
                        null);

    }

}
