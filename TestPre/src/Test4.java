import java.util.Scanner;
class Administration
{
   Scanner sc = new Scanner(System.in); 
   int attack , defense , moving ;
   public Administration(int attack , int defense , int moving){this.attack = attack;this.defense = defense;this.moving = moving;}
   public Administration(){};
   
}
public class Test4  extends Administration
{
   public static Administration [] array;
   Test4(int attack , int defense , int moving){this.attack = attack;this.defense = defense;this.moving = moving;}
   static int FinalAttack, attack1, attack2, attack3, defense1, defense2, defense3, moving1, moving2, moving3, x;
   static void run()
   {
      Scanner sc = new Scanner(System.in); 
      array = new Administration[3];
      while(true) 
      {
         System.out.println("<<�޴�>>");
           System.out.print("���ϴ� ��(Ȯ��: 1, ����:2, ���� �Է�:3 ���� �Է�: 4 ���� �Է�: 5 ���ӽ���: 6) ");
           int menu = sc.nextInt();
           switch(menu)
           {
           case 1: 
              System.out.println("-----���� ���� ����-----");
              System.out.println("����: " + array[0].attack + "����: " + array[0].defense + "�̵��ӵ�: " + array[0].moving);
              System.out.println("������ ������ų�� "); //�Ŀ�����
              System.out.println("-----------------");
              System.out.println("-----���� ���� ����-----");
              System.out.println("����: " + array[1].attack + "����: " + array[1].defense + "�̵��ӵ�: " + array[1].moving);
              System.out.println("�������� ������ų�� " ); //�ڷ���Ʈ
              System.out.println("-----------------");
              System.out.println("-----���� ���� ����-----");
              System.out.println("����: " + array[2].attack + "����: " + array[2].defense + "�̵��ӵ�: " + array[2].moving);
              System.out.println("������ ������ų�� "); //�ΰԱ���
              System.out.println("-----------------");
              break;
           case 2: System.out.print("���α׷� ����"); return;
           case 3: 
              System.out.print("���ݷ� >>> ");
              attack1 = sc.nextInt();
              System.out.print("���� >>> ");
              defense1 = sc.nextInt();
              System.out.print("�̵��ӵ� >>> ");
              moving1 = sc.nextInt();
              array[0] = new Administration(attack1, defense1, moving1);
              break;
           case 4: 
              System.out.print("���ݷ� >>> ");
              attack2 = sc.nextInt();
              System.out.print("���� >>> ");
              defense2 = sc.nextInt();
              System.out.print("�̵��ӵ� >>> ");
              moving2 = sc.nextInt();
              array[1] = new Administration(attack2, defense2, moving2);
              break;
           case 5: 
              System.out.print("���ݷ� >>> ");
              attack3 = sc.nextInt();
              System.out.print("���� >>> ");
              defense3 = sc.nextInt();
              System.out.print("�̵��ӵ� >>> ");
              moving3 = sc.nextInt();
              array[2] = new Administration(attack3, defense3, moving3);
              break; 
           case 6: System.out.print("������ �����մϴ� >> ");
           System.out.print("1. �̵��ϱ� 2. ������ġ 3. ��������");
           int menu2 = sc.nextInt();
           switch(menu2) {
           case 1: System.out.println(moving3 + "��ŭ �̵��߽��ϴ�");
           x += moving3;
           break;
           case 2: System.out.println("���� ��ġ��"+x+"�Դϴ�");break;
           case 3: System.out.println("������ �����մϴ�");
           System.out.println("��������(��) ��Ÿ����!(ü�� 5, ���ݷ� 3");
           int slimeHP = 5; int slimeATK = 3;
           FinalAttack = attack1 - slimeATK; 
           }
        	   
           }  
      }
   }
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      Administration a = new Administration();
      run();
      
   }

}