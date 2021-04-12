package �devler01;

import java.util.Scanner;

public class C1_SwitchCaseSorusu1 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�n�n girmi� oldu�u A,B,C,D,F notlar�n�n kar��l���n� yazd�ran Switch
		 * Case java kodunu yaz�n�z. A Excellent B Good C Average D Deficient F Failing
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen notunuzu giriniz");
		char not = scan.next().toUpperCase().charAt(0);

		switch (not) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Avarage");
			break;
		case 'D':
			System.out.println("Deficient");
			break;
		case 'F':
			System.out.println("Failing");
			break;

		default:
			System.out.println("L�tfen ge�erli bir not giriniz");
		}

		
		System.out.println();
		scan.close();
	}

}
