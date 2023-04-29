import java.util.Scanner;

public class QualMaiorInt {
    public static void main(String[] args)
    {
        int number_1, number_2, number_3, max;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        number_1 = sc.nextInt();
        System.out.print("Digite o segundo numeror: ");
        number_2 = sc.nextInt();
        System.out.print("Digite o terceiro numeor: ");
        number_3 = sc.nextInt();

        max = 0;
        if (number_1 > number_2)
            max = number_1;
        if (number_2 > number_1)
            max = number_2;
        if (max < number_3)
            max = number_3;

        System.out.println("O maior Numero: " + max);
    }
}
