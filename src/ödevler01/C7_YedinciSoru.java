package ödevler01;

import java.util.Scanner;

public class C7_YedinciSoru {

	public static void main(String[] args) {
		/*
		 * StringMethods: Çift uzunlukta bir degiskenin ilk yarýsýný konsolda yazdirmak
		 * için bir Java programý yazýniz. ORNEK: INPUT : Python OUTPUT : Pyt
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String kelime=scan.next();
		
		ortadanBolunecekKelime(kelime);
		
		scan.close();
	}

	public static void ortadanBolunecekKelime(String str) {
		
		if (str.length()%2==0) {
			System.out.println(str.substring(0, str.length()/2));
		}else {
			System.out.println();
		}
		
		
	}

}
