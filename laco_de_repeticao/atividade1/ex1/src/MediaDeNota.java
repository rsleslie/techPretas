import java.util.Scanner;

public class MediaDeNota {
    public static void main(String[] args)
    {
        int nota_1, nota_2, nota_3, media;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        nota_1 = sc.nextInt();

        System.out.print("Digite a segunda nota: ");
        nota_2 = sc.nextInt();

        System.out.print("Digite a terceira nota: ");
        nota_3 = sc.nextInt();

        media = (nota_1 + nota_2 + nota_3) / (2 + 3 + 5);

        System.out.println("A media final e: " + media);
    }
}
