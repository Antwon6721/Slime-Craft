/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SlimeCraft;

import java.awt.Color;

/**
 *
 * @author 641580
 */
public class Blob extends Slime {
    private static final int SPEED = 5;
    private static final Color COLOR = Color.BLUE;
        
    public Blob(int x, int y) {
        super(SPEED, x, y, COLOR);
    }  
    
    
}