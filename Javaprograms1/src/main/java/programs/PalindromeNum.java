package programs;

public class PalindromeNum {
    public static void main(String[] args) {
        int num=1211;
        int rev=0;
        int org_num=num;
        while (num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }

        if(rev==org_num){
            System.out.println("given num is palindrome: "+org_num);
        }
        else {
            System.out.println("not palindrome : "+ org_num);
        }
    }
}
