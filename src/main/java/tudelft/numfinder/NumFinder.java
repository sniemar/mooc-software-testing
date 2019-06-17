package tudelft.numfinder;

import java.io.IOException;

public class NumFinder {
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;

    public void find(int[] nums) {
        if (nums == null) {
            System.out.println("The array cannot be null!");
            smallest = 0;
            largest = 0;
            return;
        }
        else if (nums.length == 0) {
            smallest = 0;
            largest = 0;
            System.out.println("There are no values!");
            return;
        }
        for(int n : nums) {

            if(n < smallest)
                smallest = n;
            if (n > largest)
                largest = n;

        }
    }

    public int getSmallest () {
        return smallest;
    }

    public int getLargest () {
        return largest;
    }

    /**
     * Reset the smallest and largest values to their initial values
     */
    public void reset () {
        smallest = Integer.MAX_VALUE;
        largest = Integer.MIN_VALUE;
    }
}
