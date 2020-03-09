import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		
		for(int j = 1; j < 10; j++) {
			System.out.println(i + " * " + j + " = " + i*j);
		}
	}

}
