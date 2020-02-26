// 3과 4의 합을 구하세요.
package test01;//소속되어 있는 그룹

public class ExamTest01 {//class 파일을 만들자

	public static void main(String[] args) {//static - 메모리에 올려줌
		// 3을 보관 -> 보관명(num1)
		int num1 = 3;
		// 변수명 num2에 4를 대입(선언)
		int num2 = 4;
		int num3 = 10;
		// 합 선언
		int sum;
		
		// 합구하기 => 보관(sum)
		sum = num1 + num2 + num3;
		
		// 합을 출력
		System.out.println("합은 " + sum + " 입니다.");// + : 연결할 때 사용, 공백도 문자다.	
		
	}

}
