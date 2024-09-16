import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesinArray {
    public static void main(String[] args) {
    int a[]={1,2,2,2,4,5,3,9,88};
    Set<Integer> set=new HashSet<>();
    for(int array:a)
        set.add(array);
        System.out.println(set);




        /*for(int i=0;i<a.length;i++)
            System.out.println(a[i]);*/
//        for(int array:a)
//            System.out.println(array);
//        Set <Integer> set=new HashSet<>();
        /*set.add(1);
        set.add(2);
        set.add(2);
        set.add(1);
        set.add(21);
        set.add(2);
        System.out.println(set);*/

    }
}
