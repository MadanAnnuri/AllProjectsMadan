package programs;

public class SwapingNum {
    public static void main(String[] args) {
        int a=10,b=20;

        //Using Temp variable
          //int t=a; a=b; b=t;

        //with out temp variable
         // a=a+b;b=a-b; a=a-b;

        //using XOR Operation
         //a=a^b; b=a^b; a=a^b;

        //Using * and /
         //a=a*b; b=a/b; a=a/b;
        // Using single statement
        b=a+b-(a=b);

        System.out.println("a is = "+ a +" ; b is = "+ b);
    }
}
