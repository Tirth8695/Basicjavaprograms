

public class dogbarking 
{
   public static void main(final String[] args) 
   {
        shouldwakeup(true,2);
        
   }

  public static boolean shouldwakeup(final boolean barking,final int hourOfDay) 
   {
   
        if(hourOfDay < 0 || hourOfDay > 23)
        {
            return false;
        }
        else if( (hourOfDay < 8 || hourOfDay > 22) && (barking))
        {
            return true;
        }
        else if (hourOfDay >= 8 && hourOfDay <= 22)
        {
            return false;
        }
        else
            return false;
 
    }
       
       

  }

