package �devler02;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		/*
		 * Print "L�tfen i� unvan�n�z� girin� �jobTitle� isimli bir degisken olusturun
		 * ve kullanicidan isteyin. Do�ru jobTitle yazd�rmak i�in a�a��daki test
		 * datalarini kullan�n. Example : Eger jobTitle qa ise print ��� unvan�n�z
		 * Quality Analyst� test data: qa ise print Quality Analyst dev ise print
		 * Developer ba ise print Business Analyst pm ise print Project Manager
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen i� unvan�n�z� girin");
		String jobTitle = scan.next().toLowerCase();

		if (jobTitle.equals("qa") ) {
			System.out.println("�� unvan�n�z Quality Analyst");
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
