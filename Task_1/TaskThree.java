package Task_1;

public class TaskThree {
   public static void main(String[] args){
      double nextNum = 0;
      int maxFind = 1500;
       
      double[] fibArray = new double[maxFind];
      
      int pos = 0;
      fibArray[pos++] = 0;
      fibArray[pos++] = 1;
      
      for(int x = 0; x<maxFind-2;x++){
         nextNum = fibArray[pos-1] + fibArray[pos-2];
         fibArray[pos++] = nextNum;
      }
     
      // print all elements in array
      int counter = 0;
      for(double each : fibArray){
         System.out.println(++counter + "\t" + each);    
      }      
   }
}