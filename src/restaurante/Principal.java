package restaurante;

import java.awt.Component;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;
import restaurante.Pedidos.ListaDeMesas;
import restaurante.Pedidos.PrimerPlato;

public class Principal extends javax.swing.JInternalFrame {

    public static ArrayList<Pedido> TotalPedidos = new ArrayList<Pedido>();

    public Principal() {
        initComponents();
        cargarPedidos();
    }

    public void cargarPedidos() {

        File ar = new File("C:\\Users\\christian\\Documents\\NetBeansProjects\\Restaurante\\src\\aplicacion\\Pedidos\\ListaPedidos.txt");
        Scanner sc;
        try {
            sc = new Scanner(ar);
            while (sc.hasNextLine()) {
                String textoPedido = sc.nextLine();
                cargarPedido(textoPedido);
            }
            sc.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger("No se ha podido encontrar el archivo");
        }
    }

    public void cargarPedido(String lineaPedido) {

        
        String[] atributosPedidos = lineaPedido.split("--");

        String[] primerPlato = atributosPedidos[1].split("\\*");
        Comida[] comidaPP = new Comida[primerPlato.length];

        for (int i = 0; i < primerPlato.length; i++) {
            int inicio = primerPlato[i].indexOf(".");
            int fin = inicio + 2;

            comidaPP[i] = new Comida(primerPlato[i].substring(0, inicio), Integer.parseInt(primerPlato[i].substring(inicio + 1, fin)));

        }

        String[] segundoPlato = atributosPedidos[2].split("\\*");
        Comida[] comidaSP = new Comida[segundoPlato.length];

        for (int i = 0; i < segundoPlato.length; i++) {
            int inicio = segundoPlato[i].indexOf(".");
            int fin = inicio + 2;

            comidaSP[i] = new Comida(segundoPlato[i].substring(0, inicio), Integer.parseInt(segundoPlato[i].substring(inicio + 1, fin)));

        }

        //
        String[] postre = atributosPedidos[3].split("\\*");

        Comida[] comidaPostre = new Comida[postre.length];

        for (int i = 0; i < postre.length; i++) {
            int inicio = postre[i].indexOf(".");
            int fin = inicio + 2;

            comidaPostre[i] = new Comida(postre[i].substring(0, inicio), Integer.parseInt(postre[i].substring(inicio + 1, fin)));

        }

        String[] bebida = atributosPedidos[4].split("\\*");

        Comida[] comidaBebida = new Comida[bebida.length];

        for (int i = 0; i < bebida.length; i++) {
            int inicio = bebida[i].indexOf(".");
            int fin = inicio + 2;

            comidaBebida[i] = new Comida(bebida[i].substring(0, inicio), Integer.parseInt(bebida[i].substring(inicio + 1, fin)));

        }

        Pedido PedidoCargado = new Pedido();
        //Mesa
        PedidoCargado.setN_mesa(Integer.parseInt(atributosPedidos[0]));
        //Primer plato
        ArrayList<Comida> AyudaPP = new ArrayList<Comida>();
        for (int i = 0; i < primerPlato.length; i++) {
            AyudaPP.add(comidaPP[i]);
        }
        PedidoCargado.setPrimerPlato(AyudaPP);
        
        //Segundo plato
        ArrayList<Comida> AyudaSP = new ArrayList<Comida>();
        for (int i = 0; i < segundoPlato.length; i++) {
            AyudaSP.add(comidaSP[i]);
        }
        PedidoCargado.setSegundoPlato(AyudaSP);
        
        //Postre
        ArrayList<Comida> AyudaPostre = new ArrayList<Comida>();
        for (int i = 0; i < postre.length; i++) {
            AyudaPostre.add(comidaPostre[i]);
        }
        PedidoCargado.setPostre(AyudaPostre);
        
        //Bebida
        ArrayList<Comida> AyudaBebida = new ArrayList<Comida>();
        for (int i = 0; i < bebida.length; i++) {
            AyudaBebida.add(comidaBebida[i]);
        }
        PedidoCargado.setBebida(AyudaBebida);
        
        
        System.out.print(PedidoCargado.toString());
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setOpaque(false);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 920, 660));

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 3, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/Titulo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 480, 110));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/FontAwesome_f0f5(0)_200.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(-3);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 180, -1));

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/Home.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setIconTextGap(-3);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 180, -1));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/FontAwesome_f0ea(0)_200.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setIconTextGap(-3);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 180, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ListaDeMesas p1 = new ListaDeMesas();
        Panel.add(p1);
        p1.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) p1.getUI()).setNorthPane(null);
        p1.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        PrimerPlato p1 = new PrimerPlato();
        Panel.add(p1);
        p1.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) p1.getUI()).setNorthPane(null);
        p1.show();    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Panel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
