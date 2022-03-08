package exercicios;

/**
 *  Dada uma String s, sua função deve retornar uma nova String substituindo as letras pelas suas posições no alfabeto.
 * Caso um caracter da String não seja uma letra, apenas ignore-a.
 *
 * Ex:
 * Entrada: "The sunset sets at twelve o' clock."
 * Retorno: "20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11"
 */

public class PosicaoAlfabeto {

    public static void main(String[] args) {
        encodeString("The sunset sets at twelve o' clock.");
    }

    public static void encodeString(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        StringBuilder encoded = new StringBuilder();

        for (char c : chars) {
            if (c <= 122 && c >=97) {
                encoded.append(c - 96).append(" ");
            }
        }

        System.out.println(encoded.toString());
    }

}
