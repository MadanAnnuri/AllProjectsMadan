package programs;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int n1=0,n2=1,sum=0;
        System.out.print(n1 +" "+ n2);
        for(int i=0; i<size-2;i++){
             sum=n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }
    }
}