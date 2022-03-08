package exercicios.hackerrank;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {

    public static void main(String[] args) {
        plusMinus(Arrays.asList(1,1,0,-1,-1));
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int size = arr.size();
        Double negatives = 0D;
        Double positives = 0D;
        Double zeros = 0D;

        for (Integer integer : arr) {
            if (integer < 0) {
                negatives++;
            } else if (integer > 0) {
                positives++;
            } else {
                zeros++;
            }
        }

        System.out.println(new DecimalFormat("0.000000").format(positives/size));
        System.out.println(new DecimalFormat("0.000000").format(negatives/size));
        System.out.println(new DecimalFormat("0.000000").format(zeros/size));
    }

}
