package java5_odev;

public class Soru2 {

	public static void main(String[] args) {
		/*
		1-20 arasindaki -20 dahil olmak �zere-  �ift say�lar� yazd�r�n. e.g.2 4 6 .. 20


		1-20 arasindaki -20 dahil olmak �zere-  tek say�lar� yazd�r�n. e.g 1,3,5,7,...,19 Virgul dahil!


		20 ile 1 arasindaki 5 e bolunebilen sayillari 20 den geriye gelerek yazdirin. e.g.20,15,10,5
		 
		1 - 20 aras�ndaki t�m �ift say�lar�n toplam�n� bulun.

		11 veya 15 hari� 1-20 aras�ndaki t�m say�lar� yazd�r�n; break or continue kullanin. 
		*/

		
		for (int i = 0; i <= 20; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
			
		}
			System.out.println();
		
			for (int i = 0; i <= 20; i++) {
				if (i%2!=0) {
					System.out.print(i+",");
				}
		}
			System.out.println();
			
			for (int i = 20; i >= 0; i--) {
				if (i%5==0) {
					System.out.print(i+",");
				}
		}
		System.out.println();
		int toplam=0;
		for (int i = 0; i <= 20; i++) {
			if (i%2==0) {
				toplam+=i;
			}
			
		}
		System.out.print(toplam);
		
		System.out.println();
		for (int i = 0; i <= 20; i++) {
			if(i!=11&&i!=15) {
				System.out.print(i+",");
			}
			
			
			
			
			
		}
	
		
	}

}
