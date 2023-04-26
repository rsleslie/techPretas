import java.util.Scanner;

public class ConversorDeTempo {
    public static void main(String[] args)
    {
        int duracao, horas, minutos, segundos;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a duração do evento em segundos: ");
        duracao = sc.nextInt();

        horas = duracao / 3600;
        duracao = duracao % 3600;
        minutos = duracao / 60;
        segundos = duracao % 60;

        System.out.println("A duracao do evento e: " + horas + "h " + minutos + "min " + segundos + "s");
    }
}
