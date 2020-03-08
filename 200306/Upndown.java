import java.util.Random;
import java.util.Scanner;

public class Upndown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Random rand = new Random();
		int num = rand.nextInt(100);
		num++; 
		
		int i = scan.nextInt();
		System.out.printf("입력 > %d%n", i);
		
		int cnt = 0;
		
		for(int j = 1; j < 10; j++) {
		if(i != num) {
			if(num > i) {
			System.out.println("UP!");
			cnt++;
			i = scan.nextInt();
			System.out.printf("입력 > %d%n", i);
			}
			else if(num < i) {
				System.out.println("DOWN!");
				cnt++;
				i = scan.nextInt();
				System.out.printf("입력 > %d%n", i);
			}
			if(j == 9) {
				System.out.printf("실패! 정답 %d%n", num);
			}
		}
		else if(i == num){
			System.out.printf("시도 횟수 %d번 성공!", j);	
			break;
			}	
		}	
	}
}
