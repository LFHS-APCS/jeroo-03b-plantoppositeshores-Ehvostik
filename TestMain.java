import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 *
 * @author  Aronson
 */
public class TestMain implements Directions
{
    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.test1_plantOppositeShores();

    }

    @Before
    public void setup() {

    }

    @Test
    public void test1_plantOppositeShores()
    {   
        Map.getInstance().changeSize(8, 8);
        Jeroo j1 = new Jeroo(0,  0, EAST, 90);
        j1.plantOppositeShores();
        int w = Map.getInstance().getColumns();
        int h = Map.getInstance().getRows();
        assertTrue("should still be at (0, " + (w-1) + ")", Map.getInstance().isJeroo(0, w-1));

        for (int i = 0; i < w; i++) {
            assertTrue("should be flower at (0,"+i+")", Map.getInstance().isFlower(0, i));
            assertTrue("should be flower at ("+ (h-1) + ","+i+")", Map.getInstance().isFlower(h-1, i));
        }

    }

}

