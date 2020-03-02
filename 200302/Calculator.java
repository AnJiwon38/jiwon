import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//데이터를 입력받기위해 scan이라는 이름을 갖고있는 Scanner 생성
		
		int number = 0;
		int number2 = 0;
		int result = 0;
		
		System.out.println("숫자를 입력하세요.");
		number = scan.nextInt();
		
		System.out.println("숫자를 입력하세요.");
		number2 = scan.nextInt();
		//nextInt() : 프로그램이 시작할 때 다음에 int 값이 들어오면 받아서 number값에 저장하라는 뜻
		
		//System.out.println("입력한 숫자 : " + number);
		//System.out.println("입력한 숫자 : " + number2);
		result = number + number2;
		System.out.println("덧셈 결과 : " + result);		
	}

}

/*
대문자가 나오면 단어가 두개가 조합된것.
*/