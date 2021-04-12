package ödevler01;

import java.util.Scanner;

public class C3_TurnerySorusu {
	public static void main(String[] args) {
		/*
		Ternary kullanarak:
				int variable : FIYAT
				string variable : Secim (String Secim=.....)
				price = $10 ise Print “UCUZ”
				price 10-$20 arasi ise Print “UYGUN”
				diger durumlar icin “PAHALI” yazdirin.
			*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen almak istediðiniz ürünün fiyatýný($) giriniz");
		int fiyat=scan.nextInt();
		
		String sonuc= fiyat<=10?"UCUZ":fiyat>10&&fiyat<20?"UYGUN":"PAHALI";
		System.out.println(sonuc);
		
		scan.close();

	}

}
