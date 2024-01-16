package hafta1;

import java.util.Scanner;

public class Soru7 {

	public static void main(String[] args) {
		
        //Hava durumu kodunu ekrana yazdırma
		
		Scanner input=new Scanner(System.in);
		System.out.println("Hava durumu kodu giriniz");
		int havaDurumKodu=input.nextInt();
		
		
		String havaDurumu;
		switch (havaDurumKodu) {
		case 1:
			havaDurumu=("Güneşli");
			break;
		case 2:
			havaDurumu=("Bulutlu");
			break;
		case 3:
			havaDurumu=("Yağmurlu");
			break;
		case 4:
			havaDurumu=("Karlı");
			break;
		
		default:
			havaDurumu = "Geçersiz hava durumu kodu";
			break;
		}
		System.out.println("Hava durumu:"+havaDurumu);

	}

}
