package programs;

public class EvenOddNumofArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int even[];
        int odd[];
        System.out.println("even numbers in an array");
        for (int v : a) {
            if (v%2==0)
                System.out.println(v);
        }
        System.out.println("odd numbers in an array");
        for (int v : a) {
            if (v%2!=0)
                System.out.println(v);
        }

    }
}
