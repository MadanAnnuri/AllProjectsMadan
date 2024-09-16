package programs;



import java.util.Scanner;

public class LargestofThreeNums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int a= sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       //Using condition
       //int a=100,b=200,c=300;
     /*  if(a>b && a>c){
           System.out.println(a +" is a big num");
       } else if (b>a && b>c) {
           System.out.println(b+" is a big num");
       }
       else
           System.out.println(c +" is a big num");*/
       //using ternary operator

       /* int largest=a>b?a:b;
        largest=largest>c?largest:c;
*/
        int large=(a>b?a:b)>c?(a>b?a:b):c;
        System.out.println(large + "is a large num");

    }
}
