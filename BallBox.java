import java.awt.*;
import java.awt.geom.*;
import java.util.Random;
/**
 * Write a description of class BallBox here.
 * 
 * @author (Jeremy Hixson) 
 * @version (10/19/15)
 */
public class BallBox
{
    public BallBox(Canvas drawingCanvas,int groundB,int ceilingB,int rightwallB,int leftwallB) {
        Canvas canvas = drawingCanvas;
        int ground = groundB;
        int ceiling = ceilingB;
        int rightwall = rightwallB;
        int leftwall = leftwallB;
        int xPos = 0;
        int yPos = 0;
    }
    
    public void move() 
    {
      canvas.fillCircle(int xPos, int yPos, int diameter);  
    }
    
    public void draw() {
        
    }
}
