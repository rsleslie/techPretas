import java.util.Scanner;

public class CategoriaDeIdade {
    public static void main(String[] args)
    {
        int idade;
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        idade = sc.nextInt();
        
        if (idade >= 10 && idade <= 14)
            System.out.println("10-14 infantil");
        else if (idade >= 15 && idade <= 17)
            System.out.println("15-17 juvenil");
        else if (idade >= 18 && idade <= 25)
            System.out.println("18-25 adulto");
    }
}