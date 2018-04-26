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

public class Ventas extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conexion();
    int ClienteExistente = 0;
    
    public Ventas() {
        initComponents();
        this.getContentPane().setBackground(Color.decode("#72bbff"));
        mostrarFacturas();
        jLabel6.setVisible(false);
        jButton6.setVisible(false);
    }

    public void mostrarFacturas()
    {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Serie y num:");
        modelo.addColumn("Id del cliente:");
        modelo.addColumn("Fecha:");
        modelo.addColumn("Tipo de pago:");
        modelo.addColumn("Total:");
        modelo.addColumn("Pagada:");
        jTable1.setModel(modelo);
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT serieynumero, clientes_id, fecha, tipopago, total, pagada FROM facturaventa");
            
            String datos[] = new String[6];
            
            while (rs.next())
            {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                if (rs.getString(4).equals("0"))
                {
                    datos[3] = "Credito";
                }
                else
                {
                    datos[3] = "Efectivo";
                }
                datos[4] = rs.getString(5);
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
            
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Regreso = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Busquedas1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486504374-cash-dollar-earnings-money-profit-savings-stack_81308.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ventas");

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

        jScrollPane2.setOpaque(false);

        jPanel2.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Detalle de factura:");

        jLabel13.setText("Serie:");

        jLabel14.setText("Tipo de pago:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credito", "Efectivo" }));

        jButton2.setText("Siguiente");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel4.setText("NIT cliente:");

        jTextField2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jTextField2CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField2InputMethodTextChanged(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre del cliente:");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar nombre");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel6.setText("Nombre no encontrado. Por favor ingrese uno.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(jTextField2)
                                .addComponent(jTextField4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jButton1))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGap(58, 58, 58)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        jTabbedPane1.addTab("Ingreso de Factura de Ventas", jScrollPane2);

        jScrollPane1.setOpaque(false);

        jPanel1.setOpaque(false);

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
        jRadioButton1.setText("Tipo de pago");
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Nit de Cliente");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("No.Factura");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jScrollPane11.setOpaque(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane11.setViewportView(jTable1);

        jLabel7.setText("O seleccione una factura para: ");

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

        jButton6.setText("Mostrar Todas las facturas");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(64, 64, 64)
                                .addComponent(jButton4)
                                .addGap(60, 60, 60)
                                .addComponent(jButton5))
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Busquedas1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Busquedas1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jButton5))
                    .addComponent(jButton3))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane1.addTab("Informacion de Facturas de Ventas", jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Regreso))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Regreso))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)))
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
        
        if (jRadioButton2.isSelected())
        {
            try 
            {
                DefaultTableModel modeloBusqueda = new DefaultTableModel();
                modeloBusqueda.addColumn("Serie y num:");
                modeloBusqueda.addColumn("Id del cliente:");
                modeloBusqueda.addColumn("Fecha:");
                modeloBusqueda.addColumn("Tipo de pago:");
                modeloBusqueda.addColumn("Total:");
                modeloBusqueda.addColumn("Pagada:");
                jTable1.setModel(modeloBusqueda);
        
                String datos[] = new String [6];
                
                String id = "";
                Statement sb = cn.createStatement();
                ResultSet rb = sb.executeQuery("Select id FROM clientes WHERE nit = '"+jTextField1.getText()+"' ");
                while(rb.next())
                {
                    id = rb.getString(1);
                }

                
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT serieynumero, clientes_id, fecha, tipopago, total, pagada FROM facturaventa WHERE clientes_id = '"+id+"' ");
                while(rs.next())
                {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    if (rs.getString(4).equals("0"))
                    {
                        datos[3] = "Credito";
                    }
                    else
                    {
                        datos[3] = "Efectivo";
                    }
                    datos[4] = rs.getString(5);
                    if (rs.getString(6).equals("0"))
                    {
                        datos[5] = "No pagada";
                    }
                    else
                    {
                        datos[5] = "Pagada";
                    }
                    modeloBusqueda.addRow(datos);
                }
                jTable1.setModel(modeloBusqueda);
                jButton6.setVisible(true);

            } catch (SQLException ex) {
                Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (jRadioButton1.isSelected())
        {
            try 
            {
                DefaultTableModel modeloBusqueda = new DefaultTableModel();
                modeloBusqueda.addColumn("Serie y num:");
                modeloBusqueda.addColumn("Id del cliente:");
                modeloBusqueda.addColumn("Fecha:");
                modeloBusqueda.addColumn("Tipo de pago:");
                modeloBusqueda.addColumn("Total:");
                modeloBusqueda.addColumn("Pagada:");
                jTable1.setModel(modeloBusqueda);
        
                String datos[] = new String [6];
                
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT serieynumero, clientes_id, fecha, tipopago, total, pagada FROM facturaventa WHERE tipopago = '"+jTextField1.getText()+"' ");
                while(rs.next())
                {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    if (rs.getString(4).equals("0"))
                    {
                        datos[3] = "Credito";
                    }
                    else
                    {
                        datos[3] = "Efectivo";
                    }
                    datos[4] = rs.getString(5);
                    if (rs.getString(6).equals("0"))
                    {
                        datos[5] = "No pagada";
                    }
                    else
                    {
                        datos[5] = "Pagada";
                    }
                    modeloBusqueda.addRow(datos);
                }
                jTable1.setModel(modeloBusqueda);
                jButton6.setVisible(true);

            } catch (SQLException ex) {
                Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (jRadioButton3.isSelected())
        {
            try 
            {
                DefaultTableModel modeloBusqueda = new DefaultTableModel();
                modeloBusqueda.addColumn("Serie y num:");
                modeloBusqueda.addColumn("Id del cliente:");
                modeloBusqueda.addColumn("Fecha:");
                modeloBusqueda.addColumn("Tipo de pago:");
                modeloBusqueda.addColumn("Total:");
                modeloBusqueda.addColumn("Pagada:");
                jTable1.setModel(modeloBusqueda);
        
                String datos[] = new String [6];
                
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT serieynumero, clientes_id, fecha, tipopago, total, pagada FROM facturaventa WHERE serieynumero = '"+jTextField1.getText()+"' ");
                while(rs.next())
                {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    if (rs.getString(4).equals("0"))
                    {
                        datos[3] = "Credito";
                    }
                    else
                    {
                        datos[3] = "Efectivo";
                    }
                    datos[4] = rs.getString(5);
                    if (rs.getString(6).equals("0"))
                    {
                        datos[5] = "No pagada";
                    }
                    else
                    {
                        datos[5] = "Pagada";
                    }
                    modeloBusqueda.addRow(datos);
                }
                jTable1.setModel(modeloBusqueda);
                jButton6.setVisible(true);

            } catch (SQLException ex) {
                Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Por favor marque una casilla de busqueda.");
        }
        
        
    }//GEN-LAST:event_Busquedas1MouseClicked

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        if (jTextField2.getText().equals("") || jTextField3.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos.");
        }
        else
        {
            int NoValido = 0;
            
            if(ClienteExistente == 0)
            {
                try {
                    PreparedStatement insertarDatos = cn.prepareStatement("INSERT INTO clientes(nit, nombrecli, direccion) VALUES(?,?,?)");
                    insertarDatos.setString(1, jTextField2.getText());
                    insertarDatos.setString(2, jTextField4.getText());
                    insertarDatos.setString(3, "Ciudad");
                    insertarDatos.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT serieynumero FROM facturaventa");

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
                String nitcliente, factserie, pag;
                int pagada;

                nitcliente = jTextField2.getText();
                factserie = jTextField3.getText();
                pagada = jComboBox1.getSelectedIndex();
                pag = String.valueOf(pagada);   
                String idcliente = "";
                
                //Buscamos el id del cliente para insertarlo en la factura
                try 
                {
                    Statement sc = cn.createStatement();
                    ResultSet rs = sc.executeQuery("SELECT nit, id FROM clientes");

                    while(rs.next())
                    {
                        if(nitcliente.equals(rs.getString(1)))
                        {
                            idcliente = rs.getString(2);
                        }
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
                }

                try
                {
                    PreparedStatement insertarDatos = cn.prepareStatement("INSERT INTO facturaventa(serieynumero,total,tipopago,pagada,clientes_id) VALUES(?,?,?,?,?)");
                    insertarDatos.setString(1, factserie);
                    insertarDatos.setString(2, "0");
                    insertarDatos.setString(3, pag);
                    insertarDatos.setString(5, idcliente);
                    if (pagada == 0)
                    {
                        insertarDatos.setString(4, "0");
                    }
                    else
                    {
                        insertarDatos.setString(4, "1");
                    }
                    insertarDatos.executeUpdate();

                } catch (SQLException ex) {
                    Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
                }

                SeleccionProdVentas s = new SeleccionProdVentas(1,factserie,0);
                s.setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Serie de factura ya ingresada. Por favor introduzca otro dato.");
            }
        }

    }//GEN-LAST:event_jButton2MouseClicked

    private void jTextField2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField2InputMethodTextChanged
        System.out.println("yolo");
    }//GEN-LAST:event_jTextField2InputMethodTextChanged

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField2CaretPositionChanged

    }//GEN-LAST:event_jTextField2CaretPositionChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        if (jTextField2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Por favor ingrese de primero un NIT.");
        }
        else
        {
            String nitc = jTextField2.getText();
            try 
            {
                Statement sc = cn.createStatement();
                ResultSet rs = sc.executeQuery("SELECT nit, nombrecli FROM clientes");

                while(rs.next())
                {
                    if(nitc.equals(rs.getString(1)))
                    {
                        String nombreCliente = rs.getString(2);
                        ClienteExistente = 1;
                        jTextField4.setText(nombreCliente);
                        jLabel6.setVisible(false);
                    }
                }
                if (ClienteExistente == 0)
                {
                    jLabel6.setVisible(true);
                    jTextField4.setText("");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

        
        
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

        if (jTable1.getSelectedRow() > -1)
        {
            String nofactura = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
//            try {
//                PreparedStatement BorrarDetalle = cn.prepareStatement("DELETE FROM detalleventa WHERE facturaventa_serieynumero = '"+nofactura+"'");
//                BorrarDetalle.executeUpdate();
//
//            } catch (SQLException ex) {
//                Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
//            }

            try {
                PreparedStatement BorrarFactura = cn.prepareStatement("DELETE FROM facturaventa WHERE serieynumero = '"+nofactura+"'");
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
            MostrarFacturaVenta v = new MostrarFacturaVenta(fac,tot);
            v.setVisible(true);
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Por favor selecione un producto.");
        }

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        mostrarFacturas();
        jButton6.setVisible(false);
    }//GEN-LAST:event_jButton6MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Busquedas1;
    private javax.swing.JButton Regreso;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
