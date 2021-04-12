package antraman;

import java.util.Random;

public class RastgeleSay�lar {

	public static void main(String[] args) {
		/*
		 * Soru3: Rastgele say�lardan olu�mu� 100 elemanl�k tamsay� dizisindeki t�m
		 * elemanlar�n ortalamas�n� alacak program� geli�tirin. Program� yazarken
		 * a�a��daki �zelliklere uygun yaz�n�z. Rastgele olu�an 100 elemanl�k say�
		 * k�mesi program yeniden her �al��t���nda de�i�sin. Sabit elemanl� bir dizi
		 * vermeyin! Ortalama almay� sa�layacak kodu bir fonksiyon halinde tasarlay�n.
		 * ��ine diziyi girdi (input) olarak als�n. Ortalama alan fonksiyon ortalamay�
		 * ondal�kl� say� olarak d�nd�rs�n. (return) etsin.
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
