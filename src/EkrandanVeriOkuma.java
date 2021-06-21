import java.util.Scanner;

public class EkrandanVeriOkuma {
	public static void main(String[] furkan) {
		System.out.println("Bir sayı giriniz   ... :");
		Scanner klavye = new Scanner(System.in);
		int sayi = klavye.nextInt();
		System.out.println("Girdiğiniz sayi :  " + sayi);
	}

}
