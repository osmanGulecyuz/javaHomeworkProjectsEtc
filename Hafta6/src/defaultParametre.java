
public class defaultParametre {

	public static void main(String[] args) {
		selam("");
		selam("Ali");

	}

	private static void selam(String isim) {
		if(isim==null || isim.isEmpty()) {
			isim="Boş";
		}
		System.out.println("Merhaba "+isim);
	}

}
