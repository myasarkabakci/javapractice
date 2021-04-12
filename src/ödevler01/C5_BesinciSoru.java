package ödevler01;

import java.util.Scanner;

public class C5_BesinciSoru {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir kelime girmesini isteyin. Sözcükte tek sayýda karakter ve 3
		 * veya daha fazla karakter içeriyorsa, kelimenin ortasýndaki karakteri
		 * yazdýrýn.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String kelime=scan.next();
		
		
		if (kelime.length()%2==0) {
			System.out.println("Girdiðiniz kelime çift sayýda karakter içermektedir");
		} else {
			System.out.println(kelime.substring(kelime.length()/2, kelime.length()/2+1));
		}
		
		scan.close();
		
	}

}
