
public class Hello {
//접근제한이 없는 클래스 이름은 Hello
	public static void main(String[] args) {
		System.out.print("자기소개 프로그램\n");
		System.out.println("======================");
		System.out.println("이름 : 안지원");
		System.out.println("취미 : 영화감상, 독서");
		System.out.println("주량 : 알쓰");
		System.out.printf("%f + %d = %d", 1.5, 2, 1+2);
		//println 대신 \n을 사용하면 원하는 만큼 줄을 변경할 수 있음
		//printf(format, args) foramt - 형식을 지정하게되는 문자, args
		//%d 에서 d는 십진수를 의미함
		//ex. 1.5를 넣어주면 오류 발생함
		//주석은 한 줄로만 구성이 되도록 해야하지만 코드는 ; 나오기 전까지는 상관없음
		/*
		 * 이것은 여러 줄을 주석으로 처리합니다. 
		 */
		
		/*
		 * 데이터의 종류
		 * 1. 숫자
		 *   1)정수 - 소수점이 없는 숫자
		 *     (integer)
		 *   2)실수 - 소수점이 있는 숫자(부동소수점)
		 *     (float)
		 * 2. 문자(character)
		 * 3. 문자열(string)
		 *    -한글은 문자로 못 다루기 때문에 문자열로만 사용해야함-
		 * 4. 진리값(true/false)
		 *    -0이면 거짓, 1이면 참-
		 */
		
		/*
		 * 메모리에서 모든 프로그램은 동작함.
		 * 데이터도 모두 메모리에 저장되어야 함.
		 * 데이터를 저장하는 공간을 변수라고 함. 
		 */
		
		/* 자료형의 종류
		 * 1. 진리값 자료형 boolean
		 * 1-1. 바이트 자료형 byte - 1byte
		 * 2. 문자형 자료형 char - 2byte
		 * 3. 정수형 자료형 
		 *   	 short - 2byte
		 *   	 int - 4byte
		 *   	 long - 4byte
		 *   	 long long
		 * 4. 실수형 자료형
		 *    	 float - 4byte
		 *   	 double - 8byte
		 *   	 long double
		 * 5. 참조자료형
		 * 	 	  문자열 - String 
		 * 
		 * long long, long double 는 거의 쓰이지 않음
		 */
		
		/* 프로그램을 작성할 때 생각해야 할 일
		 * 1. 어떠한 데이터가 입력/출력되는가.
		 *   -> 데이터를 처리할 공간이 필요하다.
		 *   -> 해당 데이터의 변수를 만들어야 한다.
		 */
		
		//변수를 만드는 방법
		//자료형 이름;
		//진리값 저장 변수
		
		boolean b = false;		//true, false
		byte bb = 0;			//1byte
		char ch = '\0';			//숫자 0은 아스키코드로 048이기 때문에 Null 문자(\0)를 넣어준다.
		short s = 0;
		int i = 0;
		long l = 0L;
		float f = 0.0f;
		double d = 0.0f;
		
		String str1 = "";
		String str2 = null;
		
		//대입연산자(=) : 오른쪽에 있는 데이터를 왼쪽에 있는 공간에 대입한다.
		//초기화 : 제일 처음에 쓰일 값을 첫번째 데이터로 집어넣는것. 경우에 따라 해줘도 되고, 안해줘도 된다.
		
		
		
		/* 주석의 또다른 쓰임새 - 불필요한 소스 숨기기
		System.out.print("자기소개 프로그램\n");
		System.out.println("======================");
		System.out.println("이름 : 안지원");
		System.out.println("취미 : 영화감상, 독서");
		System.out.println("주량 : 알쓰");
		System.out.printf("%f + %d = %d", 1.5, 2, 1+2);
		*/
		
		
		//타이틀 출력
	}

}
