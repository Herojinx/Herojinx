import java.util.Scanner;
public class Ch2PQ1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ȭ�� �Է��ϼ���(���� ��)>>");
		int won = scanner.nextInt();
		double dollar = (double)won / 1100;
		System.out.println(won+"���� "+dollar+"�Դϴ�.");
	}
}
