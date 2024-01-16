package hafta2;

public class Soru1 {
	
	//1- Fibonacci sayılarını özyinelemeli (recursive) olarak bulan program

	
	static int fibonacci(int n) {
		if(n==1||n==2)
			return 1;
		
		return fibonacci(n-1)+fibonacci(n-2);
		
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(7));

	}

}
