/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 * Autor(es):Juan Sebastian Muñoz Rojas <juan.munoz.rojas@correounivalle.edu.co> 
              Carol Sofia Rubiano Valderrama <carol.rubiano@correounivalle.edu.co>  
 * 
 */
public class VentanaComprar extends javax.swing.JFrame {
    DefaultTableModel dtm;
    DefaultComboBoxModel dcbm  = new DefaultComboBoxModel();
    /**
     * Creates new form VentanaComprar
     */
    public VentanaComprar() {
        this.dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };        
        initComponents();
    }
    public void crearTabla(){
        String[] titulo=new String[]{"Proveedor", "Producto", "Cantidad", "Precio"};
        dtm.setColumnIdentifiers(titulo);
        TablaCompras.setModel(dtm);      
    }   
    
    public void llenarTabla(){
        dtm.addRow(new Object[]{
            getProveedores(),
            getProducto(),
            getCantidad(),
            getPrecio()
        });
    }     
    
    public DefaultComboBoxModel getDcbm() {
        return dcbm;
    }

    public void setDcbm(DefaultComboBoxModel dcbm) {
        this.dcbm = dcbm;
    }
    
    public javax.swing.JButton getBotonComprar() {
        return BotonComprar;
    }

    public void setBotonComprar(javax.swing.JButton BotonComprar) {
        this.BotonComprar = BotonComprar;
    }

    public javax.swing.JButton getBotonRegresar() {
        return BotonRegresar;
    }

    public void setBotonRegresar(javax.swing.JButton BotonRegresar) {
        this.BotonRegresar = BotonRegresar;
    }

    public String getCantidad() {
        return (String) getComboCantidad().getSelectedItem();
    }

    public void setComboCantidad(javax.swing.JComboBox<String> ComboCantidad) {
        this.ComboCantidad = ComboCantidad;
    }

    public String getProducto() {
        return (String) getComboProducto().getSelectedItem();
    }

    public void setComboProducto(javax.swing.JComboBox<String> ComboProducto) {
        this.ComboProducto = ComboProducto;
    }

    public String getProveedores() {
        return (String) getComboProveedores().getSelectedItem();
    }

    public void setComboProveedores(javax.swing.JComboBox<String> ComboProveedores) {
        this.ComboProveedores = ComboProveedores;
    }

    public javax.swing.JLabel getLabelCantidad() {
        return LabelCantidad;
    }

    public void setLabelCantidad(javax.swing.JLabel LabelCantidad) {
        this.LabelCantidad = LabelCantidad;
    }

    public javax.swing.JLabel getLabelPrecio() {
        return LabelPrecio;
    }

    public void setLabelPrecio(javax.swing.JLabel LabelPrecio) {
        this.LabelPrecio = LabelPrecio;
    }

    public javax.swing.JLabel getLabelProducto() {
        return LabelProducto;
    }

    public void setLabelProducto(javax.swing.JLabel LabelProducto) {
        this.LabelProducto = LabelProducto;
    }

    public javax.swing.JLabel getLabelProveedor() {
        return LabelProveedor;
    }

    public void setLabelProveedor(javax.swing.JLabel LabelProveedor) {
        this.LabelProveedor = LabelProveedor;
    }

    public javax.swing.JPanel getPanelDatos() {
        return PanelDatos;
    }

    public void setPanelDatos(javax.swing.JPanel PanelDatos) {
        this.PanelDatos = PanelDatos;
    }

    public javax.swing.JTable getTablaCompras() {
        return TablaCompras;
    }

    public void setTablaCompras(javax.swing.JTable TablaCompras) {
        this.TablaCompras = TablaCompras;
    }
    
    public javax.swing.JComboBox<String> getComboPrecio() {
        return ComboPrecio;
    }

    public void setComboPrecio(javax.swing.JComboBox<String> ComboPrecio) {
        this.ComboPrecio = ComboPrecio;
    }

    public String getPrecio(){
        return (String)ComboPrecio.getSelectedItem();
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
        jLabel1 = new javax.swing.JLabel();
        PanelDatos = new javax.swing.JPanel();
        ComboProveedores = new javax.swing.JComboBox<>();
        LabelProveedor = new javax.swing.JLabel();
        LabelProducto = new javax.swing.JLabel();
        ComboProducto = new javax.swing.JComboBox<>();
        LabelPrecio = new javax.swing.JLabel();
        LabelCantidad = new javax.swing.JLabel();
        ComboCantidad = new javax.swing.JComboBox<>();
        ComboPrecio = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCompras = new javax.swing.JTable();
        BotonRegresar = new javax.swing.JButton();
        BotonComprar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Comprar producto");

        PanelDatos.setBackground(new java.awt.Color(0, 0, 204));

        LabelProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LabelProveedor.setForeground(new java.awt.Color(255, 255, 255));
        LabelProveedor.setText("Proveedor:");

        LabelProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LabelProducto.setForeground(new java.awt.Color(255, 255, 255));
        LabelProducto.setText("Producto:");

        LabelPrecio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LabelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        LabelPrecio.setText("Precio:");

        LabelCantidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LabelCantidad.setForeground(new java.awt.Color(255, 255, 255));
        LabelCantidad.setText("Cantidad:");

        ComboCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));

        ComboPrecio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1000", "2000", "3000", "4000", "5000", "6000", "7000", "8000", "9000", "10000", "11000", "12000", "13000", "14000", "15000", "16000", "17000", "18000", "19000", "20000", "21000", "22000", "23000", "24000", "25000", "26000", "27000", "28000", "29000", "30000", "31000", "32000", "33000", "34000", "35000", "36000", "37000", "38000", "39000", "40000", "41000", "42000", "43000", "44000", "45000", "46000", "47000", "48000", "49000", "50000" }));

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addComponent(LabelProveedor)
                        .addGap(36, 36, 36)
                        .addComponent(ComboProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelProducto)
                            .addComponent(LabelCantidad)
                            .addComponent(LabelPrecio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboProducto, 0, 100, Short.MAX_VALUE)
                            .addComponent(ComboCantidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboPrecio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelProveedor)
                    .addComponent(ComboProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelProducto)
                    .addComponent(ComboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCantidad)
                    .addComponent(ComboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPrecio)
                    .addComponent(ComboPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        TablaCompras.setBackground(new java.awt.Color(0, 204, 255));
        TablaCompras.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaCompras.getTableHeader().setResizingAllowed(false);
        TablaCompras.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaCompras);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
        );

        BotonRegresar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BotonRegresar.setText("Volver a inicio");
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });

        BotonComprar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BotonComprar.setText("Comprar");
        BotonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(BotonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(PanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 235, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(234, 234, 234))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonComprar)
                            .addComponent(BotonRegresar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void BotonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonComprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonComprarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaComprar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonComprar;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JComboBox<String> ComboCantidad;
    private javax.swing.JComboBox<String> ComboPrecio;
    private javax.swing.JComboBox<String> ComboProducto;
    private javax.swing.JComboBox<String> ComboProveedores;
    private javax.swing.JLabel LabelCantidad;
    private javax.swing.JLabel LabelPrecio;
    private javax.swing.JLabel LabelProducto;
    private javax.swing.JLabel LabelProveedor;
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JTable TablaCompras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JComboBox<String> getComboCantidad() {
        return ComboCantidad;
    }

    public javax.swing.JComboBox<String> getComboProducto() {
        return ComboProducto;
    }

    public javax.swing.JComboBox<String> getComboProveedores() {
        return ComboProveedores;
    }

}
