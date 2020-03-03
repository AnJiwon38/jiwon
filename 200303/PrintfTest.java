import java.util.Scanner;

public class PrintfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printf : 출력형식 지정 명령
		//("출력할 형식", 여러개의 값들..)
		
		//System.out.println("문자열");   			//println - 메소드  System 클래스이름
/*		Scanner scan = new Scanner(System.in);		//System.in : 키보드로부터 입력받을 수 있는 장치
		//객체 = 인스턴스(instance)  
		//new 키워드는 인스턴스를 생성하는 명령어
				
		int num = 10;
		
		num = scan.nextInt();						//메소드는 입력이 필요한 것과 필요없는 것 있음
													//클래스 일종의 설계도, 설계도로 직접 만든게 인스턴스
		
		System.out.printf("num 변수의 값은 %d", num); //정수일 경우에는 %d 사용
*/		
		
		
		//구구단 2단 출력
		int dan = 2;
		int m = 1;
		System.out.printf("2단%n");							//%n도 줄바꿈 역할
		System.out.printf("================%n");
		System.out.printf("%d * %d = %5d%n", dan, m, dan*m);//%nd n자리 숫자에 맞춰서 배열해줌
		m = m + 1;
		System.out.printf("%d * %d = %5d%n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d%n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d%n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d%n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d%n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d%n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d%n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %-5d*%n", dan, m, dan*m);//%-nd 뒤에부터 n자리 숫자에 맞춰서 배열해줌
		
		
		//금액 출력
		System.out.printf("당첨 %,d원%n",100000000);
		//공백 대체(0으로) 출력 => 10자리 안에서 빈공간은 0으로 채워줌
		System.out.printf("%010d%n", 123);
		//10진수 -> 16진수 출력			//octa
		System.out.printf("%x%n", 123);
		//10진수 -> 8진수 출력				//hexa
		System.out.printf("%o%n", 123);
		
		
		//실수 출력
		System.out.printf("%5.3f", 103.14);//앞에 있는 숫자보다 뒤에 있는 숫자를 우선처리해야함
		
		//System.out.printf("%f", 3.14);		//기본 6자리에서 빈자리는 0으로 채워줌
		
		System.out.print("dd");
	}

}
