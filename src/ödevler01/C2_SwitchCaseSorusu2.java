package �devler01;

import java.util.Scanner;

public class C2_SwitchCaseSorusu2 {

	public static void main(String[] args) {
		/*
		 * Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran Switch Case java
		 * kodunu yaziniz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir ay giriniz");
		String ay = scan.next().toLowerCase();

		switch (ay) {
		case "ocak":
			System.out.println("31 g�n");
			break;
		case "subat":
			System.out.println("28 g�n");
			break;
		case "mart":
			System.out.println("31 g�n");
			break;
		case "nisan":
			System.out.println("30 g�n");
			break;
		case "mayis":
			System.out.println("31 g�n");
			break;
		case "haziran":
			System.out.println("30 g�n");
			break;
		case "temmuz":
			System.out.println("31 g�n");
			break;
		case "agustos":
			System.out.println("31 g�n");
			break;
		case "eylul":
			System.out.println("30 g�n");
			break;
		case "ekim":
			System.out.println("31 g�n");
			break;
		case "kasim":
			System.out.println("30 g�n");
			break;
		case "aral�k":
			System.out.println("31 g�n");
			break;

		default:
			System.out.println("L�tfen ge�erli bir ay giriniz");
		}

		scan.close();
	}

}
