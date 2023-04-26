public class SomaDosImpares {
    public static void main(String[] args) {
        int i, soma;

        i = 1;
        soma = 0;

        while (i <= 500) {
            if (i % 3 == 0 && i % 2 != 0)
                soma = soma + 1;
            i++;
        }
    }
}