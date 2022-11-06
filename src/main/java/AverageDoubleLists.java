import java.util.ArrayList;

public class AverageDoubleLists {

    // write out these too
    public int count(ArrayList<Double> aa) { //changed return type to int
        return aa.size();
    }
    public Double sum(ArrayList<Double> aa) {
        double sum = 0;
        for (double num: aa
             ) {
            sum += num;
        }
        return sum;
    }
    public Double average(ArrayList<Double> aa) {
        if(aa.size() > 0){
            return sum(aa) / aa.size();
        }else{
            return 0.0;
        }

    }

}
