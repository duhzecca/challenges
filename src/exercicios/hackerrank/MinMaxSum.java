package exercicios.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxSum {

    public static void main(String[] args) {
        miniMaxSum(Arrays.asList(1,2,3,4,5));
        miniMaxSum2(Arrays.asList(1,2,3,4,5));
        miniMaxSum(Arrays.asList(1,3,5,7,9));
        miniMaxSum2(Arrays.asList(1,3,5,7,9));
        miniMaxSum2(Arrays.asList(5, 5, 5, 5, 5));
        miniMaxSum(Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625));
        miniMaxSum2(Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625));
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Long min = arr.stream().filter(f -> f != arr.stream().mapToLong(Integer::longValue).max().getAsLong()).mapToLong(Integer::longValue).sum();
        Long max = arr.stream().filter(f -> f != arr.stream().mapToLong(Integer::longValue).min().getAsLong()).mapToLong(Integer::longValue).sum();
        System.out.println(min + " " + max);
    }

    public static void miniMaxSum2(List<Integer> arr) {
        // Write your code here
        List<Integer> integerList = arr.stream().sorted().collect(Collectors.toList());
        Long minSum = 0L;
        Long maxSum = 0L;
        for (int i = 0; i < integerList.size(); i++) {
            if (i == 0) {
                minSum += integerList.get(i);
            } else if (i == integerList.size() - 1) {
                maxSum += integerList.get(i);
            } else {
                minSum += integerList.get(i);
                maxSum += integerList.get(i);
            }
        }

        System.out.println(minSum + " " + maxSum);
    }

}
