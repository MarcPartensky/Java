package myAwesomeFirstTestOnJava;

import java.util.Scanner;

public class TheMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		if (false) {
		int result = 5;
		int nombre;
		
		do {
			System.out.println("Veuillez saisir un nombre:");
			nombre = sc.nextInt();
			if (nombre<result) {System.out.println("trop petit");}
			if (nombre>result) {System.out.println("trop grand");}
			System.out.println("wesh");
		} while (nombre != result && false) ;
		System.out.println("gg c'était bien: ");
		System.out.println(result);
		}
		
		for(int i=3; i<=100; i+=2) {
			boolean mybool = false;
			for(int j=2; j<i; j++) {
				if (i%j==0) {mybool=true;}
				}
			if (mybool==false) {System.out.println(i);}
			//System.out.println(mybool);
		}
		
			
	}	
}
