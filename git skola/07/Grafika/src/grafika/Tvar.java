/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafika;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author student
 */
abstract class Tvar {
    protected Point point;
    protected Color color;
    protected boolean fill;
    protected boolean active;
    protected Tvar(int x, int y,boolean fill){
        this.point = new Point(x,y);
        int red = (int)Math.floor(Math.random()*256);
        int green = (int)Math.floor(Math.random()*256);
        int blue = (int)Math.floor(Math.random()*256);
        this.color = new Color(red,green,blue);
        this.fill = fill;
    }
    
    public boolean setActive(int curX, int curY){
        if(this.detect(curX,curY)) {
            this.active = true;
        } else {
            this.active = false;
        }
        return this.active;
    }
    
    abstract public boolean detect(int x, int y);
    abstract public void paint(Graphics g);
    abstract public void animate(Platno p);
}


