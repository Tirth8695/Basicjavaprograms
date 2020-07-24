public class decimalcomparator 
{
    public static void main(String[] args) 
    {
     areEqualbyThreeDecimalPlaces(3.125, 3.1894);   
    }
    
    public static boolean areEqualbyThreeDecimalPlaces(double num1,double num2)
    {
        num1 = num1 * 1000;
        num2 = num2 * 1000;
        int c = (int) num1;
        int d = (int) num2;
        if (c == d) 
        {
            System.out.println("the number is same upto three units");
            return true;   
        } 
        else 
        {
            System.out.println("not same");
            return false;   
        }
    }
}