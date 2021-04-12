package ödevler03;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
	 /* SORU 3) Kullanicidan 100 den kucuk bir tamsayi isteyip, bu sayinin daha
    * onceden tanimlanmis array’de olup olmadigini kullaniciya donen bir method
    * yaziniz
    *
    * Array={3,5,21,32,34,45,56,57,76,87,95}
    *
    * Input : 5  Output: Girdiginiz sayi Arrayde var
    * Input : 15 Output: Girdiginiz sayi Arrayde yok
    */

		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen 100'den küçük bir tam sayý giriniz");
		int sayi=scan.nextInt();
		
		int arr[]= {3,5,21,32,34,45,56,57,76,87,95};
		int flag=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sayi) {
				flag=1;
			}
		}
		
		if (flag==1) {
			System.out.println("Girdiginiz sayi Arrayde var");
		}else {
			System.out.println("Girdiginiz sayi Arrayde yok");
		}
		
	scan.close();	
	}

}
