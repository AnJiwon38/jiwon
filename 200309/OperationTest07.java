
public class OperationTest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break, continue 문
		// 단독으로 사용이 불가능한 제어문
		// break 종료시키는 단독문
		// continue 

		// 1~100까지 짝수의 합
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				continue;//홀수일 경우에는 sum += i 패스함. continue 이후의 문장들은 skip하고 반복하라는 의미
			}
			
			sum += i;
		}
		
		System.out.println(sum);
		
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				break;//홀수일 경우에는 for문 반복이 멈춰버림
			}
			
			sum += i;
		}
		
		System.out.println(sum);
	}

}
