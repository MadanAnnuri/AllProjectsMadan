package programs;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        int num=123;
        int evencount=0,oddcount=0;
        while (num>0){
            int dig=num%10;
            if(dig%2==0)
                evencount++;
            else
                oddcount++;
            num=num/10;
        }
        System.out.println("even digits: "+evencount +" odd digits :"+oddcount);
    }
}