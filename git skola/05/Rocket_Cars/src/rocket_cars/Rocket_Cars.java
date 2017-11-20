/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rocket_cars;


import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author student
 */
public class Rocket_Cars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cars student = new Cars("Maistrstyk", Cars.Position.STRIKER);
        List<Cars> lide = new ArrayList<Cars>(); 
        lide.add(student);
        
        for(Cars clovek : lide) {
            System.out.println(clovek.toString());
        }
    }
    
}
