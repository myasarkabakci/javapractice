package �devler03;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/* Kullanicidan sayilar girmesini isteyin
         * ve girdigi sayilari toplayip yazdirin.
         * yeni sayi isteyin
         * girilen sayilarin toplami 100 'u gecerse
         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
         *
         */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen say�lar giriniz");
		
		int count=0;
		int toplamSayi=0;
		
		do {
			int sayi=scan.nextInt();
			
			if(sayi<=100) {
				count++;
				toplamSayi+=sayi;
			}

		}	while(toplamSayi<100);
			
			
			
		
		System.out.println(count +" kere sayi girdin.Bu kadar sayi yeter");
		
	

}
	
}

