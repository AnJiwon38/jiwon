package test01;

public class ExamTest02 {
	public static void main(String[] args) {
		//�Է¹��� �ݾ�
		int i = 6530;
		int a;//1000���� ����
		int b;//500���� ����
		int c;//100���� ����
		int d;//10���� ����
		int r;//������ ��
		
		
		a = i/1000;
		r = i%1000;
		
		b = r/500;
		r = r%500;
		
		c = r/100;
		r = r%100;
		
		d = r/10;
		r = r%10;
		
		System.out.println("�Է¹��� �ݾ� : " + i + "��");
		System.out.println("�Ž��� ���� 1000�� " + a + "��, " + "500�� " + b + "��, " 
							+ "100�� " + c + "��, " + "10�� " + d + "���Դϴ�.");
		
		
	}
			
}
