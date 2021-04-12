package ödevler03;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 Stringi ters çevirmek için bir Java Programý yazýn 
		 1.Yol: StringBuilder () kullanarak
		 2.Yol: String Classini kullanarak
		 3.Yol: Bir method oluþturun, ardýndan methodu main method dan çaðýrýn
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir String giriniz");
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


