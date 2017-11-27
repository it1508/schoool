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
public class Endo extends Cars{
    private float TurnAvg = (float) 2.15;
    private float width = (float) 82.30;
    private float height =  (float) 31.80;
    private float lenght = (float) 128.96;
    private int SurfArea = 33679;

    
    public Endo(String jmeno) {
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
        return super.toString() + "[Endo]";
    }
    
}
