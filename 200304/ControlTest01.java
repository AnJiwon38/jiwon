import java.util.Scanner;

public class ControlTest01 {

		public static void main(String[] args) {
			// ���ǹ� if
			// ���� true��� ó��, false��� �Ѿ.
			// if(���ǽ�)
			// 		ó������(��ɹ�);
			//�Է� ���� ¦������ �Ǵ��ϴ� ���α׷�
			
//			Scanner scan = new Scanner(System.in);
//			int num = 0;
//			System.out.print("���� �Է� : ");
//			num = scan.nextInt();
//			if(num % 2 != 1){					//num % 2 == 0 �� ��� ����
//				System.out.println("¦���Դϴ�.");
//				System.out.println("2�� ����Դϴ�.");
//			//Enter�ص� �鿩���� �ȵǴ� ���� - if�� ������ ������ �������� ������ �� �ޱ� ������
//			}			
//			
//			else {								//if(num % 2 == 1) ��� else ���
//				System.out.println("Ȧ���Դϴ�.");
//			}
			
			//���� �б� else if.
			//if(���ǽ�1) { .... }
			//else if(���ǽ�2) { .... }
			//else if(���ǽ�3) { .... }
			//[else { .... }]									//���ȣ�� ���� �����ϴٴ� �ǹ� => ���ǽ��� �ʿ��� ��ŭ�� ����ϸ� ��
			
			//���� ��ȯ ���α׷�
			//���� -> ����
			//90�� �̻� : A
			//80�� �̻� : B
			//70�� �̻� : C
			//60�� �̻� : D
			//������ : F
			
			System.out.print("���� : ");
			Scanner scan = new Scanner(System.in);
			int score = scan.nextInt();				//�����Է�
			String grade = null;
			
			if(score >= 90) {
				if(score >= 95) {
					grade = "A+";
				}
				else {				//if���� �� else�� �ʿ������� ����
					grade = "A0";
				}
				
			}
			
//			if(score >= 95) {
//				grade = "A+";
//			}
//			else if(score >= 90) {
//				grade = "A";
//			}
			
			else if(score >= 80 && score < 90) {	//and �����ڴ� �켱������ ó������� �Ǵ� �� ���ʿ� �д�.
				if(score >= 85) {
					grade = "B+";
				}
				if(score < 85) {
					grade = "B0";
				}
			}
			
			else if(score >= 70 && score < 80) {
				if(score >= 75) {
					grade = "C+";
				}
				if(score < 75) {
					grade = "C0";
				}
			}
			
			else if(score >= 60 && score < 70) {
				if(score >= 65) {
					grade = "D+";
				}
				else {
					grade = "D0";
				}
			}
			else {									//������ ���� �ش�Ǳ� ������ else if(score < 60)�� ���� �ʾƵ��ȴ�.
				grade = "F";
			}
			
			System.out.println("���� : " + grade);
			
			
			
			System.out.println("�����մϴ�.");
			
			//��ǻ�ʹ� �����ۿ� ����
			//�ι�°�� �ش��ϴ� ���� ���̳ʽ��ؼ� ���� �������
			//������ ������ ���༭ �������� ����� ����
			//���� ������ ����
			//������ ������ �����̹Ƿ� �ᱹ ������ �����̴�.
			
			
			//����ȿ� ����� ���� ���� ��ø�̶�� �Ѵ�. ���� ���
		}
}
