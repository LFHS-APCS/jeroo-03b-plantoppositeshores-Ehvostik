/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {
    
    /**
     * It should plant a flower on one shore and then go to the
     * other shore to plant a flower then come back to the first shore
     * It should repeat this until both shores are full of flowers.
     * See picture in Readme.md
     * IMPORTANT: Do NOT just plant all flowers on one shore 
     * and then do the other shore.  The Jeroo should alternate
     * between shores.
     */
    public void plantOppositeShores() {

    }


    // Do NOT touch the code below here
    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int y, int x) { super(y, x); }

    public Jeroo(int y, int x, CompassDirection direction) { super (y, x, direction);}

    public Jeroo(int y, int x, int flowers) { super (y, x, flowers);}

    public Jeroo(int y, int x, CompassDirection direction, int flowers) { super(y, x, direction, flowers);}
}

