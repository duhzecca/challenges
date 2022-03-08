package exercicios;

/**
 * - Considere os numeros inteiros de 0 a 10.
 * - Desenvolva um algoritmo que receba como entrada qualquer subconjunto de
 *   10 elementos do anteriormente citado.
 * - Considere tambem que os valores de entrada estao ordenados e nao
 *   apresentam repeticao.
 * - O algoritmo deve retornar qual o elemento ausente da colecao.
 *
 * Ex: Entrada: [0,1,2,4,5,6,7,8,9,10] - Saida Ausente: 3
 *
 */

public class MissingNumber {

    public static void main(String[] args) {
        System.out.println("ausente " + ausente(new int[] {0,1,2,4,5,6,7,8,9,10}));
    }

    public static int ausente(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i != a[i]) {
                return i;
            }
        }
        return a.length;
    }
}
