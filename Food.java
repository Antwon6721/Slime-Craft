package SlimeCraft;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 641580
 */
public class Food extends Sprite {

    private static final Color COLOR = new Color(0, 144, 255);
    private static final int WIDTH = 5;
    private static final int HEIGHT = 5;
    private static final int SPEED = 0;

    public Food (int x, int y) {
        super(SPEED, x, y, WIDTH, HEIGHT, COLOR);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(super.getColor());
        g.drawOval(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }

}