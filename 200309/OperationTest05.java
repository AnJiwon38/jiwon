import java.util.*;

public class OperationTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ݺ���
		//while��
		//while(���ǽ�) { ... }
		//1~100���� ������ ����
		//���� ���� while���� for������ ����
		int i = 1;
		int sum = 0;
		
		
		while(i <= 100) {
			sum += i;
			i++;			
		}
		
		System.out.printf("1~100���� ������ [%d]%n", sum);
		
		
		int sum2 = 0;
		for(int j = 1; j <= 100; j++) {
			sum2 += j;
		}
		System.out.printf("1~100���� ������ [%d]%n", sum2);
		
		
		
	}

}
