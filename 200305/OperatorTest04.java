
public class OperatorTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제어문 조합
		//for, if 문 조합
		//예제. 1~100까지의 짝수의 합 구하기

		int sum = 0;
				
		for(int i = 1; i <= 100; i++) {
			if(i%2==0) {
				sum += i;				
			}
		}System.out.println("짝수의 합 : " + sum);
	}

}
