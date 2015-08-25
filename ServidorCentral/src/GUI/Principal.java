/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Mathi
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        menu = new javax.swing.JMenuBar();
        inicio = new javax.swing.JMenu();
        generarPedido = new javax.swing.JMenuItem();
        cancelarPedido = new javax.swing.JMenuItem();
        actualizarEstadoPedido = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        actualizarProducto = new javax.swing.JMenuItem();
        registro = new javax.swing.JMenu();
        registrarCliente = new javax.swing.JMenuItem();
        registrarRestaurante = new javax.swing.JMenuItem();
        registrarProducto = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        altaCategoria = new javax.swing.JMenuItem();
        informacion = new javax.swing.JMenu();
        verInfoCliente = new javax.swing.JMenuItem();
        verInfoRestaurante = new javax.swing.JMenuItem();
        verInfoProducto = new javax.swing.JMenuItem();
        verInfoPedido = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setSize(new java.awt.Dimension(1024, 768));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );

        inicio.setText("Inicio");

        generarPedido.setText("Generar Pedido");
        generarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarPedidoActionPerformed(evt);
            }
        });
        inicio.add(generarPedido);

        cancelarPedido.setText("Cancelar Pedido");
        cancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarPedidoActionPerformed(evt);
            }
        });
        inicio.add(cancelarPedido);

        actualizarEstadoPedido.setText("Actualizar Estado del Pedido");
        actualizarEstadoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarEstadoPedidoActionPerformed(evt);
            }
        });
        inicio.add(actualizarEstadoPedido);
        inicio.add(jSeparator1);

        actualizarProducto.setText("Actualizar Producto");
        actualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarProductoActionPerformed(evt);
            }
        });
        inicio.add(actualizarProducto);

        menu.add(inicio);

        registro.setText("Registro");

        registrarCliente.setText("Registrar Cliente");
        registrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarClienteActionPerformed(evt);
            }
        });
        registro.add(registrarCliente);

        registrarRestaurante.setText("Registrar Restaurante");
        registrarRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarRestauranteActionPerformed(evt);
            }
        });
        registro.add(registrarRestaurante);

        registrarProducto.setText("Registrar Producto");
        registrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarProductoActionPerformed(evt);
            }
        });
        registro.add(registrarProducto);
        registro.add(jSeparator2);

        altaCategoria.setText("Alta Categoría");
        altaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaCategoriaActionPerformed(evt);
            }
        });
        registro.add(altaCategoria);

        menu.add(registro);

        informacion.setText("Información");

        verInfoCliente.setText("Ver Información de Cliente");
        verInfoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verInfoClienteActionPerformed(evt);
            }
        });
        informacion.add(verInfoCliente);

        verInfoRestaurante.setText("Ver Información de Restaurante");
        verInfoRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verInfoRestauranteActionPerformed(evt);
            }
        });
        informacion.add(verInfoRestaurante);

        verInfoProducto.setText("Ver Información de Producto");
        verInfoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verInfoProductoActionPerformed(evt);
            }
        });
        informacion.add(verInfoProducto);

        verInfoPedido.setText("Ver Información de Pedido");
        verInfoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verInfoPedidoActionPerformed(evt);
            }
        });
        informacion.add(verInfoPedido);

        menu.add(informacion);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarClienteActionPerformed
        RegistrarCliente f = new RegistrarCliente();
        jDesktopPane1.add(f);
        f.show();            
    }//GEN-LAST:event_registrarClienteActionPerformed

    private void registrarRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarRestauranteActionPerformed
        RegistrarRestaurante f = new RegistrarRestaurante();
        jDesktopPane1.add(f);
        f.show();          // TODO add your handling code here:
    }//GEN-LAST:event_registrarRestauranteActionPerformed

    private void altaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaCategoriaActionPerformed
        AltaCategoria f = new AltaCategoria();
        jDesktopPane1.add(f);
        f.show();
    }//GEN-LAST:event_altaCategoriaActionPerformed

    private void registrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarProductoActionPerformed
        RegistrarProducto f = new RegistrarProducto();
        jDesktopPane1.add(f);
        f.show();
    }//GEN-LAST:event_registrarProductoActionPerformed

    private void generarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarPedidoActionPerformed
        GenerarPedido f = new GenerarPedido();
        jDesktopPane1.add(f);
        f.show();
    }//GEN-LAST:event_generarPedidoActionPerformed

    private void cancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarPedidoActionPerformed
        CancelarPedido f = new CancelarPedido();
        jDesktopPane1.add(f);
        f.show();
    }//GEN-LAST:event_cancelarPedidoActionPerformed

    private void actualizarEstadoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarEstadoPedidoActionPerformed
        ActualizarEstadoDelPedido f = new ActualizarEstadoDelPedido();
        jDesktopPane1.add(f);
        f.show();
    }//GEN-LAST:event_actualizarEstadoPedidoActionPerformed

    private void actualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarProductoActionPerformed
        ActualizarProducto f = new ActualizarProducto();
        jDesktopPane1.add(f);
        f.show();
    }//GEN-LAST:event_actualizarProductoActionPerformed

    private void verInfoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verInfoClienteActionPerformed
        VerInformacionDeCliente f = new VerInformacionDeCliente();
        jDesktopPane1.add(f);
        f.show();
    }//GEN-LAST:event_verInfoClienteActionPerformed

    private void verInfoRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verInfoRestauranteActionPerformed
        VerInformacionDeRestaurante f = new VerInformacionDeRestaurante();
        jDesktopPane1.add(f);
        f.show();
    }//GEN-LAST:event_verInfoRestauranteActionPerformed

    private void verInfoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verInfoProductoActionPerformed
        VerInformacionDeProducto f = new VerInformacionDeProducto();
        jDesktopPane1.add(f);
        f.show();
    }//GEN-LAST:event_verInfoProductoActionPerformed

    private void verInfoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verInfoPedidoActionPerformed
        VerInformacionDePedido f = new VerInformacionDePedido();
        jDesktopPane1.add(f);
        f.show();
    }//GEN-LAST:event_verInfoPedidoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actualizarEstadoPedido;
    private javax.swing.JMenuItem actualizarProducto;
    private javax.swing.JMenuItem altaCategoria;
    private javax.swing.JMenuItem cancelarPedido;
    private javax.swing.JMenuItem generarPedido;
    private javax.swing.JMenu informacion;
    private javax.swing.JMenu inicio;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem registrarCliente;
    private javax.swing.JMenuItem registrarProducto;
    private javax.swing.JMenuItem registrarRestaurante;
    private javax.swing.JMenu registro;
    private javax.swing.JMenuItem verInfoCliente;
    private javax.swing.JMenuItem verInfoPedido;
    private javax.swing.JMenuItem verInfoProducto;
    private javax.swing.JMenuItem verInfoRestaurante;
    // End of variables declaration//GEN-END:variables
}
