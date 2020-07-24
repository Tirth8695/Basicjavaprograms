package basic;
public class byteshortint {
    public static void main(String[] args) {
    int myMinvalueinteger = Integer.MIN_VALUE;
    int myMaxvalueinteger = Integer.MAX_VALUE;
    System.out.println("Integer Minimumvalue " +myMinvalueinteger);
    System.out.println("Integer Maximumvalue " +myMaxvalueinteger);
    //overflow busted Maxvalue
    System.out.println("Busted Max value " +(myMaxvalueinteger + 1 ));
    //underflow busted Minvalue
    System.out.println("Busted Min value " +(myMinvalueinteger - 1 ));

     byte myMinbytevalue = Byte.MIN_VALUE;
     byte myMaxbytevalue = Byte.MAX_VALUE;
     System.out.println("Byte Min value" +myMinbytevalue);
     System.out.println("Byte Max value" +myMaxbytevalue);
     
     //same for short and long
     //casting
     int mytotal = (myMinvalueinteger / 2);
     System.out.println(mytotal);
     byte mynewbytevalue = (byte) (myMinbytevalue / 2);
     System.out.println(mynewbytevalue);
     
    }
}