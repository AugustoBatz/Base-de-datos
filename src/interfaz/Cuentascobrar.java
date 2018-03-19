package interfaz;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Cuentascobrar extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conexion();
    
    public Cuentascobrar() {
        initComponents();
        this.getContentPane().setBackground(Color.decode("#669900"));
        mostrarFacturas();
    }

    public void mostrarFacturas()
    {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Serie y num:");
        modelo.addColumn("NIT del cliente:");
        modelo.addColumn("Fecha:");
        modelo.addColumn("Tipo de pago:");
        modelo.addColumn("Total:");
        modelo.addColumn("Pagada:");
        jTable1.setModel(modelo);
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT serieynumero, clientes_nit, fecha, tipopago, total, pagada FROM facturaventa WHERE pagada = 0");
            
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Regreso = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Download_downloading_data_storage_folder-64.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Facturas por Cobrar");

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Regreso))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 17, Short.MAX_VALUE)))
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
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(Regreso)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresoMouseClicked
        Menu i = new Menu ();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresoMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuentascobrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
