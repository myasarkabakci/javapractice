package ödevler02;

import java.util.Scanner;

public class Soru5_SwitchCaseSorusu {

	public static void main(String[] args) {
		/*
		 * Kullanýcýný 1 ile 7 arasýnda bir sayý girdiðinde haftanýn hangi günü olduðunu
		 * yazdýran switch case java kodunu yazinýz.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 1 ve 7 arasýnda bir sayý giriniz");
		int sayi=scan.nextInt();
		
		switch(sayi){
			case 1:
				System.out.println("Pazartesi");
			break;	
			case 2:
				System.out.println("Salý");
			break;	
			case 3:
				System.out.println("Carsamba");
			break;	
			case 4:
				System.out.println("Persembe");
			break;	
			case 5:
				System.out.println("Cuma");
			break;	
			case 6:
				System.out.println("Cumartesi");
			break;	
			case 7:
				System.out.println("Pazar");
			break;	
			default:
				System.out.println("Lütfen geçerli bir sayý giriniz");
		}
		
		
		
		
		scan.close();
	}

}
