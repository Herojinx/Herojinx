
import java.util.Scanner;
class Admin // 전문가
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
      System.out.println("작업자 관리공간입니다.");
      System.out.println("이곳은 직업들의 스탯을 조정할 수 있습니다.");
      System.out.println("조정 후에 게임이 실행됩니다.");
      System.out.print("캐릭터를 선택해주십시오. ( 현재 : 전사 / 마법사 / 상인 ) / 멈추고 싶다면, 'stop' 타이핑 >>> ");
      Scanner sc = new Scanner(System.in);
      while(true)
      {
         String answer3 = sc.next();
         if(answer3.equals("전사"))
         {
            int attack = sc.nextInt();
            int defense = sc.nextInt();
            int moving = sc.nextInt();
            stat[0] = new Admin(attack , defense , moving);
            for(int i = 0; i < stat.length;i++)
            System.out.println(stat[i].attack + stat[i].defense + stat[i].moving);
            continue;
         }
         if(answer3.equals("마법사"))
         {
            int attack = sc.nextInt();
            int defense = sc.nextInt();
            int moving = sc.nextInt();
            stat[1] = new Admin(attack , defense , moving);
         }
         if(answer3.equals("상인"))
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
            System.out.println("다시 선택해주시기 바랍니다.");
         }
      }
      
   }
   void start()
   {
      Scanner sc= new Scanner(System.in);
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
         String answer2 = sc.next();
         if(answer2.equals("전사"))
         {
            
         }
         if(answer2.equals("마법사"))
         {
            //
         }
         if(answer2.equals("상인"))
         {
            //
         }
         
      }
      if(answer1 == 2)
      {
         
      }
      else
      {
         System.out.println("종료합니다.");
      }
   }
   
}
class Warrior extends Admin //전사
{
   public Admin[] stat;
   Warrior(int attack , int defense , int moving)
   {
      super(attack,defense,moving);
   }
   void view()
   {
      System.out.println("전사직업입니다.");
      System.out.println();
   }
   
}
class Magician extends Admin// 마법사
{
   public Admin[] stat;
   Magician(int attack , int defense , int moving)
   {
      super(attack,defense,moving);
   }
}
class Merchant extends Admin// 상인
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
      System.out.print("콘솔 작업을 통해 직업들의 기본스탯을 설정하시겠습니까?(y/n) >>> ");
      String answer = sc.next();
      if(answer.equals("y")) { a.consol(); }
      if(answer.equals("n")) 
      { 
         System.out.print("게임을 시작하시겠습니까?(y/n) >>> "); 
         String answer1 = sc.next();
         if(answer1.equals("y")){a.start();}
         else{System.out.println("종료합니다");}
      }
   }

}
