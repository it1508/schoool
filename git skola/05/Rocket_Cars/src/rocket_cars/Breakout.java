/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rocket_cars;

/**
 *
 * @author student
 */
public class Breakout extends Cars{
    private float TurnAvg = (float) 2.22;
    private float width = (float) 76.37;
    private float height =  (float) 30.30;
    private float lenght = (float) 131.49;
    private int SurfArea = 32679;

    
    public Breakout(String jmeno) {
        super(jmeno);
    }
    
    public float getTurnAvg() {
        return TurnAvg;
    }

    public void setTurnAvg(float TurnAvg) {
        this.TurnAvg = TurnAvg;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public int getSurfArea() {
        return SurfArea;
    }

    public void setSurfArea(int SurfArea) {
        this.SurfArea = SurfArea;
    }
    
    @Override
    public String toString() {
        return super.toString() + "[Breakout]";
    }
    
}
