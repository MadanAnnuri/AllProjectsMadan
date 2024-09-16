package programs;

import java.util.HashSet;

public class DuplicatesinArray {
    public static void main(String[] args) {
       /* String a[] = {"abc", "def", "xyz", "abc"};
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    System.out.println("doplcate found : " + a[i]);
                flag = false;
            }
        }
        if (flag = true)
            System.out.println("no duplicate in array");*/

    String arr[]={"java","c","c++","python","java"};

        HashSet<String> hs=new HashSet();
        boolean flag=true;
        for(String s:arr)
            if(hs.add(s)==false) {
                System.out.println("duplicate found: " + s);
                flag =false;
            }
        if (flag==true){
            System.out.println("no duplicate found");
        }

    }
}


