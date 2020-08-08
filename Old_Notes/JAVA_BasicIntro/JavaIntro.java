package Old_Notes.JAVA_BasicIntro;

// JavaIntro
// ---------------------------
// this is a comment "//"

// every java file is basically a class.
// Java is case sensitive, so hello, Hello and HELLO are different.
// Class names need to start with a capital, this will also be the name of the file.

public class JavaIntro
{
   //curly brackets indicate blocks of code.
   // every java program must include a MAIN METHOD.
   public static void main(String [] args)
   {
      System.out.println("Hello World");
      System.out.print("Hello World"+"\n");
      // remember to place a ";" at the end of the line.
      // using ".print" everything on the same line.
      // using ".println" ends the line with a return (newline)
      
      // variables -> there are global and local variables.
      // when assigning a value to a variable the format is:
      //    <type> <name> = <value>
      int valA = 4;
      int valB = 5;
      //int valAB = 4*5; 
      int valAB = valA*valB;
      System.out.println(valA + " x " + valB + " = " + valAB);
      
      //IF, FOR & WHILE
      // if's allow us to compare values and if conditions are met do to do something.
      
      //if (valAB == 20)
      //{
         // there are a few operators: "=="(equals), "!="(not equal to"),
         // "<" (less than), ">" (greater than), 
         // ">=" (greater than and equals to), "<=" (less than and equals to).
        // System.out.println("Its 20");
     // }
      
      //for(int x = 0; x<=10; x++)
      //{
      //   System.out.println(x);
      //}
      // for(<initial value>; <condition to be met>; <increment>)
      
      int valC = 0;
      while(valC < 20)
      {
         valC++;
         // valC = valC + 1;
         System.out.println(valC);
      }
      
      
      
      
   }
   
}  