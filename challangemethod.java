

public class challangemethod 
{
 public static void main(String[] args) 
 {
    int highscoreposition = calculatehighscoreposition(1500);
    displayhighscorePosition("tirth", highscoreposition);
    
    highscoreposition = calculatehighscoreposition(900);
    displayhighscorePosition("patel", highscoreposition);

    highscoreposition = calculatehighscoreposition(500);
    displayhighscorePosition("nishit", highscoreposition);

    highscoreposition = calculatehighscoreposition(50);
    displayhighscorePosition("jd", highscoreposition);

    highscoreposition = calculatehighscoreposition(1000);
    displayhighscorePosition("neel", highscoreposition);


 
 }   
    
 
   
 public static void displayhighscorePosition(String Playername ,int highscoreposition)
 {
    System.out.println(Playername + " manage to get into the position  " +  highscoreposition +" on the high score table");
 }

 public static int calculatehighscoreposition(int score)
 {
    // if(score >= 1000)
//     {
//         return 1;
//     }
//     else if(score >= 500 && score < 1000)
//     {
//         return 2;
//     }
//     else if (score >= 100 && score < 500)
//     {
//         return 3;
//     }
//     else 
//     {
//         return 4;
//     }
        int position = 4;
    if (score >=1000)
    {
        position = 1;
    }
    else if (score >= 500)
    {
        position = 2;
    }
    else if (score >= 100)
    {
        position = 3;
    }
    return position;
 }
 
}