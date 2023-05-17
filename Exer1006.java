import java.util.Scanner;
public class Exer1006 {
    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        System.out.println("1° Nota ");
        double x = read.nextDouble();

        System.out.println("2° Nota ");
        double y = read.nextDouble();

        System.out.println("3° Nota ");
        double z = read.nextDouble();
        

        double media = ((x * 2) + (y * 3) + (z * 5)) / 10;

        System.out.println("MEDIA = " + media );

    }
}
