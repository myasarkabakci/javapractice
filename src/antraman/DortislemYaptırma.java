package antraman;

import java.util.Scanner;

public class DortislemYaptýrma {

	public static void main(String[] args) {
		/*
		 * Soru2: Kullanýcýnýn konsol ekrandan 4 temel matematiksel iþlemi yapabildiði
		 * bir program yazmanýz bekleniyor. Program aþaðýdaki özellikleri saðlamalýdýr.
		 * Yapýlabilecek temel iþlemler: Toplama, Çýkarma, Çarpma, Bölme Kullanýcýya 4
		 * iþlemden birini seçeceði menüyü konsol ekrana yazdýrýn. Örneðin: 1-Toplama,
		 * 2-Çýkarma vb… Ardýndan kullanýcýdan 2 adet tamsayý tipinde sayý girmesini
		 * isteyin. Bu girilen iki sayýyý deðiþkenlerde saklayýn. Seçilen iþlem tipine
		 * göre matematiksel iþlemi yapýn ve konsol ekranýna yazdýrýn.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen yapmak istediðiniz iþlemin numarasýný giriniz");
		System.out.println("1-Toplama");
		System.out.println("2-Çýkarma");
		System.out.println("3-Çarpma");
		System.out.println("4-Bolme");
		
		int islem=scan.nextInt();
		
		System.out.println("Lütfen iki adet tam sayý giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		if(islem==1) {
			System.out.println("Girdiðiniz sayýlarýn toplamý  : "+(sayi1+sayi2));
		}else if(islem==2) {
			System.out.println("Girdiðiniz sayýlarýn farký  : "+(sayi1-sayi2));
		}else if(islem==3) {
			System.out.println("Girdiðiniz sayýlarýn çarpýmý  : "+(sayi1*sayi2));
		}else if(islem==4) {
			System.out.println("Girdiðiniz sayýlarýn bolumu  : "+(sayi1/sayi2));
		}else {
			System.out.println("Lütfen geçerli sayýlar giriniz");
		}

	scan.close();
	
	}

}
