package java5_odev;

import java.util.Iterator;
import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {

		/*
		 * Verilen String icerisindeki tekrar eden karakterleri yazdiran Java kodunu
		 * yaziniz. String str=“ilovejavatoo” Output: o v a
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir String giriniz");
		String str = scan.nextLine();
		;
		for (int i = 0; i < str.length(); i++) {

			for (int j = 0; j < i; j++) {
				if (str.charAt(i) == str.charAt(j))
					System.out.print(str.charAt(j) + " ");
			}

		}

	}
}
