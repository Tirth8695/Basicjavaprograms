public class MegaBytes 
{
 public static void main(String[] args) 
 {
     printMegaBytesandKilobytes(2500);
 }
 
 public static void printMegaBytesandKilobytes(int Kilobytes) 
 {
  
   if(Kilobytes < 0)
   {
       System.out.println("Invalid Value");
   }
   else
   {
    int MB =  Kilobytes / 1024;
    int remaningkilobytes = Kilobytes % 1024;   
    System.out.println(Kilobytes + "KB" + "=" + MB + "MB" + "and" + remaningkilobytes );
 
   }

 }

}