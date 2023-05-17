import java.util.Scanner;

public class exer1003 {

    
    public static void main (String[] args){

    Scanner read = new Scanner(System.in) ;
		
    System.out.println("Digite o valor de A: ");
    int A = read.nextInt();

    System.out.println("Digite o valor de B: ");
    int B = read.nextInt();
    
    
    int SOMA = A + B;
    
    System.out.println("SOMA = " + SOMA);


    read.close();
    
}
}
