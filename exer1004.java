import java.util.Scanner;

public class exer1004 {
    
    public static void main(String [] args){

        Scanner read = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int x = read.nextInt();

        System.out.println("informe um numero: ");
        int y = read.nextInt();

        int PROD = x + y;

        System.out.println("PROD = " + PROD);
    }
}
