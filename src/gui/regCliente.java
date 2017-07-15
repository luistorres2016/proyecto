
package gui;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import sexshop.Cliente;
import sexshop.HibernateUtil;
import javax.swing.JOptionPane;

/**
 *
 * @author ccp
 */
public class regCliente extends javax.swing.JDialog {

    /**
     * Creates new form regCliente
     */
    public regCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.t_ya.setVisible(false);
    }

    public regCliente(java.awt.Frame parent, boolean modal, String text) {
        super(parent, modal);
        initComponents();
        this.t_ya.setVisible(false);
        this.t_ci.setText(text);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        t_ya = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        b_registrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        t_direccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t_telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t_email = new javax.swing.JTextField();
        t_nombre = new javax.swing.JTextField();
        t_ci = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(0, 204, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Clientes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        t_ya.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        t_ya.setForeground(new java.awt.Color(255, 51, 51));
        t_ya.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t_ya.setText("Cliente ya registrado  Si continua el registro sera actualizado");
        t_ya.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(t_ya, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(t_ya, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        b_registrar.setText("Registrar");
        b_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir)
                    .addComponent(b_registrar))
                .addContainerGap())
        );

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 20));

        t_direccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        t_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_direccionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_direccionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_direccionKeyTyped(evt);
            }
        });
        jPanel5.add(t_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 360, 30));

        jLabel7.setText("Direccion:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setText("Telefono: ");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        t_telefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        t_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_telefonoKeyTyped(evt);
            }
        });
        jPanel5.add(t_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 360, 30));

        jLabel6.setText("Email:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        t_email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel5.add(t_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 360, 30));

        t_nombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        t_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_nombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_nombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_nombreKeyTyped(evt);
            }
        });
        jPanel5.add(t_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 360, 30));

        t_ci.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        t_ci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_ciKeyReleased(evt);
            }
        });
        jPanel5.add(t_ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 360, 30));

        jLabel4.setText("N.C.I.:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed

    private void b_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_registrarActionPerformed
        //this.b_registrar.setEnabled(false);
        //this.salir.setEnabled(false);
        String cedula, nombre, direccion, ruc, telefono, email;
        cedula = t_ci.getText();
        nombre = t_nombre.getText();
        direccion = t_direccion.getText();
        //ruc = t_ruc.getText();
        telefono = t_telefono.getText();
        email = t_email.getText();
        //System.out.println(cont);
        if (cedula.equals("") || (nombre.equals("")) || (direccion.equals(""))
                || (telefono.equals(""))|| (email.equals(""))) {
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            t_direccion.requestFocus();
            return;
        }
        else {
            Session  st;
            st = HibernateUtil.getSessionFactory().openSession();
            st.beginTransaction();
            Cliente p = new Cliente();
            p.setCedula(Integer.parseInt(cedula));
            p.setNombreRazonSocial(nombre);
            //p.setRuc(ruc);
            p.setCorreoElectronico(email);
            p.setDireccion(direccion);
            p.setTelefono(telefono);
            st.save(p);

            //int idArt = 2;
            //Productos art = (Productos)st.load(Productos.class, idArt);
            //System.out.println(art.getProducto());
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Registro agregado.");
        }
        this.t_ci.setText("");
        this.t_nombre.setText("");
        this.t_direccion.setText("");
        this.t_email.setText("");
        this.t_telefono.setText("");
        //this.t_ruc.setText("");
        this.b_registrar.setEnabled(true);
        this.salir.setEnabled(true);
    }//GEN-LAST:event_b_registrarActionPerformed

    private void t_direccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_direccionKeyPressed
        //Muestra lo ingresado despues de ingresar el siguiente caracter
        //System.out.println(t_producto.getText());
    }//GEN-LAST:event_t_direccionKeyPressed

    private void t_direccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_direccionKeyReleased
        // 
    }//GEN-LAST:event_t_direccionKeyReleased

    private void t_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_direccionKeyTyped
        // Key typed del nombre del producto

        //if (!t_producto.getText().equals("")) cont++;
    }//GEN-LAST:event_t_direccionKeyTyped

    private void t_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_telefonoKeyTyped
        //if (!t_cantidad.getText().equals("")) cont++;
    }//GEN-LAST:event_t_telefonoKeyTyped

    private void t_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_nombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_nombreKeyPressed

    private void t_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_nombreKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t_nombreKeyReleased

    private void t_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_nombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t_nombreKeyTyped

    private void t_ciKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_ciKeyReleased
        System.out.println(t_ci.getText());
        Session st = HibernateUtil.getSessionFactory().openSession();
        st.beginTransaction();
        List<Cliente> lista = (List<Cliente>)st.createQuery("From Cliente").list();
        for (Iterator<Cliente> it = lista.iterator(); it.hasNext();) {
            Cliente pro = it.next();
            String ci = Integer.toString(pro.getCedula());
            if(ci.equals(t_ci.getText())){
                //System.out.println(pro.getProducto());
                t_ya.setVisible(true);
                b_registrar.setText("Actualizar");
                break;
            }
            else{t_ya.setVisible(false);
                b_registrar.setText("Guardar");}
            //System.out.println(pro.getProducto());
        }
    }//GEN-LAST:event_t_ciKeyReleased

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
            java.util.logging.Logger.getLogger(regCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                regCliente dialog = new regCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton salir;
    private javax.swing.JTextField t_ci;
    private javax.swing.JTextField t_direccion;
    private javax.swing.JTextField t_email;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JTextField t_telefono;
    private javax.swing.JLabel t_ya;
    // End of variables declaration//GEN-END:variables
}
