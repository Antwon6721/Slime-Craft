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
public class Glob extends Slime {
    private static final int SPEED = 3;
    private static final Color COLOR = Color.RED;
        
    public Glob(int x, int y) {
        super(SPEED, x, y, COLOR);
    }
    
    public Glob reproduce(Glob mate) {
        int newX = super.getX() + (int) (Math.random() * 30 - 15);
        int newY = super.getY() + (int) (Math.random() * 30 - 15);
        Glob baby = new Glob(newX, newY);
        return baby;
    }
}