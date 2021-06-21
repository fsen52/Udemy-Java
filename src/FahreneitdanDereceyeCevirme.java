import java.util.Scanner;

public class FahreneitdanDereceyeCevirme {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("lütfen dereceye çevirmek istediğiniz fahreneit değerini giriniz  :");
		
		int fahreneit = girdi.nextInt();
		
		double derece = (int)((5.0 / 9) * (fahreneit-32));
		
		System.out.println("Girdiğiniz değer " + derece + " dereceye eşittir.");

	}

}
