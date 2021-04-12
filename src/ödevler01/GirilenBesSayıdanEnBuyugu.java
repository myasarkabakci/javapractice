package ödevler01;

import java.util.Scanner;

public class GirilenBesSayýdanEnBuyugu {

	public static void main(String[] args) {
		//KOD SU AN HATALI EN SON GIRILEN SAYIYI VERIYOR
		
		
		//2-Kullanýcnýn gireceði 5 sayýdan onlar basamaðý en büyük olan sayýyý bulunuz.
        Scanner scan = new Scanner(System.in);

        int onlarEnbSayi = 0;
        int sayac=0;

        while (sayac<5){
            System.out.println("bir sayý giriniz");
            int sayi=scan.nextInt();
           
            if(sayi/10%10>onlarEnbSayi);
            onlarEnbSayi=sayi;
            sayac++;}
        
        System.out.println("onlarenb="+onlarEnbSayi);
	
	
	scan.close();
	}

}
