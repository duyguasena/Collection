package hafta1;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {


		
//		Basit Hesap Makinesi
		
		Scanner input=new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz");
		int sayi1=input.nextInt();
		int sayi2=input.nextInt();
		
		int toplam=sayi1+sayi2;
		int fark=sayi1-sayi2;
		int çarpım=sayi1*sayi2;
		int bolum=sayi1/sayi2;
		
		System.out.println("Toplam:"+toplam);
		System.out.println("Fark"+fark);
		System.out.println("Çarpım"+çarpım);
		System.out.println("Bolum"+bolum);
	}

}
