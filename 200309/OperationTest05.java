import java.util.*;

public class OperationTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반복문
		//while문
		//while(조건식) { ... }
		//1~100까지 숫자의 총합
		//같은 식을 while문과 for문으로 비교함
		int i = 1;
		int sum = 0;
		
		
		while(i <= 100) {
			sum += i;
			i++;			
		}
		
		System.out.printf("1~100까지 총합은 [%d]%n", sum);
		
		
		int sum2 = 0;
		for(int j = 1; j <= 100; j++) {
			sum2 += j;
		}
		System.out.printf("1~100까지 총합은 [%d]%n", sum2);
		
		
		
	}

}
