/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio;

import java.util.Random;
/**
 *
 * @author Andressa
 */
public class Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random aleatorio = new Random();
        for(int i = 0; i < 5; i++) {
	    	System.out.println(aleatorio.nextInt(100));
	 	}
    }
    
}
