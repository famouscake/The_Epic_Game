/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package epicgame;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author Peter
 */
public abstract class Space_Object {
    
    protected BufferedImage image;
    public int x,y;
    public int width,height;
    public boolean active;
    
    
    public void paint(Graphics a){
        if(active)
            a.drawImage(image,x,y,width,height, null);
    }
    
    void move(int offset_x,int offset_y)
    {
        if(active)
        {
            x+=offset_x;
            y+=offset_y;
        }
    }

    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isActive() {
        return active;
    }
    
    
}
