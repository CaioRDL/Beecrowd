package Exer;
import java.util.Scanner;
public class Exer1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
			
		double pi =3.14159;
		
		
		System.out.println("Digite o valor da área: ");
		double raio = read.nextDouble();
		
		double area = pi * (raio*raio);
		
		System.out.println("A = " + area); 
		
		
		
		

	}

}
