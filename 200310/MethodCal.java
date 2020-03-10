import java.util.Scanner;

public class MethodCal {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4칙 연산 계산기
		// 덧셈 연산용 메소드 파라미터 X, 반환값 X
		// 작성한 메소드는 다른 메소드 안에서 호출한다.
		// 1. 파라미터가 있고 결과값이 있는 메소드 호출법
		int rs = add(1, 2);//결과값 저장할 변수. 공간이 두개가 있으면 비워두면 안되므로 다 채워넣어야함
		System.out.println("1 + 2 = " + rs);
		System.out.println("3 + 4 = " + add(3, 4));//변수없이 곧바로 사용할 수 있음 ex.3+4
		int a1, a2;
		a1 = scan.nextInt();
		a2 = scan.nextInt();
		System.out.println(a1 + " + " + a2 
				+ " = " + add(a1, a2));
		//변수가 통째로 전달되는 것이 아닌 안에 있는 정보만 전달됨

		//2. 파라미터 O, 반환값 X
		sub(a1, a2);
		
		//3. 파라미터 X, 반환값 O
		rs = mul();
		
		//4. 파라미터 X, 반환값 X
		div();
		
	}//main 메소드 끝
	
	//파라미터 O, 반환값 O 메소드
	//두개의 값을 입력받는 메소드
	//결과를 반환하는 메소드
	//메소드 이름 앞에 붙이는 자료형은 반환되는(결과) 값의 자료형을 붙인다.
	// -> 반환형
	public static int add(int a, int b) {//a, b만 입력값 받기 위한 변수로 사용 가능
		int c, d;//입력값 받기 위한 변수로 못 씀. 
		int result = a + b;
		return result;

		//앞에 항상 public static 붙여주기
		//결과값을 줄 때 정수값이 아닌 실수값으로 준다는 걸 알려줘야함.
		//받는사람 입장에서 어떤 결과가 나왔는지 알아야 정확히 처리를 할 수 있기 때문
		//결과값에 대한 상태를 미리 말해놓고 시작하기 위해 메소드 타입 앞에 자료형을 붙임(반환형)
		//메소드 앞에 반환형태를 붙인다고 해서 반환형이라고 함 
		//return해주는 변수인 result와 동일한 타입으로 사용해야함
		
		//return 없으면 에러 발생함. int로 받는다고 명시해 두었기 때문
	}
	
		//float로 받는 예시
	
		//public static float divid(int a, int b) {
		//	float result = (float)a/b;
		//	return result;
		//}
		//파라미터가 있다는 의미는 입력값을 받아야하는데 
		//변수니까 기억공간을 만들어놓고, 파라미터값 가져다가 사용할 수 있음
		//두개의 숫자를 주면 다시 되돌려주는게 메소드의 기본 형태
	
	//파라미터 O, 반환값 X 메소드
	public static void sub(int a, int b) {
		int result = a - b;
		System.out.println(a + " - " + b + " = " + result);
	}
		//형식에 맞춰서 사용해야함. return이 없는 경우에는 void 사용
	
	//파라미터 X, 반환값 O 메소드
	public static int mul() {//return이 없어서 빨간줄 오류뜸
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = a * b;
		return result;
	}
	
	//파라미터 X, 반환값 X 메소드
	public static void div() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = a / b;
		System.out.println(a + " / " + b + " = " + result);
	}
	//입력 출력 모두 생성한 뒤 받는다. 
	
	
}//class 끝
