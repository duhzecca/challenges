package exercicios;

import java.util.HashMap;
import java.util.Map;

/**
 * Desenvolva um algoritmo que receba como entrada um array de Strings
 * (que pode ou nao apresentar repeticoes) e imprima o elemento e a
 * quantidade de vezes em que ele apareceu.
 *
 * Observacoes
 * - o seu algoritmo deve funcionar para qualquer String, nao estando
 *   limitado ao exemplo
 * - a formatacao da resposta e livre
 *
 *   Entrada
 *   =======
 *     ["banana", "abacaxi", "uva", "banana", "laranja", "laranja"]
 *   Saida
 *   =======
 *     banana 2
 *     abacaxi 1
 *     uva 1
 *     laranja 2
 *
 */

public class Frutas {

    public static void main(String[] args) {
        elementoQuantidade(new String[] { "banana", "abacaxi", "uva", "banana", "laranja", "laranja" });
    }

    public static void elementoQuantidade(String[] v) {
        Map<String, Integer> fruitMap = new HashMap<>();

        for (int i=0; i < v.length; i++) {
            if (fruitMap.containsKey(v[i])) {
                fruitMap.put(v[i], fruitMap.get(v[i]) + 1);
            } else {
                fruitMap.put(v[i], 1);
            }
        }

        System.out.println(fruitMap);
    }
}
