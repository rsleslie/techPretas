import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) 
    {
        int soma;

        soma = 233;
        System.out.print(soma);
        while(soma < 456)
        {
            if (soma < 300)
                soma = soma + 5;
            else if (soma > 400)
                soma = soma + 5;
            else
                soma = soma + 3;
            if (soma < 456)
                System.out.print(", " + soma);
        }
    }
}
