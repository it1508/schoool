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
    private Color first = Color.BLUE;
    private Color second = Color.GREEN;
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

    public Color getFirst() {
        return first;
    }

    public void setFirst(Color first) {
        this.first = first;
    }

    public Color getSecond() {
        return second;
    }

    public void setSecond(Color second) {
        this.second = second;
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
