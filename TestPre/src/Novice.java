import java.util.Scanner;
class Admin
{
   public Admin[] stat;
   int attack, defense, moving;
   public Admin(int attack , int defense , int moving){this.attack = attack;this.defense = defense;this.moving = moving;}
   public Admin(){};
   public int attack() {return attack;}
   public int defense() {return defense;}
   public int moving() {return moving;}

   public Admin[] stat() {return stat;}
   
   public Admin stat1;
   public void consol()
   {
	   
      stat = new Admin [3];
      stat1 = new Admin(10, 10, 4); // ���� �⺻����
      System.out.print("������ ������ ĳ���͸� �������ֽʽÿ�. ( ���� : ���� / ������ / ���� ) / ���߰� �ʹٸ�, 'stop' Ÿ���� >>> ");
      Scanner sc = new Scanner(System.in);
      while(true)
      {
         String answer3 = sc.next();
         if(answer3.equals("����"))
         {
            int attack1 = sc.nextInt();
            int defense1 = sc.nextInt();
            int moving1 = sc.nextInt();   
            stat1 = new Admin(attack1 , defense1 , moving1);   
            System.out.print("������ �׸��Ͻðڽ��ϱ�? (y/�ƹ�Ű) >>> ");
            String a = sc.next();
            if(a.equals("y"))
            {
               System.out.println("������ �����մϴ�.");
               start();            
            }
            else
            {
               continue;
            }
         }
         if(answer3.equals("������"))
         {}
         if(answer3.equals("����"))
         {}
         if(answer3.equals("stop"))
         {}
         else
         {
            System.out.println("�ٽ� �������ֽñ� �ٶ��ϴ�.");
         }
      }
      
   }
   public void start()
   {
      Scanner sc= new Scanner(System.in);
      System.out.println("�Ԏ¸�");
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int num3 = sc.nextInt();
	  stat1 = new Admin(num1, num2, num3);
      System.out.println("JustPRG ���ӿ� ���� ���� ȯ���մϴ�.");
      System.out.println("<<<------------------------>>>");
      System.out.println("<<<----------�ε���---------->>>");
      
      System.out.println("���� ������ �� �� ������ �����Ͻø� ����˴ϴ�.");
      System.out.print("1��key : ���� ���� / 2��key : ���� ���� / �ƹ�key : ���� ���� >>> ");
      
      int answer1 = sc.nextInt();
      
      if(answer1 == 1)
      {
         System.out.println("������ ���� ����, ������, ������ �����մϴ�.");
         System.out.print("��ȸ�ϰ� ���� ������ �Է��Ͻñ� �ٶ��ϴ�. >>> ");
         while(true)
         {
            String answer2 = sc.next();
            if(answer2.equals("����"))
            {
               Warrior w = new Warrior(attack, defense, moving);
               w.view();
            }
            
            }
         }
   }
}
class Warrior extends Admin //����
{
   
   public Warrior(int attack , int defense , int moving){super(attack,defense,moving);}public Warrior(){};
   public Warrior(Admin []stat)
   {
      super(stat);
   }
   public void view()
   {
	   
      System.out.println("���������Դϴ�.");
      System.out.println("�ʱⷹ�� ������ " + "���ݷ��� " + stat1.attack + "�̰�, ������ " + stat1.defense + "�̸�, �̵��ӵ��� " + stat1.moving + "�Դϴ�.");
   }
}

class Novice
{

   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      Admin a = new Admin();
      System.out.print("�ܼ� �۾��� ���� �������� �⺻������ �����Ͻðڽ��ϱ�?(y/n) >>> ");
      String answer = sc.next();
      if(answer.equals("y")){a.consol();}
      if(answer.equals("n")) 
      {System.out.print("������ �����Ͻðڽ��ϱ�?(y/n) >>> "); 
         String answer1 = sc.next();
         if(answer1.equals("y"))
         {
            a.start();
         }
         else{System.out.println("�����մϴ�");}
      }
   }

}