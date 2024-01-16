package hafta2;

public class Soru4 {
	//Girilen sayıyı asal mı kontrol eden program
	
	public static boolean asalMi(int sayi) {
		
		boolean sonuc=true;
		for(int i=2;i<sayi;i++) {
			if (sayi%i==0) {
				sonuc=false;
				break;
			}
		}
		return sonuc;
		
	}
	
	public static void main(String[] args) {
		System.out.println(asalMi(7));
	}

}
