package �devler01;

import java.util.Scanner;

public class GirilenBesSay�danEnBuyugu {

	public static void main(String[] args) {
		//KOD SU AN HATALI EN SON GIRILEN SAYIYI VERIYOR
		
		
		//2-Kullan�cn�n girece�i 5 say�dan onlar basama�� en b�y�k olan say�y� bulunuz.
        Scanner scan = new Scanner(System.in);

        int onlarEnbSayi = 0;
        int sayac=0;

        while (sayac<5){
            System.out.println("bir say� giriniz");
            int sayi=scan.nextInt();
           
            if(sayi/10%10>onlarEnbSayi);
            onlarEnbSayi=sayi;
            sayac++;}
        
        System.out.println("onlarenb="+onlarEnbSayi);
	
	
	scan.close();
	}

}
