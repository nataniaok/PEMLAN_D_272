import static org.junit.Assert.*;
import org.junit.Test;

public class MinFinder {
    @Test
    public void testFindMin_Skenario1() {
        assertEquals(2, Tugas4.findMin(1, 2, 3));
    }

    @Test
    public void testFindMin_Skenario2() {
        assertEquals(-3, Tugas4.findMin(-1, -2, -3));
    }

    @Test
    public void testFindMin_Skenario3() {
        assertEquals(0, Tugas4.findMin(0, 0, 1));
    }
}