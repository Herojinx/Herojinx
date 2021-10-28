import java.util.Arrays;
import java.util.Scanner;

class Admin1{
	int attack, defense, moving;
	public Admin1(int attack, int defense, int moving) {
		this.attack = attack; this.defense = defense; this.moving = moving;
	}
	public int attack(){return attack;}
	public int defense() {return defense;}
	public int moving() {return moving;}	
	public String toString() {
		return "공격: "+attack+" 방어: "+defense+" 이동: "+moving;
	}
}
	public class NovicePre {
		public Admin1[] Array1;
		public Admin1[] Array2;
		public Admin1[] Array3;
		public Admin1[] Stat1;
		Scanner scanner = new Scanner(System.in);
		public NovicePre() {
		}
			public void Input() {
			Array1 = new Admin1[1];
			for(int i = 0; i<Array1.length;i++) {
				System.out.print("공격 >> ");
				int attack = scanner.nextInt();
				System.out.print("방어 >> ");
				int defense = scanner.nextInt();
				System.out.print("이동 >> ");
				int moving = scanner.nextInt();
				Array1[i] = new Admin1(attack, defense, moving);
			}
		}
			public void Stat() {
				Stat1 = new Admin1[1];
				for(int i = 0; i<Stat1.length;i++) {
					int attack = 10; int defense = 20; int moving = 30;
					System.out.print("전사의 스텟 >> ");
					Stat1[i] = new Admin1(attack, defense, moving);
				}
					System.out.println(Arrays.toString(Stat1));
			}
			public void Input2() {
				Array2 = new Admin1[1];
				for(int i = 0; i<Array2.length;i++) {
					System.out.print("공격 >> ");
					int attack = scanner.nextInt();
					System.out.print("방어 >> ");
					int defense = scanner.nextInt();
					System.out.print("이동 >> ");
					int moving = scanner.nextInt();
					Array2[i] = new Admin1(attack, defense, moving);
				}
			}
			public void Input3() {
				Array3 = new Admin1[1];
				for(int i = 0; i<Array3.length;i++) {
					System.out.print("공격 >> ");
					int attack = scanner.nextInt();
					System.out.print("방어 >> ");
					int defense = scanner.nextInt();
					System.out.print("이동 >> ");
					int moving = scanner.nextInt();
					Array3[i] = new Admin1(attack, defense, moving);
				}
			}
			public void View() {
				System.out.println("-----전사 스텟 열람-----");
				System.out.println(Arrays.toString(Array1));
				System.out.println("-----------------");
				System.out.println("-----법사 스텟 열람-----");
				System.out.println(Arrays.toString(Array2));
				System.out.println("-----------------");
				System.out.println("-----상인 스텟 열람-----");
				System.out.println(Arrays.toString(Array3));
				System.out.println("-----------------");
			}
			public void Play() {
				System.out.println("1. 이동 2. 현재 위치 확인 ");
				int play = scanner.nextInt();
				int x = 0;
				switch(play) {
				case 1: System.out.println(moving+"만큼 이동했습니다");
				}
				
			}
			public void run() {	
			while(true) {
			System.out.println("<<메뉴>>");
			System.out.print("원하는 것(전사 입력: 1, 보기:2, 마침:3 법사 입력: 4 상인 입력: 5 전사 초기값: 6) ");
			int menu = scanner.nextInt();
			switch(menu) {
			case 1: Input(); break;
			case 2: View(); break;
			case 3: System.out.print("프로그램 종료"); return;
			case 4: Input2(); break;
			case 5: Input3(); break;
			case 6: Stat(); break;
			case 7: Play(); break;
			}
		}
	}
		public static void main(String[] args) {
			NovicePre np = new NovicePre();
			np.run();
		}
	}