import java.util.Scanner;

public class ControlTest01 {

		public static void main(String[] args) {
			// 조건문 if
			// 만약 true라면 처리, false라면 넘어감.
			// if(조건식)
			// 		처리문장(명령문);
			//입력 값이 짝수인지 판단하는 프로그램
			
//			Scanner scan = new Scanner(System.in);
//			int num = 0;
//			System.out.print("숫자 입력 : ");
//			num = scan.nextInt();
//			if(num % 2 != 1){					//num % 2 == 0 도 사용 가능
//				System.out.println("짝수입니다.");
//				System.out.println("2의 배수입니다.");
//			//Enter해도 들여쓰기 안되는 이유 - if문 끝났기 때문에 다음줄은 영향을 안 받기 때문에
//			}			
//			
//			else {								//if(num % 2 == 1) 대신 else 사용
//				System.out.println("홀수입니다.");
//			}
			
			//다중 분기 else if.
			//if(조건식1) { .... }
			//else if(조건식2) { .... }
			//else if(조건식3) { .... }
			//[else { .... }]									//대괄호는 생략 가능하다는 의미 => 조건식은 필요한 만큼만 사용하면 됨
			
			//학점 변환 프로그램
			//성적 -> 학점
			//90점 이상 : A
			//80점 이상 : B
			//70점 이상 : C
			//60점 이상 : D
			//나머지 : F
			
			System.out.print("점수 : ");
			Scanner scan = new Scanner(System.in);
			int score = scan.nextInt();				//성적입력
			String grade = null;
			
			if(score >= 90) {
				if(score >= 95) {
					grade = "A+";
				}
				else {				//if문에 꼭 else가 필요하지는 않음
					grade = "A0";
				}
				
			}
			
//			if(score >= 95) {
//				grade = "A+";
//			}
//			else if(score >= 90) {
//				grade = "A";
//			}
			
			else if(score >= 80 && score < 90) {	//and 연산자는 우선적으로 처리해줘야 되는 걸 앞쪽에 둔다.
				if(score >= 85) {
					grade = "B+";
				}
				if(score < 85) {
					grade = "B0";
				}
			}
			
			else if(score >= 70 && score < 80) {
				if(score >= 75) {
					grade = "C+";
				}
				if(score < 75) {
					grade = "C0";
				}
			}
			
			else if(score >= 60 && score < 70) {
				if(score >= 65) {
					grade = "D+";
				}
				else {
					grade = "D0";
				}
			}
			else {									//나머지 값에 해당되기 때문에 else if(score < 60)로 쓰지 않아도된다.
				grade = "F";
			}
			
			System.out.println("학점 : " + grade);
			
			
			
			System.out.println("종료합니다.");
			
			//컴퓨터는 덧셈밖에 못함
			//두번째에 해당하는 수를 마이너스해서 따로 만들어줌
			//뺄셈을 보수를 해줘서 덧셈으로 계산을 해줌
			//곱셈 덧셈의 연속
			//나눗셈 뺄셈의 연속이므로 결국 덧셈의 연속이다.
			
			
			//제어문안에 제어문이 들어가는 것을 중첩이라고 한다. 하위 제어문
		}
}
