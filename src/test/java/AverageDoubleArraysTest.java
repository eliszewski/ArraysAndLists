import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleArraysTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        double [] a = {1,4,5};
        int expected = 3;
        AverageDoubleArrays obj = new AverageDoubleArrays();
        assertEquals(expected, obj.count(a));
    }
    @Test
    void count1() {
        double [] a = { };
        int expected = 0;
        AverageDoubleArrays obj = new AverageDoubleArrays();
        assertEquals(expected, obj.count(a));
    }

    @Test
    void sum() {
        double [] a = {1,2,3,4};
        double expected = 10;
        AverageDoubleArrays obj = new AverageDoubleArrays();
        assertEquals(expected, obj.sum(a));
    }

    @Test
    void sum1() {
        double [] a = { };
        double expected = 0;
        AverageDoubleArrays obj = new AverageDoubleArrays();
        assertEquals(expected, obj.sum(a));
    }
    @Test
    void sum2() {
        double [] a = {1.5,2.2,3.5,4.7};
        double expected = 11.9;
        AverageDoubleArrays obj = new AverageDoubleArrays();
        assertEquals(expected, obj.sum(a));
    }

    @Test
    void average() {
        double [] a = {1, 3, 5, 7, 10};
        double expected = 5.2;
        AverageDoubleArrays obj = new AverageDoubleArrays();
        assertEquals(expected, obj.average(a));
    }

    @Test
    void average1() {
        double [] a = { };
        double expected = 0;
        AverageDoubleArrays obj = new AverageDoubleArrays();
        assertEquals(expected, obj.average(a));
    }

    @Test
    void average2() {
        double [] a = {1.11, 3.0, 5.4, 7.123123, 10.9};
        double expected = 5.5066246;
        AverageDoubleArrays obj = new AverageDoubleArrays();
        assertEquals(expected, obj.average(a));
    }
}