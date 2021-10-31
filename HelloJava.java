public class HelloJava {

	public static void main(String[] args) {
		String name = "Anna";
		String surname = "Krzysik";
		String phone = "123456789";
		String city = "Krakow";
		System.out.println();
		
		String line1 = "*" + " " + "tel." + name + " " + surname;
		String line2 = "*" + " " + "adres:" + phone + " " + city;
		
		int line1Length = line1.length();
		int line2Length = line2.length();
		int cardlength = line2Length;
		
		//zmień długość wizytówki jeżeli linia 1 jest dłuższa
		if (line1Length > line2Length) {
			cardlength = line1Length;
		}
		
		//wydłuż szerokość wizytówki o 2 żeby zmieścić dodatkową spację i gwiazdkę
		cardlength = cardlength + 2;

		int padding1length = cardlength - line1Length;
		int padding2length = cardlength - line2Length;

		//wydrukuj górną ramkę
		for (int i = 0; i < cardlength; i++) {
			System.out.print("*");
		}

		System.out.println();
		System.out.print(line1);
		for (int i = 1; i < padding1length; i++) {
			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println();
		System.out.print(line2);
		for (int i = 1; i < padding2length; i++) {
			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println();
		//wydrukuj dolną ramkę
		for (int i = 0; i < cardlength; i++) {
			System.out.print("*");
		}
	}
}
