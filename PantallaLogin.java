/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProyectoFinal;

import java.util.ArrayList;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.swing.JOptionPane;

/**
 *
 * @author Darien
 */
public class PantallaLogin extends javax.swing.JFrame {

    ArrayList<Cliente> listadoUsuarios;

    SecretKey generateSecretKey() {
        SecretKey secretKey = null;
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256); // Tamaño de clave de 256 bits
            secretKey = keyGenerator.generateKey();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error."
                    + e.getMessage() + " "
                    + e.getStackTrace()[0].toString());
        }
        return secretKey;
    }

    SecretKey secretKey = generateSecretKey();

    /**
     * Creates new form PantallaLogin
     */
    public PantallaLogin() {
        initComponents();
        //this.setLocationRelativeTo(null);
        listadoUsuarios = new ArrayList<>();

        createListUsuarios();
    }
    

    public static String decrypt(String encryptedData, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
        return new String(decryptedBytes, "UTF-8");
    }

    public String encrypt(String data, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes("UTF-8"));
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    void createListUsuarios() {

        Cliente usuario1 = new Cliente();
        Cliente usuario2 = new Cliente();
        Cliente usuario3 = new Cliente();

        try {
            // encrypt password
            usuario1.setClave(encrypt("pass123", secretKey));
            usuario1.setNombre("Juan");

            usuario2.setClave(encrypt("pass123", secretKey));
            usuario2.setNombre("Pedro");

            usuario3.setClave(encrypt("pass789", secretKey));
            usuario3.setNombre("Lucas");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        listadoUsuarios.add(usuario1);
        listadoUsuarios.add(usuario2);
        listadoUsuarios.add(usuario3);

        // print listadoUsuarios
         for (Cliente usuario : listadoUsuarios) {
            System.out.println(usuario.getNombre());
            System.out.println(usuario.getClave());
         }
    }

    public String findUsuario(String user) {

        String claveUsuario = null;
        System.out.println("Buscando usuario: " + user);

        for (Cliente cliente : listadoUsuarios) {

            String usuarioGuardado = cliente.getNombre();

            if (usuarioGuardado.equals(user)) {
                System.out.println("Usuario encontrado: " + usuarioGuardado);
                claveUsuario = cliente.getClave();
                break;
            }
        }

        return claveUsuario;

    }
    
    public boolean checkPassword(String password, String claveEncriptada){
        
        boolean passCheck = false;
        try{
            //String passwordEncriptada = encrypt(password, secretKey);
            //String passwordDesencriptada = decrypt(passwordEncriptada, secretKey);
            String claveDesencriptada = decrypt(claveEncriptada, secretKey);

            //System.out.println("password desencriptada: " + passwordDesencriptada);
            //System.out.println("Clave desencriptada: " + claveDesencriptada);
            
             if (password.equals(claveDesencriptada)) {
                    return passCheck = true;
                }
            
       } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());

            }
        
        return passCheck;
    
    }

    void ingresarUsuario() {

        String user = usuarioField.getText();
        String password = passField.getText();

        System.out.println("Usuario: " + user);
        System.out.println("Clave: " + password);

        if (user.isEmpty() && password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error. Ingrese usuario y clave.");
            return;
        } else if (user.length() > 0 && password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error. Ingrese clave.");
            return;
        } else if (user.isEmpty() && password.length() > 0) {
            JOptionPane.showMessageDialog(null, "Error. Ingrese Usuario.");
            return;
        }

        // System.out.println(user);
        // System.out.println(password);

        try {

            String claveEncriptada = findUsuario(user);
            //System.out.println("Clave encriptada: " + claveEncriptada);
            
            if (claveEncriptada == null) {
                JOptionPane.showMessageDialog(null, "Error. Usuario no existe.");
                return;
            }
            
            Boolean isPassword = checkPassword(password.toString(), claveEncriptada);
            
            if(isPassword){
                System.out.println("Clave correcta");
                JOptionPane.showMessageDialog(null, "Bienvenido " + user);
                // clean fields
                usuarioField.setText("");
                passField.setText("");
                
                
                Container container = new Container();
                container.setVisible(true);
                this.dispose();
                
                return;
            } else {
                System.out.println("Clave incorrecta");
                JOptionPane.showMessageDialog(null, "Error. Clave incorrecta.");
                return;
            }

        } catch (Exception e) {
            System.out.println("Error de ingreso: " + e.getMessage());
            // JOptionPane.showMessageDialog(null, "Error. No se pudo ingresar, compruebe
            // sus datos.");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnLogin = new javax.swing.JButton();
        passField = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JLabel();
        usuarioField = new javax.swing.JTextField();
        txtTitulo1 = new javax.swing.JLabel();
        txtsubtitulo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));

        jBtnLogin.setText("INGRESAR");
        jBtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLoginActionPerformed(evt);
            }
        });

        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });

        txtTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtTitulo.setText("Clínica Médica Metropolitana");

        usuarioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioFieldActionPerformed(evt);
            }
        });

        txtTitulo1.setText("Usuario");

        txtsubtitulo.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtTitulo)
                    .addComponent(txtTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(txtTitulo)
                .addGap(30, 30, 30)
                .addComponent(txtTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(usuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtsubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jBtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void usuarioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioFieldActionPerformed

    private void jBtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLoginActionPerformed
        // TODO add your handling code here:
//        if (!usuarioField.getText().isEmpty() && !passField.getText().isEmpty()) {
//            
//            Container container = new Container();
//            container.setVisible(true);
//            this.dispose();
//            
//        }
        
         System.out.println("Ingresando...");
        ingresarUsuario();
    }//GEN-LAST:event_jBtnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnLogin;
    private javax.swing.JTextField passField;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtTitulo1;
    private javax.swing.JLabel txtsubtitulo;
    private javax.swing.JTextField usuarioField;
    // End of variables declaration//GEN-END:variables
}
