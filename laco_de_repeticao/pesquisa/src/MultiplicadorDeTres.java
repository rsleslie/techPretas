import java.util.Scanner;

public class MultiplicadorDeTres {
    public static void main(String[] args) 
    {
        int multiplica;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        multiplica = sc.nextInt();

        System.out.print(multiplica + " ");
        while(multiplica < 100)
        {
            multiplica = multiplica * 3;
            System.out.print(multiplica + " ");
        }
    }
}
