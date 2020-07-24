public class operatorschallenge {
    public static void main(String [] args) {
        double myfirstvalue = 20.00;
        double mysecondvalue = 80.00;
        double totaloftwonumber = myfirstvalue + mysecondvalue;
        System.out.println(" 20.00 + 80.00 = " +totaloftwonumber);

        totaloftwonumber *=100;
        System.out.println(" 100 * 100 = " +totaloftwonumber);

        totaloftwonumber %=40;
        System.out.println(" 1000 % 40 = " +totaloftwonumber);

        boolean thefinalvalue = (totaloftwonumber == 0) ? true : false;
        if (thefinalvalue)
        System.out.println(" the reminder is 0 ");

  }
}