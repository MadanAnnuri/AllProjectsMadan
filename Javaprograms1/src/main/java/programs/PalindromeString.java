package programs;

public class PalindromeString {
    public static void main(String[] args) {
        String str="aba";
        String org_str=str;

        String rev="";
        char a[]=str.toCharArray();
        int len=a.length;
        for(int i=len-1;i>=0;i--){
            rev=rev+a[i];
        }

        if(rev.equals(org_str))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");




   /*     StringBuffer sb=new StringBuffer(str);
        StringBuffer rev= sb.reverse();
        if (rev.toString().equals(org_str))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");*/
    }
}
