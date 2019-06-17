package tudelft.numfinder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumFinderTest {

    @Test
    public void passNull() {
        NumFinder nf = new NumFinder();
        nf.find(null);
        int smallest = nf.getSmallest();
        int largest = nf.getLargest();
        Assertions.assertEquals(0, smallest);
        Assertions.assertEquals(0, largest);
    }

    @Test
    public void passEmpty() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{});
        int smallest = nf.getSmallest();
        int largest = nf.getLargest();
        Assertions.assertEquals(0, smallest);
        Assertions.assertEquals(0, largest);
    }

    @Test
    public void passReverseOrdered() {
        NumFinder nf = new NumFinder();
        nf.find(new int[] {4, 3, 2, 1});
        int smallest = nf.getSmallest();
        int largest = nf.getLargest();
        Assertions.assertEquals(1, smallest);
        Assertions.assertEquals(4, largest);
    }

    @Test
    public void passSomeOther() {
        NumFinder nf = new NumFinder();
        nf.find(new int[] {52, 25, 15, 0, 276, -43});
        int smallest = nf.getSmallest();
        int largest = nf.getLargest();
        Assertions.assertEquals(-43, smallest);
        Assertions.assertEquals(276, largest);
    }
}
