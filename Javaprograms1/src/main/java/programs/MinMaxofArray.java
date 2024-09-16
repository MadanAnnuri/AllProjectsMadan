package programs;

public class MinMaxofArray {
    public static void main(String[] args) {
        int a[]={10,20,500,40,50,69};
        int max=a[0];
        for(int i=0;i<a.length;i++){
           if(a[i]>max){
               max=a[i];
           }
        }
        System.out.println("max value in array :"+ max);

        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min) {
                min=a[i];
            }
        }
        System.out.println("min val of an aray is :"+ min);


    }
}
