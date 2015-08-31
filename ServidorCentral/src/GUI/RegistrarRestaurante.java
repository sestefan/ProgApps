/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import datatype.DataCategoria;
import controlador.ControladorCategoria;
import datatype.DataDireccion;
import fabrica.Fabrica;
import interfaces.IControladorCategoria;
import interfaces.IControladorUsuario;
import java.io.File;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author Mathi
 */
public class RegistrarRestaurante extends javax.swing.JInternalFrame {
    private 

        String nick;
        String nombre;
        String mail;
        DataDireccion direccion;
        String password;
        String confirmaPassword;

        
        List<String> imagenes = new ArrayList<String>();
        String[] lasImagenes = new String[imagenes.size()];


        
        
        List<DataCategoria> listaCategorias;
        IControladorCategoria cCat;
        DefaultListModel modeloLista;
   

    /**
     * Creates new form RegistrarRestaurante
     */
    public RegistrarRestaurante() {
        //imagenes= new ArrayList(); 
        
        modeloLista = new DefaultListModel();
        cCat=new ControladorCategoria();

        listaCategorias=cCat.listarCategorias();
        
        if (listaCategorias != null) {
            for (DataCategoria current : listaCategorias) {
                modeloLista.addElement(current.getNombre());
            }

            initComponents();
            
        }else JOptionPane.showMessageDialog(this, "No hay categorías cargadas para dar de alta un Restaurante", this.getTitle(), JOptionPane.WARNING_MESSAGE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNickname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabelNick = new javax.swing.JLabel();
        jLabelMail = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jPasswordFieldRePass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jButtonImages = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCategorias = new javax.swing.JList();
        jButtonCancelar = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();

        setTitle("Registrar Restaurante");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Ingrese los siguientes datos:");

        jLabel1.setText("NickName");

        jLabel3.setText("Correo");

        jLabelNick.setForeground(new java.awt.Color(255, 0, 0));
        jLabelNick.setText("Nick no válido");

        jLabelMail.setForeground(new java.awt.Color(255, 0, 0));
        jLabelMail.setText("Mail no válido");

        jLabel6.setText("Contraseña");

        jLabel7.setText("Confirmar Contraseña");

        jLabel8.setText("Nombre");

        jLabel9.setText("Dirección");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Seleccione las Categorías:");

        jButtonImages.setText("Seleccionar Imágenes");
        jButtonImages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImagesActionPerformed(evt);
            }
        });

        jListCategorias.setModel(modeloLista);
        jScrollPane1.setViewportView(jListCategorias);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonRegistrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNick, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonImages, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonCancelar)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(jButtonRegistrar))))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNickname)
                            .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldPass)
                            .addComponent(jPasswordFieldRePass)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldDireccion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNick)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jPasswordFieldRePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonImages)
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        IControladorUsuario cUsr = Fabrica.getInstance().obtenerControladorUsuario();
        boolean existeUsu,contraseñasIguales,existeNick;
    
    
    nick=jTextFieldNickname.getText();
    nombre=jTextFieldNombre.getText();
    mail=jTextFieldCorreo.getText();
   
    direccion= new DataDireccion(jTextFieldDireccion.getText(),"","");
    password=jPasswordFieldPass.getText();
    confirmaPassword=jPasswordFieldRePass.getText();
    
    
    List<String> selectedCat=jListCategorias.getSelectedValuesList();
    
    if ("".equals(nick) ||"".equals(nombre) ||"".equals(mail) ||"".equals(direccion) || selectedCat.isEmpty()
        ||"".equals(password)||"".equals(confirmaPassword)){
        JOptionPane.showMessageDialog(this, "Complete todos los campos", "", JOptionPane.WARNING_MESSAGE);
    }
    else{
        existeUsu=cUsr.existeUsuario(nick, mail);
        existeNick=cUsr.existeUsuario(nick);
        contraseñasIguales=password.equals(confirmaPassword);
        
        if ( !existeUsu && !existeNick && contraseñasIguales){
            try{
                
                
                Iterator<String> it = selectedCat.iterator();
                while (it.hasNext()) {
                    cUsr.seleccionarCategoria(it.next());
                }
                
                
                cUsr.CargarDatosUsuario(nick, mail, nombre, password, direccion, lasImagenes);
                cUsr.altaUsuario();
                //cUsr.altaRestaurante(nick, nombre, mail, direccion,selectedCat,imagenes,"");
                JOptionPane.showMessageDialog(this, "Restaurante registrado", "", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
            }

        }
        else{
                if (existeNick)
                    jLabelNick.setText("Ya existe usuario con ese Nick");
                else
                    jLabelNick.setText("");
                if (existeUsu && !existeNick)
                    jLabelMail.setText("Ya existe usuario con ese E-Mail");
                else
                    jLabelMail.setText("");
                if (!contraseñasIguales)
                    jLabelMail.setText("Las contraseñas deben ser iguales");
                else
                    jLabelMail.setText("");
            }       
    }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImagesActionPerformed
            FileFilter filter = new FileNameExtensionFilter("Imagenes (.jpg .png)","jpg", "png");

        JFileChooser elegirImagen = new JFileChooser();
        elegirImagen.setMultiSelectionEnabled(rootPaneCheckingEnabled);
        elegirImagen.setAcceptAllFileFilterUsed(false);
        elegirImagen.addChoosableFileFilter(filter);
        int opcion = elegirImagen.showOpenDialog(jButtonImages);
        
        
        if (opcion == JFileChooser.APPROVE_OPTION) {
            File[] f=elegirImagen.getSelectedFiles(); 
            //imagenes.clear();
                
                for (File f1 : f) {
                    imagenes.add(f1.getPath());        
                    imagenes.toArray(lasImagenes);
                    //imagenes.add(f1.getPath());
                }
            
        }
         
    }//GEN-LAST:event_jButtonImagesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonImages;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMail;
    private javax.swing.JLabel jLabelNick;
    private javax.swing.JList jListCategorias;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JPasswordField jPasswordFieldRePass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNickname;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
