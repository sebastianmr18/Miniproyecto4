/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author jsmr0
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        System.out.println("xd");
    }

    public javax.swing.JButton getBotonAsignarProducto() {
        return BotonAsignarProducto;
    }

    public void setBotonAsignarProducto(javax.swing.JButton BotonAsignarProducto) {
        this.BotonAsignarProducto = BotonAsignarProducto;
    }

    public javax.swing.JButton getBotonAñadirCliente() {
        return BotonAñadirCliente;
    }

    public void setBotonAñadirCliente(javax.swing.JButton BotonAñadirCliente) {
        this.BotonAñadirCliente = BotonAñadirCliente;
    }

    public javax.swing.JButton getBotonAñadirProductos() {
        return BotonAñadirProductos;
    }

    public void setBotonAñadirProductos(javax.swing.JButton BotonAñadirProductos) {
        this.BotonAñadirProductos = BotonAñadirProductos;
    }

    public javax.swing.JButton getBotonAñadirProveedor() {
        return BotonAñadirProveedor;
    }

    public void setBotonAñadirProveedor(javax.swing.JButton BotonAñadirProveedor) {
        this.BotonAñadirProveedor = BotonAñadirProveedor;
    }

    public javax.swing.JButton getBotonComprar() {
        return BotonComprar;
    }

    public void setBotonComprar(javax.swing.JButton BotonComprar) {
        this.BotonComprar = BotonComprar;
    }

    public javax.swing.JButton getBotonVender() {
        return BotonVender;
    }

    public void setBotonVender(javax.swing.JButton BotonVender) {
        this.BotonVender = BotonVender;
    }    
    
    public void getCerrarVentana(){
        dispose();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelContenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotonAñadirProveedor = new javax.swing.JButton();
        BotonAñadirProductos = new javax.swing.JButton();
        BotonAñadirCliente = new javax.swing.JButton();
        BotonVender = new javax.swing.JButton();
        BotonAsignarProducto = new javax.swing.JButton();
        BotonComprar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 900));

        PanelContenido.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Supermercado Univalle");

        BotonAñadirProveedor.setText("añadir proveedor");
        BotonAñadirProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirProveedorActionPerformed(evt);
            }
        });

        BotonAñadirProductos.setText("añadir producto");
        BotonAñadirProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirProductosActionPerformed(evt);
            }
        });

        BotonAñadirCliente.setText("añadir cliente");

        BotonVender.setText("vender");

        BotonAsignarProducto.setText("asignar producto");

        BotonComprar.setText("comprar");

        javax.swing.GroupLayout PanelContenidoLayout = new javax.swing.GroupLayout(PanelContenido);
        PanelContenido.setLayout(PanelContenidoLayout);
        PanelContenidoLayout.setHorizontalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BotonAñadirProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonAñadirProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(BotonAñadirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BotonAsignarProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonComprar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonVender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );
        PanelContenidoLayout.setVerticalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAsignarProducto)
                    .addComponent(BotonAñadirProveedor))
                .addGap(88, 88, 88)
                .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonComprar)
                    .addComponent(BotonAñadirProductos))
                .addGap(88, 88, 88)
                .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonVender)
                    .addComponent(BotonAñadirCliente))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAñadirProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirProveedorActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonAñadirProveedorActionPerformed

    private void BotonAñadirProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirProductosActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonAñadirProductosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAsignarProducto;
    private javax.swing.JButton BotonAñadirCliente;
    private javax.swing.JButton BotonAñadirProductos;
    private javax.swing.JButton BotonAñadirProveedor;
    private javax.swing.JButton BotonComprar;
    private javax.swing.JButton BotonVender;
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}