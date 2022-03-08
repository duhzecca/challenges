package exercicios.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class LonelyInteger {

    public static void main(String[] args) {
        System.out.println(lonelyinteger(Arrays.asList(1,2,3,4,3,2,1)));
    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        Map<Integer, Long> integerListMap = a.stream().collect(groupingBy(Integer::intValue, counting()));
        Optional<Integer> lonelyInteger = integerListMap.entrySet().stream().filter(f -> f.getValue().equals(1L))
                .map(Map.Entry::getKey).reduce((integer, integer2) -> null);
        return lonelyInteger.get();
    }
}
