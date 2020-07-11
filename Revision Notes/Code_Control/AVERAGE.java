
public class AVERAGE {

   // The aim of this code is produce a set amount of random numbers,
   // in each trial.
   // The numbers in each trial will be added.
   // The when the average number is half way between the min
   // and max, the code will stop.
   // allowing one to see how many numbers had to be produced to get to
   // an average of half.
   public static void main(String[] args) {
      int totalTrials = 0;

      int sumRndNums = 0; // sum of random number in a trial.
      float avgRandNums = 0;

      int upper = 5000;
      int lower = 0;

      float halfway = ((float) upper + (float) lower) / 2;

      // int numDots = SOP.dotsPrinted(0);

      do {
         ++totalTrials;

         int varRandNum = GET.randInt(lower, upper);

         sumRndNums = sumRndNums + varRandNum;
         avgRandNums = sumRndNums / (float) totalTrials;
         // int dotsPerLine = 20;
         // int dotCheck = SOP.running(totalTrials, dotsPerLine, avgRandNums, numDots);
         // if (dotCheck == 1) {
         //    numDots++;
         // }
         // if (numDots < dotsPerLine) {
         //    SOP.dotsPrinted(numDots);
         // }
         // if (numDots == dotsPerLine+1) {
         //    SOP.dotsPrinted(0);
         //    numDots =0;
         // }

         SOP.num(totalTrials);
         SOP.num(varRandNum);
         SOP.num(sumRndNums);
         SOP.num(avgRandNums);
         SOP.end();

      } while (avgRandNums != halfway);

      SOP.end();
      SOP.end();
      SOP.heading("results");
      SOP.wordNum("Trials:" , totalTrials);
      SOP.wordNum("TOTAL", sumRndNums);
      SOP.wordNum("avgRandNums", avgRandNums);
      // SOP.num(totalTrials);
      // SOP.num(sumRndNums);
      // SOP.num(avgRandNums);
      SOP.end();
   }
}
