public class areacalculator 
{
    public static void main(String[] args) {
       area(-2);
       area(2, 2);
        
    }

    public static double area(double radius)
    {
        if (radius < 0) {
            System.out.println("notvalid");
            return -1.0;
            
        }
        else
        {
            double Areaofcircle = radius * radius * Math.PI;
            System.out.println("Areaofcircle = " + Areaofcircle);
            return Areaofcircle;
        }
    }

    public static double area(double x,double y)
    {
        if (x<0 || y<0){
            System.out.println("notvalid");
        return -1.0;
        }
        else
        {
            double Areaofrectangle = x * y;
            System.out.println("Areaofrectangle = " + Areaofrectangle);
            return Areaofrectangle;
        }
    }
    
}