/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.Varios;


import restaurante.Pedido;
import static restaurante.Principal.TotalPedidos;
import restaurante.Varios.VisualizacionPedido;
/**
 *
 * @author christian
 */
public class VistaMesas extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaMesas
     */
    public VistaMesas() {
        initComponents();
        cargarMesas();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnM5 = new javax.swing.JButton();
        btnM3 = new javax.swing.JButton();
        btnM6 = new javax.swing.JButton();
        btnM8 = new javax.swing.JButton();
        btnM4 = new javax.swing.JButton();
        btnM9 = new javax.swing.JButton();
        btnM7 = new javax.swing.JButton();
        btnM2 = new javax.swing.JButton();
        btnM1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(900, 770));
        setMinimumSize(new java.awt.Dimension(900, 770));
        setPreferredSize(new java.awt.Dimension(900, 770));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(51, 51, 51));
        Panel.setPreferredSize(new java.awt.Dimension(900, 770));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/VisualizarPedidos/VisualizarMesa.png"))); // NOI18N
        Panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 400, 230));

        btnM5.setBackground(new java.awt.Color(0, 0, 0));
        btnM5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Lista/Mesa (5).png"))); // NOI18N
        btnM5.setBorder(null);
        btnM5.setBorderPainted(false);
        btnM5.setContentAreaFilled(false);
        btnM5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnM5.setEnabled(false);
        btnM5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnM5.setIconTextGap(-3);
        btnM5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Lista/MesaG (5).png"))); // NOI18N
        btnM5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnM5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnM5ActionPerformed(evt);
            }
        });
        Panel.add(btnM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 100, 100));

        btnM3.setBackground(new java.awt.Color(0, 0, 0));
        btnM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Lista/Mesa (3).png"))); // NOI18N
        btnM3.setBorder(null);
        btnM3.setBorderPainted(false);
        btnM3.setContentAreaFilled(false);
        btnM3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnM3.setEnabled(false);
        btnM3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnM3.setIconTextGap(-3);
        btnM3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Lista/MesaG (3).png"))); // NOI18N
        btnM3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnM3ActionPerformed(evt);
            }
        });
        Panel.add(btnM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, 100, 100));

        btnM6.setBackground(new java.awt.Color(0, 0, 0));
        btnM6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Lista/Mesa (6).png"))); // NOI18N
        btnM6.setBorder(null);
        btnM6.setBorderPainted(false);
        btnM6.setContentAreaFilled(false);
        btnM6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnM6.setEnabled(false);
        btnM6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnM6.setIconTextGap(-3);
        btnM6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Lista/MesaG (6).png"))); // NOI18N
        btnM6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnM6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnM6ActionPerformed(evt);
            }
        });
        Panel.add(btnM6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 100, 100));

        btnM8.setBackground(new java.awt.Color(0, 0, 0));
        btnM8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Lista/Mesa (8).png"))); // NOI18N
        btnM8.setBorder(null);
        btnM8.setBorderPainted(false);
        btnM8.setContentAreaFilled(false);
        btnM8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnM8.setEnabled(false);
        btnM8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnM8.setIconTextGap(-3);
        btnM8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Lista/MesaG (8).png"))); // NOI18N
        btnM8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnM8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnM8ActionPerformed(evt);
            }
        });
        Panel.add(btnM8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 100, 100));

        btnM4.setBackground(new java.awt.Color(0, 0, 0));
        btnM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Lista/Mesa (4).png"))); // NOI18N
        btnM4.setBorder(null);
        btnM4.setBorderPainted(false);
        btnM4.setContentAreaFilled(false);
        btnM4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnM4.setEnabled(false);
        btnM4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnM4.setIconTextGap(-3);
        btnM4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Lista/MesaG (4).png"))); // NOI18N
        btnM4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnM4ActionPerformed(evt);
            }
        });
        Panel.add(btnM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, 100, 100));

        btnM9.setBackground(new java.awt.Color(0, 0, 0));
        btnM9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Lista/Mesa (9).png"))); // NOI18N
        btnM9.setBorder(null);
        btnM9.setBorderPainted(false);
        btnM9.setContentAreaFilled(false);
        btnM9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnM9.setEnabled(false);
        btnM9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnM9.setIconTextGap(-3);
        btnM9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Lista/MesaG (9).png"))); // NOI18N
        btnM9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnM9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnM9ActionPerformed(evt);
            }
        });
        Panel.add(btnM9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 100, 100));

        btnM7.setBackground(new java.awt.Color(0, 0, 0));
        btnM7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Lista/Mesa (7).png"))); // NOI18N
        btnM7.setBorder(null);
        btnM7.setBorderPainted(false);
        btnM7.setContentAreaFilled(false);
        btnM7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnM7.setEnabled(false);
        btnM7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnM7.setIconTextGap(-3);
        btnM7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Lista/MesaG (7).png"))); // NOI18N
        btnM7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnM7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnM7ActionPerformed(evt);
            }
        });
        Panel.add(btnM7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 100, 100));

        btnM2.setBackground(new java.awt.Color(0, 0, 0));
        btnM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Lista/Mesa (2).png"))); // NOI18N
        btnM2.setBorder(null);
        btnM2.setBorderPainted(false);
        btnM2.setContentAreaFilled(false);
        btnM2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnM2.setEnabled(false);
        btnM2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnM2.setIconTextGap(-3);
        btnM2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Lista/MesaG (2).png"))); // NOI18N
        btnM2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnM2ActionPerformed(evt);
            }
        });
        Panel.add(btnM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 100, 110));

        btnM1.setBackground(new java.awt.Color(0, 0, 0));
        btnM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Lista/Mesa (1).png"))); // NOI18N
        btnM1.setBorder(null);
        btnM1.setBorderPainted(false);
        btnM1.setContentAreaFilled(false);
        btnM1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnM1.setEnabled(false);
        btnM1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnM1.setIconTextGap(-3);
        btnM1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Lista/MesaG (1).png"))); // NOI18N
        btnM1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnM1ActionPerformed(evt);
            }
        });
        Panel.add(btnM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 100, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/PLANO.png"))); // NOI18N
        Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -180, 800, 1110));

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Panel2.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarMesas() {

        for (Pedido i : TotalPedidos) {
            switch (i.getN_mesa()) {
                case 1:
                    btnM1.setEnabled(true);
                    break;
                case 2:
                    btnM2.setEnabled(true);
                    break;
                case 3:
                    btnM3.setEnabled(true);
                    break;
                case 4:
                    btnM4.setEnabled(true);
                    break;
                case 5:
                    btnM5.setEnabled(true);
                    break;
                case 6:
                    btnM6.setEnabled(true);
                    break;
                case 7:
                    btnM7.setEnabled(true);
                    break;
                case 8:
                    btnM8.setEnabled(true);
                    break;
                case 9:
                    btnM9.setEnabled(true);
                    break;
            }
        }

    }


    private void btnM9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnM9ActionPerformed
        VisualizacionPedido p1 = new VisualizacionPedido();
        Panel.setVisible(false);
        Panel2.add(p1);
        p1.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) p1.getUI()).setNorthPane(null);
        p1.cargarInformacion(9);
        p1.show(); 
    }//GEN-LAST:event_btnM9ActionPerformed
    private void btnM7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnM7ActionPerformed
        VisualizacionPedido p1 = new VisualizacionPedido();
        Panel.setVisible(false);
        Panel2.add(p1);
        p1.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) p1.getUI()).setNorthPane(null);
        p1.cargarInformacion(7);
        p1.show(); 
    }//GEN-LAST:event_btnM7ActionPerformed
    private void btnM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnM2ActionPerformed
        VisualizacionPedido p1 = new VisualizacionPedido();
        Panel.setVisible(false);
        Panel2.add(p1);
        p1.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) p1.getUI()).setNorthPane(null);
        p1.cargarInformacion(2);
        p1.show(); 
    }//GEN-LAST:event_btnM2ActionPerformed
    private void btnM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnM4ActionPerformed
        VisualizacionPedido p1 = new VisualizacionPedido();
        Panel.setVisible(false);
        Panel2.add(p1);
        p1.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) p1.getUI()).setNorthPane(null);
        p1.cargarInformacion(4);
        p1.show(); 
    }//GEN-LAST:event_btnM4ActionPerformed
    private void btnM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnM1ActionPerformed
        VisualizacionPedido p1 = new VisualizacionPedido();
        Panel.setVisible(false);
        Panel2.add(p1);
        p1.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) p1.getUI()).setNorthPane(null);
        p1.cargarInformacion(1);
        p1.show(); 
    }//GEN-LAST:event_btnM1ActionPerformed
    private void btnM8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnM8ActionPerformed
        VisualizacionPedido p1 = new VisualizacionPedido();
        Panel.setVisible(false);
        Panel2.add(p1);
        p1.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) p1.getUI()).setNorthPane(null);
        p1.cargarInformacion(8);
        p1.show(); 
    }//GEN-LAST:event_btnM8ActionPerformed
    private void btnM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnM3ActionPerformed
        VisualizacionPedido p1 = new VisualizacionPedido();
        Panel.setVisible(false);
        Panel2.add(p1);
        p1.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) p1.getUI()).setNorthPane(null);
        p1.cargarInformacion(3);
        p1.show(); 
    }//GEN-LAST:event_btnM3ActionPerformed
    private void btnM6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnM6ActionPerformed
        VisualizacionPedido p1 = new VisualizacionPedido();
        Panel.setVisible(false);
        Panel2.add(p1);
        p1.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) p1.getUI()).setNorthPane(null);
        p1.cargarInformacion(6);
        p1.show(); 
    }//GEN-LAST:event_btnM6ActionPerformed
    private void btnM5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnM5ActionPerformed

        VisualizacionPedido p1 = new VisualizacionPedido();
        Panel.setVisible(false);
        Panel2.add(p1);
        p1.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) p1.getUI()).setNorthPane(null);
        p1.cargarInformacion(5);
        p1.show();     
    }//GEN-LAST:event_btnM5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel Panel2;
    private javax.swing.JButton btnM1;
    private javax.swing.JButton btnM2;
    private javax.swing.JButton btnM3;
    private javax.swing.JButton btnM4;
    private javax.swing.JButton btnM5;
    private javax.swing.JButton btnM6;
    private javax.swing.JButton btnM7;
    private javax.swing.JButton btnM8;
    private javax.swing.JButton btnM9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
