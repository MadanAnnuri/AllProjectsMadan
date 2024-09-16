package programs;

public class RevofNum {
    public static void main(String[] args) {
        //Using Alogorithm
        int num=1234;
        int rev=0;
        while (num>0){
            rev=rev*10+((num%10)*10);
            num=num/10;
        }
        System.out.println(rev);

        // uisng string buffer

       /* StringBuffer sb = new StringBuffer(String.valueOf(num));
        System.out.println(sb.reverse());
*/


    }

}
