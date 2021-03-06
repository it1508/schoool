/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;

/**
 *
 * @author student
 */


    

public class MainWindow extends javax.swing.JFrame {
    private File file;
    private final CustomFile txtFile = new CustomFile();
    private String charset = "UTF-8";
    private String copy = "";
    private String take = "";
    private String searchText = "";
    private String replText = "";
    
        
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codingGroup = new javax.swing.ButtonGroup();
        ToolBar = new javax.swing.JToolBar();
        ToolBarNew = new javax.swing.JButton();
        ToolBarOpen = new javax.swing.JButton();
        ToolBarSave = new javax.swing.JButton();
        Footer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        editorPane = new javax.swing.JScrollPane();
        editor = new javax.swing.JEditorPane();
        MenuBar = new javax.swing.JMenuBar();
        MenuFile = new javax.swing.JMenu();
        itemNewMF = new javax.swing.JMenuItem();
        itemOpenMF = new javax.swing.JMenuItem();
        itemSaveMF = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemInfoMF = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemExitMF = new javax.swing.JMenuItem();
        MenuEdit = new javax.swing.JMenu();
        itemTakeME = new javax.swing.JMenuItem();
        itemCopyME = new javax.swing.JMenuItem();
        itemPasteME = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        itemFindME = new javax.swing.JMenuItem();
        itemReplaceME = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itemAllME = new javax.swing.JMenuItem();
        MenuSettings = new javax.swing.JMenu();
        itemMenuShow = new javax.swing.JMenu();
        itemToolBar = new javax.swing.JCheckBoxMenuItem();
        itemStatusBar = new javax.swing.JCheckBoxMenuItem();
        itemColor = new javax.swing.JMenuItem();
        itemFont = new javax.swing.JMenuItem();
        itemMenuCoding = new javax.swing.JMenu();
        itemCodeUTF = new javax.swing.JRadioButtonMenuItem();
        itemCodeWindows = new javax.swing.JRadioButtonMenuItem();
        itemCodeISO = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mrkvosoft Vord");
        setPreferredSize(new java.awt.Dimension(800, 600));

        ToolBar.setFloatable(false);
        ToolBar.setRollover(true);

        ToolBarNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/icons/new.png"))); // NOI18N
        ToolBarNew.setText("New");
        ToolBarNew.setFocusable(false);
        ToolBarNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ToolBarNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBarNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToolBarNewActionPerformed(evt);
            }
        });
        ToolBar.add(ToolBarNew);

        ToolBarOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/icons/open.png"))); // NOI18N
        ToolBarOpen.setText("Open");
        ToolBarOpen.setFocusable(false);
        ToolBarOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ToolBarOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBarOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToolBarOpenActionPerformed(evt);
            }
        });
        ToolBar.add(ToolBarOpen);

        ToolBarSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/icons/save.png"))); // NOI18N
        ToolBarSave.setText("Save");
        ToolBarSave.setFocusable(false);
        ToolBarSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ToolBarSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBarSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToolBarSaveActionPerformed(evt);
            }
        });
        ToolBar.add(ToolBarSave);

        Footer.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("File Name: ");
        jLabel1.setOpaque(true);
        Footer.add(jLabel1);

        jLabel2.setBackground(new java.awt.Color(255, 153, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Properties:");
        jLabel2.setOpaque(true);
        Footer.add(jLabel2);

        jLabel3.setBackground(new java.awt.Color(0, 153, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("label");
        jLabel3.setOpaque(true);
        Footer.add(jLabel3);

        editor.setBackground(new java.awt.Color(255, 255, 255));
        editor.setCaretColor(new java.awt.Color(0, 0, 0));
        editorPane.setViewportView(editor);

        MenuFile.setText("File");

        itemNewMF.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        itemNewMF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/icons/new-small.png"))); // NOI18N
        itemNewMF.setText("New");
        MenuFile.add(itemNewMF);

        itemOpenMF.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        itemOpenMF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/icons/open-small.png"))); // NOI18N
        itemOpenMF.setText("Open");
        itemOpenMF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOpenMFActionPerformed(evt);
            }
        });
        MenuFile.add(itemOpenMF);

        itemSaveMF.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        itemSaveMF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/icons/save-small.png"))); // NOI18N
        itemSaveMF.setText("Save");
        itemSaveMF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSaveMFActionPerformed(evt);
            }
        });
        MenuFile.add(itemSaveMF);
        MenuFile.add(jSeparator1);

        itemInfoMF.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        itemInfoMF.setText("File Information");
        itemInfoMF.setEnabled(false);
        itemInfoMF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInfoMFActionPerformed(evt);
            }
        });
        MenuFile.add(itemInfoMF);
        MenuFile.add(jSeparator2);

        itemExitMF.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        itemExitMF.setText("Exit");
        MenuFile.add(itemExitMF);

        MenuBar.add(MenuFile);

        MenuEdit.setText("Edit");

        itemTakeME.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        itemTakeME.setText("Take");
        itemTakeME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTakeMEActionPerformed(evt);
            }
        });
        MenuEdit.add(itemTakeME);

        itemCopyME.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itemCopyME.setText("Copy");
        MenuEdit.add(itemCopyME);

        itemPasteME.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        itemPasteME.setText("Paste");
        MenuEdit.add(itemPasteME);
        MenuEdit.add(jSeparator4);

        itemFindME.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        itemFindME.setText("Find");
        itemFindME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFindMEActionPerformed(evt);
            }
        });
        MenuEdit.add(itemFindME);

        itemReplaceME.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        itemReplaceME.setText("Replace");
        itemReplaceME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReplaceMEActionPerformed(evt);
            }
        });
        MenuEdit.add(itemReplaceME);
        MenuEdit.add(jSeparator3);

        itemAllME.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itemAllME.setText("Select All");
        MenuEdit.add(itemAllME);

        MenuBar.add(MenuEdit);

        MenuSettings.setText("Settigns");

        itemMenuShow.setText("Show");

        itemToolBar.setSelected(true);
        itemToolBar.setText("Tool Bar");
        itemToolBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemToolBarActionPerformed(evt);
            }
        });
        itemMenuShow.add(itemToolBar);

        itemStatusBar.setSelected(true);
        itemStatusBar.setText("Status Bar");
        itemStatusBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemStatusBarActionPerformed(evt);
            }
        });
        itemMenuShow.add(itemStatusBar);

        MenuSettings.add(itemMenuShow);

        itemColor.setText("Background Color ...");
        itemColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemColorActionPerformed(evt);
            }
        });
        MenuSettings.add(itemColor);

        itemFont.setText("Font ...");
        itemFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFontActionPerformed(evt);
            }
        });
        MenuSettings.add(itemFont);

        itemMenuCoding.setText("Coding");

        codingGroup.add(itemCodeUTF);
        itemCodeUTF.setText("UTF-8");
        itemCodeUTF.setToolTipText("");
        itemMenuCoding.add(itemCodeUTF);

        codingGroup.add(itemCodeWindows);
        itemCodeWindows.setSelected(true);
        itemCodeWindows.setText("Windows 1250");
        itemCodeWindows.setToolTipText("");
        itemMenuCoding.add(itemCodeWindows);

        codingGroup.add(itemCodeISO);
        itemCodeISO.setText("ISO-8859-2");
        itemCodeISO.setToolTipText("");
        itemMenuCoding.add(itemCodeISO);

        MenuSettings.add(itemMenuCoding);

        MenuBar.add(MenuSettings);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editorPane)
                    .addComponent(Footer, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(editorPane, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Footer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private String info(){
        String info = "";
        info+="File name: "+file.getName() + "\n";
        info+="Path: " + file.getParent() + "\n";
        info+="Size: " + String.valueOf(file.length())+ " bytes \n";
        info+="Rights: ";
        info+= file.canRead() ? "R": "-";
        info+= file.canWrite() ? "W": "-";
        info+= file.canExecute() ? "X\n ": "-\n";
        info+= "Hidden: " + (file.isHidden()? "Yes\n":"No\n");
        Date date = new Date();
        date.setTime(file.lastModified());
        info += "Last update: " + date.toString();
        return info;
    }
    
    private void ToolBarNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToolBarNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToolBarNewActionPerformed

    private void itemToolBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemToolBarActionPerformed
        if(itemToolBar.isSelected())
            ToolBar.setVisible(true);
        else
            ToolBar.setVisible(false);
    }//GEN-LAST:event_itemToolBarActionPerformed

    private void itemStatusBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemStatusBarActionPerformed
        if(itemStatusBar.isSelected())
            Footer.setVisible(true);
        else
            Footer.setVisible(false);
    }//GEN-LAST:event_itemStatusBarActionPerformed

    private void itemColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemColorActionPerformed
         Color newColor = JColorChooser.showDialog(
                     editor,
                     "Choose Background Color",
                     editor.getBackground());
                if(newColor != null){
                    editor.setBackground(newColor);
                }
    }//GEN-LAST:event_itemColorActionPerformed
    
    private void searchOperation(String foundTxt, String replacedTxt, Boolean replace){
        editor.requestFocusInWindow();
        int startFrom = (editor.getCaretPosition() == editor.getDocument().getLength()) ? 0 :editor.getCaretPosition();
        int max = editor.getDocument().getLength() - startFrom;
        int searchIndex = -1;
        try {
            searchIndex = editor.getDocument().getText(startFrom, max).indexOf(foundTxt);
        } catch (BadLocationException ex){
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(searchIndex != -1){
            editor.select(searchIndex + startFrom,searchIndex+startFrom + foundTxt.length());
            if(replace){
                editor.replaceSelection(replacedTxt);
            }
        } else {
            JOptionPane.showMessageDialog(this, "5etězec nebyl nalezen");
            editor.setSelectionStart(-1);
            editor.setSelectionEnd(-1);
        }
    }
    
    
    private void itemOpenMFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOpenMFActionPerformed
       try{
        JFileChooser fc = new JFileChooser();
        fc.setDialogType(JFileChooser.OPEN_DIALOG);
        fc.setDialogTitle("Choose file to open");
        fc.setCurrentDirectory(new java.io.File("."));
        FileNameExtensionFilter myFilter = new FileNameExtensionFilter("Text","txt");
        fc.setFileFilter(myFilter);

        if(fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            file = fc.getSelectedFile();
            try{
                txtFile.load(file, charset);
                editor.setText(txtFile.getData());
            }catch(FileNotFoundException ex){
                JOptionPane.showMessageDialog(this, "File not found", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }

       }catch(Exception e){
           JOptionPane.showMessageDialog(this, "Error when opening file!", "Error!", JOptionPane.ERROR_MESSAGE);
       }
       itemInfoMF.setEnabled(true);
    }//GEN-LAST:event_itemOpenMFActionPerformed

    private void itemSaveMFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSaveMFActionPerformed
       try{
            JFileChooser fc = new JFileChooser();
            fc.setDialogType(JFileChooser.SAVE_DIALOG);
            fc.setDialogTitle("Save file");
            fc.setCurrentDirectory(new java.io.File("."));
            FileNameExtensionFilter myFilter = new FileNameExtensionFilter("Text","txt");
            fc.setFileFilter(myFilter);
            if(fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){

                    txtFile.setData(editor.getText());
                    txtFile.save(fc.getSelectedFile(), charset);

            }
       }catch(Exception e){
           JOptionPane.showMessageDialog(this, "Error when saving file!", "Error!", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_itemSaveMFActionPerformed

    private void itemInfoMFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInfoMFActionPerformed
        if(file != null)
            JOptionPane.showMessageDialog(new JFrame(), info(), "File Information", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_itemInfoMFActionPerformed

    private void itemTakeMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTakeMEActionPerformed
        take = editor.getSelectedText();
        
    }//GEN-LAST:event_itemTakeMEActionPerformed

    private void itemFindMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFindMEActionPerformed
        searchText = JOptionPane.showInputDialog(this,"zadej hledaný ře");
        this.searchOperation(searchText, null, false);
    }//GEN-LAST:event_itemFindMEActionPerformed

    private void itemReplaceMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReplaceMEActionPerformed
      
        okno1 nahraditDialog = new okno1(this, true,replText, searchText );
        if (nahraditDialog.showDialog().equals("Nahradit")){
            editor.requestFocusInWindow();
            searchText = nahraditDialog.getNahraditText();
            replText = nahraditDialog.getNovyText();
            this.searchOperation(searchText, replText, true);
        }
    }//GEN-LAST:event_itemReplaceMEActionPerformed

    private void ToolBarOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToolBarOpenActionPerformed
        try{
        JFileChooser fc = new JFileChooser();
        fc.setDialogType(JFileChooser.OPEN_DIALOG);
        fc.setDialogTitle("Choose file to open");
        fc.setCurrentDirectory(new java.io.File("."));
        FileNameExtensionFilter myFilter = new FileNameExtensionFilter("Text","txt");
        fc.setFileFilter(myFilter);

        if(fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            file = fc.getSelectedFile();
            try{
                txtFile.load(file, charset);
                editor.setText(txtFile.getData());
            }catch(FileNotFoundException ex){
                JOptionPane.showMessageDialog(this, "File not found", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }

       }catch(Exception e){
           JOptionPane.showMessageDialog(this, "Error when opening file!", "Error!", JOptionPane.ERROR_MESSAGE);
       }
       itemInfoMF.setEnabled(true);
    }//GEN-LAST:event_ToolBarOpenActionPerformed

    private void ToolBarSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToolBarSaveActionPerformed
        try{
            JFileChooser fc = new JFileChooser();
            fc.setDialogType(JFileChooser.SAVE_DIALOG);
            fc.setDialogTitle("Save file");
            fc.setCurrentDirectory(new java.io.File("."));
            FileNameExtensionFilter myFilter = new FileNameExtensionFilter("Text","txt");
            fc.setFileFilter(myFilter);
            if(fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){

                    txtFile.setData(editor.getText());
                    txtFile.save(fc.getSelectedFile(), charset);

            }
       }catch(Exception e){
           JOptionPane.showMessageDialog(this, "Error when saving file!", "Error!", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_ToolBarSaveActionPerformed

    private void itemFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFontActionPerformed
        fontDialog fontDialog = new fontDialog(this, true );
        
    }//GEN-LAST:event_itemFontActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Footer;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuEdit;
    private javax.swing.JMenu MenuFile;
    private javax.swing.JMenu MenuSettings;
    private javax.swing.JToolBar ToolBar;
    private javax.swing.JButton ToolBarNew;
    private javax.swing.JButton ToolBarOpen;
    private javax.swing.JButton ToolBarSave;
    private javax.swing.ButtonGroup codingGroup;
    private javax.swing.JEditorPane editor;
    private javax.swing.JScrollPane editorPane;
    private javax.swing.JMenuItem itemAllME;
    private javax.swing.JRadioButtonMenuItem itemCodeISO;
    private javax.swing.JRadioButtonMenuItem itemCodeUTF;
    private javax.swing.JRadioButtonMenuItem itemCodeWindows;
    private javax.swing.JMenuItem itemColor;
    private javax.swing.JMenuItem itemCopyME;
    private javax.swing.JMenuItem itemExitMF;
    private javax.swing.JMenuItem itemFindME;
    private javax.swing.JMenuItem itemFont;
    private javax.swing.JMenuItem itemInfoMF;
    private javax.swing.JMenu itemMenuCoding;
    private javax.swing.JMenu itemMenuShow;
    private javax.swing.JMenuItem itemNewMF;
    private javax.swing.JMenuItem itemOpenMF;
    private javax.swing.JMenuItem itemPasteME;
    private javax.swing.JMenuItem itemReplaceME;
    private javax.swing.JMenuItem itemSaveMF;
    private javax.swing.JCheckBoxMenuItem itemStatusBar;
    private javax.swing.JMenuItem itemTakeME;
    private javax.swing.JCheckBoxMenuItem itemToolBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
