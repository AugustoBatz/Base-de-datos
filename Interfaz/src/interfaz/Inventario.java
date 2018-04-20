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

public class Inventario extends javax.swing.JFrame {
    
    Conexion con = new Conexion();
    Connection cn = con.conexion();
    
    public Inventario() {
        initComponents();
        this.getContentPane().setBackground(Color.ORANGE);
        mostrarProductos();
        jButton3.setVisible(false);
    }
    
    void mostrarProductos()
    {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("No. Producto:");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio de venta:");
        modelo.addColumn("Marca:");
        modelo.addColumn("Existencia:");
        modelo.addColumn("Precio de compra:");
        jTable1.setModel(modelo);
        
        String datos[] = new String [6];
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT *FROM producto");
            while(rs.next())
            {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(4);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(5);
                datos[4] = rs.getString(2);
                datos[5] = rs.getString(6);
                modelo.addRow(datos);
            }
            jTable1.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Regreso = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        Busqueda = new javax.swing.JTextField();
        Busquedas = new javax.swing.JButton();
        Busquedas1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/List.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Inventario ");

        Regreso.setBackground(new java.awt.Color(255, 255, 255));
        Regreso.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        Regreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486504328-bullet-list-menu-lines-points-items-options_81334.png"))); // NOI18N
        Regreso.setBorder(null);
        Regreso.setBorderPainted(false);
        Regreso.setFocusPainted(false);
        Regreso.setOpaque(false);
        Regreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresoMouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Nombre");
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Existencia");
        jRadioButton2.setContentAreaFilled(false);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Marca");
        jRadioButton3.setContentAreaFilled(false);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Precio de venta");
        jRadioButton4.setContentAreaFilled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Busqueda por: ");

        Busquedas.setBackground(new java.awt.Color(255, 255, 255));
        Busquedas.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        Busquedas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486506270-glass-magnifying-out-search-detective-magnifier-zoom_81489.png"))); // NOI18N
        Busquedas.setToolTipText("");
        Busquedas.setBorder(null);
        Busquedas.setBorderPainted(false);
        Busquedas.setFocusPainted(false);
        Busquedas.setOpaque(false);
        Busquedas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusquedasMouseClicked(evt);
            }
        });

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

        jLabel8.setText("Ingresar Producto");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Regresar al menu");

        jLabel4.setText("O seleccione un producto para:");

        jButton1.setText("Modificarlo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Eliminarlo");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel5.setText("*Advertencia: Borrar un producto tambien borrara sus ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel6.setText("registros de compras y ventas en las facturas.");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Precio de compra");
        jRadioButton5.setContentAreaFilled(false);

        jButton3.setText("Mostrar todos los productos");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(56, 56, 56)
                                        .addComponent(jButton2))
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Busquedas1)))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Regreso))
                                    .addComponent(jLabel3)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Busquedas))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton5)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Busquedas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addComponent(Busquedas1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(Regreso))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresoMouseClicked
        Menu i = new Menu ();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresoMouseClicked

    private void BusquedasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedasMouseClicked
       
        if (jRadioButton1.isSelected())
        {
            try 
            {
                DefaultTableModel ModBusqueda = new DefaultTableModel();
                ModBusqueda.addColumn("No. Producto:");
                ModBusqueda.addColumn("Nombre");
                ModBusqueda.addColumn("Precio de venta:");
                ModBusqueda.addColumn("Marca:");
                ModBusqueda.addColumn("Existencia:");
                ModBusqueda.addColumn("Precio de compra:");
                jTable1.setModel(ModBusqueda);

                String datos[] = new String [6];
                
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT *FROM producto WHERE nombre = '"+Busqueda.getText()+"' ");
                while(rs.next())
                {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(4);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(5);
                    datos[4] = rs.getString(2);
                    datos[5] = rs.getString(6);
                    ModBusqueda.addRow(datos);
                }
                jTable1.setModel(ModBusqueda);
                jButton3.setVisible(true);

            } catch (SQLException ex) {
                Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (jRadioButton2.isSelected())
        {
            try 
            {
                DefaultTableModel ModBusqueda = new DefaultTableModel();
                ModBusqueda.addColumn("No. Producto:");
                ModBusqueda.addColumn("Nombre");
                ModBusqueda.addColumn("Precio de venta:");
                ModBusqueda.addColumn("Marca:");
                ModBusqueda.addColumn("Existencia:");
                ModBusqueda.addColumn("Precio de compra:");
                jTable1.setModel(ModBusqueda);

                String datos[] = new String [6];
                
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT *FROM producto WHERE existencia = '"+Busqueda.getText()+"' ");
                while(rs.next())
                {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(4);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(5);
                    datos[4] = rs.getString(2);
                    datos[5] = rs.getString(6);
                    ModBusqueda.addRow(datos);
                }
                jTable1.setModel(ModBusqueda);
                jButton3.setVisible(true);

            } catch (SQLException ex) {
                Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (jRadioButton3.isSelected())
        {
            try 
            {
                DefaultTableModel ModBusqueda = new DefaultTableModel();
                ModBusqueda.addColumn("No. Producto:");
                ModBusqueda.addColumn("Nombre");
                ModBusqueda.addColumn("Precio de venta:");
                ModBusqueda.addColumn("Marca:");
                ModBusqueda.addColumn("Existencia:");
                ModBusqueda.addColumn("Precio de compra:");
                jTable1.setModel(ModBusqueda);

                String datos[] = new String [6];
                
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT *FROM producto WHERE marca = '"+Busqueda.getText()+"' ");
                while(rs.next())
                {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(4);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(5);
                    datos[4] = rs.getString(2);
                    datos[5] = rs.getString(6);
                    ModBusqueda.addRow(datos);
                }
                jTable1.setModel(ModBusqueda);
                jButton3.setVisible(true);

            } catch (SQLException ex) {
                Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (jRadioButton4.isSelected())
        {
            try 
            {
                DefaultTableModel ModBusqueda = new DefaultTableModel();
                ModBusqueda.addColumn("No. Producto:");
                ModBusqueda.addColumn("Nombre");
                ModBusqueda.addColumn("Precio de venta:");
                ModBusqueda.addColumn("Marca:");
                ModBusqueda.addColumn("Existencia:");
                ModBusqueda.addColumn("Precio de compra:");
                jTable1.setModel(ModBusqueda);

                String datos[] = new String [6];
                
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT *FROM producto WHERE preciostock = '"+Busqueda.getText()+"' ");
                while(rs.next())
                {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(4);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(5);
                    datos[4] = rs.getString(2);
                    datos[5] = rs.getString(6);
                    ModBusqueda.addRow(datos);
                }
                jTable1.setModel(ModBusqueda);
                jButton3.setVisible(true);

            } catch (SQLException ex) {
                Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (jRadioButton5.isSelected())
        {
            try 
            {
                DefaultTableModel ModBusqueda = new DefaultTableModel();
                ModBusqueda.addColumn("No. Producto:");
                ModBusqueda.addColumn("Nombre");
                ModBusqueda.addColumn("Precio de venta:");
                ModBusqueda.addColumn("Marca:");
                ModBusqueda.addColumn("Existencia:");
                ModBusqueda.addColumn("Precio de compra:");
                jTable1.setModel(ModBusqueda);

                String datos[] = new String [6];
                
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT *FROM producto WHERE preciocompra = '"+Busqueda.getText()+"' ");
                while(rs.next())
                {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(4);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(5);
                    datos[4] = rs.getString(2);
                    datos[5] = rs.getString(6);
                    ModBusqueda.addRow(datos);
                }
                jTable1.setModel(ModBusqueda);
                jButton3.setVisible(true);

            } catch (SQLException ex) {
                Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Por favor marque una casilla de busqueda.");
        }
        
    }//GEN-LAST:event_BusquedasMouseClicked

    private void Busquedas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Busquedas1MouseClicked
       Ingresoinventario i = new Ingresoinventario(0,0,"",0); 
       i.setVisible(true);
       this.dispose(); 
    }//GEN-LAST:event_Busquedas1MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
            
        if (jTable1.getSelectedRow() > -1)
        {
            String noproducto = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();

            try {
                PreparedStatement BorrarCompras = cn.prepareStatement("DELETE FROM detallecompra WHERE producto_idprod = '"+noproducto+"'");
                BorrarCompras.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                PreparedStatement BorrarVentas = cn.prepareStatement("DELETE FROM detalleventa WHERE producto_idprod = '"+noproducto+"'");
                BorrarVentas.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                PreparedStatement BorrarFactura = cn.prepareStatement("DELETE FROM producto WHERE idprod = '"+noproducto+"'");
                BorrarFactura.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Producto borrado.");
            mostrarProductos();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un producto.");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        if (jTable1.getSelectedRow() > -1)
        {
            String Id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            String Nombre = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
            String PrecioVenta = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
            String Marca = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
            String Existencia = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
            String PrecioCompra = jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString();
            
            ModificarProductos mp = new ModificarProductos(Id,Nombre,PrecioVenta,Marca, Existencia, PrecioCompra);
            mp.setVisible(true);
            this.dispose();
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un proveedor.");
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        mostrarProductos();
        jButton3.setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Busqueda;
    private javax.swing.JButton Busquedas;
    private javax.swing.JButton Busquedas1;
    private javax.swing.JButton Regreso;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
