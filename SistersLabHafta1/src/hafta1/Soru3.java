package hafta1;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {

        //Not değeri hesaplayan program
		
		Scanner input=new Scanner(System.in);
		System.out.println("Notunuzu giriniz");
		int not=input.nextInt();
		
		if (not>=90&&not<=100) {
			System.out.println("AA");
		}else if (not>=80&&not<=89) {
			System.out.println("BA");
		}else if (not>=70&&not<=79) {
			System.out.println("BB");
		}else if (not>=60&&not<=69) {
			System.out.println("CB");
		}else if (not>=50&&not<=59) {
			System.out.println("CC");
		}else {
			System.out.println("FF");
		}
		
		
		
	}

}
