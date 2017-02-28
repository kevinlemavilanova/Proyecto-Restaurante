/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.Pedidos;

import java.util.ArrayList;
import restaurante.Comida;
import javax.swing.DefaultListModel;

/**
 *
 * @author christian
 */
public class PrimerPlato extends javax.swing.JInternalFrame {

    /**
     * Creates new form MenuPedidos
     */
    public PrimerPlato() {
        initComponents();
    }
    Comida comida1 = new Comida("Pasta", 3.4f);
    Comida comida2 = new Comida("comida2", 3.4f);
    Comida comida3 = new Comida("comida3", 3.4f);
    Comida comida4 = new Comida("comida4", 3.4f);
    Comida comida5 = new Comida("comida5", 3.4f);
    Comida comida6 = new Comida("comida6", 3.4f);
    ArrayList<Comida> lista = new ArrayList<Comida>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        modelo=new DefaultListModel();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setText("Eliminar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, -1, -1));

        jButton5.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida/Tortilla.png"))); // NOI18N
        jButton5.setText("Tortilla de patata");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setIconTextGap(-3);
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida/TortillaP.png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida/TortillaG.png"))); // NOI18N
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 210, 240));

        jButton1.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida/PastaConTomate.png"))); // NOI18N
        jButton1.setText("Pasta con tomate");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(-3);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida/PastaConTomateP.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida/PastaConTomateG.png"))); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 210, 240));

        jButton4.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida/Callos.png"))); // NOI18N
        jButton4.setText("Callos");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setIconTextGap(-3);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida/CallosP.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida/CallosG.png"))); // NOI18N
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 210, 240));

        jButton2.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida/SopaDeZanahoria.png"))); // NOI18N
        jButton2.setText("Sopa de zanahoria");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(-3);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida/SopaDeZanahoriaP.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida/SopaDeZanahoriaG.png"))); // NOI18N
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 210, 240));

        jButton6.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida/Espinacas.png"))); // NOI18N
        jButton6.setText("Espinacas");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setIconTextGap(-3);
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida/EspinacasP.png"))); // NOI18N
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida/EspinacasG.png"))); // NOI18N
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 210, 240));

        jButton3.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida/Empanada.png"))); // NOI18N
        jButton3.setText("Empanada de pollo");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(-3);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida/EmpanadaP.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida/EmpanadaG.png"))); // NOI18N
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 210, 240));

        jList1.setModel(modelo);
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 170, 420));

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Pedido/PPlato.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 570, 90));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 901, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String value = jList1.getSelectedValue().substring(4, jList1.getSelectedValue().length());
        for(Comida c : lista){
            String cnombre = c.getNombre();
            if(cnombre.equals(value)) {
            } else {
                c.setCantidad(c.getCantidad()-1);
                if(c.getCantidad() == 0){
                    lista.remove(c);
                }
                break;
            }
        }
        modelo.removeAllElements();
        for (Comida c : lista) {
            modelo.addElement(c.getCantidad() + "x   " + c.getNombre());
        }        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int aux = 0;
        if (lista.size() > 0) {
            for (Comida c : lista) {
                if (c.getNombre().equals(comida5.getNombre())) {
                    c.setCantidad(c.getCantidad() + 1);
                    break;
                } else {
                    aux++;
                }
                if (aux == lista.size()) {
                    comida5.setCantidad(comida5.getCantidad() + 1);
                    lista.add(comida5);
                    break;
                }
            }
        } else {
            comida5.setCantidad(comida5.getCantidad() + 1);
            lista.add(comida5);
        }
        modelo.removeAllElements();
        for (Comida c : lista) {
            modelo.addElement(c.getCantidad() + "x   " + c.getNombre());
        }    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int aux = 0;
        if (lista.size() > 0) {
            for (Comida c : lista) {
                if (c.getNombre().equals(comida1.getNombre())) {
                    c.setCantidad(c.getCantidad() + 1);
                    break;
                } else {
                    aux++;
                }
                if (aux == lista.size()) {
                    comida1.setCantidad(comida1.getCantidad() + 1);
                    lista.add(comida1);
                    break;
                }
            }
        } else {
            comida1.setCantidad(comida1.getCantidad() + 1);
            lista.add(comida1);
        }
        modelo.removeAllElements();
        for (Comida c : lista) {
            modelo.addElement(c.getCantidad() + "x   " + c.getNombre());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int aux = 0;
        if (lista.size() > 0) {
            for (Comida c : lista) {
                if (c.getNombre().equals(comida4.getNombre())) {
                    c.setCantidad(c.getCantidad() + 1);
                    break;
                } else {
                    aux++;
                }
                if (aux == lista.size()) {
                    comida4.setCantidad(comida4.getCantidad() + 1);
                    lista.add(comida4);
                    break;
                }
            }
        } else {
            comida4.setCantidad(comida4.getCantidad() + 1);
            lista.add(comida4);
        }
        modelo.removeAllElements();
        for (Comida c : lista) {
            modelo.addElement(c.getCantidad() + "x   " + c.getNombre());
        }    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int aux = 0;
        if (lista.size() > 0) {
            for (Comida c : lista) {
                if (c.getNombre().equals(comida2.getNombre())) {
                    c.setCantidad(c.getCantidad() + 1);
                    break;
                } else {
                    aux++;
                }
                if (aux == lista.size()) {
                    comida2.setCantidad(comida2.getCantidad() + 1);
                    lista.add(comida2);
                    break;
                }
            }
        } else {
            comida2.setCantidad(comida2.getCantidad() + 1);
            lista.add(comida2);
        }
        modelo.removeAllElements();
        for (Comida c : lista) {
            modelo.addElement(c.getCantidad() + "x   " + c.getNombre());
        }    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int aux = 0;
        if (lista.size() > 0) {
            for (Comida c : lista) {
                if (c.getNombre().equals(comida6.getNombre())) {
                    c.setCantidad(c.getCantidad() + 1);
                    break;
                } else {
                    aux++;
                }
                if (aux == lista.size()) {
                    comida6.setCantidad(comida6.getCantidad() + 1);
                    lista.add(comida6);
                    break;
                }
            }
        } else {
            comida6.setCantidad(comida6.getCantidad() + 1);
            lista.add(comida6);
        }
        modelo.removeAllElements();
        for (Comida c : lista) {
            modelo.addElement(c.getCantidad() + "x   " + c.getNombre());
        }    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int aux = 0;
        if (lista.size() > 0) {
            for (Comida c : lista) {
                if (c.getNombre().equals(comida3.getNombre())) {
                    c.setCantidad(c.getCantidad() + 1);
                    break;
                } else {
                    aux++;
                }
                if (aux == lista.size()) {
                    comida3.setCantidad(comida3.getCantidad() + 1);
                    lista.add(comida3);
                    break;
                }
            }
        } else {
            comida3.setCantidad(comida3.getCantidad() + 1);
            lista.add(comida3);
        }
        modelo.removeAllElements();
        for (Comida c : lista) {
            modelo.addElement(c.getCantidad() + "x   " + c.getNombre());
        }    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private DefaultListModel modelo;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
