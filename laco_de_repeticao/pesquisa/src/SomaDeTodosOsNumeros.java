import java.util.Scanner;

public class SomaDeTodosOsNumeros{
    public static void main(String[] args) 
    {
        int soma, numero, i;

        soma = 1;
        i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        numero = sc.nextInt();
        System.out.print(i);
        if (numero != 1)
        {
            while(i < numero)
            {
                i++;
                soma = soma + i;
                System.out.print("+" + i);
            }
        }
        System.out.print("=" + soma);
    }
}
