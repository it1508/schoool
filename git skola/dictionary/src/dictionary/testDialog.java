/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author student
 */
public class testDialog extends javax.swing.JDialog {
    private String actionButton = "Storno";
    private String[][] words = new String[3][10];
    public int chyby = 0;
    
    /**
     * Creates new form testDialog
     */
    public testDialog(java.awt.Frame parent, boolean modal ,String[][] slova) {
        super(parent, modal);
        Random rand = new Random();
        int  n = rand.nextInt(3) + 1;

        //udelej tu random cislo hod tam random slovo a potom porovnavat
         initComponents();
         for(int i =0;i<3;i++){
            for(int y=0;y<10;y++){
                this.words[i][y] = slova[i][y]; 
            }
            switch(n){
                case 1:
                    this.enTexty.setText(slova[1][i]);
                    break;
                case 2:
                    this.csTexty.setText(slova[0][i]);
                    break;
                case 3:
                    this.deTexty.setText(slova[2][i]);
                    break;
            }     
        }
         
        
    }
    
    public String showDialog() {
        /* Zviditelní dialogové okno */
        this.setVisible(true);
        /* Vrací název stisnutého tlačítka */
        return actionButton; 
    }
    
    
    
    public String getanglicky() {
        return this.enTexty.getText();
    }

    public String getcesky() {
        return this.csTexty.getText();
    }
    
    public String getnemecky(){
        return this.deTexty.getText();
    }
    
    public void dalsi(){
        
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okButton = new javax.swing.JButton();
        StornoButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        csTexty = new javax.swing.JTextField();
        enTexty = new javax.swing.JTextField();
        deTexty = new javax.swing.JTextField();
        dalsiButton = new javax.swing.JButton();
        vysledekText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        StornoButton.setText("Storno");
        StornoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StornoButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Cesky text");

        jLabel2.setText("anglicky text");

        jLabel3.setText("nemecky text");

        enTexty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enTextyActionPerformed(evt);
            }
        });

        dalsiButton.setText("Další");
        dalsiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dalsiButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                .addComponent(deTexty, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enTexty)
                                    .addComponent(csTexty)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(okButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StornoButton)))
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(dalsiButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(vysledekText, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(csTexty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(enTexty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(deTexty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dalsiButton)
                    .addComponent(vysledekText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(StornoButton))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
       actionButton = "OK";
       /* Uvolní objekt formuláře z paměti */
       this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void StornoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StornoButtonActionPerformed
        actionButton = "Storno";
       this.dispose();
    }//GEN-LAST:event_StornoButtonActionPerformed

    private void enTextyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enTextyActionPerformed
        
    }//GEN-LAST:event_enTextyActionPerformed

    private void dalsiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dalsiButtonActionPerformed
      if(!words[1][1].equalsIgnoreCase(getanglicky())){
                this.chyby++;
                this.vysledekText.setText("spatne"); 
           } 
            if(!words[2][1].equalsIgnoreCase(getnemecky())){
                this.chyby++;
                this.vysledekText.setText("spatne");
           } 
            if(!words[0][1].equalsIgnoreCase(getcesky())){
                this.chyby++;
                this.vysledekText.setText("spatne");  
           }
            this.vysledekText.setText("vyporne");  
              
    }//GEN-LAST:event_dalsiButtonActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton StornoButton;
    private javax.swing.JTextField csTexty;
    private javax.swing.JButton dalsiButton;
    private javax.swing.JTextField deTexty;
    private javax.swing.JTextField enTexty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField vysledekText;
    // End of variables declaration//GEN-END:variables
}