public class BusinessCard {

	public static void main(String[] args) {
		String name = "Anna";
		String surname = "Krzysik";
		String phone = "123456789";
		String city = "Krakow";
		
		
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

		int padding1length = padding(cardlength, line1Length);
		int padding2length = padding(cardlength, line2Length);

		printFrame(cardlength);
		printLine(line1, padding1length);
		printLine(line2, padding2length);
		printFrame(cardlength);
	}

	private static int padding(int cardlength, int linelength) {
		return cardlength - linelength;
	}
	private static void printFrame(int cardlength) {
		System.out.println();
		//wydrukuj ramkę
		for (int i = 0; i < cardlength; i++) {
			System.out.print("*");
		}
	}

	private static void printLine(String line, int paddinglength) {
		System.out.println();
		System.out.print(line);
		for (int i = 1; i < paddinglength; i++) {
			System.out.print(" ");
		}
		System.out.print("*");
	}
}
