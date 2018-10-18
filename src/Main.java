import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Input Number(0-9) :");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		Calculate number = new Calculate();
		number.setNumber(num);
		System.out.println(number.calculate());

	}

}
