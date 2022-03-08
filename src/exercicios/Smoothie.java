package exercicios;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**

{
    "Classic": ["strawberry", "banana", "pineapple", "mango", "peach", "honey", "ice", "yogurt"],
    "Forest Berry": ["strawberry", "raspberry", "blueberry", "honey", "ice", "yogurt"],
    "Freezie": ["blackberry", "blueberry", "black currant", "grape juice", "frozen yogurt"],
    "Greenie": ["green apple", "kiwi", "lime", "avocado", "spinach", "ice", "apple juice"],
    "Vegan Delite": ["strawberry", "passion fruit", "pineapple", "mango", "peach", "ice", "soy milk"],
    "Just Desserts": ["banana", "ice cream", "chocolate", "peanut", "cherry"]
}

A estrutura de dados acima representa uma lista de Smoothies, onde cada exercicios.Smoothie possui sua lista de ingredientes.
Com base na estrutura, construa uma solução que represente o modelo acima e permite incluir e remover ingredientes de um exercicios.Smoothie.
O parâmetro de entrada é uma string (`Classic,+chocolate,-strawberry`), onde o primeiro valor é o tipo do exercicios.Smoothie, e os demais a lista de ingredientes com suas operações. O retorno dessa operação é a lista atualizada de ingredientes do exercicios.Smoothie passado.
 **/

public class Smoothie {

    public static void main(String[] args) {
        Map<String, List<String>> smoothies = new HashMap<>();
        smoothies.put("Classic", Stream.of("strawberry", "banana", "pineapple", "mango", "peach", "honey", "ice", "yogurt").collect(Collectors.toList()));
        smoothies.put("Forest Berry", Stream.of("strawberry", "raspberry", "blueberry", "honey", "ice", "yogurt").collect(Collectors.toList()));
        smoothies.put("Freezie", Stream.of("blackberry", "blueberry", "black currant", "grape juice", "frozen yogurt").collect(Collectors.toList()));
        smoothies.put("Greenie", Stream.of("green apple", "kiwi", "lime", "avocado", "spinach", "ice", "apple juice").collect(Collectors.toList()));
        smoothies.put("Vegan Delite", Stream.of("strawberry", "passion fruit", "pineapple", "mango", "peach", "ice", "soy milk").collect(Collectors.toList()));
        smoothies.put("Just Desserts", Stream.of("banana", "ice cream", "chocolate", "peanut", "cherry").collect(Collectors.toList()));

        changeSmoothie("Classic,+chocolate,-strawberry", smoothies);
        changeSmoothie("Forest Berry,+mango,-strawberry", smoothies);
        changeSmoothie("Forest Berrey,+mango,-strawberry", smoothies);
    }

    private static void changeSmoothie(String param, Map<String, List<String>> smoothies) {
        String[] split = param.split(",");
        String smoothieFlavor = split[0];
        List<String> itemsToAdd = Arrays.stream(split).filter(i -> i.startsWith("+"))
                .map(i -> i.replace("+", "")).collect(Collectors.toList());
        List<String> itemsToRemove = Arrays.stream(split).filter(i -> i.startsWith("-"))
                .map(i -> i.replace("-", "")).collect(Collectors.toList());

        if (smoothies.containsKey(smoothieFlavor)) {
            List<String> smoothieItems = smoothies.get(smoothieFlavor);
            smoothieItems.addAll(itemsToAdd);
            smoothieItems.removeAll(itemsToRemove);
            System.out.println(smoothieFlavor + ": " + smoothieItems);
        } else {
            System.out.println("exercicios.Smoothie " + smoothieFlavor + " inexistente");
        }
    }
}
