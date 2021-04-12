package ödevler01;

import java.util.Scanner;

public class C2_SwitchCaseSorusu2 {

	public static void main(String[] args) {
		/*
		 * Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran Switch Case java
		 * kodunu yaziniz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir ay giriniz");
		String ay = scan.next().toLowerCase();

		switch (ay) {
		case "ocak":
			System.out.println("31 gün");
			break;
		case "subat":
			System.out.println("28 gün");
			break;
		case "mart":
			System.out.println("31 gün");
			break;
		case "nisan":
			System.out.println("30 gün");
			break;
		case "mayis":
			System.out.println("31 gün");
			break;
		case "haziran":
			System.out.println("30 gün");
			break;
		case "temmuz":
			System.out.println("31 gün");
			break;
		case "agustos":
			System.out.println("31 gün");
			break;
		case "eylul":
			System.out.println("30 gün");
			break;
		case "ekim":
			System.out.println("31 gün");
			break;
		case "kasim":
			System.out.println("30 gün");
			break;
		case "aralýk":
			System.out.println("31 gün");
			break;

		default:
			System.out.println("Lütfen geçerli bir ay giriniz");
		}

		scan.close();
	}

}
