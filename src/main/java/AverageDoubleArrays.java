public class AverageDoubleArrays {


// Complete these methods

    public int count(double[] aa) {
        return aa.length;
    }

    public double sum(double[] aa) { //changed return type to double
        double sum = 0;
        for (double num: aa
             ) {
            sum += num;
        }
        return  sum;
    }

    public double average(double[] aa) { //changed return type to double
        if (aa.length > 0) {
            return sum(aa) / aa.length;
        } else {
            return 0;
        }
    }
}
