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
         System.out.println(location + "Tire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
         return true;
      }
      else
      {
         System.out.println("*** " + location + " Tire ��ũ ***");
         return false;
      }
   }
   
}
class Car
{
   Tire frontLeftTire = new Tire("��-����", 6);
   Tire frontRightTire = new Tire("��-������", 2);
   Tire backLeftTire = new Tire("��-����", 3);
   Tire backRightTire = new Tire("��-������", 4);
   
   int run()
   {
      System.out.println("[�ڵ����� �޷���]");
      if(frontLeftTire.roll()==false) {stop(); return 1;}
      if(frontRightTire.roll()==false) {stop(); return 2;}
      if(backLeftTire.roll()==false) {stop(); return 3;}
      if(backRightTire.roll()==false) {stop(); return 4;}
      return 0;
   }
   
   void stop()
   {
      System.out.println("[�ڵ����� �����]");
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
         System.out.println(location + "�ѱ�Tire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
         return true;
      }
      else
      {
         System.out.println("*** " + location + " �ѱ�Tire ��ũ ***");
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
         System.out.println(location + "��ȣTire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
         return true;
      }
      else
      {
         System.out.println("*** " + location + " ��ȣTire ��ũ ***");
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
            System.out.println("��-���� �ѱ�Ÿ�̾�� ��ü");
            car.frontLeftTire = new HankookTire("�� ����" , 15);
            break;
         case 2:
            System.out.println("��-������ ��ȣŸ�̾�� ��ü");
            car.frontRightTire = new KumhoTire("�� ����" , 13);
            break;
         case 3:
            System.out.println("��-���� �ѱ�Ÿ�̾�� ��ü");
            car.backLeftTire = new HankookTire("�� ����" , 14);
            break;
         case 4:
            System.out.println("��-������ ��ȣŸ�̾�� ��ü");
            car.backLeftTire = new KumhoTire("�� ����" , 17);
            break;
         }
         System.out.println("-----------------------------------");
      }

   }

}