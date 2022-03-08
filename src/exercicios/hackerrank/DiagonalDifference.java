package exercicios.hackerrank;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {
        System.out.println(diagonalDifference(Arrays.asList(Arrays.asList(1,2,3),
                Arrays.asList(4,5,6), Arrays.asList(9,8,9))));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        for (int i = 0; i < arr.size(); i++) {
            leftDiagonal += arr.get(i).get(i);
            rightDiagonal += arr.get(i).get(arr.size() - 1 - i);
        }

        return Math.abs(leftDiagonal - rightDiagonal);
    }

}
