package hafta2;

public class Soru7 {
	//Armstrong sayı mı kontrol eden program

	public static void main(String[] args) {
		
		int temp,birler,onlar,yüzler,toplam;
		for(int i=100;i<999;i++) {
			temp=i;
			
			birler=temp%10;
			temp/=10;
			
			onlar=temp%10;
			temp/=10;
			
			yüzler=temp%10;
			temp/=10;
			
			toplam=(birler*birler*birler)+(yüzler*yüzler*yüzler)+(onlar*onlar*onlar);
			if(toplam==i) {
				System.out.println(i+"bir armstrong sayıdır");
			}
			
			
			
		}
		

	}

}
