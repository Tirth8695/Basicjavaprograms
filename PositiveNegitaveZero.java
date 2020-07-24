public class PositiveNegitaveZero 
{
  public static void main(String[] args) 
  {
      checknumber(5);
      checknumber(-5);
      checknumber(0);
  }  

  public static void checknumber(int number) 
  {
     if(number > 0)
     {
         System.out.println("positive");
     }
     else if(number < 0)
     {
         System.out.println("negitive");
     }
     else
     {
        System.out.println("ZEro");
     }
  }
}