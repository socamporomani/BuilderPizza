/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author r618b
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Pizza miPizzaHawaiana;
        
        miPizzaHawaiana = new PizzaBuilder(500, 350f)
                .setGrPiña(100)
                .setGrSal(5f)
                .setGrQueso(10f)
                .setGrTomate(30f)
                .createPizza();
        
        System.out.println(miPizzaHawaiana.toString());


    }
    
}
