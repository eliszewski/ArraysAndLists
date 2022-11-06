import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LoadAndStoreTest {

    // write all these out too.

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void loadIntArrayFromFile() {
        LoadAndStore ls = new LoadAndStore();
        int [] expected = {4,5,6,11,13,8,9,7,14,18};
        int [] actual = ls.loadIntArrayFromFile("testIntegerData1.txt");
        assertArrayEquals(expected,actual );
    }

    @Test
    void loadIntegerArrayListFromFile() {
        LoadAndStore ls = new LoadAndStore();
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4,5,6,11,13,8,9,7,14,18));
        ArrayList<Integer> actual = ls.loadIntegerArrayListFromFile("testIntegerData1.txt");
        assertTrue(expected.equals(actual));
    }

    @Test
    void loaddoubleArrayFromFile() {
        LoadAndStore ls = new LoadAndStore();
        double [] expected = {4.4,5.5,6.34,11.0001,13.004,8.7,9.97060,7.4532,14.5,18.00023132123};
        double [] actual = ls.loaddoubleArrayFromFile("testDoubleData2.txt");
        assertArrayEquals(expected,actual);
    }

    @Test
    void loadDoubleArrayListFromFile() {
        LoadAndStore ls = new LoadAndStore();
        ArrayList<Double> expected = new ArrayList<>(Arrays.asList(4.4,5.5,6.34,11.0001,13.004,8.7,9.97060,7.4532,14.5,18.00023132123));
        ArrayList<Double> actual = ls.loadDoubleArrayListFromFile("testDoubleData2.txt");
        assertTrue(expected.equals(actual));
    }

    @Test
    void loadStringArrayFromFile() {
        LoadAndStore ls = new LoadAndStore();
        String [] expected = {"4.4","5.5","Foo","11.0001","Bar","Lost in Space","Lido Shuffle", "How much data was destroyed?","I think therefore I compute","0","NaN","ZipCode Rocks!"};
        String [] actual = ls.loadStringArrayFromFile("testStringData3.txt");
        assertArrayEquals(expected, actual);
    }

    @Test
    void loadStringArrayListFromFile() {
        LoadAndStore ls = new LoadAndStore();
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("4.4","5.5","Foo","11.0001","Bar","Lost in Space","Lido Shuffle", "How much data was destroyed?","I think therefore I compute","0","NaN","ZipCode Rocks!"));
        ArrayList<String> actual = ls.loadStringArrayListFromFile("testStringData3.txt");
        assertTrue(expected.equals(actual));
    }
}