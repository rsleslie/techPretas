import java.util.Scanner;

public class Somatoria
{
    public static void main(String[] args) 
    {
        int i, soma, temp;

        i = 0;
        soma= 0;
        temp = 0;
        Scanner sc = new Scanner(System.in);
        while(temp > 0)
        {
            i++;
            soma = soma + temp;
            System.out.print("Digite um numero: ");
            temp = sc.nextInt();
        }
        System.out.println("A soma dos numeros : " + soma);
        System.out.println("A media dos numeros: " + soma);
        System.out.println("O total de valores lidos: " + i);
    }
}