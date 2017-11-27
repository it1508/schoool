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
public class Cars {
    public enum Position {
        GOALKEEPER,STRIKER
    }
    
    private String name;
    protected int boost = 100;
    private int Red1 = 255;
    private  int Green1 = 255;
    private int Blue1 = 255;
    private  int Green2 = 255;
    private int Red2 = 255;
    private  int Blue2 = 255;
    private Position position = Position.GOALKEEPER;
    
    public Cars(String jmeno){
       this.name = jmeno; 
    }
    
    public Cars(String jmeno, Position position){
        this.name = jmeno;
        this.setPosition(position);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRed1() {
        return Red1;
    }

    public void setRed1(int Red1) {
        if(Red1 >= 0 && Red1 < 256)
            this.Red1 = Red1;
        if(Red1 > 255)
            this.Red1 = 255;
        if(Red1 < 0)
            this.Red1 = 0;
    }

    public int getGreen1() {
        return Green1;
    }

    public void setGreen1(int Green1) {
        if(Green1 >= 0 && Green1 < 256)
            this.Green1 = Green1;
        if(Green1 > 255)
            this.Green1 = 255;
        if(Green1 < 0)
            this.Green1 = 0;
    }

    public int getBlue1() {
        return Blue1;
    }

    public void setBlue1(int Blue1) {
        if(Blue1 >= 0 && Blue1 < 256)
            this.Blue1 = Blue1;
        if(Blue1 > 255)
            this.Blue1 = 255;
        if(Blue1 < 0)
            this.Blue1 = 0;
    }

    public int getGreen2() {
        return Green2;
    }

    public void setGreen2(int Green2) {
        if(Green2 >= 0 && Green2 < 256)
            this.Green2 = Green2;
        if(Green2 > 255)
            this.Green2 = 255;
        if(Green2 < 0)
            this.Green2 = 0;
    }

    public int getRed2() {
        return Red2;
    }

    public void setRed2(int Red2) {
        if(Red2 >= 0 && Red2 < 256)
            this.Red2 = Red2;
        if(Red2 > 255)
            this.Red2 = 255;
        if(Red2 < 0)
            this.Red2 = 0;
    }

    public int getBlue2() {
        return Blue2;
    }

    public void setBlue2(int Blue2) {
        if(Blue2 >= 0 && Blue2 < 256)
            this.Blue2 = Blue2;
        if(Blue2 > 255)
            this.Blue2 = 255;
        if(Blue2 < 0)
            this.Blue2 = 0;
    }

    

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position Position) {
        this.position = Position;
    }
    
    
    
    @Override
    public String toString() {
        String output = this.name + "[Car]";
        return output;
    }
    
}
