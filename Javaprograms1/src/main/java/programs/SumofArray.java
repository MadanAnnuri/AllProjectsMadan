package programs;

public class SumofArray {
    public static void main(String[] args) {
        int a[]={1,3,5,8,4};
        int sum=0;
        /*for (int i=0;i<a.length;i++){
            sum=sum+a[i];
        }*/

        // Using for Each loop

        for(int val:a)
            sum=sum+val;
        System.out.println(sum);
    }
}
