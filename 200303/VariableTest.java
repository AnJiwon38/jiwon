
public class VariableTest {

	public static void main(String[] args) {
		// 변수 
		int num = 100;					//데이터 타입(정수형 4byte) 변수이름 = 리터럴. 변수에 생기는 경고는 변수를 현재 사용하지 않는다는 의미
		num = 200;						//생성된 num 변수에 200이라는 새로운 값 다시 대입해줌 
		char ch = ' ';					//' '은 공백 문자(space ber)로 사용 가능함. ''만 사용 X
		char ch2 = '한'; 				//2byte 안에 허용되는 데이터 문자 하나만 입력 가능
		//char ch3 = 'abc';     		//데이터가 한개 이상이므로 char 사용 X
		String str = "";				//문자열은 ""(비어있는 문자열)가 가능한데 문자는''가 불가능, 무언가가 입력이 되어야함. 문자를 빈공간으로 사용하려면 '\0'을 입력해야함
		String str2 = null;		
		num = 300;

		//상수
		final float PI;					//예약어 데이터타입
		PI = 4.0f;						//상수는 값을 변경할 수 없음
		//PI = 3.14f;
		
		
		int a = 10;						//정수 
		float f = a;					//실수
		/*
		System.out.println(f);			//f는 출력해주면서 사용했기 때문에 경고가 사라짐
		
		float realNumber = 3.14f;		//real과 number의 합성어기 때문에 두번째 단어의 시작을 대문자로 작성해줌
		System.out.println(realNumber);
		
		System.out.printf("%.4f",realNumber);//소수점 n자리까지 표시하고 싶을 때 %.nf로 작성
		*/
		
		
		//(자료)형변환
		// 자동형변환 - (암시적/묵시적)형변환
		// 강제형변환 - 명시적형변환
		int n1 = 5;
		int n2 = 2;
		//나눗셈 : / 
		System.out.println(((float)n1)/n2);
		//1.float변화 2.계산 순서대로 진행하게됨
		//1)System.out.println((float)(n1/n2));
		//정수끼리의 나누기가 되므로 2에 대한 형변환이 되어버림 
		//2)System.out.println((float)n1/n2);  
		//n1과 n2 중에 n1만 float가 되어 버림. 괄호는 괄호 뒤에만 있는 값에 대해 형변환을 함
		
		
		//다른 자료형 간의 연산
		//n1 = 5.0f;//변수의 타입이 변환하지는 않음=>n1이라는 공간은 integer n1자체를 형변환하는게 아니고, n1에 있는 데이터를 형변환하는것이므로
		//3 + 4 * 5 = 23  => 3 + (4 * 5) = 23 or (3 + 4) * 5 = 35
		//System.out.println(n1/n2);  	  //소수점 이하의 나머지가 손실되는 오류가 발생함
		
		float f1 = 3.14f;
		//int nf = f1;					 //큰거를 작은거로 바꾸면서 0.14 데이터가 날아가므로 불가능
		int nf = (int)f1;				 //데이터 없어질것 알고 있으니까 그냥 변경하라는 의미. 강제적으로 형변환
										
		
		//정수 < 실수 < 문자열 
		//숫자의 문자열 변환
		String str3 = "abc";
		int ntoa = 10;
		//str3 = (String)ntoa; 			//타입이 달라서 넣지 못해서 형변환 해줘야하는데 string형변환은 이런식으로 하면 오류발생
		str3 = ntoa + "";				
		System.out.println(str3);
				
		
		//문제
		//다음 중 캐스트연산자의 생략이 가능한 문장은?
		int num1 = 10;					//4byte
		//1. byte로 변환
		     byte b1 = (byte)num1;		//4byte->1byte
		//2. double로 변환
		     double d = num1;			//4byte->4byte
		//3. short로 변환
		     short s = (short)num1;		//4byte->2byte
		//4. long으로 변환
		     long l = num1;				//4byte->4byte
		
		//답 2,4 => byte와 short는 int보다 작기 때문에 생략이 불가능함. 자동형변환은 작은거에서 큰거로 가능함
		
		//오버플로우/언더플로우
		byte b = 127;				//-128~127가지이므로 byte b = 128은 불가능
		b++;
		
		System.out.println(b);		//128이 아닌 -128이 나옴. 0111/1111(127) + 1 => 1000/0000(-128)
									//변수를 묶어서 사용하는 배열에서 발생함
		}
		
		
		
		
		
		
	

}


/* 줄바꿈(enter)까지 데이터로 인식해줘야함
 * 부호 +(양의 정수), -(음의 정수) 숫자 타입 byte 256(2^8)가지  short int long float double
 * 범위는 가지수 2^8개만큼 사용할 수 있음
 * ㅁㅁㅁㅁㅁㅁㅁㅁ에서 첫번째는 부호 비트
 * 0일때 + 1일때 -를 나타냄 그러므로 -128~127(0을 포함하기 때문)까지 나타낼 수 있음
 * -128~-1까지 사용하지 않으면 부호비트 사용할 필요없기 때문에 unsigned로 명시해줌
 * 
 * 
 * 
 * 
 */
