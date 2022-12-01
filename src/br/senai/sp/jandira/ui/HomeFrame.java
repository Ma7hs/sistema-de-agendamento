package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDao;
import br.senai.sp.jandira.dao.MedicoDao;
import br.senai.sp.jandira.dao.PlanoSaudeDao;

public class HomeFrame extends javax.swing.JFrame {

    private PlanosSaudePanel planosSaudePanel;
    private EspecialidadePanel especialidadePanel;
    private MedicoPanel medicoPanel;

    private final int LARGURA = 1090;
    private final int ALTURA = 490;
    private final int POSICAO_X = 0;
    private final int POSICAO_Y = 240;

    public HomeFrame() {
        initComponents();
        PlanoSaudeDao.getListaPlanosSaude();
        EspecialidadeDao.getListaEspecialidades();
        MedicoDao.getListaMedicos();
        initPanels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labeltitulo = new javax.swing.JLabel();
        labelicon = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        labelPlanodeSaude = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        buttonAgenda = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPlanoSaude = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        labeltitulo.setFont(new java.awt.Font("Tw Cen MT", 3, 36)); // NOI18N
        labeltitulo.setForeground(new java.awt.Color(51, 51, 51));
        labeltitulo.setText("Sistema para Agendamento de Consultas");
        jPanel1.add(labeltitulo);
        labeltitulo.setBounds(140, 30, 600, 50);
        jPanel1.add(labelicon);
        labelicon.setBounds(40, 20, 0, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1090, 100);

        buttonSair.setBackground(new java.awt.Color(204, 204, 255));
        buttonSair.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        buttonSair.setForeground(new java.awt.Color(255, 0, 0));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/exit.png"))); // NOI18N
        buttonSair.setToolTipText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(980, 130, 90, 70);

        panelHome.setBackground(new java.awt.Color(153, 153, 255));
        panelHome.setLayout(null);

        labelPlanodeSaude.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        labelPlanodeSaude.setForeground(new java.awt.Color(204, 204, 255));
        labelPlanodeSaude.setText("SISACON");
        labelPlanodeSaude.setToolTipText("");
        panelHome.add(labelPlanodeSaude);
        labelPlanodeSaude.setBounds(30, 10, 210, 70);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Dados para contato:");
        panelHome.add(jLabel1);
        jLabel1.setBounds(30, 130, 180, 40);

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Sistema para Agendamento de Consultas");
        panelHome.add(jLabel2);
        jLabel2.setBounds(30, 70, 250, 30);

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("www.sisacon.com.br");
        panelHome.add(jLabel3);
        jLabel3.setBounds(40, 210, 210, 16);

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("E-mail: suporte@sisacon.com.br");
        panelHome.add(jLabel4);
        jLabel4.setBounds(40, 170, 190, 20);

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Telefone: (11) 5555-5555");
        panelHome.add(jLabel5);
        jLabel5.setBounds(40, 190, 150, 20);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        panelHome.add(jPanel2);
        jPanel2.setBounds(30, 110, 1040, 10);

        getContentPane().add(panelHome);
        panelHome.setBounds(0, 240, 1090, 490);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(null);

        buttonAgenda.setBackground(new java.awt.Color(204, 204, 255));
        buttonAgenda.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        buttonAgenda.setForeground(new java.awt.Color(102, 102, 102));
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/agenda_1.png"))); // NOI18N
        buttonAgenda.setToolTipText("Agenda");
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        jPanel3.add(buttonAgenda);
        buttonAgenda.setBounds(110, 30, 90, 70);

        buttonPaciente.setBackground(new java.awt.Color(204, 204, 255));
        buttonPaciente.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        buttonPaciente.setForeground(new java.awt.Color(102, 102, 102));
        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/pacient.png"))); // NOI18N
        buttonPaciente.setToolTipText("Pacientes");
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });
        jPanel3.add(buttonPaciente);
        buttonPaciente.setBounds(210, 30, 90, 70);

        buttonMedicos.setBackground(new java.awt.Color(204, 204, 255));
        buttonMedicos.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        buttonMedicos.setForeground(new java.awt.Color(102, 102, 102));
        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/doctor.png"))); // NOI18N
        buttonMedicos.setToolTipText("Médicos");
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        jPanel3.add(buttonMedicos);
        buttonMedicos.setBounds(310, 30, 90, 70);

        buttonEspecialidades.setBackground(new java.awt.Color(204, 204, 255));
        buttonEspecialidades.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        buttonEspecialidades.setForeground(new java.awt.Color(102, 102, 102));
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/especi.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Especialidades");
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        jPanel3.add(buttonEspecialidades);
        buttonEspecialidades.setBounds(410, 30, 90, 70);

        buttonPlanoSaude.setBackground(new java.awt.Color(204, 204, 255));
        buttonPlanoSaude.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        buttonPlanoSaude.setForeground(new java.awt.Color(153, 153, 255));
        buttonPlanoSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plano.png"))); // NOI18N
        buttonPlanoSaude.setToolTipText("Planos de Saúde");
        buttonPlanoSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoSaudeActionPerformed(evt);
            }
        });
        jPanel3.add(buttonPlanoSaude);
        buttonPlanoSaude.setBounds(510, 30, 90, 70);

        buttonHome.setBackground(new java.awt.Color(153, 153, 255));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/home32.png"))); // NOI18N
        buttonHome.setToolTipText("Voltar para a página principal");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        jPanel3.add(buttonHome);
        buttonHome.setBounds(10, 30, 90, 70);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 100, 1090, 140);

        setBounds(0, 0, 1105, 732);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        setBackgroundButton();
        buttonMedicos.setBackground(new java.awt.Color(153,153,255));
        
        setAllInvisible();
        medicoPanel.setVisible(true);
    }//GEN-LAST:event_buttonMedicosActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        setBackgroundButton();
        buttonEspecialidades.setBackground(new java.awt.Color(153,153,255));
        
        setAllInvisible();
        especialidadePanel.setVisible(true);
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonPlanoSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoSaudeActionPerformed
        setBackgroundButton();
        buttonPlanoSaude.setBackground(new java.awt.Color(153,153,255));
        
        setAllInvisible();
        planosSaudePanel.setVisible(true);
    }//GEN-LAST:event_buttonPlanoSaudeActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        setBackgroundButton();
        buttonHome.setBackground(new java.awt.Color(153,153,255));
        
        setAllInvisible();
        panelHome.setVisible(true);
    }//GEN-LAST:event_buttonHomeActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPlanoSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelPlanodeSaude;
    private javax.swing.JLabel labelicon;
    private javax.swing.JLabel labeltitulo;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        planosSaudePanel = new PlanosSaudePanel();
        planosSaudePanel.setBounds(POSICAO_X, POSICAO_Y, LARGURA, ALTURA);
        getContentPane().add(planosSaudePanel);
        planosSaudePanel.setVisible(false);
        
        especialidadePanel = new EspecialidadePanel();
        especialidadePanel.setBounds(POSICAO_X, POSICAO_Y, LARGURA, ALTURA);
        getContentPane().add(especialidadePanel);
        especialidadePanel.setVisible(false);
        
        medicoPanel = new MedicoPanel();
        medicoPanel.setBounds(POSICAO_X, POSICAO_Y, LARGURA, ALTURA);
        getContentPane().add(medicoPanel);
        medicoPanel.setVisible(false);
        
    }

    public void setAllInvisible() {
        panelHome.setVisible(false);
        especialidadePanel.setVisible(false);
        planosSaudePanel.setVisible(false);
        medicoPanel.setVisible(false);
    }

    public void setBackgroundButton() {
        buttonAgenda.setBackground(new java.awt.Color(204, 204, 255));
        buttonPlanoSaude.setBackground(new java.awt.Color(204, 204, 255));
        buttonEspecialidades.setBackground(new java.awt.Color(204, 204, 255));
        buttonHome.setBackground(new java.awt.Color(204, 204, 255));
        buttonMedicos.setBackground(new java.awt.Color(204, 204, 255));
        buttonPaciente.setBackground(new java.awt.Color(204, 204, 255));
        buttonPlanoSaude.setBackground(new java.awt.Color(204, 204, 255));
        buttonSair.setBackground(new java.awt.Color(204, 204, 255));
        
    }
}
