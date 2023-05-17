import java.util.Scanner;

public class exer1007 {
    
    
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);


        System.out.println("1° valor ");
        double A = read.nextDouble();

        System.out.println("2° valor ");
        double B = read.nextDouble();

        System.out.println("3° valor ");
        double C = read.nextDouble();

        
        System.out.println("4° valor ");
        double D = read.nextDouble();


        double DIFERENCA = (A * B - C * D);


        System.out.println("DIFERENÇA = " + DIFERENCA );
    }

}
