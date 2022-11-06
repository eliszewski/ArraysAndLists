public class AverageIntArrays {

// Complete these methods

    public int count(int[] aa) {
        return aa.length;
    }

    public int sum(int[] aa) {
        int sum = 0;
        for (int num: aa
             ) {
            sum+= num;
        }
        return sum;
    }

    public int average(int[] aa) {
        if(aa.length > 0){
            return sum(aa) / aa.length;
        } else {
            return 0; //checks for empty array
        }
    }

}
