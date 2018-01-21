/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafika;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.Timer;

/**
 *
 * @author student
 */


public class Platno extends JComponent implements MouseListener, MouseMotionListener, KeyListener, ActionListener {
    private Point p = new Point(100,100);
    private boolean drag;
    private int score;
    ArrayList<Tvar> points;
    private Timer timer;
    private int pocet =1;
    private int time = 30;
    private Tvar activeObj;
    private Font myFont = new Font("Aerial", Font.BOLD, 18);
    private Font myFont2 = new Font("Aerial", Font.BOLD, 60);
    
    
    public Platno() {
        this.points = new ArrayList();

    }
    
    public void start(){
        /*if(timer.isRunning())
            do{
                time--;
            }while(timer.isRepeats());*/
    }
    
    public void setPoint(int x, int y,boolean fill){
        p = new Point(x,y);
        this.points.add(new Kruh(p.x,p.y,fill));
        this.activeObj = this.points.get(this.points.size()-1);
    }
    
    public void setAxis(int x, int y){
        
    }
    
    public void init() {
        this.addMouseListener(this);
        this.addMouseMotionListener(this); 
        this.addKeyListener(this);
        this.setFocusable(true);
        this.timer = new Timer(1000,this);
        timer.start();
    }
    
    public void drawPoints(Graphics g){
        for(Tvar b: this.points){
            b.paint(g);
        }
    }
    
    public void drawAxis(Graphics g, Dimension size){
        Graphics2D g2d = (Graphics2D) g;
        float tloustka = 1f;
        float miterLimit = 20f;
        float[] dashPattern = {5f};
        float dashPhase = 5f;
        BasicStroke stroke = new BasicStroke(tloustka,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,miterLimit,dashPattern,dashPhase);
        g2d.setStroke(stroke);
        g2d.setColor(Color.gray);
        g2d.drawLine(0, p.y, size.width, p.y);
        g2d.drawLine(p.x, 0, p.x, size.height);
    }
    
    public void paint(Graphics g){
        g.setColor(Color.green);
        Dimension size = this.getSize();
        g.fillRect(0, 0, size.width, size.height);
        drawAxis(g, size);
        drawPoints(g);
        drawDistance(g,size);
        drawEndGame(g,size);
    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {
        if (me.getButton() == 1) {
            drag = true;
        }
        if (me.getButton() != 1){
            drag = false;
        }
        for(Tvar t: this.points){
            
            if(t.getActive()){
                this.activeObj = t;
                this.points.remove(t);
                score++;
                int x = (int)Math.floor(Math.random()*getWidth());
                int y = (int)Math.floor(Math.random()*getHeight());
                setPoint(x,y,true);
                this.repaint();
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println(me.getButton());
        if (me.getButton() == 3) {
            this.setPoint(me.getX(),me.getY(),false);
        }
        if (me.getButton() == 2) {
            this.setPoint(me.getX(),me.getY(),true);
        }
        this.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }

    @Override
    public void mouseDragged(MouseEvent me) {
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        System.out.println("x:"+me.getX()+" y:"+me.getY());
        for(Tvar t: this.points){
            t.setActive(me.getX(),me.getY());
        }
        p.x = me.getX();
        p.y = me.getY();
        this.repaint();
    }
    
    public void drawDistance(Graphics g,Dimension size){
        String str = "Points: " + score;
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(myFont);
        g2.setColor(Color.white);
        g2.drawString(str, size.width-120, size.height-450);
        String str2 = "Time: " + time;
        Graphics2D g3 = (Graphics2D) g;
        g3.setFont(myFont);
        g3.setColor(Color.white);
        g3.drawString(str2, size.width-720, size.height-450);
    }
    
        public void drawEndGame(Graphics g,Dimension size){
        if(time <= 0){
            String str = "Score: " + score;
            String str2 = "GAME OVER";
            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(myFont2);
            g2.setColor(Color.red);     
            g2.drawString(str, size.width/2 -150, 290);
            g2.drawString(str2, size.width/2 -150, 220);
            timer.stop();
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {

    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        for(Tvar t: this.points){
            t.animate(this);
            
        }
        if(pocet == 1){
            int x = (int)Math.floor(Math.random()*getWidth());
            int y = (int)Math.floor(Math.random()*getHeight());
            setPoint(x,y,true);
            pocet++;
        }
        time--;
        this.repaint();
    }
    
}
