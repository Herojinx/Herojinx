import java.util.Scanner;
import java.util.Arrays;

class Distance {	
	int X,Y;
	public Distance(int X, int Y) {
		this.X = X; this.Y = Y;
	}
}
class Stat {
	int ATK,DEF,MOV;
	public Stat(int ATK, int DEF, int MOV) {
		this.ATK = ATK; this.DEF = DEF; this.MOV = MOV;
	}
	public String toString() {
		return "����: "+ATK+" ���: "+DEF+" �̵�: "+MOV;
	}
	
}

public class RPGGame {
	public void SetStat() {
		Stat[] StatAry;
		StatAry = new Stat[1];
		int ATK = (int)(Math.random()*5+1);
		int DEF = (int)(Math.random()*5+1);
		int MOV = (int)(Math.random()*5+1);
		StatAry[0] = new Stat(ATK, DEF, MOV);
		
	}
	public void ViewStat(int ATK, int DEF, int MOV, Stat[] StatAry) {
		System.out.println("����: "+ATK);
		System.out.println("���: "+DEF);
		System.out.println("�̵�: "+MOV);
		System.out.println(Arrays.toString(StatAry));
	}
	
	public void Fight() {
		
	}
	public void run() {
		SetStat();
		ViewStat(int ATK);
		Fight();
	}
	public static void main(String[] args) {
		RPGGame R = new RPGGame();
		R.run();
	}
}