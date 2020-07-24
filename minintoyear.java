public class minintoyear {
    public static void main(String[] args) {
        printYearsandDays(1051200);
        
    }
    public static void printYearsandDays(long Minutes){
        if (Minutes < 0) {
            System.out.println("Invilid"); 
            
        } else {
            long Year = Minutes / 525600;
            long remainingyear = Minutes % 525600;
            long Days = remainingyear / 1440;
            System.out.println(Year + " Y " + Days + " D "); 
            
        }
    }
    
}