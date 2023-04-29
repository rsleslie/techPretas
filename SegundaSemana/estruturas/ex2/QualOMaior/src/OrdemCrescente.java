import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args)
    {
        int i, j, temporario;
        int order[] = new int[3];

        i = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        order[0] = sc.nextInt();
        System.out.print("Digite o segundo numeor: ");
        order[1] = sc.nextInt();
        System.out.print("Digite o terceiro numeor: ");
        order[2] = sc.nextInt();
        
        while (i < 3)
        {
            j = i;
            while (j < 3)
            {
                if (order[i] > order[j])
                {
                    temporario = order[i];
                    order[i] = order[j];
                    order[j] = temporario;
                }
                j++;
            }
            i++;
        }

        for (i = 0; i < 3; i++) {
            System.out.println(order[i]);
        }
    }
}