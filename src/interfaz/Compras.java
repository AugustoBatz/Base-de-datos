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

public class Compras extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conexion();
    
    public Compras() {
        initComponents();
        this.getContentPane().setBackground(Color.decode("#86592d"));
        mostrarFacturas();
        mostrarProveedores();  
    }

    public void mostrarProveedores()
    {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre:");
        modelo.addColumn("Nit:");
        jTable2.setModel(modelo);
        
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombreprov, nit FROM proveedores");
            
            while(rs.next())
            { 
                String nombre[] = new String[2];
                nombre[0] = rs.getString(1);
                nombre[1] = rs.getString(2);
                modelo.addRow(nombre);
            }
            jTable2.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    public void mostrarFacturas()
    {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Serie y num:");
        modelo.addColumn("NIT del proveedor:");
        modelo.addColumn("Fecha:");
        modelo.addColumn("Tipo de pago:");
        modelo.addColumn("Total:");
        modelo.addColumn("Pagada:");
        jTable1.setModel(modelo);
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT serieynumero, total, fecha, tipopago, proveedores_nit, pagada FROM facturacompra");
            
            String datos[] = new String[6];
            
            while (rs.next())
            {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(5);
                datos[2] = rs.getString(3);
                if (rs.getString(4).equals("0"))
                {
                    datos[3] = "Credito";
                }
                else
                {
                    datos[3] = "Efectivo";
                }
                datos[4] = rs.getString(2);
                if (rs.getString(6).equals("0"))
                {
                    datos[5] = "No pagada";
                }
                else
                {
                    datos[5] = "Pagada";
                }
                modelo.addRow(datos);
            }    
            jTable1.setModel(modelo);     
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Regreso = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Inventario2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Busquedas1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486504353-cart-ecommerce-shop-commerce-supermarket-trolley-shopping_81310.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Compras ");

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

        jLabel23.setText("Seleccionar proveedor:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(jTable2);

        Inventario2.setBackground(new java.awt.Color(255, 255, 255));
        Inventario2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        Inventario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Collaboration_group_people_men_user_team_users-64.png"))); // NOI18N
        Inventario2.setBorder(null);
        Inventario2.setBorderPainted(false);
        Inventario2.setFocusPainted(false);
        Inventario2.setOpaque(false);
        Inventario2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Inventario2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Inventario2MousePressed(evt);
            }
        });
        Inventario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inventario2ActionPerformed(evt);
            }
        });

        jLabel10.setText("o Ingresar nuevo proveedor");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Detalle de factura:");

        jLabel13.setText("Serie:");

        jLabel14.setText("Tipo de pago:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credito", "Efectivo" }));

        jLabel15.setText("Fecha:");

        jButton1.setText("Siguiente");

        jButton2.setText("Siguiente");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel12)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(47, 47, 47)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(752, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane7)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(Inventario2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(364, 364, 364))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(558, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(347, 347, 347))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inventario2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jScrollPane12.setViewportView(jPanel3);

        jTabbedPane1.addTab("Ingreso de factura de compra", jScrollPane12);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane11.setViewportView(jTable1);

        Busquedas1.setBackground(new java.awt.Color(255, 255, 255));
        Busquedas1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        Busquedas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486506270-glass-magnifying-out-search-detective-magnifier-zoom_81489.png"))); // NOI18N
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

        jLabel3.setText("Buscar por: ");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Nombre de Proveedor");
        jRadioButton1.setContentAreaFilled(false);

        jRadioButton2.setText("Nit de Proveedor");

        jRadioButton3.setText("No.Factura");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("O seleccione una factura para: ");

        jButton3.setText("Modificarla");

        jButton4.setText("Eliminarla");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Mostrar su informacion");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Busquedas1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(64, 64, 64)
                                .addComponent(jButton4)
                                .addGap(60, 60, 60)
                                .addComponent(jButton5))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton3))
                    .addComponent(Busquedas1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jButton5))
                    .addComponent(jButton3))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane1.addTab("Mostrar facturas de Compra", jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 634, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Regreso)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Regreso, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresoMouseClicked
        Menu i = new Menu ();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresoMouseClicked

    private void Busquedas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Busquedas1MouseClicked

    }//GEN-LAST:event_Busquedas1MouseClicked

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void Inventario2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inventario2MouseClicked
        Proveedores p = new Proveedores(1);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Inventario2MouseClicked

    private void Inventario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inventario2ActionPerformed
        
    }//GEN-LAST:event_Inventario2ActionPerformed

    private void Inventario2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inventario2MousePressed
       
    }//GEN-LAST:event_Inventario2MousePressed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        
        if (jTable2.getSelectedRow() == -1 || jTextField3.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un proveedor e ingrese todos los datos.");
        }
        else
        {
            int NoValido = 0;
            
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT serieynumero FROM facturacompra");

                while(rs.next())
                {
                    if(jTextField3.getText().equals(rs.getString(1)))
                    {
                        NoValido = 1;
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (NoValido == 0)
            {
                String nitprov, factserie, pag;
                String fecha = "20180101";
                int filaelegida, pagada;

                filaelegida = jTable2.getSelectedRow();
                nitprov = jTable2.getValueAt(filaelegida, 1).toString();
                factserie = jTextField3.getText();
                pagada = jComboBox1.getSelectedIndex();
                pag = String.valueOf(pagada);

                try 
                {
                    PreparedStatement insertarDatos = cn.prepareStatement("INSERT INTO facturacompra(serieynumero,total,fecha,tipopago,proveedores_nit,pagada) VALUES(?,?,?,?,?,?)");
                    insertarDatos.setString(1, factserie);
                    insertarDatos.setString(2, "0");
                    insertarDatos.setString(3, fecha);
                    insertarDatos.setString(4, pag);
                    insertarDatos.setString(5, nitprov);
                    if (pagada == 0) 
                    {
                        insertarDatos.setString(6, "0");
                    }
                    else
                    {
                        insertarDatos.setString(6, "1");
                    }
                    insertarDatos.executeUpdate();

                } catch (SQLException ex) {
                    Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
                }

                SeleccionProductos s = new SeleccionProductos(1,factserie,0);
                s.setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Serie de factura ya ingresada. Por favor introduzca otro dato.");
            }
        }
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        
        if (jTable1.getSelectedRow() > -1)
        {
            String nofactura = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            try {
                PreparedStatement BorrarDetalle = cn.prepareStatement("DELETE FROM detallecompra WHERE 	facturacompra_serieynumero = '"+nofactura+"'");
                BorrarDetalle.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            try {
                PreparedStatement BorrarFactura = cn.prepareStatement("DELETE FROM facturacompra WHERE serieynumero = '"+nofactura+"'");
                BorrarFactura.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Factura borrada.");
            mostrarFacturas();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una factura.");
        }
        
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        
        if (jTable1.getSelectedRow() != -1)
        {
            String fac = jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
            String tot = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
            MostrarFactura ms = new MostrarFactura(fac,tot);
            ms.setVisible(true);
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Por favor selecione un producto.");
        }
        
    }//GEN-LAST:event_jButton5MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Busquedas1;
    private javax.swing.JButton Inventario2;
    private javax.swing.JButton Regreso;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
