package �devler01;

import java.util.Scanner;

public class C6_Alt�nc�Soru {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan firstName ve lastName'i girmesini isteyin, ard�ndan ba�
		 * harflerini b�y�k harf yap�n ve geri kalan� tamamen kucuk harf olarak konsolda
		 * yazdirin. ferhat => Ferhat kirac => Kirac
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen isminizi giriniz");
		String isim=scan.next();
		System.out.println("L�tfen soyisminizi giriniz");
		String soyisim=scan.next();
		
		char isimIlkHarf=isim.toUpperCase().charAt(0);
		char soyIs�mIlkHarf=soyisim.toUpperCase().charAt(0);
		
		System.out.println(isimIlkHarf+isim.substring(1,isim.length()).toLowerCase()+" "+ soyIs�mIlkHarf+soyisim.substring(1, soyisim.length()).toLowerCase());
		
		
		scan.close();

	}

}
