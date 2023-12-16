import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		/*Scanner girisyapolm= new Scanner(System.in);
		System.out.print("Vize notu gir lan    ");
		byte vizeNotu=girisyapolm.nextByte();
		System.out.print("Final de gir bakim	");
		byte finalNotu= girisyapolm.nextByte();
		byte basariNotu=(byte) ((vizeNotu+finalNotu)/2);
		System.out.println("Program Bitti "+"Basari Notunuz: "+basariNotu);*/
		
		
		Scanner girisyap=new Scanner(System.in);
		System.out.print("Vize Notu Giriniz ");
		byte vize=girisyap.nextByte();
		System.out.println("Final giriniz");
		byte finall=girisyap.nextByte();
		byte basarinotu=(byte) ((vize+finall)/2);
	
		System.out.println("Basari notunuz: "+basarinotu);
		System.out.println("Program Bitti");
		

	}

}
