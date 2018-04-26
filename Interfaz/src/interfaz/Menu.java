 package interfaz;

import java.awt.Color;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        Inventario.setOpaque(false);
        Inventario.setBorder(null);
        Compras.setOpaque(false);
        Compras.setBorder(null);
        Ventas.setOpaque(false);
        Ventas.setBorder(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Inventario = new javax.swing.JButton();
        Compras = new javax.swing.JButton();
        Ventas = new javax.swing.JButton();
        Invent = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Inventario1 = new javax.swing.JButton();
        Inventario2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Inventario3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Inventario4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Inventario5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Compras ");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        Inventario.setBackground(new java.awt.Color(255, 255, 255));
        Inventario.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        Inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/List.png"))); // NOI18N
        Inventario.setBorder(null);
        Inventario.setBorderPainted(false);
        Inventario.setFocusPainted(false);
        Inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventarioMouseClicked(evt);
            }
        });

        Compras.setBackground(new java.awt.Color(255, 255, 255));
        Compras.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        Compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486504353-cart-ecommerce-shop-commerce-supermarket-trolley-shopping_81310.png"))); // NOI18N
        Compras.setBorder(null);
        Compras.setBorderPainted(false);
        Compras.setFocusPainted(false);
        Compras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComprasMouseClicked(evt);
            }
        });

        Ventas.setBackground(new java.awt.Color(255, 255, 255));
        Ventas.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486504374-cash-dollar-earnings-money-profit-savings-stack_81308.png"))); // NOI18N
        Ventas.setBorder(null);
        Ventas.setBorderPainted(false);
        Ventas.setFocusPainted(false);
        Ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VentasMouseClicked(evt);
            }
        });

        Invent.setBackground(new java.awt.Color(255, 255, 102));
        Invent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Invent.setForeground(new java.awt.Color(255, 255, 255));
        Invent.setText("Inventario ");
        Invent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ventas ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Menú");

        Inventario1.setBackground(new java.awt.Color(255, 255, 255));
        Inventario1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        Inventario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Folder_folder_up_folder_upload_update_folder_upload-64.png"))); // NOI18N
        Inventario1.setBorder(null);
        Inventario1.setBorderPainted(false);
        Inventario1.setFocusPainted(false);
        Inventario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Inventario1MouseClicked(evt);
            }
        });

        Inventario2.setBackground(new java.awt.Color(255, 255, 255));
        Inventario2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        Inventario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Collaboration_group_people_men_user_team_users-64.png"))); // NOI18N
        Inventario2.setBorder(null);
        Inventario2.setBorderPainted(false);
        Inventario2.setFocusPainted(false);
        Inventario2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Inventario2MouseClicked(evt);
            }
        });
        Inventario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inventario2ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Facturas por Cobrar");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Facturas por Pagar");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        Inventario3.setBackground(new java.awt.Color(255, 255, 255));
        Inventario3.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        Inventario3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Download_downloading_data_storage_folder-64.png"))); // NOI18N
        Inventario3.setBorder(null);
        Inventario3.setBorderPainted(false);
        Inventario3.setFocusPainted(false);
        Inventario3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Inventario3MouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Proveedores");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        Inventario4.setBackground(new java.awt.Color(255, 255, 255));
        Inventario4.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        Inventario4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Chn_link_locked_share-64.png"))); // NOI18N
        Inventario4.setBorder(null);
        Inventario4.setBorderPainted(false);
        Inventario4.setFocusPainted(false);
        Inventario4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Inventario4MouseClicked(evt);
            }
        });
        Inventario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inventario4ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Clientes");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        Inventario5.setBackground(new java.awt.Color(255, 255, 255));
        Inventario5.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        Inventario5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel_close_delete_exit_remove_x_icon_32.png"))); // NOI18N
        Inventario5.setBorder(null);
        Inventario5.setBorderPainted(false);
        Inventario5.setFocusPainted(false);
        Inventario5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Inventario5MouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 102));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Salir ");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Inventario5)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inventario4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inventario2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inventario1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Compras, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inventario3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addComponent(Invent, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(309, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Inventario1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Inventario3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Compras, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Inventario2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Inventario4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Inventario5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(Invent, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(295, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventarioMouseClicked
        Inventario i = new Inventario (); 
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_InventarioMouseClicked

    private void ComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprasMouseClicked
        Compras c = new Compras(); 
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ComprasMouseClicked

    private void VentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentasMouseClicked
        Ventas v = new Ventas(); 
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VentasMouseClicked

    private void Inventario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inventario1MouseClicked
        Cuentaspagar c = new Cuentaspagar(); 
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Inventario1MouseClicked

    private void Inventario3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inventario3MouseClicked
        Cuentascobrar c = new Cuentascobrar(); 
        c.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_Inventario3MouseClicked

    private void Inventario2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inventario2MouseClicked
        Proveedores p = new Proveedores(0); 
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Inventario2MouseClicked

    private void Inventario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inventario2ActionPerformed

    }//GEN-LAST:event_Inventario2ActionPerformed

    private void InventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventMouseClicked
        Inventario i = new Inventario (); 
        i.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_InventMouseClicked

    private void Inventario4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inventario4MouseClicked
        Clientes c = new Clientes (0); 
        c.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_Inventario4MouseClicked

    private void Inventario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inventario4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Inventario4ActionPerformed

    private void Inventario5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inventario5MouseClicked
         System.exit(0); // TODO add your handling code here:
    }//GEN-LAST:event_Inventario5MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       Compras c = new Compras(); 
       c.setVisible(true);
       this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       Ventas v = new Ventas(); 
       v.setVisible(true);
       this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Cuentaspagar cp = new Cuentaspagar(); 
        cp.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Cuentascobrar cr = new Cuentascobrar(); 
        cr.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Proveedores p = new Proveedores(0); 
        p.setVisible(true);
        this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Clientes c = new Clientes (0); 
        c.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Compras;
    private javax.swing.JLabel Invent;
    private javax.swing.JButton Inventario;
    private javax.swing.JButton Inventario1;
    private javax.swing.JButton Inventario2;
    private javax.swing.JButton Inventario3;
    private javax.swing.JButton Inventario4;
    private javax.swing.JButton Inventario5;
    private javax.swing.JButton Ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
