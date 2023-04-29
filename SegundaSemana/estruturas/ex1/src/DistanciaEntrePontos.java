import java.util.Scanner;
import java.lang.Math;

public class DistanciaEntrePontos{
    public static void main(String[] args)
    {
        double x1, x2, y1, y2, distancia;

        Scanner  sc = new Scanner(System.in);

        System.out.println("Digite as coordenadas do primeiro ponto:");
        
        System.out.print("x1 : ");
        x1 = sc.nextFloat();
        
        System.out.print("y1 : ");
        y1 = sc.nextFloat();
        
        System.out.print("x2 : ");
        x2 = sc.nextFloat();
        
        System.out.print("y2 : ");
        y2 = sc.nextFloat();

        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("A distância entre os pontos e : " + distancia + "\n") ;
    }
}