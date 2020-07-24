public class leapyear {
    public static void main(final String[] args) 
    {
           isLeapyear(1700);
           
    }

    public static boolean isLeapyear(final int year) 
    {
        if (year >= 1 && year <= 9999)
        {
            if (year % 4 == 0) 
            {
                if (year % 100 == 0) 
                {
                    if (year % 400 == 0)
                    {
                        
                        System.out.println("this is leap year");
                        return true;
                    }
                        else
                        {
                            System.out.println("no");
                            return false;
                        }
                             
                }
                
            }
        }
        return false;
        
                
    }    
}
        

        
        
    
    
