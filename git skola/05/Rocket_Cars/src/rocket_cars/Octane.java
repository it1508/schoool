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
public class Octane extends Cars {
    private float TurnAvg = (float) 2.18;
    private float Width = (float) 84.20;
    private float height =  (float) 36.16;
    private float lenght = (float) 118.01;
    private int SurfArea = 34495;
    
    
    public Octane(String jmeno) {
        super(jmeno);
    }
    
    public float getTurnAvg() {
        return TurnAvg;
    }

    public void setTurnAvg(float TurnAvg) {
        this.TurnAvg = TurnAvg;
    }

    public float getWidth() {
        return Width;
    }

    public void setWidth(float Width) {
        this.Width = Width;
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
        return super.toString() + "[Octane]";
    }
}
