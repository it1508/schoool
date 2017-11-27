/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rocket_cars;

import rocket_cars.Cars.Position;

/**
 *
 * @author student
 */
public class CarEdit extends javax.swing.JDialog {
    private Cars car;
    private String actionButton = "Storno";
    /**
     * Creates new form CarEdit
     * 
     */
    public CarEdit(java.awt.Frame rodic, boolean modal, Cars car) {
        super(rodic, modal);
        initComponents();
        this.car = car;
        name.setText(car.getName());
        if (car.getPosition() == Position.GOALKEEPER) {
            GoalkeeperButton.setSelected(true);
        } else {
            StrikerButton.setSelected(true);            
        }
    }
    
    public String showDialog() {
        this.setVisible(true);
        return actionButton;
    }
    
    public Cars getCar(){
        this.car.setName(name.getText());
        
        
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

        PositionButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        GoalkeeperButton = new javax.swing.JRadioButton();
        StrikerButton = new javax.swing.JRadioButton();
        name = new javax.swing.JTextField();
        OkButton = new javax.swing.JButton();
        StornoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Jméno");

        jLabel2.setText("1.barva");

        jLabel3.setText("2.barva");

        jLabel4.setText("Pozice");

        PositionButtonGroup.add(GoalkeeperButton);
        GoalkeeperButton.setSelected(true);
        GoalkeeperButton.setText("Goalkeeper");

        PositionButtonGroup.add(StrikerButton);
        StrikerButton.setText("Striker");
        StrikerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrikerButtonActionPerformed(evt);
            }
        });

        OkButton.setText("OK");
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });

        StornoButton.setText("Storno");
        StornoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StornoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(139, 139, 139)
                                .addComponent(GoalkeeperButton)
                                .addGap(50, 50, 50)
                                .addComponent(StrikerButton))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(98, 98, 98)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(OkButton)
                        .addGap(131, 131, 131)
                        .addComponent(StornoButton)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GoalkeeperButton)
                        .addComponent(StrikerButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OkButton)
                    .addComponent(StornoButton))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StrikerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StrikerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StrikerButtonActionPerformed

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        actionButton = "OK";
        this.dispose();
    }//GEN-LAST:event_OkButtonActionPerformed

    private void StornoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StornoButtonActionPerformed
        actionButton = "Storno";
        this.dispose();
    }//GEN-LAST:event_StornoButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton GoalkeeperButton;
    private javax.swing.JButton OkButton;
    private javax.swing.ButtonGroup PositionButtonGroup;
    private javax.swing.JButton StornoButton;
    private javax.swing.JRadioButton StrikerButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}