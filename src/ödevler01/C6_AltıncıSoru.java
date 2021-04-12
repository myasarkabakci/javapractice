package ödevler01;

import java.util.Scanner;

public class C6_AltýncýSoru {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan firstName ve lastName'i girmesini isteyin, ardýndan baþ
		 * harflerini büyük harf yapýn ve geri kalaný tamamen kucuk harf olarak konsolda
		 * yazdirin. ferhat => Ferhat kirac => Kirac
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen isminizi giriniz");
		String isim=scan.next();
		System.out.println("Lütfen soyisminizi giriniz");
		String soyisim=scan.next();
		
		char isimIlkHarf=isim.toUpperCase().charAt(0);
		char soyIsýmIlkHarf=soyisim.toUpperCase().charAt(0);
		
		System.out.println(isimIlkHarf+isim.substring(1,isim.length()).toLowerCase()+" "+ soyIsýmIlkHarf+soyisim.substring(1, soyisim.length()).toLowerCase());
		
		
		scan.close();

	}

}
