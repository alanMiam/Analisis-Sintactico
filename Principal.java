package compiladores;

import java.io.*;
import java.util.regex.*;
import javax.swing.*;


public class Principal extends javax.swing.JFrame {

    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public String abrirArchivo(File archivo) {
        String documento = "";

        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) != -1) {
                char caracter = (char) ascci;
                documento += caracter;
            }
        } catch (Exception ex) {
            System.out.println("ERROR!" + ex);
        }
        return documento;
    }

    //Guarda el archivo
    public String guardarArchivo(File archivo, String documento) {
        String mensaje = null;

        try {
            salida = new FileOutputStream(archivo);
            byte[] bytxt = documento.getBytes();
            salida.write(bytxt);
            mensaje = "Archivo Guardado";
        } catch (Exception ex) {
            System.out.println("ERROR!" + ex);
        }
        return mensaje;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtExp = new javax.swing.JTextField();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnRegEx = new javax.swing.JButton();
        btnAnalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        txtExp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btnAbrir.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnAbrir.setIcon(new javax.swing.ImageIcon("F:\\Descargas\\imágenes\\file-rounded-empty-sheet_icon-icons.com_73253.png")); // NOI18N
        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon("F:\\Descargas\\imágenes\\save-button-interface-symbol-of-outlined-diskette_icon-icons.com_73167.png")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnRegEx.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnRegEx.setIcon(new javax.swing.ImageIcon("F:\\Descargas\\imágenes\\regex_icon_132036 (1).png")); // NOI18N
        btnRegEx.setText("RegEx");
        btnRegEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegExActionPerformed(evt);
            }
        });

        btnAnalizar.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnAnalizar.setIcon(new javax.swing.ImageIcon("F:\\Descargas\\imágenes\\analizar.png")); // NOI18N
        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        txtEntrada.setBackground(new java.awt.Color(51, 51, 51));
        txtEntrada.setColumns(20);
        txtEntrada.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtEntrada.setForeground(new java.awt.Color(0, 204, 0));
        txtEntrada.setRows(5);
        jScrollPane1.setViewportView(txtEntrada);

        txtSalida.setBackground(new java.awt.Color(51, 51, 51));
        txtSalida.setColumns(20);
        txtSalida.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtSalida.setForeground(new java.awt.Color(0, 204, 0));
        txtSalida.setRows(5);
        jScrollPane2.setViewportView(txtSalida);

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\Descargas\\imágenes\\icono (1).png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtExp, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegEx, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(23, 23, 23)
                .addComponent(jLabel1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtExp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegEx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegExActionPerformed
        String RegEx = txtExp.getText();
        final Pattern pattern = Pattern.compile(RegEx, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(abrirArchivo(archivo));
        String resultado = "";

        while (matcher.find()) {
            //System.out.println("Full match: " + matcher.group(0));
            resultado += matcher.group(0) + "\n";
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
        txtSalida.setText(resultado);

    }//GEN-LAST:event_btnRegExActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String documento = abrirArchivo(archivo);
                txtEntrada.setText(documento);
            } else {
                JOptionPane.showMessageDialog(null, "Archivo no compatible");
            }
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {                                            
//GEN-FIRST:event_btnAnalizarActionPerformed
        File archivo = new File("archivo.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(txtEntrada.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
// Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(Compiladores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
// try {
        Reader lector;
        try {
            lector = new BufferedReader(new FileReader("archivo.txt"));
            Lexer lexer = new Lexer(lector);
            String resultado = "";
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    resultado += "FIN";
                    txtSalida.setText(resultado);
                    return;
                }
                switch (tokens) {
                    case ERROR:
                        resultado += "Símbolo no definido\n";
                        break;
                    case Lugar:
                    case Compañero:
                    case Liguilla_mx:    
                        resultado += lexer.lexeme + ": Es un " + tokens + "\n";
                        break;
                    default:
                        resultado += "Token: " + tokens + "\n";
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
// Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(Compiladores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
// Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(Compiladores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (seleccionar.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String documento = txtEntrada.getText();
                String mensaje = guardarArchivo(archivo, documento);
                if (mensaje != null) {
                    JOptionPane.showMessageDialog(null, mensaje);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Guardar documento de texto");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegEx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtEntrada;
    private javax.swing.JTextField txtExp;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables
}
