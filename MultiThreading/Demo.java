import java.lang.Thread;
     
class demo{
   public static void main(String[] arg){
      Thread1 t1 = new Thread1();
      t1.start();
      Thread2 t2 = new Thread2();
      t2.start();
   }
}

class Thread1 extends Thread{
   @Override
   public void run(){
      for(int i=0;i <100;i++){
         Data.count++;
         Data.num = Data.num + 1;
         System.out.println("A\t"+ Data.count + "\t" + Data.num);
      }
   }
}
class Thread2 extends Thread{
   @Override
   public void run(){
      for(int c=0;c<100;c++){
         Data.count++;
         Data.num = Data.num - 1; 
         System.out.println("B\t"+ Data.count + "\t" + Data.num);
      }
   }
}