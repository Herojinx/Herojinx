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
		return "����: "+attack+" ���: "+defense+" �̵�: "+moving;
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
				System.out.print("���� >> ");
				int attack = scanner.nextInt();
				System.out.print("��� >> ");
				int defense = scanner.nextInt();
				System.out.print("�̵� >> ");
				int moving = scanner.nextInt();
				Array1[i] = new Admin1(attack, defense, moving);
			}
		}
			public void Stat() {
				Stat1 = new Admin1[1];
				for(int i = 0; i<Stat1.length;i++) {
					int attack = 10; int defense = 20; int moving = 30;
					System.out.print("������ ���� >> ");
					Stat1[i] = new Admin1(attack, defense, moving);
				}
					System.out.println(Arrays.toString(Stat1));
			}
			public void Input2() {
				Array2 = new Admin1[1];
				for(int i = 0; i<Array2.length;i++) {
					System.out.print("���� >> ");
					int attack = scanner.nextInt();
					System.out.print("��� >> ");
					int defense = scanner.nextInt();
					System.out.print("�̵� >> ");
					int moving = scanner.nextInt();
					Array2[i] = new Admin1(attack, defense, moving);
				}
			}
			public void Input3() {
				Array3 = new Admin1[1];
				for(int i = 0; i<Array3.length;i++) {
					System.out.print("���� >> ");
					int attack = scanner.nextInt();
					System.out.print("��� >> ");
					int defense = scanner.nextInt();
					System.out.print("�̵� >> ");
					int moving = scanner.nextInt();
					Array3[i] = new Admin1(attack, defense, moving);
				}
			}
			public void View() {
				System.out.println("-----���� ���� ����-----");
				System.out.println(Arrays.toString(Array1));
				System.out.println("-----------------");
				System.out.println("-----���� ���� ����-----");
				System.out.println(Arrays.toString(Array2));
				System.out.println("-----------------");
				System.out.println("-----���� ���� ����-----");
				System.out.println(Arrays.toString(Array3));
				System.out.println("-----------------");
			}
			public void Play() {
				System.out.println("1. �̵� 2. ���� ��ġ Ȯ�� ");
				int play = scanner.nextInt();
				int x = 0;
				switch(play) {
				case 1: System.out.println(moving+"��ŭ �̵��߽��ϴ�");
				}
				
			}
			public void run() {	
			while(true) {
			System.out.println("<<�޴�>>");
			System.out.print("���ϴ� ��(���� �Է�: 1, ����:2, ��ħ:3 ���� �Է�: 4 ���� �Է�: 5 ���� �ʱⰪ: 6) ");
			int menu = scanner.nextInt();
			switch(menu) {
			case 1: Input(); break;
			case 2: View(); break;
			case 3: System.out.print("���α׷� ����"); return;
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