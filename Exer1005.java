import java.util.Scanner;

public class Exer1005 {
    
    public static void main(String []args){

        Scanner read = new Scanner(System.in);

        System.out.println("1° nota: ");
        double x = read.nextDouble();

        System.out.println("2° nota: ");
        double y = read.nextDouble();

        double media = ((x * 3.5) + (y * 7.5)) / 11;

        System.out.println("MEDIA = " + media );


    }
}
