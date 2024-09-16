package programs;

public class RevNum {
    public static void main(String[] args) {
        int num=1234;
        //Using Algorithem
    /*  int rev=0;
      while(num!=0){
          rev=rev*10+num%10;
          num=num/10;
      }*/

        //Using string buffer class
    /*StringBuffer sb=new StringBuffer(String.valueOf(num));
    StringBuffer rev=sb.reverse();*/

        //Using String Builder

        StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        StringBuilder rev=sbl.reverse();

        System.out.println("rev of Num =" +rev);
    }


}
