/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package figschachipistachis;

import java.awt.event.ItemEvent;

/**
 *
 * @author ruben
 */
public class Padre extends javax.swing.JFrame {

    /**
     * Creates new form Padre
     */
    Dibujador drawer;
    public Padre() {
        initComponents();
        drawer = new Dibujador(jPanel1);
        drawer.clearScreen();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        clear = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jPanel2 = new javax.swing.JPanel();
        textu = new javax.swing.JRadioButton();
        degr = new javax.swing.JRadioButton();
        soli = new javax.swing.JRadioButton();
        delgada = new javax.swing.JRadioButton();
        gruesa = new javax.swing.JRadioButton();
        punteada = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cua = new javax.swing.JRadioButton();
        cir = new javax.swing.JRadioButton();
        cil = new javax.swing.JRadioButton();
        Figuras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1138, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );

        clear.setText("Limpiar");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });

        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jSlider1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jSlider1CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        buttonGroup2.add(textu);
        textu.setText("Textura");
        textu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                textuItemStateChanged(evt);
            }
        });

        buttonGroup2.add(degr);
        degr.setText("Degradado");
        degr.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                degrItemStateChanged(evt);
            }
        });

        buttonGroup2.add(soli);
        soli.setText("Solido");
        soli.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                soliItemStateChanged(evt);
            }
        });

        buttonGroup3.add(delgada);
        delgada.setText("Delgada");
        delgada.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                delgadaItemStateChanged(evt);
            }
        });

        buttonGroup3.add(gruesa);
        gruesa.setText("Gruesa");
        gruesa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                gruesaItemStateChanged(evt);
            }
        });

        buttonGroup3.add(punteada);
        punteada.setText("Punteada");
        punteada.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                punteadaItemStateChanged(evt);
            }
        });

        jLabel2.setText("Relleno");

        jLabel3.setText("Lineas");

        buttonGroup1.add(cua);
        cua.setText("Cuadrado");
        cua.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cuaItemStateChanged(evt);
            }
        });
        cua.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cuaStateChanged(evt);
            }
        });
        cua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuaActionPerformed(evt);
            }
        });

        buttonGroup1.add(cir);
        cir.setText("Circulo");
        cir.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cirItemStateChanged(evt);
            }
        });

        buttonGroup1.add(cil);
        cil.setText("Ciliindro");
        cil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cilItemStateChanged(evt);
            }
        });

        Figuras.setText("Figuras");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cua)
                        .addComponent(cir)
                        .addComponent(cil))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Figuras)
                        .addGap(13, 13, 13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textu)
                    .addComponent(degr)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(soli)))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(punteada)
                            .addComponent(delgada)
                            .addComponent(gruesa))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(85, 85, 85))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(soli)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(degr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textu))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(gruesa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(delgada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(punteada))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Figuras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cil))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clear)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cuaStateChanged
        
    }//GEN-LAST:event_cuaStateChanged

    private void cuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuaActionPerformed
        
    }//GEN-LAST:event_cuaActionPerformed

    private void cuaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cuaItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            drawer.drawFigura(2);
        }
    }//GEN-LAST:event_cuaItemStateChanged

    private void cirItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cirItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
           drawer.drawFigura(1);
        }
    }//GEN-LAST:event_cirItemStateChanged

    private void cilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cilItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            drawer.drawFigura(3);
        }
    }//GEN-LAST:event_cilItemStateChanged

    private void soliItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_soliItemStateChanged
       if(evt.getStateChange() == ItemEvent.SELECTED){
            drawer.fillFigura(1);
        }
    }//GEN-LAST:event_soliItemStateChanged

    private void degrItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_degrItemStateChanged
         if(evt.getStateChange() == ItemEvent.SELECTED){
            drawer.fillFigura(2);
        }
    }//GEN-LAST:event_degrItemStateChanged

    private void textuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_textuItemStateChanged
       if(evt.getStateChange() == ItemEvent.SELECTED){
            drawer.fillFigura(3);
        }
    }//GEN-LAST:event_textuItemStateChanged

    private void gruesaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_gruesaItemStateChanged
         if(evt.getStateChange() == ItemEvent.SELECTED){
            drawer.lineFigura(1);
        }
    }//GEN-LAST:event_gruesaItemStateChanged

    private void delgadaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_delgadaItemStateChanged
         if(evt.getStateChange() == ItemEvent.SELECTED){
            drawer.lineFigura(2);
        }
    }//GEN-LAST:event_delgadaItemStateChanged

    private void punteadaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_punteadaItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            drawer.lineFigura(3);
        }
    }//GEN-LAST:event_punteadaItemStateChanged

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        drawer.clearScreen();
        drawer.resetValues();
    }//GEN-LAST:event_clearMouseClicked

    private void jSlider1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jSlider1CaretPositionChanged
       
    }//GEN-LAST:event_jSlider1CaretPositionChanged

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
         drawer.scaleFig(jSlider1.getValue());
        System.out.print(jSlider1.getValue()+"\n");
    }//GEN-LAST:event_jSlider1StateChanged

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
            java.util.logging.Logger.getLogger(Padre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Padre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Padre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Padre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Padre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Figuras;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton cil;
    private javax.swing.JRadioButton cir;
    private javax.swing.JButton clear;
    private javax.swing.JRadioButton cua;
    private javax.swing.JRadioButton degr;
    private javax.swing.JRadioButton delgada;
    private javax.swing.JRadioButton gruesa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JRadioButton punteada;
    private javax.swing.JRadioButton soli;
    private javax.swing.JRadioButton textu;
    // End of variables declaration//GEN-END:variables
}
