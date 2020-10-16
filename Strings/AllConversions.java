public class AllConversions{
   public static void line(){
      System.out.println("----------------");
   }
   public static void main(String[] args){
      // String to int
      String nums = "20";
      int numi = Integer.parseInt(nums);
      System.out.println(nums+1);
      System.out.println(numi+1);
      line();
      
      // String to double
      String numsd = "20.5";
      double numd = Double.parseDouble(numsd);
      System.out.println(numsd+1.5d);
      System.out.println(numd+1.5d);
      line();
      
      //double to int
      int numdi = (int)numd;
      System.out.println(numdi);
      line();
      
      // int to double
      double numid = numdi;
      System.out.println(numid);
      line();
      line();
      // int to char
      int letterNum =  101;
      char letter = (char)letterNum;
      System.out.println(letterNum + "\n" + letter) ;
      
      char letter2 = ++letter;
      int num2 = (int)letter2;
      System.out.println(letter2 + "\n" + num2);
      line();
     // int to string
     String string2 = "" + num2;
     System.out.println(string2);
     line();
     // double to string 
     double dbl3 = 22.34;
     String string3 = "" + dbl3;
     System.out.println(string3);
     
     // char to string
     char char4= 'g';
     String string4 = "" + char4;
     // string to char
     String string5 = "h";
     char char5 = string5.charAt(0);
      
   }
}