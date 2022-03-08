package exercicios;

public class NumeroPrimo {

    public static void main(String[] args) {
        isPrimo(7);
        isPrimo(1);
        isPrimo(2);
        isPrimo(4);
        isPrimo(17);
        isPrimo(25);
        isPrimo(13);
    }

    public static void isPrimo(Integer number) {
        boolean isPrimo = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrimo = false;
            }
        }

        System.out.println(isPrimo ? number + " é primo" : number + " não é primo");
    }

}
