package programs;

public class RevString {
    public static void main(String[] args) {
        //Using concatination
  /*      String str="abcd";
        String  rev="";
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);*/

        //using char Array

       /* String str="abcd";
        String rev="";
        char a[]=str.toCharArray();
        int len=a.length;

        for(int i=len-1; i>=0;i--){
            rev=rev+a[i];
        }

        System.out.println(rev);*/

        //Using String Buffer Class
        String str="abcdefg";
        StringBuffer sb= new StringBuffer(str);
        System.out.println(sb.reverse());

    }
}
