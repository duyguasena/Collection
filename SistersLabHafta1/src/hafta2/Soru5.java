package hafta2;

import java.util.Scanner;

public class Soru5 {
	//Kendi hesap makinenizi yapin

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        // Kullanıcıya hangi işlemi yapmak istediğini seçmesini söyle
        System.out.println("Yapmak istediğiniz işlemi seçin:");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Bölme");
        System.out.println("4. Çarpma");
        System.out.print("Seçiminizi yapın (1-4): ");
        int secim = scanner.nextInt();

        // Seçime göre işlemi yap ve sonucu ekrana yazdır
        switch (secim) {
            case 1:
                System.out.println("Toplama sonucu: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Çıkarma sonucu: " + (sayi1 - sayi2));
                break;
            case 3:
                if (sayi2 != 0) {
                    System.out.println("Bölme sonucu: " + (sayi1 / sayi2));
                } else {
                    System.out.println("Bir sayıyı sıfıra bölemezsiniz.");
                }
                break;
            case 4:
                System.out.println("Çarpma sonucu: " + (sayi1 * sayi2));
                break;
            default:
                System.out.println("Geçersiz seçim. Lütfen 1-4 arasında bir sayı girin.");
        }
    
	}
		

	}


