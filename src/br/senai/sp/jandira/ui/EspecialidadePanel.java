package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDao;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class EspecialidadePanel extends javax.swing.JPanel {

    int linha;

    public EspecialidadePanel() {
        initComponents();
        criarTabelaEspecialidade();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEspecialidade = new javax.swing.JLabel();
        buttonRemover = new javax.swing.JButton();
        buttoneEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEspecialidade = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 153, 255));
        setPreferredSize(new java.awt.Dimension(1090, 490));
        setRequestFocusEnabled(false);
        setLayout(null);

        labelEspecialidade.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelEspecialidade.setText("Especialidade");
        labelEspecialidade.setToolTipText("");
        add(labelEspecialidade);
        labelEspecialidade.setBounds(20, 10, 120, 20);

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

        tableEspecialidade.setBackground(new java.awt.Color(204, 204, 255));
        tableEspecialidade.setModel(new javax.swing.table.DefaultTableModel(
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
        tableEspecialidade.setGridColor(new java.awt.Color(204, 204, 255));
        tableEspecialidade.setSelectionBackground(new java.awt.Color(255, 153, 153));
        jScrollPane1.setViewportView(tableEspecialidade);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 1000, 320);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed
        linha = tableEspecialidade.getSelectedRow();

        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione a especialidade que você deseja excluir", "Especialidade", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_buttonRemoverActionPerformed

    private void buttoneEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoneEditarActionPerformed
        linha = tableEspecialidade.getSelectedRow();

        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione a especialidade que você deseja alterar", "Especialidade", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_buttoneEditarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(null, true, TipoOperacao.ADICIONAR, null);
        especialidadeDialog.setVisible(true);

        criarTabelaEspecialidade();
    }//GEN-LAST:event_buttonAdicionarActionPerformed


    private void editar() {
        Especialidade especialidade = EspecialidadeDao.getEspecialidade(getCodigo());

        EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(null, true, TipoOperacao.ALTERAR, especialidade);
        especialidadeDialog.setVisible(true);

        criarTabelaEspecialidade();
    }

    private void excluir() {

        int resposta = JOptionPane.showConfirmDialog(this, "Você confirma a exclusão da especialidade selecionada?", "Especialidade", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            EspecialidadeDao.excluir(getCodigo());
            criarTabelaEspecialidade();
        }
    }

    private Integer getCodigo() {
        String codigoStr = tableEspecialidade.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JButton buttoneEditar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEspecialidade;
    private javax.swing.JTable tableEspecialidade;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaEspecialidade() {

        tableEspecialidade.setModel(EspecialidadeDao.getTableModel());
        tableEspecialidade.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        tableEspecialidade.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidade.getColumnModel().getColumn(1).setPreferredWidth(300);
        tableEspecialidade.getColumnModel().getColumn(2).setPreferredWidth(300);

        tableEspecialidade.getTableHeader().setReorderingAllowed(false);

        tableEspecialidade.setDefaultEditor(Object.class, null);

    }

}
