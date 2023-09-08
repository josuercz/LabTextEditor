/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package labeditordetexto;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author pcast
 */
public class editor extends javax.swing.JFrame {


    public editor() {
        initComponents();
        doc= vis.getStyledDocument();
        estilo=vis.addStyle("n", null);
        f();
        
    }
    private void f(){
        DefaultComboBoxModel mod=(DefaultComboBoxModel) fuente.getModel();
        GraphicsEnvironment e= GraphicsEnvironment.getLocalGraphicsEnvironment();
        String listaF[]= e.getAvailableFontFamilyNames();
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(int i=0; i< fonts.length;i++){
            mod.addElement(fonts[i]);
        }
        fuente.setModel(mod);
    }
    StyledDocument doc;
    Style estilo;
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fuente = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        vis = new javax.swing.JTextPane();
        color = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        sub = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        quitar_sub = new javax.swing.JButton();
        tamaño = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        quitFondo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bold = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        byeBold = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        byeIta = new javax.swing.JButton();
        crearArchivo = new javax.swing.JButton();
        abrirArchivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor de texto");

        jPanel1.setBackground(new java.awt.Color(174, 167, 139));

        fuente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fuenteItemStateChanged(evt);
            }
        });
        fuente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fuenteMouseClicked(evt);
            }
        });
        fuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuenteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Fuente:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tamaño:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Color:");

        jScrollPane2.setViewportView(vis);

        color.setBackground(new java.awt.Color(255, 204, 204));
        color.setText("A");
        color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Subrayar:");

        sub.setText("Sub");
        sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Quitar sub:");

        quitar_sub.setText("sub :( ");
        quitar_sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitar_subMouseClicked(evt);
            }
        });

        tamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "8", "10", "12", "14", "16", "18", "20", "24", "28", "30", "36", "40", "44", "48", "52", "60", "70", "80", "90", "100" }));
        tamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamañoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Fondo:");

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setText("...");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Quitar fondo:");

        quitFondo.setText("...");
        quitFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitFondoMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Negrita:");

        bold.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bold.setText("B");
        bold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boldMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Quitar B:");

        byeBold.setText("B");
        byeBold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                byeBoldMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Italic:");

        jButton2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton2.setText("I");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Quitar I");

        byeIta.setText("I");
        byeIta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                byeItaMouseClicked(evt);
            }
        });

        crearArchivo.setText("Guardar");
        crearArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearArchivoMouseClicked(evt);
            }
        });

        abrirArchivo.setText("Abrir archivo");
        abrirArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirArchivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tamaño, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(fuente, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(color))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bold))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quitar_sub)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(byeBold, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(quitFondo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(byeIta))))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(abrirArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crearArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(crearArchivo)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(abrirArchivo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(color))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(sub)
                    .addComponent(jLabel5)
                    .addComponent(quitar_sub))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jButton1)
                            .addComponent(quitFondo))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(bold)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(byeBold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jLabel10)
                            .addComponent(byeIta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorMouseClicked
       try{
           StyleConstants.setForeground(estilo, JColorChooser.showDialog(this, "Elija color", Color.yellow));
       
           doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd()-vis.getSelectionStart(), vis.getStyle("n"), true);
       }catch(Exception ex){
           System.out.println("ups"); 
       }
    }//GEN-LAST:event_colorMouseClicked

    private void subMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseClicked
        try{
           StyleConstants.setUnderline(estilo,true);
       
           doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd()-vis.getSelectionStart(), vis.getStyle("n"), true);
       }catch(Exception ex){
           System.out.println("ups"); 
       }

    }//GEN-LAST:event_subMouseClicked

    private void quitar_subMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitar_subMouseClicked
        try{
           StyleConstants.setUnderline(estilo,false);
       
           doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd()-vis.getSelectionStart(), vis.getStyle("n"), true);
       }catch(Exception ex){
           System.out.println("ups"); 
       }
    }//GEN-LAST:event_quitar_subMouseClicked

    private void tamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamañoActionPerformed
        StyleConstants.setFontSize(estilo, Integer.parseInt(tamaño.getSelectedItem().toString()));
        doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd()-vis.getSelectionStart(), vis.getStyle("n"), true);
    }//GEN-LAST:event_tamañoActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try{
           StyleConstants.setBackground(estilo, Color.YELLOW);
       
           doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd()-vis.getSelectionStart(), vis.getStyle("n"), true);
       }catch(Exception ex){
           System.out.println("ups"); 
       }
    }//GEN-LAST:event_jButton1MouseClicked

    private void quitFondoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitFondoMouseClicked
        try{
           StyleConstants.setBackground(estilo, Color.white);
       
           doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd()-vis.getSelectionStart(), vis.getStyle("n"), true);
       }catch(Exception ex){
           System.out.println("ups"); 
       }
    }//GEN-LAST:event_quitFondoMouseClicked

    private void fuenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fuenteMouseClicked
      
    }//GEN-LAST:event_fuenteMouseClicked

    private void fuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fuenteActionPerformed

    private void fuenteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fuenteItemStateChanged
        StyleConstants.setFontFamily(estilo, fuente.getSelectedItem().toString());
       doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd()-vis.getSelectionStart(), vis.getStyle("n"), true);
    
    }//GEN-LAST:event_fuenteItemStateChanged

    private void boldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boldMouseClicked
        try{
           StyleConstants.setBold(estilo, true);
       
           doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd()-vis.getSelectionStart(), vis.getStyle("n"), true);
       }catch(Exception ex){
           System.out.println("ups"); 
       }
    }//GEN-LAST:event_boldMouseClicked

    private void byeBoldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_byeBoldMouseClicked
        try{
           StyleConstants.setBold(estilo, false);
       
           doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd()-vis.getSelectionStart(), vis.getStyle("n"), true);
       }catch(Exception ex){
           System.out.println("ups"); 
       }
    }//GEN-LAST:event_byeBoldMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try{
           StyleConstants.setItalic(estilo, true);
       
           doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd()-vis.getSelectionStart(), vis.getStyle("n"), true);
       }catch(Exception ex){
           System.out.println("ups"); 
       }
    }//GEN-LAST:event_jButton2MouseClicked

    private void byeItaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_byeItaMouseClicked
        try{
           StyleConstants.setItalic(estilo, false);
       
           doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd()-vis.getSelectionStart(), vis.getStyle("n"), true);
       }catch(Exception ex){
           System.out.println("ups"); 
       }
    }//GEN-LAST:event_byeItaMouseClicked

    private void abrirArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirArchivoMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
        fileChooser.setFileFilter(filter);

        int response = fileChooser.showOpenDialog(null);

        if (response == JFileChooser.APPROVE_OPTION) {
            File file = new File(fileChooser.getSelectedFile().getAbsolutePath());

            try (Scanner fileIn = new Scanner(file)) {
                if (file.isFile()) {
                    StyledDocument doc = vis.getStyledDocument();
                    while (fileIn.hasNextLine()) {
                        String line = fileIn.nextLine() + "\n";
                        doc.insertString(doc.getLength(), line, null);
                    }
                }
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException | BadLocationException e2) {
                e2.printStackTrace();
            }
        }
    }//GEN-LAST:event_abrirArchivoMouseClicked

    private void crearArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearArchivoMouseClicked
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File("."));

        int r = fc.showSaveDialog(null);

        if (r == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                // Obtiene el StyledDocument
                StyledDocument doc = vis.getStyledDocument();
                int length = doc.getLength();

                // Itera a través del documento y guarda el texto con formato HTML
                for (int i = 0; i < length; i++) {
                    Element element = doc.getCharacterElement(i);
                    AttributeSet attrs = element.getAttributes();
                    String text = doc.getText(i, 1);
                    String style = AttributeSetToString(attrs);
                    writer.write("<span style=\"" + style + "\">" + text + "</span>");
                }
            } catch (IOException | BadLocationException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_crearArchivoMouseClicked
    private String AttributeSetToString(AttributeSet attrs) {
        String style = "";

        if (StyleConstants.isBold(attrs)) {
            style += "font-weight: bold;";
        }
        if (StyleConstants.isItalic(attrs)) {
            style += "font-style: italic;";
        }
        if (StyleConstants.isUnderline(attrs)) {
            style += "text-decoration: underline;";
        }

        // Obtener tamaño de fuente
        int size = StyleConstants.getFontSize(attrs);
        style += "font-size: " + size + "pt;";

        // Obtener tipo de fuente
        String fontFamily = StyleConstants.getFontFamily(attrs);
        style += "font-family: " + fontFamily + ";";

        // Obtener color de fondo
        Color bgColor = StyleConstants.getBackground(attrs);
        if (bgColor != null) {
            String hexColor = String.format("#%02x%02x%02x", bgColor.getRed(), bgColor.getGreen(), bgColor.getBlue());
            style += "background-color: " + hexColor + ";";
        }

        return style;
    }

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
            java.util.logging.Logger.getLogger(editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirArchivo;
    private javax.swing.JButton bold;
    private javax.swing.JButton byeBold;
    private javax.swing.JButton byeIta;
    private javax.swing.JButton color;
    private javax.swing.JButton crearArchivo;
    private javax.swing.JComboBox<String> fuente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton quitFondo;
    private javax.swing.JButton quitar_sub;
    private javax.swing.JButton sub;
    private javax.swing.JComboBox<String> tamaño;
    private javax.swing.JTextPane vis;
    // End of variables declaration//GEN-END:variables

    
}
