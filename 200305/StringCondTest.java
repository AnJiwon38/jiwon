import java.util.Scanner;

public class StringCondTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String str1 = "abc";
		String str2 = "abc";
		//String str2 = new String ("abc"); 
		//new를 사용하면 새로 데이터를 다시 만들기 때문에 같지 않다 가 나옴
		//String도 scanner 처럼 new 형식으로 사용가능하지만 자주 사용해서 new없이 사용해도 상관없다.
		
		//new가 인스턴스 생성명령어 -> Heap영역에 동적으로 필요할 때 생성함
		//== 이름만 가지고 비교
		//equals 진짜 데이터(주소값)으로 비교 
		
		if(str1 == str2) {
			System.out.println("같다.");
		}
		else {
			System.out.println("같지않다.");
		}
		
		str2 = scan.next();//abc 입력
		
		if(str1.equals(str2)) {
			System.out.println("같다.");
		}
		else {
			System.out.println("같지않다.");
		}
		//abc를 직접 입력을 받아서 비교하면 결과값이 다르게 나옴
		
	}

}

//메모리 구조