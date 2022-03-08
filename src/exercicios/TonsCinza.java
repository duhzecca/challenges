package exercicios;

import java.util.HashMap;
import java.util.Map;

/**
 * Uma imagem bi-dimensional em tons de cinza (n bits) pode ser representada como uma matriz
 * de dimensoes MxN cujos elementos assumem valores no intervalo que vai de 0 a n-1.
 *
 * Desenvolva um algoritmo que receba como entrada uma matriz e de como resposta a quantidade
 * de vezes que cada possivel tom de cinza foi encontrado na figura.
 *
 * Entrada          Saida
 * =======          ======
 *   | 0 0 0 7 |    0 : 5 | 4 : 2
 *   | 4 4 7 5 |    1 : 1 | 5 : 1
 *   | 3 2 1 0 |    2 : 1 | 6 : 0
 *   | 0 7 7 7 |    3 : 1 | 7 : 5
 *
 */

public class TonsCinza {

    public static void main(String[] args) {
        hist(new int[][] {
                { 0, 0, 0, 7 },
                { 4, 4, 7, 5 },
                { 3, 2, 1, 0 },
                { 0, 7, 7, 7 } }, 8);
    }

    public static void hist(int[][] imagem, int bits) {
        Map<Integer, Integer> shades = new HashMap<>();

        initializeShadesMap(bits, shades);

        for (int i = 0; i < imagem.length; i++) {
            for (int j = 0; j < imagem.length; j++) {
                shades.put(imagem[i][j], shades.get(imagem[i][j]) + 1);
            }
        }

        System.out.println(shades);
    }

    private static void initializeShadesMap(int bits, Map<Integer, Integer> shades) {
        for (int i = 0; i < bits; i++) {
            shades.put(i, 0);
        }
    }

}
