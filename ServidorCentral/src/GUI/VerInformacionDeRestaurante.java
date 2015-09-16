/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.Principal.jDesktopPane1;
import datatype.DataCategoria;
import datatype.DataProducto;
import datatype.DataRestaurante;
import fabrica.Fabrica;
import interfaces.IControladorCategoria;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Mathi
 */
public class VerInformacionDeRestaurante extends javax.swing.JInternalFrame {
    private DefaultTreeModel modelo;
    private DataRestaurante restSelected;
    public static boolean VIDR;
    /**
     * Creates new form VerInformacionDeRestaurante
     */
    public VerInformacionDeRestaurante() {
        VIDR = true;
        IControladorCategoria cCat = Fabrica.getInstance().obtenerControladorCategoria();
        
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Categorias");
        modelo = new DefaultTreeModel(root);
        JTree tree = new JTree(modelo);
        
        List<DataCategoria> categorias= cCat.listarCategorias();
        DefaultMutableTreeNode aux;
        
        for(DataCategoria cat : categorias){
                
            if (!cat.getDataRestaurantes().isEmpty()){
                aux=new DefaultMutableTreeNode(cat.getNombre());
                root.add(aux);
                for (DataRestaurante rest : cat.getDataRestaurantes()){
                    aux.add(new DefaultMutableTreeNode(rest));
                }
            }
        }
        
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        verInfo = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        restaurantes = new javax.swing.JTree(modelo);
        jLabel1 = new javax.swing.JLabel();
        imagenRestaurante = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nicknameRestaurante = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mailRestaurante = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreRestaurante = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        direccionRestaurante = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        modeloProductos =new DefaultListModel();
        jScrollPane2 = new javax.swing.JScrollPane();
        modeloProductos =new DefaultListModel();
        productosRestaurante = new javax.swing.JList(){    public boolean isCellEditable(int row, int column) {         return (column == 23 );     }};
        jButtonCancelar = new javax.swing.JButton();

        verInfo.setToolTipText("Ver Información");
        verInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verInfoMouseClicked(evt);
            }
        });

        jMenuItem1.setText("Ver Información del Producto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        verInfo.add(jMenuItem1);

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        restaurantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restaurantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(restaurantes);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Categorías:");

        imagenRestaurante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nickname");

        nicknameRestaurante.setText("Nickname");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Mail");

        mailRestaurante.setText("Mail");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Nombre");

        nombreRestaurante.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Dirección");

        direccionRestaurante.setText("Dirección");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Productos:");

        productosRestaurante.setModel(modeloProductos);
        productosRestaurante.setComponentPopupMenu(verInfo);
        productosRestaurante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        productosRestaurante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productosRestauranteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(productosRestaurante);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 432, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(imagenRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(direccionRestaurante)
                                            .addComponent(nombreRestaurante)
                                            .addComponent(mailRestaurante)
                                            .addComponent(nicknameRestaurante)))
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagenRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nicknameRestaurante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(mailRestaurante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nombreRestaurante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(direccionRestaurante))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButtonCancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
        VIDR = false;
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void restaurantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurantesMouseClicked
        //Carga Archivo de Propiedades ----------------------
        Properties propiedades = new Properties();
        InputStream entrada = null;
        try {               
            entrada = this.getClass().getResourceAsStream("/Resources/config.properties");
            propiedades.load(entrada);
            } 
        catch (IOException ex) {
            ex.printStackTrace();
        } 
        //---------------------------------------------------
        DefaultMutableTreeNode node = (DefaultMutableTreeNode)restaurantes.getLastSelectedPathComponent();
        if ((node != null) && (node.isLeaf())){
            restSelected=(DataRestaurante)node.getUserObject();


            this.direccionRestaurante.setText(restSelected.getDireccion().getCalle());
            this.mailRestaurante.setText(restSelected.getMail());
            this.nicknameRestaurante.setText(restSelected.getNickname());
            this.nombreRestaurante.setText(restSelected.getNombre());

            ArrayList<DataProducto> productos=restSelected.getDataProductos();
             
            modeloProductos.clear();
            for (DataProducto p : productos){
                modeloProductos.addElement(p);
            }
             
            if (this.restSelected.getRutaImagen() == null){
               Image image = Toolkit.getDefaultToolkit().createImage(propiedades.getProperty("restoPorDefecto"));
               Icon warnIcon = new ImageIcon(image.getScaledInstance(imagenRestaurante.getWidth(), imagenRestaurante.getHeight(), image.SCALE_DEFAULT));
               imagenRestaurante.setIcon(warnIcon);
               imagenRestaurante.validate();
               System.out.println("Carga la por defecto"+propiedades.getProperty("restoPorDefecto"));
            }
            else{
               Image image = Toolkit.getDefaultToolkit().createImage(this.restSelected.getRutaImagen()[0]);
               Icon warnIcon = new ImageIcon(image.getScaledInstance(imagenRestaurante.getWidth(), imagenRestaurante.getHeight(), image.SCALE_DEFAULT));
               imagenRestaurante.setIcon(warnIcon);
               imagenRestaurante.validate();
            }
            
                   
        }        // TODO add your handling code here:
    }//GEN-LAST:event_restaurantesMouseClicked

    private void productosRestauranteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosRestauranteMouseClicked

    }//GEN-LAST:event_productosRestauranteMouseClicked

    private void verInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verInfoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_verInfoMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VerInformacionDeProducto f = new VerInformacionDeProducto();
        jDesktopPane1.add(f);
        f.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        VIDR = false;
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel direccionRestaurante;
    private javax.swing.JLabel imagenRestaurante;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mailRestaurante;
    private javax.swing.JLabel nicknameRestaurante;
    private javax.swing.JLabel nombreRestaurante;
    public static javax.swing.JList productosRestaurante;
    public static DefaultListModel modeloProductos;
    public static javax.swing.JTree restaurantes;
    private javax.swing.JPopupMenu verInfo;
    // End of variables declaration//GEN-END:variables
}
