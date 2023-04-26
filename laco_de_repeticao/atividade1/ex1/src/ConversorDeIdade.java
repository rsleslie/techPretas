import java.util.Scanner;

public class ConversorDeIdade {
    public static void main(String[] args)
    {
        int idade, anos, mes, dias, resto;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade em dias : ");
        idade = sc.nextInt();

        anos = idade / 365;
        idade = idade % 365;
        mes = idade / 30;
        dias = idade % 30;

        System.out.println("Voce tem " + anos + " anos " + mes + " meses " + dias + " dias");
    }
}
