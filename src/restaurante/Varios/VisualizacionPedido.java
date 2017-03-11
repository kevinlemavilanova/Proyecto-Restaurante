/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.Varios;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import restaurante.Principal;
import restaurante.Pedido;
import restaurante.Comida;
import static restaurante.Principal.TotalPedidos;

/**
 *
 * @author christian
 */
public class VisualizacionPedido extends javax.swing.JInternalFrame {

    /**
     * Creates new form VisualizacionPedido
     */
    public VisualizacionPedido() {
        initComponents();
        
    }
    
    public DefaultListModel getModeloPP() {
        return modeloPP;
    }
    public DefaultListModel getModeloSP() {
        return modeloSP;
    }
    public DefaultListModel getModeloBebida() {
        return modeloBebida;
    }
    public DefaultListModel getModeloPostre() {
        return modeloPostre;
    }

    public void cargarInformacion(int mesa){
        Pedido pedidoCargar = new Pedido();
        for (Pedido i : TotalPedidos){
            if (i.getN_mesa() == mesa){
                pedidoCargar = i; 
            }      
        }
        
        lbNumM.setText(Integer.toString(pedidoCargar.getN_mesa()));
        lbPrecio.setText(Float.toString(pedidoCargar.getPrecioPedido()) + "€");
        
        ArrayList<Comida> AyudaPP = new ArrayList<Comida>();
      
        AyudaPP = pedidoCargar.getPrimerPlato();
        for(Comida i : AyudaPP){
            modeloPP.addElement("-" + i.getNombre() + "  " + i.getCantidad());
        }
        
        ArrayList<Comida> AyudaSP = new ArrayList<Comida>();
      
        AyudaSP = pedidoCargar.getSegundoPlato();
        for(Comida i : AyudaSP){
            modeloSP.addElement("-" + i.getNombre() + "  " + i.getCantidad());
        }
        
        ArrayList<Comida> AyudaPostre = new ArrayList<Comida>();
      
        AyudaPostre = pedidoCargar.getPostre();
        for(Comida i : AyudaPostre){
            modeloPostre.addElement("-" + i.getNombre() + "  " + i.getCantidad());
        }
        
        ArrayList<Comida> AyudaBebida = new ArrayList<Comida>();
      
        AyudaBebida = pedidoCargar.getBebida();
        for(Comida i : AyudaBebida){
            modeloBebida.addElement("-" + i.getNombre() + "  " + i.getCantidad());
        }
        
        
        
        
        
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JLabel();
        lbPrecio = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbNumM = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        list = new javax.swing.JScrollPane();
        modeloPP=new DefaultListModel();
        listaPP = new javax.swing.JList<>();
        list1 = new javax.swing.JScrollPane();
        modeloPostre=new DefaultListModel();
        listaPostre = new javax.swing.JList<>();
        list4 = new javax.swing.JScrollPane();
        modeloSP=new DefaultListModel();
        listaPS = new javax.swing.JList<>();
        listaBebida = new javax.swing.JScrollPane();
        modeloBebida=new DefaultListModel();
        listaPP4 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/Fondo.png"))); // NOI18N

        setBackground(new java.awt.Color(51, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setPreferredSize(new java.awt.Dimension(900, 770));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbPrecio.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        lbPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lbPrecio.setText("80€");
        lbPrecio.setEnabled(false);
        getContentPane().add(lbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 220, 80));

        jLabel5.setFont(new java.awt.Font("MV Boli", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Postre:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 140, 50));

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Segundo plato:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 290, 50));

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Primer plato:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 220, 50));

        lbNumM.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        lbNumM.setForeground(new java.awt.Color(255, 255, 255));
        lbNumM.setText("9");
        lbNumM.setEnabled(false);
        getContentPane().add(lbNumM, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 130, 50));

        jLabel6.setFont(new java.awt.Font("MV Boli", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mesa: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 130, 50));

        list.setBorder(null);

        listaPP.setBackground(new java.awt.Color(51, 51, 51));
        listaPP.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        listaPP.setForeground(new java.awt.Color(255, 255, 255));
        listaPP.setModel(modeloPP);
        listaPP.setEnabled(false);
        listaPP.setFocusable(false);
        list.setViewportView(listaPP);

        getContentPane().add(list, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 300, 190));

        list1.setBorder(null);

        listaPostre.setBackground(new java.awt.Color(51, 51, 51));
        listaPostre.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        listaPostre.setForeground(new java.awt.Color(255, 255, 255));
        listaPostre.setModel(modeloPostre);
        listaPostre.setEnabled(false);
        listaPostre.setFocusable(false);
        list1.setViewportView(listaPostre);

        getContentPane().add(list1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 270, 190));

        list4.setBorder(null);

        listaPS.setBackground(new java.awt.Color(51, 51, 51));
        listaPS.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        listaPS.setForeground(new java.awt.Color(255, 255, 255));
        listaPS.setModel(modeloSP);
        listaPS.setEnabled(false);
        listaPS.setFocusable(false);
        list4.setViewportView(listaPS);

        getContentPane().add(list4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 300, 190));

        listaBebida.setBorder(null);

        listaPP4.setBackground(new java.awt.Color(51, 51, 51));
        listaPP4.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        listaPP4.setForeground(new java.awt.Color(255, 255, 255));
        listaPP4.setModel(modeloBebida);
        listaPP4.setEnabled(false);
        listaPP4.setFocusable(false);
        listaBebida.setViewportView(listaPP4);

        getContentPane().add(listaBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 270, 190));

        jLabel7.setFont(new java.awt.Font("MV Boli", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bebida:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 140, 50));

        jLabel8.setFont(new java.awt.Font("MV Boli", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 140, 50));

        jButton1.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jButton1.setText("Atrás");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 140, 60));

        jButton2.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jButton2.setText("Cobrar");
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 140, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/VisualizarPedidos/InformacionDelPedido.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 830, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        for (Pedido i : TotalPedidos){
            int ayuda = Integer.parseInt(lbNumM.getText());
            if (i.getN_mesa() == ayuda){
                TotalPedidos.remove(i);
            }
        }
       Principal.escribirPedidos();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbNumM;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JScrollPane list;
    private javax.swing.JScrollPane list1;
    private javax.swing.JScrollPane list4;
    private javax.swing.JScrollPane listaBebida;
    private javax.swing.JList<String> listaPP;
    private DefaultListModel modeloPP;
    private javax.swing.JList<String> listaPP4;
    private DefaultListModel modeloBebida;
    private javax.swing.JList<String> listaPS;
    private DefaultListModel modeloSP;
    private javax.swing.JList<String> listaPostre;
    private DefaultListModel modeloPostre;
    // End of variables declaration//GEN-END:variables
}
