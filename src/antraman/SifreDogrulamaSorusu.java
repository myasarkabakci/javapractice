package antraman;

import java.util.Scanner;

public class SifreDogrulamaSorusu {

	public static void main(String[] args) {
		// Soru1: String tipinde sabit bir �ifre de�i�keni olu�turun. �rne�in: String
		// password = �12345�; gibi. Ard�ndan, kullan�c�dan klavyeden bir �ifre
		// girmesini isteyin. Girilen �ifre ile de�i�kende tuttu�unuz de�eri k�yaslay�n.
		// E�er, iki de�er birbirine e�itse ekrana �Giri� Ba�ar�l�!�, de�ilse �Giri�
		// Ba�ar�s�z� yazd�r�n.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen �ifrenizi giriniz");
		String sifre=scan.nextLine();
		String sifre1="123456";
		
		if(sifre.equals(sifre1)) {
			System.out.println("Giri� Ba�ar�l�!");
		}else {
			System.out.println("Giris Basar�s�z");
		}
		scan.close();
	}

}
