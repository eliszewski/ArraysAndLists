import java.util.ArrayList;

public class AverageIntegerLists {


    public int count(ArrayList<Integer> aa) {
        return aa.size();
    }

    public int sum(ArrayList<Integer> aa) {
        int sum = 0;
        for (int num: aa
             ) {
            sum += num;
        }
        return sum;
    }

    public int average(ArrayList<Integer> aa) {
        if(aa.size() >0){
            return sum(aa) / aa.size();
        }else {
            return 0;
        }

    }
}
