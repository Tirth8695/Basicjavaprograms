public class teen 
{
    public static void main(final String[] args) 
    {
        hasTeen(25,88,23);

    }   
    
        
            public static boolean hasTeen(int a,int b, int c)
    {
       if((a>12&&a<20)||(b>12&&b<20)||(c>12&&c<20)){
           System.out.println("yes it is teen");
            return true;
        }
        else
        {
            System.out.println("No");
            return false;
        }
    }
    public static boolean isTeen(int a)
    {
         if(a>12&&a<20)
         {
             return true;
         }
        else
        {
            return false;
        }
    }
        }
