import java.util.Scanner;

public class MethodCal {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4Ģ ���� ����
		// ���� ����� �޼ҵ� �Ķ���� X, ��ȯ�� X
		// �ۼ��� �޼ҵ�� �ٸ� �޼ҵ� �ȿ��� ȣ���Ѵ�.
		// 1. �Ķ���Ͱ� �ְ� ������� �ִ� �޼ҵ� ȣ���
		int rs = add(1, 2);//����� ������ ����. ������ �ΰ��� ������ ����θ� �ȵǹǷ� �� ä���־����
		System.out.println("1 + 2 = " + rs);
		System.out.println("3 + 4 = " + add(3, 4));//�������� ��ٷ� ����� �� ���� ex.3+4
		int a1, a2;
		a1 = scan.nextInt();
		a2 = scan.nextInt();
		System.out.println(a1 + " + " + a2 
				+ " = " + add(a1, a2));
		//������ ��°�� ���޵Ǵ� ���� �ƴ� �ȿ� �ִ� ������ ���޵�

		//2. �Ķ���� O, ��ȯ�� X
		sub(a1, a2);
		
		//3. �Ķ���� X, ��ȯ�� O
		rs = mul();
		
		//4. �Ķ���� X, ��ȯ�� X
		div();
		
	}//main �޼ҵ� ��
	
	//�Ķ���� O, ��ȯ�� O �޼ҵ�
	//�ΰ��� ���� �Է¹޴� �޼ҵ�
	//����� ��ȯ�ϴ� �޼ҵ�
	//�޼ҵ� �̸� �տ� ���̴� �ڷ����� ��ȯ�Ǵ�(���) ���� �ڷ����� ���δ�.
	// -> ��ȯ��
	public static int add(int a, int b) {//a, b�� �Է°� �ޱ� ���� ������ ��� ����
		int c, d;//�Է°� �ޱ� ���� ������ �� ��. 
		int result = a + b;
		return result;

		//�տ� �׻� public static �ٿ��ֱ�
		//������� �� �� �������� �ƴ� �Ǽ������� �شٴ� �� �˷������.
		//�޴»�� ���忡�� � ����� ���Դ��� �˾ƾ� ��Ȯ�� ó���� �� �� �ֱ� ����
		//������� ���� ���¸� �̸� ���س��� �����ϱ� ���� �޼ҵ� Ÿ�� �տ� �ڷ����� ����(��ȯ��)
		//�޼ҵ� �տ� ��ȯ���¸� ���δٰ� �ؼ� ��ȯ���̶�� �� 
		//return���ִ� ������ result�� ������ Ÿ������ ����ؾ���
		
		//return ������ ���� �߻���. int�� �޴´ٰ� ����� �ξ��� ����
	}
	
		//float�� �޴� ����
	
		//public static float divid(int a, int b) {
		//	float result = (float)a/b;
		//	return result;
		//}
		//�Ķ���Ͱ� �ִٴ� �ǹ̴� �Է°��� �޾ƾ��ϴµ� 
		//�����ϱ� �������� ��������, �Ķ���Ͱ� �����ٰ� ����� �� ����
		//�ΰ��� ���ڸ� �ָ� �ٽ� �ǵ����ִ°� �޼ҵ��� �⺻ ����
	
	//�Ķ���� O, ��ȯ�� X �޼ҵ�
	public static void sub(int a, int b) {
		int result = a - b;
		System.out.println(a + " - " + b + " = " + result);
	}
		//���Ŀ� ���缭 ����ؾ���. return�� ���� ��쿡�� void ���
	
	//�Ķ���� X, ��ȯ�� O �޼ҵ�
	public static int mul() {//return�� ��� ������ ������
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = a * b;
		return result;
	}
	
	//�Ķ���� X, ��ȯ�� X �޼ҵ�
	public static void div() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = a / b;
		System.out.println(a + " / " + b + " = " + result);
	}
	//�Է� ��� ��� ������ �� �޴´�. 
	
	
}//class ��
