package java5_odev;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir isim ve karakter girmesini isteyin, sonra karakterin ka� kez
		 * tekrarland���n� kontrol edin. e.g: char ch1= 'a' ; String name =�John came
		 * late" => Tekrar Sayisi = 2
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir isim giriniz");
		String isim=scan.nextLine();
		System.out.println("L�tfen bir karakter giriniz");
		char karakter=scan.next().charAt(0);
		
		int count=0;
		
		for (int i = 0; i < isim.length(); i++) {
			if(isim.charAt(i)==karakter)
			count++;
		}
		System.out.println("Tekrar Sayisi :"+count);

		scan.close();
	}

}
