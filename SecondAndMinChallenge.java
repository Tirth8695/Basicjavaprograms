public class SecondAndMinChallenge 
{
    public static void main(String[] args) 
    {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945L));

        
    }

    public static String getDurationString(long minute, long second) 
    {
        if ((minute > 0) && (second > 0) && (second < 59)) 
        {
            long hour = minute / 60;
            long remainingMinutes = minute % 60;

            String hoursString = hour + "h";
            if (hour < 10) 
            {
             hoursString = "0" + hoursString;  
            }

            String minutesString = remainingMinutes + "M";
            if (remainingMinutes < 10) 
            {
             minutesString = "0" + minutesString;  
            }

            String secondsString = second + "h";
            if (hour < 10) 
            {
             secondsString = "0" + secondsString;  
            }

            return hoursString  + " " + minutesString + " "  +   secondsString + " " ;
           
        
        } 
        else 
        {
            return "invild value";
        }
    }

    public static String getDurationString(long second)
    {
        if (second > 0) 
        {
            long minute = second / 60;
            long remainingSeconds = second % 60;

            return getDurationString(minute, remainingSeconds);   
        } 
        else 
        {
            return "invalid value";
        }
    }

    
}