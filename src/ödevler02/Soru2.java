package ödevler02;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		/*
		 * Print "Lütfen iþ unvanýnýzý girin” “jobTitle” isimli bir degisken olusturun
		 * ve kullanicidan isteyin. Doðru jobTitle yazdýrmak için aþaðýdaki test
		 * datalarini kullanýn. Example : Eger jobTitle qa ise print “Ýþ unvanýnýz
		 * Quality Analyst” test data: qa ise print Quality Analyst dev ise print
		 * Developer ba ise print Business Analyst pm ise print Project Manager
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iþ unvanýnýzý girin");
		String jobTitle = scan.next().toLowerCase();

		if (jobTitle.equals("qa") ) {
			System.out.println("Ýþ unvanýnýz Quality Analyst");
		} else if (jobTitle.equals("dev")) {
			System.out.println("Developer");
		} else if (jobTitle.equals("ba")) {
			System.out.println("Business Analyst");
		} else if (jobTitle.equals("pm")) {
			System.out.println("Project Manager");
		}else {
			System.out.println();
		}
		scan.close();
	}

}
