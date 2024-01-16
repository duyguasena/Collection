package hafta1;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {

        //		Tek mi çift mi
		
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi=inputScanner.nextInt();
		
		if (sayi%2==0) {
			System.out.println("Çift sayi");
		}else if (sayi%2==1) {
			System.out.println("Tek sayi");
		}
		
	}
	

}
