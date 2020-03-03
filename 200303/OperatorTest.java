import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 산술연산자
		//  +, -, *, /, %(정수 연산일때만 %연산을 함)
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.println("** 간단한 계산기 **");
		System.out.println("=================");
		
		int num1 = 0, num2 = 0, result = 0;	//같은 데이터 타입이면 ,로 여러개 한번에 사용할 수 있음
		
		System.out.print("첫 번째 수 : ");
		num1 = scan.nextInt();
		System.out.print("두 번째 수 : ");
		num2 = scan.nextInt();
		
		result = num1 + num2;		
		System.out.println("덧셈 결과 : " + result);
		result = num1 - num2;		
		System.out.println("뺄셈 결과 : " + result);
		result = num1 * num2;		
		System.out.println("곱셈 결과 : " + result);
		result = num1 / num2;		
		System.out.println("나눗셈 결과 : " + result);
		result = num1 % num2;		
		System.out.println("나머지 : " + result);
		
		
		//2. 증감 연산자
		// ++, -- : 1씩 증가 또는 감소 시키는 연산자
		// 단항 연산자이기도 함. 좌측이나 우측 한 군데에만 옴
		int i = 0;
		i++;						//i에 있는 값을 불러와서 1을 더해준 뒤 다시 i에 대입함
		//1) i = i + 1;   2)i += 1;   3)i++;		이런 순서대로 발전함
		System.out.println(i);
		
		
		i=0;
		
		++i;
		System.out.println(i);
		
		//전위형, 후위형의 비교
		int j = 0;
		int k = 0;
		int l = 0;
		
		++j;				//따로 계산먼저하고 대입을 시키는게 더 편리함
		//k = j++;			//값이 먼저 대입이 돼서 k가 0이 됨. 값을 꺼내서 사용하는걸 먼저하고 연산함
		System.out.println("후위연산 : " + j);
		j = 0;
		//l = ++j;			//증가하고 대입이 되기 때문에 1이 됨. 꺼내서 연산하고 대입하도록 사용됨
		System.out.println("전위연산 : " + j);
	
		
		System.out.println(k + ", " +l);
		 */
		
		//3. 비교 연산자(결과는 boolean)
		//  크다, 작다, 같다, 같지 않다.('같다'라기 보다는 '같냐?'라는 의문 => 결과는 true , false로 나옴)
		// ==, !=, >, >=, <, <=
		int n1 = 4, n2 = 5;
		
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		System.out.println(n1 > n2);
		System.out.println(n1 >= n2);
		System.out.println(n1 < n2);
		System.out.println(n1 <= n2);
		
		boolean b = (n1 == n2) ;
		System.out.println(b);
		
		
		
		//============================================================================
		
		//4. 논리 연산자(결과는 boolean)
		//  AND, OR, NOT, XOR
		//
		
	}
}
