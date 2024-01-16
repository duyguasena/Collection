package hafta1;

import java.util.Scanner;

public class Soru9 {

	public static void main(String[] args) {
		// Kullaniciya hangi geometrik seklin alanini hesaplamak istedigini sorun.
		//Ardindan, secilen sekle gore gerekli bilgileri alarak alani hesaplayin. (1-Dikdortgen, 2-Kare, 3-Ucgen)
		
		Scanner input=new Scanner(System.in);
		System.out.println("Secim yapiniz");
		System.out.println("1. Dikdortgen");
        System.out.println("2. Kare");
        System.out.println("3. Uçgen");
        int secim=input.nextInt();
		
		double alan=0;
        
		switch (secim) {
		case 1:
			System.out.print("Dikdörtgenin uzun kenarını girin: ");
            double uzunKenar = input.nextDouble();
            System.out.print("Dikdörtgenin kısa kenarını girin: ");
            double kisaKenar = input.nextDouble();
            alan = uzunKenar * kisaKenar;
			break;
		case 2:
			System.out.print("Karenin kenar uzunluğunu girin: ");
            double kenar = input.nextDouble();
            alan = kenar * kenar;
			break;
		case 3:
			 System.out.print("Üçgenin taban uzunlugunu girin: ");
             double tabanUzunlugu = input.nextDouble();
             System.out.print("Üçgenin yüksekliğini girin: ");
             double yukseklik = input.nextDouble();
             alan = 0.5 * tabanUzunlugu * yukseklik;
			break;
		default:
			System.out.println("Geçersiz değer girdiniz");
			break;
		}
		System.out.println("Sectiğiniz seklin alani:"+alan);

	}

}
