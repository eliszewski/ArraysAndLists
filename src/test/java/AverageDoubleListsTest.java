import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleListsTest {

    @Test
    void count() {
        ArrayList<Double> a = new ArrayList<Double>(Arrays.asList(1.0,2.2,3.3));
        Integer expected = 3;
        AverageDoubleLists obj = new AverageDoubleLists();
        assertEquals(expected, obj.count(a));
    }
    @Test
    void count1() {
        ArrayList<Double> a = new ArrayList<Double>(Arrays.asList());
        Integer expected = 0;
        AverageDoubleLists obj = new AverageDoubleLists();
        assertEquals(expected, obj.count(a));
    }

    @Test
    void sum() {
        ArrayList<Double> a = new ArrayList<Double>(Arrays.asList(1.0,2.2,3.3));
        double expected = 6.5;
        AverageDoubleLists obj = new AverageDoubleLists();
        assertEquals(expected, obj.sum(a));
    }
    @Test
    void sum1() {
        ArrayList<Double> a = new ArrayList<Double>(Arrays.asList());
        double expected = 0.0;
        AverageDoubleLists obj = new AverageDoubleLists();
        assertEquals(expected, obj.sum(a));
    }

    @Test
    void average() {
        ArrayList<Double> a = new ArrayList<Double>(Arrays.asList(1.0,2.2,3.8,2.0));
        double expected = 2.25;
        AverageDoubleLists obj = new AverageDoubleLists();
        assertEquals(expected, obj.average(a));
    }
    @Test
    void average1() {
        ArrayList<Double> a = new ArrayList<Double>(Arrays.asList());
        double expected = 0.0;
        AverageDoubleLists obj = new AverageDoubleLists();
        assertEquals(expected, obj.average(a));
    }
}