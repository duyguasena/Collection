package hafta1;


import java.util.Scanner;



public class Soru2 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Tutari girin");
		double tutar=scanner.nextDouble();
		
		double kdvOrani;
        if (tutar >= 0 && tutar <= 1000) {
            kdvOrani = 0.10; 
        } else {
            kdvOrani = 0.22; 
        }

        // KDV tutarını hesapla
        double kdvTutari = tutar * kdvOrani;
        System.out.println(kdvTutari);
		
		
		 
		
		
		
		
	}

}
