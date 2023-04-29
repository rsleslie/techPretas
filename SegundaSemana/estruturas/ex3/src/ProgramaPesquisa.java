import java.util.Scanner;

public class ProgramaPesquisa {
    public static void main(String[] args) 
    {
        float i, p_salario, s_salario, t_salario, p_filho, s_filho, t_filho, media_salario, maior_salario, media_filhos, percentual_salario;

        Scanner sc = new Scanner(System.in);
        System.out.print("Salario do primeiro habitante: ");
        p_salario = sc.nextInt();
        System.out.print("E qual o numero de filhos: ");
        p_filho = sc.nextInt();
        System.out.print("Salario do segundo habitante: ");
        s_salario = sc.nextInt();
        System.out.print("E qual o numero de filhos: ");
        s_filho = sc.nextInt();
        System.out.print("Salario do terceiro habitante: ");
        t_salario = sc.nextInt();
        System.out.print("E qual o numero de filhos: ");
        t_filho = sc.nextInt();
        
        media_salario = (p_salario + s_salario + t_salario) / 3;
        media_filhos = (p_filho + s_filho + t_filho) / 3;

        maior_salario = 0;

        if (p_salario > s_salario)
            maior_salario = p_salario;
        if (s_salario > p_salario)
            maior_salario = s_salario;
        if (t_salario > maior_salario)
            maior_salario = t_salario;

        percentual_salario = 0;
        if (p_salario <= 100)
            percentual_salario = percentual_salario + 1;
        if (s_salario <= 100)
            percentual_salario = percentual_salario + 1;
        if (t_salario <= 100)
            percentual_salario = percentual_salario + 1;


        percentual_salario = percentual_salario / 3 * 100;
      
        System.out.println("Média do salário da população: R$" + media_salario);
        System.out.println("Média do número de filhos: " + media_filhos);
        System.out.println("Maior salário: R$" + maior_salario);
        System.out.println("Percentual de pessoas com salário até R$100,00: " + percentual_salario);


    }
}
