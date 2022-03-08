package exercicios;

import java.util.Arrays;

/**
 * - A professora de uma sala de aula decide presentear cada criança com doces
 * conforme a sua nota, mas obedecendo os seguintes critérios:
 *
 * - cada criança deve ganhar pelo menos um doce;
 * - crianças com notas maiores devem ganhar mais doces que crianças com notas menores.
 *
 * Por exemplo, em uma sala com 4 crianças com notas 8, 6, 9 e 6 a professora
 * distribuiria no mínimo 7 doces, pois:
 * - nota 8 = 2 doces
 * - nota 6 = 1 doce
 * - nota 9 = 3 doces
 * - nota 6 = 1 doce
 *
 * Implemente um algoritmo que dada uma lista de notas (considere que as notas
 * não estão ordenadas), retorne a quantidade mínima de doces a serem
 * distribuídos.
 *
 *
 * Ex: Entrada: [8, 6, 9, 6] - Saida: 7
 */

public class Doces {

    public static void main(String[] args) {
        System.out.printf("No minimo %d doces ", numeroDoces(new int[]{8, 6, 9, 6}));
        System.out.printf("No minimo %d doces ", numeroDoces(new int[]{8, 6, 9, 6,4,7,10,2,8}));
    }

    public static int numeroDoces(int[] notas) {
        int totalDoces = 0;
        int docesPorNota = 1;
        Arrays.sort(notas);

        for (int i=0; i < notas.length; i++) {
            if (i == 0) {
                totalDoces += docesPorNota;
            } else {
                if (notas[i] == notas[i-1]) {
                    totalDoces += docesPorNota;
                } else {
                    docesPorNota++;
                    totalDoces += docesPorNota;
                }
            }
        }

        return totalDoces;
    }

}
