class Tire
{
   public int maxRotation;
   public int accumulatedRotation;
   public String location;
   
   public Tire(String location , int maxRotation)
   {
      this.location = location;
      this.maxRotation = maxRotation;
   }
   
   public boolean roll()
   {
      accumulatedRotation = accumulatedRotation + 1 ;
      if(accumulatedRotation<maxRotation)
      {
         System.out.println(location + "Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
         return true;
      }
      else
      {
         System.out.println("*** " + location + " Tire 펑크 ***");
         return false;
      }
   }
   
}
class Car
{
   Tire frontLeftTire = new Tire("앞-왼쪽", 6);
   Tire frontRightTire = new Tire("앞-오른쪽", 2);
   Tire backLeftTire = new Tire("뒤-왼쪽", 3);
   Tire backRightTire = new Tire("뒤-오른쪽", 4);
   
   int run()
   {
      System.out.println("[자동차가 달려요]");
      if(frontLeftTire.roll()==false) {stop(); return 1;}
      if(frontRightTire.roll()==false) {stop(); return 2;}
      if(backLeftTire.roll()==false) {stop(); return 3;}
      if(backRightTire.roll()==false) {stop(); return 4;}
      return 0;
   }
   
   void stop()
   {
      System.out.println("[자동차가 멈춰요]");
   }
}
class HankookTire extends Tire
{
   public HankookTire(String location , int maxRotation)
   {
      super(location , maxRotation);
   }
   public boolean roll()
   {
      accumulatedRotation = accumulatedRotation + 1 ;
      if(accumulatedRotation<maxRotation)
      {
         System.out.println(location + "한국Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
         return true;
      }
      else
      {
         System.out.println("*** " + location + " 한국Tire 펑크 ***");
         return false;
      }
   }
}
class KumhoTire extends Tire
{
   public KumhoTire(String location , int maxRotation)
   {
      super(location , maxRotation);
   }
   public boolean roll()
   {
      accumulatedRotation = accumulatedRotation + 1 ;
      if(accumulatedRotation<maxRotation)
      {
         System.out.println(location + "금호Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
         return true;
      }
      else
      {
         System.out.println("*** " + location + " 금호Tire 펑크 ***");
         return false;
      }
   }
}
public class CarExample 
{

   public static void main(String[] args) 
   {
      Car car = new Car();
      
      for(int i = 1; i <= 5; i++)
      {
         int problemLocation = car.run();
         switch(problemLocation)
         {
         case 1:
            System.out.println("앞-왼쪽 한국타이어로 교체");
            car.frontLeftTire = new HankookTire("앞 왼쪽" , 15);
            break;
         case 2:
            System.out.println("앞-오른쪽 금호타이어로 교체");
            car.frontRightTire = new KumhoTire("앞 왼쪽" , 13);
            break;
         case 3:
            System.out.println("뒤-왼쪽 한국타이어로 교체");
            car.backLeftTire = new HankookTire("앞 왼쪽" , 14);
            break;
         case 4:
            System.out.println("뒤-오른쪽 금호타이어로 교체");
            car.backLeftTire = new KumhoTire("앞 왼쪽" , 17);
            break;
         }
         System.out.println("-----------------------------------");
      }

   }

}