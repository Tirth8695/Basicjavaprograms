public class codeblocks {

    public static void main(final String[] args) {
         boolean gameover = true;
         int score = 10000;
         int levelcomplated = 8;
         int bonus = 200;

         if (gameover == true)
          {
             int finalScore = score + (levelcomplated *bonus);
             finalScore += 1000;
             System.out.println(" Your final score was " + finalScore);
             
         } 

         //if (gameover)
         //{
           //  int secondScore = score + (levelcomplated *bonus);
             //System.out.println("Your second score is " + secondScore); 
         //}


        score = 100;
        levelcomplated = 2;
        bonus = 20;

        if (gameover)
         {
             int secondScore = score + (levelcomplated *bonus);
             System.out.println("Your second score is " + secondScore); 
         }



             
         
    }
    
}