package hafta1;

import java.util.Scanner;

public class Soru6 {

	public static void main(String[] args) {


		
		Scanner input=new Scanner(System.in);
		System.out.println("Uc sayi giriniz");
		int sayi1=input.nextInt();
		int sayi2=input.nextInt();
		int sayi3=input.nextInt();
		
		// Sayıları küçükten büyüğe sırala
        if (sayi1 <= sayi2 && sayi1 <= sayi3) {
            if (sayi2 <= sayi3) {
                System.out.println("Sıralama: " + sayi1 + ", " + sayi2 + ", " + sayi3);
            } else {
                System.out.println("Sıralama: " + sayi1 + ", " + sayi3 + ", " + sayi2);
            }
        } else if (sayi2 <= sayi1 && sayi2 <= sayi3) {
            if (sayi1 <= sayi3) {
                System.out.println("Sıralama: " + sayi2 + ", " + sayi1 + ", " + sayi3);
            } else {
                System.out.println("Sıralama: " + sayi2 + ", " + sayi3 + ", " + sayi1);
            }
        } else {
            if (sayi1 <= sayi2) {
                System.out.println("Sıralama: " + sayi3 + ", " + sayi1 + ", " + sayi2);
            } else {
                System.out.println("Sıralama: " + sayi3 + ", " + sayi2 + ", " + sayi1);
            }
        }
		

	}

}
