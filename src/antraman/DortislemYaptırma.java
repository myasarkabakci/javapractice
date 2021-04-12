package antraman;

import java.util.Scanner;

public class DortislemYapt�rma {

	public static void main(String[] args) {
		/*
		 * Soru2: Kullan�c�n�n konsol ekrandan 4 temel matematiksel i�lemi yapabildi�i
		 * bir program yazman�z bekleniyor. Program a�a��daki �zellikleri sa�lamal�d�r.
		 * Yap�labilecek temel i�lemler: Toplama, ��karma, �arpma, B�lme Kullan�c�ya 4
		 * i�lemden birini se�ece�i men�y� konsol ekrana yazd�r�n. �rne�in: 1-Toplama,
		 * 2-��karma vb� Ard�ndan kullan�c�dan 2 adet tamsay� tipinde say� girmesini
		 * isteyin. Bu girilen iki say�y� de�i�kenlerde saklay�n. Se�ilen i�lem tipine
		 * g�re matematiksel i�lemi yap�n ve konsol ekran�na yazd�r�n.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen yapmak istedi�iniz i�lemin numaras�n� giriniz");
		System.out.println("1-Toplama");
		System.out.println("2-��karma");
		System.out.println("3-�arpma");
		System.out.println("4-Bolme");
		
		int islem=scan.nextInt();
		
		System.out.println("L�tfen iki adet tam say� giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		if(islem==1) {
			System.out.println("Girdi�iniz say�lar�n toplam�  : "+(sayi1+sayi2));
		}else if(islem==2) {
			System.out.println("Girdi�iniz say�lar�n fark�  : "+(sayi1-sayi2));
		}else if(islem==3) {
			System.out.println("Girdi�iniz say�lar�n �arp�m�  : "+(sayi1*sayi2));
		}else if(islem==4) {
			System.out.println("Girdi�iniz say�lar�n bolumu  : "+(sayi1/sayi2));
		}else {
			System.out.println("L�tfen ge�erli say�lar giriniz");
		}

	scan.close();
	
	}

}
