import java.util.Scanner;

public class maiorNota {
    public static void main(String[] args) throws Exception 
    {
        int vet[] = new int[5];
        int i;
        int j = 0;
        int temporaria;

        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 5; i++)
        {
            System.out.printf("Qual pontuação %d: ", i+1);
            vet[i] = sc.nextInt();
        }
        i = 0;
        while (i < 5)
        {
            j = i;
            while (j < 5)
            {
                if (vet[i] > vet[j])
                {
                    temporaria = vet[i];
                    vet[i] = vet[j];
                    vet[j] = temporaria;
                }
                j++;
            }
            i++;
        }
        System.out.println(vet[4]);
    }
}
//como que cria pacote com  vscode e depois fazer as classes