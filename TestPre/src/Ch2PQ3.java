//�迭�� Ǯ���
import java.util.Scanner;
public class Ch2PQ3 {

	public static void main(String[] args) {
		int coin[] = {50000, 10000, 1000, 100, 50, 10, 1};
		Scanner s = new Scanner(System.in);
		System.out.print("�ݾ��� �Է����ּ��� >> ");
		int num = s.nextInt();
		for(int i = 0; i<coin.length; i++) {
			System.out.println(coin[i]+"�� "+ num/coin[i]+"��");
			num %= coin[i];
		}
	}
}
