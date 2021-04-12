package antraman;

import java.util.Random;

public class RastgeleSayýlar {

	public static void main(String[] args) {
		/*
		 * Soru3: Rastgele sayýlardan oluþmuþ 100 elemanlýk tamsayý dizisindeki tüm
		 * elemanlarýn ortalamasýný alacak programý geliþtirin. Programý yazarken
		 * aþaðýdaki özelliklere uygun yazýnýz. Rastgele oluþan 100 elemanlýk sayý
		 * kümesi program yeniden her çalýþtýðýnda deðiþsin. Sabit elemanlý bir dizi
		 * vermeyin! Ortalama almayý saðlayacak kodu bir fonksiyon halinde tasarlayýn.
		 * Ýçine diziyi girdi (input) olarak alsýn. Ortalama alan fonksiyon ortalamayý
		 * ondalýklý sayý olarak döndürsün. (return) etsin.
		 */

		
		int[] sayilar=new int[100];
		
		for (int i = 0; i <100; i++) {
			Random rand=new Random();
			int sayi=rand.nextInt(1000);
			sayilar[i]=sayi;
			
		}
		double ort=ortalama(sayilar);
		System.out.println("ortalama : "+ort);
	}
	
	public static double ortalama(int[]dizi) {
		double toplam=0;
		for (int i = 0; i <100; i++) {
			
			toplam+=dizi[i];
			
		}
		return toplam/100;
	}

}
