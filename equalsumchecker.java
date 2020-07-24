public class equalsumchecker 
{
    public static void main(String[] args) 
    {
      hasequalsum(2, 2, 5);   
    }   
    public static boolean hasequalsum(int num1,int num2,int num3) 
    {
     if (num1 + num2 == num3) 
     {
         System.out.println("yes");
        return true;    
     } 
     else 
     {
        System.out.println("no");
         return false;
     }   
    }
}