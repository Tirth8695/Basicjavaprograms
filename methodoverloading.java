public class methodoverloading 
{
    public static void main(final String[] args) 
    {
        calcFeetandInchesTocentimeters(157);
        //calcFeetandInchesTocentimeters(5);
        
    }

    public static double calcFeetandInchesTocentimeters(double feet,double inches) 
    {
        if ((feet>0) && (inches>0)&&(inches<12)) 
        {
            //1 ft = 30.48centimeter
            //1 inches = 2.54 centimeter
            double centimeter = (feet * 12) * 2.54;
            centimeter += inches * 2.54;
            System.out.println(feet + "feet," + inches + "inches = " + centimeter + "cm" );
            return centimeter;
            
           
        } 
        else 
        {
            System.out.println("Invilid");
            return -1;
        }
        
        
    }

    public static double calcFeetandInchesTocentimeters(double inches)
    {
        if (inches >= 0) 
        {
            //1 inches = 0.0833feet
            double feet = (int) inches / 12;
            double remaininginches = (int) inches % 12;
            System.out.println(inches + " inches = " + feet + "feet," + remaininginches + "inches");
            return calcFeetandInchesTocentimeters(feet, remaininginches);
        } 
        else 
        {
            System.out.println("Notvalid");
            return -1;
        }
        
    }
}