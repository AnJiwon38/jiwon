import java.util.Scanner;

public class ControlTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ǹ� switch
		//���� �б⸦ ���� �¾ ���.
		//case, default(else) - switch ���� ������ �� ����ؾ���
		//��Ÿ ����� break. - �ʿ��� ��쿡�� ���
		
		Scanner scan = new Scanner(System.in);
		//11 - sk, 16 - kt, 19 - LG
//		System.out.print("��ȣ �Է� : ");
//		int num = scan.nextInt();
//		
//		switch(num) {
//		case 11: 
//			System.out.println("SK�Դϴ�.");
//			//�߰� ��ɾ� �ۼ�
//			break;							//�߰�ȣ�� �������� �ʾƵ� ��. break�� �׻� case�� �������� ����ؾ� ��.
//		case 16:
//			System.out.println("KT�Դϴ�.");
//			//�߰� ��ɾ� �ۼ�
//			break;
//		case 19:
//			System.out.println("LG�Դϴ�.");
//			//�߰� ��ɾ� �ۼ�
//			break;
//		default:							//case���� �ش���� ���� �������� default�� ó����
//			System.out.println("��Ÿ ����Դϴ�.");
//			//�߰� ��ɾ� �ۼ�
//			break;
//		}
			


		//���� ��ȯ ���α׷�(switch��)
		//���� -> ����
		//90�� �̻� : A
		//80�� �̻� : B
		//70�� �̻� : C
		//60�� �̻� : D
		//������ : F
		
		System.out.print("���� �Է� : ");
		int score = scan.nextInt();
		String grade = null;
		
		
		switch(score/10) {
		case 10:
			grade ="A+";
			break;
		case 9:
			if(score%10>=5) {
				grade ="A+";
			}
			else {
				grade ="A0";
			}
			break;
		case 8:
			if(score%10>=5) {
				grade ="B+";
			}
			else {
				grade ="B0";
			}
			break;
		case 7:
			if(score%10>=5) {
				grade ="C+";
			}
			else {
				grade ="C0";
			}
			break;
		case 6:
			if(score%10>=5) {
				grade ="D+";
			}
			else {
				grade ="D0";
			}
			break;
		default :
			grade = "F";
			break;
		}
		
		
		System.out.println("���� : " + grade);
		//case1, case2, case3, default�� ���� �� break�� ���µ� case1�� �ش��ϴ� ��� 
		//case1, case2, case3, default�� �ش��ϴ� ������ �� ���Եȴ�.
		//case2�� 3�� �ش��ϴ� ���� ���� case�� �ǳ� �ٰ� �ش� ������� default������ ���Եȴ�.
		//�׷��Ƿ� break�� ������ ������ �ʿ���� ���뵵 ������ �Ǳ� ������ ����� ���־���Ѵ�.
		
		//�����ð��� �ߴ� ����
		System.out.print("���� �Է� : ");
		int score1 = scan.nextInt();
		String grade1 = null;
		
		switch(score1/10) {
		case 10:
		case 9:
			grade1 = "A";
			break;
		case 8:
			grade1 = "B";
			break;
		case 7:
			grade1 = "C";
			break;
		case 6:
			grade1 = "D";
			break;
		default :
			grade1 = "F";
			break;
		}
		System.out.println("���� : " + grade1);
	}

}
