
import java.util.Scanner;
class Admin // ������
{
   public Admin[] stat;
   int attack ;
   int defense ;
   int moving ;
   Admin(int attack , int defense , int moving){this.attack = attack;this.defense = defense;this.moving = moving;}
   Admin(){};
   
   
   void consol()
   {
      stat = new Admin [3];
      System.out.println("�۾��� ���������Դϴ�.");
      System.out.println("�̰��� �������� ������ ������ �� �ֽ��ϴ�.");
      System.out.println("���� �Ŀ� ������ ����˴ϴ�.");
      System.out.print("ĳ���͸� �������ֽʽÿ�. ( ���� : ���� / ������ / ���� ) / ���߰� �ʹٸ�, 'stop' Ÿ���� >>> ");
      Scanner sc = new Scanner(System.in);
      while(true)
      {
         String answer3 = sc.next();
         if(answer3.equals("����"))
         {
            int attack = sc.nextInt();
            int defense = sc.nextInt();
            int moving = sc.nextInt();
            stat[0] = new Admin(attack , defense , moving);
            for(int i = 0; i < stat.length;i++)
            System.out.println(stat[i].attack + stat[i].defense + stat[i].moving);
            continue;
         }
         if(answer3.equals("������"))
         {
            int attack = sc.nextInt();
            int defense = sc.nextInt();
            int moving = sc.nextInt();
            stat[1] = new Admin(attack , defense , moving);
         }
         if(answer3.equals("����"))
         {
            int attack = sc.nextInt();
            int defense = sc.nextInt();
            int moving = sc.nextInt();
            stat[2] = new Admin(attack , defense , moving);
         }
         if(answer3.equals("stop"))
         {
            break;
         }
         else
         {
            System.out.println("�ٽ� �������ֽñ� �ٶ��ϴ�.");
         }
      }
      
   }
   void start()
   {
      Scanner sc= new Scanner(System.in);
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
         String answer2 = sc.next();
         if(answer2.equals("����"))
         {
            
         }
         if(answer2.equals("������"))
         {
            //
         }
         if(answer2.equals("����"))
         {
            //
         }
         
      }
      if(answer1 == 2)
      {
         
      }
      else
      {
         System.out.println("�����մϴ�.");
      }
   }
   
}
class Warrior extends Admin //����
{
   public Admin[] stat;
   Warrior(int attack , int defense , int moving)
   {
      super(attack,defense,moving);
   }
   void view()
   {
      System.out.println("���������Դϴ�.");
      System.out.println();
   }
   
}
class Magician extends Admin// ������
{
   public Admin[] stat;
   Magician(int attack , int defense , int moving)
   {
      super(attack,defense,moving);
   }
}
class Merchant extends Admin// ����
{
   public Admin[] stat;
   Merchant(int attack , int defense , int moving)
   {
      super(attack,defense,moving);
   }
}
class Novice{
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Admin a = new Admin();
      System.out.print("�ܼ� �۾��� ���� �������� �⺻������ �����Ͻðڽ��ϱ�?(y/n) >>> ");
      String answer = sc.next();
      if(answer.equals("y")) { a.consol(); }
      if(answer.equals("n")) 
      { 
         System.out.print("������ �����Ͻðڽ��ϱ�?(y/n) >>> "); 
         String answer1 = sc.next();
         if(answer1.equals("y")){a.start();}
         else{System.out.println("�����մϴ�");}
      }
   }

}
