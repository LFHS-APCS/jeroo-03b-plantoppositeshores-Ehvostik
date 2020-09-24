/**
 *  See Readme.md for instructions.
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        Map.getInstance().changeSize(8, 8);
        new JerooGUI();
        Main m = new Main();
        m.runJerooCode();

    }

    /**
     * You can change which tests you are running here.
     */
    public void runJerooCode() {
        Jeroo j1 = new Jeroo(0,  0, EAST, 90);
        j1.plantOppositeShores();
        
 
    }

}
