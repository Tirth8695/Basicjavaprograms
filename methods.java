public class methods 
{

    public static void main(String[] args) 
    {

        calculatorScore(true,10000,8,200);

        calculatorScore(true, 100, 2, 20);

             
        
    }

    public static int calculatorScore(boolean gameover,int score,int levelcomplated,int bonus) 
    {
        

       
         if (gameover == true)
        {
             int finalScore = score + (levelcomplated *bonus);
             finalScore += 2000;
             System.out.println(" Your final score was " + finalScore);
             return finalScore;
        }
        
         return  -1;
         

    }
    
}
