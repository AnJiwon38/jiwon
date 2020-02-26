package test01;

public class ExamTest02 {
	public static void main(String[] args) {
		//입력받은 금액
		int i = 6530;
		int a;//1000원의 개수
		int b;//500원의 개수
		int c;//100원의 개수
		int d;//10원의 개수
		int r;//나머지 값
		
		
		a = i/1000;
		r = i%1000;
		
		b = r/500;
		r = r%500;
		
		c = r/100;
		r = r%100;
		
		d = r/10;
		r = r%10;
		
		System.out.println("입력받은 금액 : " + i + "원");
		System.out.println("거스름 돈은 1000원 " + a + "개, " + "500원 " + b + "개, " 
							+ "100원 " + c + "개, " + "10원 " + d + "개입니다.");
		
		
	}
			
}
