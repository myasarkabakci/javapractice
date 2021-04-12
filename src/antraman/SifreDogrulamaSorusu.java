package antraman;

import java.util.Scanner;

public class SifreDogrulamaSorusu {

	public static void main(String[] args) {
		// Soru1: String tipinde sabit bir þifre deðiþkeni oluþturun. Örneðin: String
		// password = “12345”; gibi. Ardýndan, kullanýcýdan klavyeden bir þifre
		// girmesini isteyin. Girilen þifre ile deðiþkende tuttuðunuz deðeri kýyaslayýn.
		// Eðer, iki deðer birbirine eþitse ekrana “Giriþ Baþarýlý!”, deðilse “Giriþ
		// Baþarýsýz” yazdýrýn.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen þifrenizi giriniz");
		String sifre=scan.nextLine();
		String sifre1="123456";
		
		if(sifre.equals(sifre1)) {
			System.out.println("Giriþ Baþarýlý!");
		}else {
			System.out.println("Giris Basarýsýz");
		}
		scan.close();
	}

}
