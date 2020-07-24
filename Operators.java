public class Operators {
    public static void main(String [] args) {
        int result = 1 + 2; //1+2=3
        System.out.println(" 1 + 2 = " + result);
        int Previousresult = result;
        System.out.println(" Previuosresult " + Previousresult);
        result = result - 1;// 3-1=2
        System.out.println(" 3-1 = " +result);

        result = result * 10;
        System.out.println(" 2 * 10 =  " + result);

        result = result / 5;
        System.out.println(" 20 / 5 = " + result);

        result = result % 3;
        System.out.println(" 4 % 3 = " + result);

        result++; //1 + 1 = 2
        System.out.println(" 1 + 1 = " + result);

        result--; //2 - 1 = 1
        System.out.println(" 2 - 1 = " + result);

        result += 2; //1 + 2 = 3
        System.out.println(" 1 + 2 = " + result);

        result *= 10; //3*10=30
        System.out.println(" 3 * 10 " + result);

        result /= 3 ; // 30 / 10 = 3
        System.out.println(" 30 / 10 = " + result);
        
        result -= 2 ; // 10 - 2 = 8
        System.out.println(" 10 - 2 =" + result);

        boolean isAlien = false;
        if (isAlien == false) {

        System.out.println(" is it  a Alien ! ");
        System.out.println(" and i m scared ");

        } 

        int topscore = 80 ; //topscore != 80 than it will not be printed.
        if (topscore < 100) {
            System.out.println(" YOU MADE CENTURY !");
        }
        int secondtopscore = 60 ;
        if (topscore > secondtopscore && topscore < 100) {
            System.out.println(" Greater than Second topscore and less than 100 ");
        }

        if ((topscore > 90 ) || (secondtopscore <= 90) ) {
            System.out.println(" Either or both of the condition are true");
        }

        boolean iscar = false;
        if (iscar) {
            System.out.println("This is supposed to happen");
        }

        iscar = true;
        boolean wascar = iscar  ? true : false;
        if (wascar) {
            System.out.println(" wascar is true ");
        }
         int ageofclient = 20;
         boolean iseighteenorover = (ageofclient == 20) ? true : false;
         if (iseighteenorover)
         System.out.println(" Client is adult ");
    




      



        
    }
    
}