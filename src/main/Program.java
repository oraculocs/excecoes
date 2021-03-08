package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();

		System.out.println("Fim do Programa");
	}
	
	public static void method1() {
		System.out.println("*****Método 1 START*******");
		method2();
		
		System.out.println("*****Método 1 FIM*********");
	}
	
	public static void method2() {
		System.out.println("*****Método 2 START*******");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!");
			e.printStackTrace();
			sc.next();
		}catch(InputMismatchException e) {
			System.out.println("Input error!");
		}
		
		System.out.println("*****Método 2 FIM*********");
		
		sc.close();
	}

}
