package �devler01;

import java.util.Scanner;

public class C7_YedinciSoru {

	public static void main(String[] args) {
		/*
		 * StringMethods: �ift uzunlukta bir degiskenin ilk yar�s�n� konsolda yazdirmak
		 * i�in bir Java program� yaz�niz. ORNEK: INPUT : Python OUTPUT : Pyt
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir kelime giriniz");
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
