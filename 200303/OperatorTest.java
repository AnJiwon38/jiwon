import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ���������
		//  +, -, *, /, %(���� �����϶��� %������ ��)
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.println("** ������ ���� **");
		System.out.println("=================");
		
		int num1 = 0, num2 = 0, result = 0;	//���� ������ Ÿ���̸� ,�� ������ �ѹ��� ����� �� ����
		
		System.out.print("ù ��° �� : ");
		num1 = scan.nextInt();
		System.out.print("�� ��° �� : ");
		num2 = scan.nextInt();
		
		result = num1 + num2;		
		System.out.println("���� ��� : " + result);
		result = num1 - num2;		
		System.out.println("���� ��� : " + result);
		result = num1 * num2;		
		System.out.println("���� ��� : " + result);
		result = num1 / num2;		
		System.out.println("������ ��� : " + result);
		result = num1 % num2;		
		System.out.println("������ : " + result);
		
		
		//2. ���� ������
		// ++, -- : 1�� ���� �Ǵ� ���� ��Ű�� ������
		// ���� �������̱⵵ ��. �����̳� ���� �� �������� ��
		int i = 0;
		i++;						//i�� �ִ� ���� �ҷ��ͼ� 1�� ������ �� �ٽ� i�� ������
		//1) i = i + 1;   2)i += 1;   3)i++;		�̷� ������� ������
		System.out.println(i);
		
		
		i=0;
		
		++i;
		System.out.println(i);
		
		//������, �������� ��
		int j = 0;
		int k = 0;
		int l = 0;
		
		++j;				//���� �������ϰ� ������ ��Ű�°� �� ����
		//k = j++;			//���� ���� ������ �ż� k�� 0�� ��. ���� ������ ����ϴ°� �����ϰ� ������
		System.out.println("�������� : " + j);
		j = 0;
		//l = ++j;			//�����ϰ� ������ �Ǳ� ������ 1�� ��. ������ �����ϰ� �����ϵ��� ����
		System.out.println("�������� : " + j);
	
		
		System.out.println(k + ", " +l);
		 */
		
		//3. �� ������(����� boolean)
		//  ũ��, �۴�, ����, ���� �ʴ�.('����'��� ���ٴ� '����?'��� �ǹ� => ����� true , false�� ����)
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
		
		//4. �� ������(����� boolean)
		//  AND, OR, NOT, XOR
		//
		
	}
}
