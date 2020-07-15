import java.lang.*;

public class Master{
   public static void main(String[] args){
      
      // int valA = 0;     
      // int valB = 5;
   
      
      double valA = 0f;  
      double valB = 5f;  
      
      long startTimer = System.nanoTime();
      int loops = 100000000;
      
      for(int x = 0; x < loops; x++){
         valA = valA + valB;
      }
      
      
      long endTimer = System.nanoTime();
      
      System.out.println("valA: " + valA);
      System.out.println("valB: " + valB);
   
      
      long deltaTimer_ns = endTimer - startTimer;
      System.out.println("ns: " + deltaTimer_ns);
      
      long deltaTimer_us = deltaTimer_ns/1000L;
      System.out.println("us: " + deltaTimer_us);
      
      long deltaTimer_ms = deltaTimer_us/1000L;
      System.out.println("ms: " + deltaTimer_ms);
      
      double floatOps = (double)loops * 1;
      System.out.println("floats: " + floatOps);
      
      double deltaTimer_sec = (double)deltaTimer_ns / 1E9f;
      System.out.println("sec: " + deltaTimer_sec);
      double flops = floatOps / deltaTimer_sec;
      System.out.println("flops: " + flops);
      
      double Mflops = flops / 1e6f;
      
      System.out.println("Mflops: " + Mflops);
   
      
   }
}