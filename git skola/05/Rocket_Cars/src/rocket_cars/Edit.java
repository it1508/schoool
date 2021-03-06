/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rocket_cars;

import rocket_cars.Cars.Position;
import java.awt.Color;

/**
 *
 * @author student
 */
public class Edit extends javax.swing.JDialog {
    private Cars car;
    private String actionButton = "Storno";
    /**
     * Creates new form Edit
     */
    public Edit(java.awt.Frame parent, boolean modal, Cars car) {
        super(parent, modal);
        initComponents();
        this.car = car;
        name.setText(car.getName());
        BSpinner1.setValue(car.getBlue1());
        BSpinner2.setValue(car.getBlue2());
        GSpinner1.setValue(car.getGreen1());
        GSpinner2.setValue(car.getGreen2());
        RSpinner1.setValue(car.getRed1());
        RSpinner2.setValue(car.getRed2());
        if (car.getPosition() == Position.GOALKEEPER) {
            GoalkeeperButton.setSelected(true);
        } else {
            StrikerButton.setSelected(true);            
        }
        
        
        if (car.getClass().getSimpleName().equalsIgnoreCase("Endo")) {
            imageLabel.setIcon(new javax.swing.ImageIcon("endo.png"));
        } else if (car.getClass().getSimpleName().equalsIgnoreCase("Octane")) {
            imageLabel.setIcon(new javax.swing.ImageIcon("octane.png"));
        } else
            imageLabel.setIcon(new javax.swing.ImageIcon("breakout2.png"));
    }
    
    public String showDialog() {
        this.setVisible(true);
        return actionButton;
    }
    
    public Cars getCar(){
        this.car.setName(name.getText());
        this.car.setBlue1((int)BSpinner1.getValue());
        this.car.setBlue2((int)BSpinner2.getValue());
        this.car.setRed1((int)RSpinner1.getValue());
        this.car.setRed2((int)RSpinner2.getValue());
        this.car.setGreen1((int)GSpinner1.getValue());
        this.car.setGreen2((int)GSpinner2.getValue());
        if (GoalkeeperButton.isSelected()) {
            this.car.setPosition(Position.GOALKEEPER);
        } else {
            this.car.setPosition(Position.STRIKER);
        }
        return this.car;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        GoalkeeperButton = new javax.swing.JRadioButton();
        StrikerButton = new javax.swing.JRadioButton();
        name = new javax.swing.JTextField();
        OKButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        ColorPanel1 = new javax.swing.JPanel();
        ColorPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        RSpinner1 = new javax.swing.JSpinner();
        GSpinner1 = new javax.swing.JSpinner();
        BSpinner1 = new javax.swing.JSpinner();
        RSpinner2 = new javax.swing.JSpinner();
        GSpinner2 = new javax.swing.JSpinner();
        BSpinner2 = new javax.swing.JSpinner();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Jméno");

        jLabel2.setText("1.barva");

        jLabel3.setText("2.barva");

        jLabel4.setText("Pozice");

        buttonGroup1.add(GoalkeeperButton);
        GoalkeeperButton.setSelected(true);
        GoalkeeperButton.setText("Goalkeeper");

        buttonGroup1.add(StrikerButton);
        StrikerButton.setText("Striker");

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        ColorPanel1.setBackground(new java.awt.Color(255, 255, 255));
        ColorPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout ColorPanel1Layout = new javax.swing.GroupLayout(ColorPanel1);
        ColorPanel1.setLayout(ColorPanel1Layout);
        ColorPanel1Layout.setHorizontalGroup(
            ColorPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );
        ColorPanel1Layout.setVerticalGroup(
            ColorPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );

        ColorPanel2.setBackground(new java.awt.Color(255, 255, 255));
        ColorPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout ColorPanel2Layout = new javax.swing.GroupLayout(ColorPanel2);
        ColorPanel2.setLayout(ColorPanel2Layout);
        ColorPanel2Layout.setHorizontalGroup(
            ColorPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );
        ColorPanel2Layout.setVerticalGroup(
            ColorPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );

        jLabel5.setText("R");

        jLabel6.setText("G");

        jLabel7.setText("B");

        jLabel8.setText("R");

        jLabel9.setText("G");

        jLabel10.setText("B");

        RSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                RSpinner1StateChanged(evt);
            }
        });

        GSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                GSpinner1StateChanged(evt);
            }
        });

        BSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BSpinner1StateChanged(evt);
            }
        });

        RSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                RSpinner2StateChanged(evt);
            }
        });

        GSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                GSpinner2StateChanged(evt);
            }
        });

        BSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BSpinner2StateChanged(evt);
            }
        });

        imageLabel.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(OKButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ColorPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(63, 63, 63)
                                .addComponent(GoalkeeperButton)
                                .addGap(59, 59, 59)
                                .addComponent(StrikerButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ColorPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(CloseButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(imageLabel)))
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(198, 198, 198))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(RSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(GSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(BSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(ColorPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(jLabel3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel5)
                                                    .addComponent(RSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(GSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(BSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(ColorPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(GoalkeeperButton)
                            .addComponent(StrikerButton))
                        .addGap(44, 44, 44)
                        .addComponent(OKButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CloseButton)
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        actionButton = "OK";
        this.dispose();
    }//GEN-LAST:event_OKButtonActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
         actionButton = "Storno";
        this.dispose();
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void RSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_RSpinner1StateChanged
        int b = (int)BSpinner1.getValue();
        int r = (int)RSpinner1.getValue();
        int g = (int)GSpinner1.getValue();
        ColorPanel1.setBackground( new Color(r,g,b) );
    }//GEN-LAST:event_RSpinner1StateChanged

    private void GSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_GSpinner1StateChanged
        int b = (int)BSpinner1.getValue();
        int r = (int)RSpinner1.getValue();
        int g = (int)GSpinner1.getValue();
        ColorPanel1.setBackground( new Color(r,g,b) );
    }//GEN-LAST:event_GSpinner1StateChanged

    private void BSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BSpinner1StateChanged
        int b = (int)BSpinner1.getValue();
        int r = (int)RSpinner1.getValue();
        int g = (int)GSpinner1.getValue();
        ColorPanel1.setBackground( new Color(r,g,b) );
    }//GEN-LAST:event_BSpinner1StateChanged

    private void RSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_RSpinner2StateChanged
        int r2 = (int)RSpinner2.getValue();
        int g2= (int)GSpinner2.getValue();
        int b2 = (int)BSpinner2.getValue();
        ColorPanel2.setBackground( new Color(r2,g2,b2) );
    }//GEN-LAST:event_RSpinner2StateChanged

    private void GSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_GSpinner2StateChanged
        int r2 = (int)RSpinner2.getValue();
        int g2= (int)GSpinner2.getValue();
        int b2 = (int)BSpinner2.getValue();
        ColorPanel2.setBackground( new Color(r2,g2,b2) );
    }//GEN-LAST:event_GSpinner2StateChanged

    private void BSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BSpinner2StateChanged
        int r2 = (int)RSpinner2.getValue();
        int g2= (int)GSpinner2.getValue();
        int b2 = (int)BSpinner2.getValue();
        ColorPanel2.setBackground( new Color(r2,g2,b2) );
    }//GEN-LAST:event_BSpinner2StateChanged

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner BSpinner1;
    private javax.swing.JSpinner BSpinner2;
    private javax.swing.JButton CloseButton;
    private javax.swing.JPanel ColorPanel1;
    private javax.swing.JPanel ColorPanel2;
    private javax.swing.JSpinner GSpinner1;
    private javax.swing.JSpinner GSpinner2;
    private javax.swing.JRadioButton GoalkeeperButton;
    private javax.swing.JButton OKButton;
    private javax.swing.JSpinner RSpinner1;
    private javax.swing.JSpinner RSpinner2;
    private javax.swing.JRadioButton StrikerButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
