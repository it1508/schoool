/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rocket_cars;

import java.awt.Color;

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
    }

    public int getGreen1() {
        return Green1;
    }

    public void setGreen1(int Green1) {
        this.Green1 = Green1;
    }

    public int getBlue1() {
        return Blue1;
    }

    public void setBlue1(int Blue1) {
        this.Blue1 = Blue1;
    }

    public int getGreen2() {
        return Green2;
    }

    public void setGreen2(int Green2) {
        this.Green2 = Green2;
    }

    public int getRed2() {
        return Red2;
    }

    public void setRed2(int Red2) {
        this.Red2 = Red2;
    }

    public int getBlue2() {
        return Blue2;
    }

    public void setBlue2(int Blue2) {
        this.Blue2 = Blue2;
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
