public class speedconverter
{
    public static void main(String[] args) 
    {
       double miles =ToMilesPerHour(15.2);
       System.out.println("Miles = " + miles); 
      // double kilometers = 10.5;
       printconversion(10.5);
    }
    public static long ToMilesPerHour(double kilometers) 
    {
        
        if(kilometers < 0)
        {
            return -1;
        }
        long milesperhour = Math.round(kilometers/1.609);
        return milesperhour;
        
    }

    public static void printconversion(double kilometers) 
    {
        if (kilometers < 0) 
        {
            System.out.println("Invilid Value");            
        }
        else
        {
            long milesperhour = ToMilesPerHour(kilometers);
            System.out.println(kilometers   +   "   Km/h   "    +    milesperhour    +   "   M/h   " );
        }
        
    }

     
}