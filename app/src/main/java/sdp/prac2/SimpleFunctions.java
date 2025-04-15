package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public static int sumElements(int []a, int []b) {
        int sum = 0;
        
        for (int index : b) {
            // Check if index is within bounds of 'a'
            if (index >= 0 && index < a.length) {
                sum += a[index];
            }
            // Ignore invalid indexes
        }
        
        return sum;
    }
}
