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
public class VentanaVender extends javax.swing.JFrame {
    DefaultTableModel dtm;
    DefaultComboBoxModel dcbm = new DefaultComboBoxModel();    

    /**
     * Creates new form Vender
     */
    public VentanaVender() {
        this.dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        initComponents();       
    }
    
    public void crearTabla(){
        String[] titulo=new String[]{"Cliente", "Producto","Proveedor",
            "Cantidad", "Precio"};
        dtm.setColumnIdentifiers(titulo);
        TablaVentas.setModel(dtm); 
    }   
    public void llenarTabla(){
        dtm.addRow(new Object[]{
            getCliente(),
            getProductos(),
            getProveedor(),            
            getCantidad(),
            getPrecio()
        });
    }    
    
    public String getCliente(){
        return (String) ComboClientes.getSelectedItem();
    }
    
    public String getProductos(){
        return (String) ComboProducto.getSelectedItem();
    }    
        
    public String getCantidad(){
        return (String) ComboCantidad.getSelectedItem();
    }
    
    public String getProveedor() {
        return (String)ComboProveedor.getSelectedItem();
    }    
    
    public String getPrecio(){
        return (String)ComboPrecio.getSelectedItem();
    }
    
    public DefaultComboBoxModel getDcbm() {
        return dcbm;
    }

    public void setDcbm(DefaultComboBoxModel dcbm) {
        this.dcbm = dcbm;
    }

    public void setDtm(DefaultTableModel dtm) {
        this.dtm = dtm;
    }    

    public DefaultTableModel getDtm() {
        return dtm;
    }
    
    public javax.swing.JButton getBotonRegresar() {
        return BotonRegresar;
    }

    public void setBotonRegresar(javax.swing.JButton BotonRegresar) {
        this.BotonRegresar = BotonRegresar;
    }

    public javax.swing.JLabel getLabelProveedor() {
        return LabelProveedor;
    }
    
    public javax.swing.JComboBox<String> getComboClientes() {
        return ComboClientes;
    }

    public void setComboClientes(javax.swing.JComboBox<String> ComboClientes) {
        this.ComboClientes = ComboClientes;
    }

    public javax.swing.JComboBox<String> getComboProducto() {
        return ComboProducto;
    }

    public void setComboProducto(javax.swing.JComboBox<String> ComboProducto) {
        this.ComboProducto = ComboProducto;
    }

    public javax.swing.JLabel getLabelCantidad() {
        return LabelCantidad;
    }

    public void setLabelCantidad(javax.swing.JLabel LabelCantidad) {
        this.LabelCantidad = LabelCantidad;
    }

    public javax.swing.JLabel getLabelCliente() {
        return LabelCliente;
    }

    public void setLabelCliente(javax.swing.JLabel LabelCliente) {
        this.LabelCliente = LabelCliente;
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

    public javax.swing.JPanel getPanelDatos() {
        return PanelDatos;
    }

    public void setPanelDatos(javax.swing.JPanel PanelDatos) {
        this.PanelDatos = PanelDatos;
    }

    public javax.swing.JComboBox getComboCantidad() {
        return ComboCantidad;
    }

    public void setComboCantidad(javax.swing.JComboBox ComboCantidad) {
        this.ComboCantidad = ComboCantidad;
    }

    public javax.swing.JTable getTablaVentas() {
        return TablaVentas;
    }

    public void setTablaVentas(javax.swing.JTable TablaVentas) {
        this.TablaVentas = TablaVentas;
    }

    public javax.swing.JComboBox getComboProveedor() {
        return ComboProveedor;
    }

    public void setTextoPrecio(javax.swing.JComboBox ComboProveedor) {
        this.ComboProveedor = ComboProveedor;
    }

    public javax.swing.JButton getBotonVender() {
        return BotonVender;
    }

    public void setBotonVender(javax.swing.JButton BotonVender) {
        this.BotonVender = BotonVender;
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
        ComboClientes = new javax.swing.JComboBox<>();
        LabelCliente = new javax.swing.JLabel();
        LabelProducto = new javax.swing.JLabel();
        ComboProducto = new javax.swing.JComboBox<>();
        LabelProveedor = new javax.swing.JLabel();
        LabelPrecio = new javax.swing.JLabel();
        LabelCantidad = new javax.swing.JLabel();
        ComboCantidad = new javax.swing.JComboBox<>();
        ComboPrecio = new javax.swing.JComboBox<>();
        ComboProveedor = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();
        BotonRegresar = new javax.swing.JButton();
        BotonVender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 500));

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar venta");

        PanelDatos.setBackground(new java.awt.Color(0, 51, 204));

        LabelCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        LabelCliente.setText("Cliente:");

        LabelProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LabelProducto.setForeground(new java.awt.Color(255, 255, 255));
        LabelProducto.setText("Producto:");

        LabelProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LabelProveedor.setForeground(new java.awt.Color(255, 255, 255));
        LabelProveedor.setText("Proveedor:");

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
                .addGap(30, 30, 30)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addComponent(LabelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelProducto)
                            .addComponent(LabelCantidad)
                            .addComponent(LabelProveedor)
                            .addComponent(LabelPrecio))
                        .addGap(30, 30, 30)
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboProducto, 0, 100, Short.MAX_VALUE)
                            .addComponent(ComboCantidad, 0, 100, Short.MAX_VALUE)
                            .addComponent(ComboPrecio, 0, 100, Short.MAX_VALUE)
                            .addComponent(ComboProveedor, 0, 100, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCliente)
                    .addComponent(ComboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelProducto)
                    .addComponent(ComboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelProveedor)
                    .addComponent(ComboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCantidad)
                    .addComponent(ComboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPrecio)
                    .addComponent(ComboPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        TablaVentas.setBackground(new java.awt.Color(0, 204, 255));
        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaVentas.setEnabled(false);
        TablaVentas.getTableHeader().setResizingAllowed(false);
        TablaVentas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaVentas);

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

        BotonVender.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BotonVender.setText("Vender");
        BotonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(PanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonRegresar)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel1)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonRegresar)
                            .addComponent(BotonVender)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void BotonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVenderActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVender().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JButton BotonVender;
    private javax.swing.JComboBox<String> ComboCantidad;
    private javax.swing.JComboBox<String> ComboClientes;
    private javax.swing.JComboBox<String> ComboPrecio;
    private javax.swing.JComboBox<String> ComboProducto;
    private javax.swing.JComboBox<String> ComboProveedor;
    private javax.swing.JLabel LabelCantidad;
    private javax.swing.JLabel LabelCliente;
    private javax.swing.JLabel LabelPrecio;
    private javax.swing.JLabel LabelProducto;
    private javax.swing.JLabel LabelProveedor;
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JTable TablaVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
