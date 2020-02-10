/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SlimeCraft;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 641580
 */
public class Food extends Sprite{
   private static final int WIDTH = 5;
   private static final int HEIGHT = 3;
   private static final int SPEED = 0;
   private static final Color COLOR = Color.WHITE; 
    
    public Food( int x, int y) {
        super(SPEED, x, y, WIDTH, HEIGHT, COLOR);
    }
    
    /**
     *
     * @param g
     */
    @Override
    public void draw(Graphics g) {
        g.setColor(super.getColor());
        g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight()); 
    }
}
