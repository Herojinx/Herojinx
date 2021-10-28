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
      stat1 = new Admin(10, 10, 4); // 전사 기본스탯
      System.out.print("스탯을 조정할 캐릭터를 선택해주십시오. ( 현재 : 전사 / 마법사 / 상인 ) / 멈추고 싶다면, 'stop' 타이핑 >>> ");
      Scanner sc = new Scanner(System.in);
      while(true)
      {
         String answer3 = sc.next();
         if(answer3.equals("전사"))
         {
            int attack1 = sc.nextInt();
            int defense1 = sc.nextInt();
            int moving1 = sc.nextInt();   
            stat1 = new Admin(attack1 , defense1 , moving1);   
            System.out.print("조정을 그만하시겠습니까? (y/아무키) >>> ");
            String a = sc.next();
            if(a.equals("y"))
            {
               System.out.println("게임을 실행합니다.");
               start();            
            }
            else
            {
               continue;
            }
         }
         if(answer3.equals("마법사"))
         {}
         if(answer3.equals("상인"))
         {}
         if(answer3.equals("stop"))
         {}
         else
         {
            System.out.println("다시 선택해주시기 바랍니다.");
         }
      }
      
   }
   public void start()
   {
      Scanner sc= new Scanner(System.in);
      System.out.println("입렺모");
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int num3 = sc.nextInt();
	  stat1 = new Admin(num1, num2, num3);
      System.out.println("JustPRG 게임에 오신 것을 환영합니다.");
      System.out.println("<<<------------------------>>>");
      System.out.println("<<<----------로딩중---------->>>");
      
      System.out.println("다음 세가지 중 한 가지를 선택하시면 진행됩니다.");
      System.out.print("1번key : 직업 정보 / 2번key : 직업 선택 / 아무key : 접속 종료 >>> ");
      
      int answer1 = sc.nextInt();
      
      if(answer1 == 1)
      {
         System.out.println("직업은 현재 전사, 마법사, 상인이 존재합니다.");
         System.out.print("조회하고 싶은 직업을 입력하시기 바랍니다. >>> ");
         while(true)
         {
            String answer2 = sc.next();
            if(answer2.equals("전사"))
            {
               Warrior w = new Warrior(attack, defense, moving);
               w.view();
            }
            
            }
         }
   }
}
class Warrior extends Admin //전사
{
   
   public Warrior(int attack , int defense , int moving){super(attack,defense,moving);}public Warrior(){};
   public Warrior(Admin []stat)
   {
      super(stat);
   }
   public void view()
   {
	   
      System.out.println("전사직업입니다.");
      System.out.println("초기레벨 스탯은 " + "공격력은 " + stat1.attack + "이고, 방어력은 " + stat1.defense + "이며, 이동속도는 " + stat1.moving + "입니다.");
   }
}

class Novice
{

   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      Admin a = new Admin();
      System.out.print("콘솔 작업을 통해 직업들의 기본스탯을 설정하시겠습니까?(y/n) >>> ");
      String answer = sc.next();
      if(answer.equals("y")){a.consol();}
      if(answer.equals("n")) 
      {System.out.print("게임을 시작하시겠습니까?(y/n) >>> "); 
         String answer1 = sc.next();
         if(answer1.equals("y"))
         {
            a.start();
         }
         else{System.out.println("종료합니다");}
      }
   }

}