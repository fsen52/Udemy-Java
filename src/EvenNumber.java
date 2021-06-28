import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Please type a number for controlling even number  :");

		int value = key.nextInt();

		if (value % 2 == 0) {
			System.out.println("This number is an even number");
		} else {
			System.out.println("This number is an odd number");

		}
	}
}
