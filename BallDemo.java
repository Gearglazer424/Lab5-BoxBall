import java.awt.Color;

/**
 * Class BallDemo - a short demonstration showing animation with the 
 * Canvas class. 
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

public class BallDemo   
{
    private Canvas myCanvas;

    /**
     * Create a BallDemo object. Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        myCanvas = new Canvas("Ball Demo", 600, 500);
    }

    /**
     * Simulate two bouncing balls
     */
    public void boxBounce()
    {
        final int OFFSET = 75;
        int ground = 400;   // position of the lines
        int ceiling = 0;
        int leftwall = 0;
        int rightwall = 400;
        

        myCanvas.setVisible(true);

        // draw the ground
        myCanvas.drawLine(OFFSET + leftwall, OFFSET + ground, OFFSET + rightwall, OFFSET + ground);
        //draw the ceiling
        myCanvas.drawLine(OFFSET + leftwall, OFFSET + ceiling, OFFSET + rightwall, OFFSET + ceiling);
        //draw the left wall
        myCanvas.drawLine(OFFSET + leftwall, OFFSET + ceiling, OFFSET + leftwall, OFFSET + ground);
        //draw the right wall
        myCanvas.drawLine(OFFSET + rightwall, OFFSET + ceiling, OFFSET + rightwall, OFFSET + ground);

        // create and show the balls
        BallBox ball1 = new BallBox(myCanvas,OFFSET + ground,OFFSET + ceiling,OFFSET + rightwall,
            OFFSET + leftwall);
        ball1.draw();
        BallBox ball2 = new BallBox(myCanvas,OFFSET + ground,OFFSET + ceiling,OFFSET + rightwall,OFFSET + leftwall);
        ball2.draw();
        BallBox ball3 = new BallBox(myCanvas,OFFSET + ground,OFFSET + ceiling,OFFSET + rightwall,OFFSET + leftwall);
        ball3.draw();
        BallBox ball4 = new BallBox(myCanvas,OFFSET + ground,OFFSET + ceiling,OFFSET + rightwall,OFFSET + leftwall);
        ball4.draw();
        BallBox ball5 = new BallBox(myCanvas,OFFSET + ground,OFFSET + ceiling,OFFSET + rightwall,OFFSET + leftwall);
        ball5.draw();

        // make them bounce
        boolean finished =  false;
        while(!finished) {
            myCanvas.wait(50);           // small delay
            ball1.move();
            ball2.move();
            ball3.move();
            ball4.move();
            ball5.move();
        }
    }
}

