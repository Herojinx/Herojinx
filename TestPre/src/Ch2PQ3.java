//배열로 풀어보기
import java.util.Scanner;
public class Ch2PQ3 {

	public static void main(String[] args) {
		int coin[] = {50000, 10000, 1000, 100, 50, 10, 1};
		Scanner s = new Scanner(System.in);
		System.out.print("금액을 입력해주세요 >> ");
		int num = s.nextInt();
		for(int i = 0; i<coin.length; i++) {
			System.out.println(coin[i]+"원 "+ num/coin[i]+"개");
			num %= coin[i];
		}
	}
}
