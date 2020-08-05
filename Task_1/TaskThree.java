public class TaskThree{
   public static void main(String[] args){
      // We are now going to make a fibonacci sequence.
      // The sequence is the sum of the two preceding ones, 
      // starting from 0 and 1
      double currNum = 1;
      double nextNum = 0;
      double prevNum = 0;
      
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