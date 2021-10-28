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
         System.out.println("<<메뉴>>");
           System.out.print("원하는 것(확인: 1, 종료:2, 전사 입력:3 법사 입력: 4 상인 입력: 5 게임시작: 6) ");
           int menu = sc.nextInt();
           switch(menu)
           {
           case 1: 
              System.out.println("-----전사 스텟 열람-----");
              System.out.println("공격: " + array[0].attack + "수비: " + array[0].defense + "이동속도: " + array[0].moving);
              System.out.println("전사의 고유스킬은 "); //파워가드
              System.out.println("-----------------");
              System.out.println("-----법사 스텟 열람-----");
              System.out.println("공격: " + array[1].attack + "수비: " + array[1].defense + "이동속도: " + array[1].moving);
              System.out.println("마법사의 고유스킬은 " ); //텔레포트
              System.out.println("-----------------");
              System.out.println("-----상인 스텟 열람-----");
              System.out.println("공격: " + array[2].attack + "수비: " + array[2].defense + "이동속도: " + array[2].moving);
              System.out.println("상인의 고유스킬은 "); //싸게구입
              System.out.println("-----------------");
              break;
           case 2: System.out.print("프로그램 종료"); return;
           case 3: 
              System.out.print("공격력 >>> ");
              attack1 = sc.nextInt();
              System.out.print("방어력 >>> ");
              defense1 = sc.nextInt();
              System.out.print("이동속도 >>> ");
              moving1 = sc.nextInt();
              array[0] = new Administration(attack1, defense1, moving1);
              break;
           case 4: 
              System.out.print("공격력 >>> ");
              attack2 = sc.nextInt();
              System.out.print("방어력 >>> ");
              defense2 = sc.nextInt();
              System.out.print("이동속도 >>> ");
              moving2 = sc.nextInt();
              array[1] = new Administration(attack2, defense2, moving2);
              break;
           case 5: 
              System.out.print("공격력 >>> ");
              attack3 = sc.nextInt();
              System.out.print("방어력 >>> ");
              defense3 = sc.nextInt();
              System.out.print("이동속도 >>> ");
              moving3 = sc.nextInt();
              array[2] = new Administration(attack3, defense3, moving3);
              break; 
           case 6: System.out.print("게임을 시작합니다 >> ");
           System.out.print("1. 이동하기 2. 현재위치 3. 전투시작");
           int menu2 = sc.nextInt();
           switch(menu2) {
           case 1: System.out.println(moving3 + "만큼 이동했습니다");
           x += moving3;
           break;
           case 2: System.out.println("현재 위치는"+x+"입니다");break;
           case 3: System.out.println("전투를 시작합니다");
           System.out.println("슬라임이(가) 나타났다!(체력 5, 공격력 3");
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