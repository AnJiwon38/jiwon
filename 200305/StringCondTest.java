import java.util.Scanner;

public class StringCondTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String str1 = "abc";
		String str2 = "abc";
		//String str2 = new String ("abc"); 
		//new�� ����ϸ� ���� �����͸� �ٽ� ����� ������ ���� �ʴ� �� ����
		//String�� scanner ó�� new �������� ��밡�������� ���� ����ؼ� new���� ����ص� �������.
		
		//new�� �ν��Ͻ� ������ɾ� -> Heap������ �������� �ʿ��� �� ������
		//== �̸��� ������ ��
		//equals ��¥ ������(�ּҰ�)���� �� 
		
		if(str1 == str2) {
			System.out.println("����.");
		}
		else {
			System.out.println("�����ʴ�.");
		}
		
		str2 = scan.next();//abc �Է�
		
		if(str1.equals(str2)) {
			System.out.println("����.");
		}
		else {
			System.out.println("�����ʴ�.");
		}
		//abc�� ���� �Է��� �޾Ƽ� ���ϸ� ������� �ٸ��� ����
		
	}

}

//�޸� ����