package hatalar;

public class Hatalar {

	public static void main(String[] args) {
		int a=10000, b='a';
		try {
			
			System.out.println("Bölüm sonucu: "+(a/b));
			
		}catch(ArithmeticException e) {
			b=1;
			System.out.println("Bölüm sonucu: "+(a/b));
			System.out.println("B 1 alındı");
			
		}catch(Exception e) {
			System.out.println("Hatayı Görüntüle: "+ e);
		}finally {
			System.out.println("Program Bitti");
		}

	}

}
