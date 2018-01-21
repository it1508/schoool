/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafika;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author student
 */
public class Grafika {

    private JFrame window;
    private JButton drawButton;
    private JButton restartButton;
    private JLabel headLabel;
    private JLabel pocet;
    private JLabel record;
    private JLabel cas;
    private Image image;
    private Timer timer;
    
    
    public Grafika(String title,int width,int height){
;
        window = new JFrame(title);
        try{
            this.image = ImageIO.read(this.getClass().getResource("terc.png"));
        }catch(IOException ex){
            
        }
        window.setIconImage(this.image);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(width,height);
        /*Vytvoreni napisu okna*/
        headLabel = new JLabel(title);
        int style = Font.BOLD | Font.ITALIC;
        Font font = new Font("Arial",style,25);
        headLabel.setFont(font);
        headLabel.setBackground(Color.red);
        headLabel.setOpaque(true);
        headLabel.setForeground(Color.blue);
        headLabel.setBorder(new EmptyBorder(10,0,10,0));
        headLabel.setHorizontalAlignment(JLabel.CENTER);
        /*Vytvoreni tlačítka*/
        /*pocet = new JLabel("0");
        pocet.setFont(font);
        pocet.setBackground(Color.red);
        pocet.setOpaque(true);
        pocet.setForeground(Color.white);
        pocet.setBorder(new EmptyBorder(0,20,0,20));
        pocet.setHorizontalAlignment(JLabel.LEFT);
        record = new JLabel("0");
        record.setFont(font);
        record.setBackground(Color.red);
        record.setOpaque(true);
        record.setForeground(Color.white);
        record.setBorder(new EmptyBorder(0,20,0,20));
        record.setHorizontalAlignment(JLabel.LEFT);
        cas = new JLabel("rip");
        cas.setFont(font);
        cas.setBackground(Color.red);
        cas.setOpaque(true);
        cas.setForeground(Color.white);
        cas.setBorder(new EmptyBorder(0,20,0,20));
        cas.setHorizontalAlignment(JLabel.LEFT);*/
        Platno platno = new Platno();
        platno.init();
        
        drawButton = new JButton("Start");
        drawButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                //System.out.println("udelano 10 objektu");
               /*if(platno.timer.isRunning()){
                    do{
                        platno.time--;
                    }while(platno.timer.);
               }
                for(int i=0;i<10;i++){
                    int x = (int)Math.floor(Math.random()*platno.getWidth());
                    int y = (int)Math.floor(Math.random()*platno.getHeight());
                    platno.setPoint(x,y,true);
                    platno.repaint();
                }*/
            }
            
        });
        restartButton = new JButton("Restart");
        restartButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Restart");
                timer.restart();
            }
            
        });
        
        Container pane = window.getContentPane();
        pane.add(headLabel,BorderLayout.PAGE_START);
        //pane.add(pocet,BorderLayout.LINE_START);
        //pane.add(record,BorderLayout.LINE_END);
        //pane.add(cas,BorderLayout.LINE_END);
        //pane.add(restartButton,BorderLayout.AFTER_LAST_LINE);
        //pane.add(restartButton,BorderLayout.AFTER_LINE_ENDS);
        pane.add(platno,BorderLayout.CENTER);
        window.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        new Grafika("Tref se!!",800,600);
    }
    
}
