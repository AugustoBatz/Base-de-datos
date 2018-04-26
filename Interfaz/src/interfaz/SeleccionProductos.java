package interfaz;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SeleccionProductos extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conexion();
    String id;
    String facturaid;
    int Subtotal, noDetalle;
    
    public SeleccionProductos(int noid, String facid, int subtot) 
    {
        initComponents();
        this.getContentPane().setBackground(Color.decode("#86592d"));
        mostrarProductos();
        facturaid = facid;
        id = facid + "." + String.valueOf(noid);    
        Subtotal = subtot;
        noDetalle = noid;
    }

    void mostrarProductos()
    {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("No. Producto:");
        modelo.addColumn("Nombre");
        modelo.addColumn("Existencia:");
        modelo.addColumn("Precio compra:");
        jTable1.setModel(modelo);
        
        String datos[] = new String [4];
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT producto.idprod, producto.nombre, producto.existencia, producto.preciocompra FROM producto");
            while(rs.next())
            {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                modelo.addRow(datos);
            }
            jTable1.setModel(modelo);
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Busquedas1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Siguiente");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Finalizar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Seleccionar un producto:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Busquedas1.setBackground(new java.awt.Color(255, 255, 255));
        Busquedas1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        Busquedas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486504369-change-edit-options-pencil-settings-tools-write_81307.png"))); // NOI18N
        Busquedas1.setToolTipText("");
        Busquedas1.setBorder(null);
        Busquedas1.setBorderPainted(false);
        Busquedas1.setFocusPainted(false);
        Busquedas1.setOpaque(false);
        Busquedas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Busquedas1MouseClicked(evt);
            }
        });

        jLabel2.setText("O ingrese un producto:");

        jLabel3.setText("Ingresar cantidad a comprar:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Busquedas1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Busquedas1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Busquedas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Busquedas1MouseClicked
        Ingresoinventario i = new Ingresoinventario(1,noDetalle, facturaid, Subtotal);
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Busquedas1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        if(jTable1.getSelectedRow() == -1 || jTextField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un producto y eliga la cantidad comprada.");
        }
        else
        {
            int filaelegida = jTable1.getSelectedRow();
            String idprod = jTable1.getValueAt(filaelegida, 0).toString();
            String cantidad = jTextField1.getText();
            int cant = Integer.parseInt(cantidad);
            
            String AntiguaCant = jTable1.getValueAt(filaelegida, 2).toString();
            int antcant = Integer.parseInt(AntiguaCant);
            int NuevaCant = antcant + cant;
            
            int sub;
            String precioprod;
            precioprod = jTable1.getValueAt(filaelegida, 3).toString();
            sub = Integer.parseInt(precioprod); 
            sub = sub*cant;
            Subtotal = Subtotal + sub;
            String subtotal = String.valueOf(sub);
            
//            PreparedStatement actualizarDatos;
//            try {
//                actualizarDatos = cn.prepareStatement("UPDATE producto SET existencia = '"+NuevaCant+"' WHERE idprod = '"+idprod+"'");
//                actualizarDatos.executeUpdate();
//            } catch (SQLException ex) {
//                Logger.getLogger(SeleccionProductos.class.getName()).log(Level.SEVERE, null, ex);
//            }
             
            try 
            {
                PreparedStatement ingresarDatos = cn.prepareStatement("INSERT INTO detallecompra(producto_idprod,facturacompra_serieynumero, id, cantidad, subtotal) VALUES (?,?,?,?,?)");
                ingresarDatos.setString(1, idprod);
                ingresarDatos.setString(2, facturaid);
                ingresarDatos.setString(3, id);
                ingresarDatos.setString(4, cantidad);
                ingresarDatos.setString(5, subtotal);
                ingresarDatos.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(SeleccionProductos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            noDetalle++;
            SeleccionProductos s = new SeleccionProductos(noDetalle, facturaid,Subtotal);
            s.setVisible(true);
            this.dispose();
        } 
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        
        if(jTable1.getSelectedRow() != -1 && jTextField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Factura registrada.");
        }
        else if (jTable1.getSelectedRow() != -1 && !jTextField1.getText().equals(""))
        {
            int filaelegida = jTable1.getSelectedRow();
            String idprod = jTable1.getValueAt(filaelegida, 0).toString();
            String cantidad = jTextField1.getText();
            int cant = Integer.parseInt(cantidad);
            
            int sub;
            String precioprod;
            precioprod = jTable1.getValueAt(filaelegida, 3).toString();
            sub = Integer.parseInt(precioprod); 
            sub = sub*cant;
            Subtotal = Subtotal + sub;
            String subtotal = String.valueOf(sub);
                   
            String AntiguaCant = jTable1.getValueAt(filaelegida, 2).toString();
            int antcant = Integer.parseInt(AntiguaCant);
            int NuevaCant = antcant + cant;
            
//            PreparedStatement actualizarDatos;
//            try {
//                actualizarDatos = cn.prepareStatement("UPDATE producto SET existencia = '"+NuevaCant+"' WHERE idprod = '"+idprod+"'");
//                actualizarDatos.executeUpdate();
//            } catch (SQLException ex) {
//                Logger.getLogger(SeleccionProductos.class.getName()).log(Level.SEVERE, null, ex);
//            }
            
            
            try 
            {
                PreparedStatement ingresarDatos = cn.prepareStatement("INSERT INTO detallecompra(producto_idprod,facturacompra_serieynumero, id, cantidad, subtotal) VALUES (?,?,?,?,?)");
                ingresarDatos.setString(1, idprod);
                ingresarDatos.setString(2, facturaid);
                ingresarDatos.setString(3, id);
                ingresarDatos.setString(4, cantidad);
                ingresarDatos.setString(5, subtotal);
                ingresarDatos.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(SeleccionProductos.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Factura registrada.");
        }  
        else
        {
            JOptionPane.showMessageDialog(null, "Factura registrada.");
        }
        try 
        {
            PreparedStatement ps = cn.prepareStatement("UPDATE facturacompra SET total='"+Subtotal+"' WHERE serieynumero='"+facturaid+"'");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SeleccionProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        Compras c = new Compras();
        c.setVisible(true);
        this.dispose();      
    }//GEN-LAST:event_jButton2MouseClicked

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionProductos(0,"",0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Busquedas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
