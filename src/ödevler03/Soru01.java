package �devler03;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 Stringi ters �evirmek i�in bir Java Program� yaz�n 
		 1.Yol: StringBuilder () kullanarak
		 2.Yol: String Classini kullanarak
		 3.Yol: Bir method olu�turun, ard�ndan methodu main method dan �a��r�n
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir String giriniz");
		String str=scan.nextLine();
		
		
		//1. yol SB
		
		StringBuilder sb=new StringBuilder(str);
		
		System.out.println(sb.reverse());
		
		//2. yol
		
		for (int i = str.length(); i > 0; i--) {
			System.out.print(str.charAt(i-1));
		}
		System.out.println();
		
		//3.yol
		TersCevir(str);
		
	}

	public static void TersCevir(String str) {
		for (int i = str.length(); i > 0; i--) {
			System.out.print(str.charAt(i-1));
		}

	}
		
	}


