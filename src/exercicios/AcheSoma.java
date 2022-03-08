package exercicios;

import java.util.*;
import java.util.stream.Collectors;

/**
        1- Verifique se no array existem numeros que somado dao a soma e print verdadeiro ou falso

        2- se existir printa-los
 **/

public class AcheSoma {


    public static void main(String[] args) {
       acheSomaStream(10, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 11, 15});
       acheSomaStreamBoolean(10, new Integer[]{1,2,3,4,5,6,7,8,11,15});
       acheSoma(10, new Integer[]{1,2,3,4,5,6,7,8,11,15});
       acheSomaPar(10, new Integer[]{1,2,3,4,5,6,7,8,11,15});
    }

    private static void acheSomaStream(Integer value, Integer[] list) {
        var integerList = Arrays.asList(list);
        var findSumNumbers = integerList.stream().filter(v -> integerList.contains(value - v)
                && v != (value - v)).collect(Collectors.toList());
        System.out.println(findSumNumbers);
    }

    private static void acheSomaStreamBoolean(Integer value, Integer[] list) {
        var integerList = Arrays.asList(list);
        var findSumNumbers = integerList.stream().filter(v -> integerList.contains(value - v) && v != (value - v)).findAny();
        System.out.println(findSumNumbers.isPresent());
    }

    private static void acheSoma(Integer value, Integer[] list) {
        var numberLesserThenValue = Arrays.stream(list).filter(v -> v <= value).collect(Collectors.toList());
        Set<Integer> findNumbers = new HashSet<>();
        for (int i=0; i < numberLesserThenValue.size(); i++) {
            if (numberLesserThenValue.contains(value - numberLesserThenValue.get(i))
            && (value - numberLesserThenValue.get(i)) != numberLesserThenValue.get(i)) {
                findNumbers.add(numberLesserThenValue.get(i));
            }
        }
        System.out.println(findNumbers);
    }

    private static void acheSomaPar(Integer value, Integer[] list) {
        var numberLesserThenValue = Arrays.stream(list).filter(v -> v <= value).collect(Collectors.toList());
        Set<Integer> findNumbers = new LinkedHashSet<>();
        for (int i=0; i < numberLesserThenValue.size(); i++) {
            if (numberLesserThenValue.contains(value - numberLesserThenValue.get(i))
                    && (value - numberLesserThenValue.get(i)) != numberLesserThenValue.get(i)) {
                findNumbers.add(numberLesserThenValue.get(i));
                findNumbers.add(value - numberLesserThenValue.get(i));
            }
        }
        System.out.println(findNumbers);
    }
}
