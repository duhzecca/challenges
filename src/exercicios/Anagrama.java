package exercicios;

import java.util.Arrays;

public class Anagrama {

    public static void main(String[] args) {
        anagrama("pedra", "perda");
        anagrama2("pedra", "perda");
    }

    private static void anagrama(String word1, String word2) {
        var word1Chars = word1.toCharArray();
        var word2Chars = word2.toCharArray();
        Arrays.sort(word1Chars);
        Arrays.sort(word2Chars);

        if (Arrays.equals(word1Chars, word2Chars)) {
            System.out.println(word1 + " e " + word2 + " são anagramas");
        } else {
            System.out.println(word1 + " e " + word2 + " não são anagramas");
        }
    }

    private static void anagrama2(String word1, String word2) {
        var word1Chars = word1.toCharArray();
        boolean isAnagrama = true;

        if (word1.length() == word2.length()) {
            for (char word1Char : word1Chars) {
                if (word2.indexOf(word1Char) == -1) {
                    isAnagrama = false;
                }
            }
        } else {
            isAnagrama = false;
        }

        if (isAnagrama) {
            System.out.println(word1 + " e " + word2 + " são anagramas");
        } else {
            System.out.println(word1 + " e " + word2 + " não são anagramas");
        }

    }
}
