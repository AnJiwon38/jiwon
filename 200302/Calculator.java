import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//�����͸� �Է¹ޱ����� scan�̶�� �̸��� �����ִ� Scanner ����
		
		int number = 0;
		int number2 = 0;
		int result = 0;
		
		System.out.println("���ڸ� �Է��ϼ���.");
		number = scan.nextInt();
		
		System.out.println("���ڸ� �Է��ϼ���.");
		number2 = scan.nextInt();
		//nextInt() : ���α׷��� ������ �� ������ int ���� ������ �޾Ƽ� number���� �����϶�� ��
		
		//System.out.println("�Է��� ���� : " + number);
		//System.out.println("�Է��� ���� : " + number2);
		result = number + number2;
		System.out.println("���� ��� : " + result);		
	}

}

/*
�빮�ڰ� ������ �ܾ �ΰ��� ���յȰ�.
*/