 abstract class AbstractEx {
      abstract void fuel();
      void start() {
         System.out.print("Start "); 
         }
     }
 class Car extends AbstractEx {
      void fuel() {
         System.out.print("Petrol "); 
      }
 }

class AbstractTest{
      public static void main(String[] args) {
         AbstractEx v = new Car();
         v.start();
         v.fuel();
      }
 }
