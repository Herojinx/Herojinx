import java.util.Scanner;
public class Prac8 {

	public static boolean noExist(int []ary,int i, int r) {
		for (int j = 0; j<i; j++) 
			if(ary[i]==r) 
				return false;
			return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 배열 몇개?(1~99) >>");
		int num = scanner.nextInt();
		int ary[] = new int[num];
		for(int i = 0; i <ary.length; i++) {
			int r;
			while(true) {
				r= (int)(Math.random()*100+1);
				if(noExist(ary,i,r))
					break;
			}
			ary[i] = r;
		}
		for(int i =0; i<ary.length;i++) {
			if(i != 0 && i%10 ==0)
				System.out.println();
			System.out.print(ary[i]+" ");
		}
		scanner.close();
	}
}