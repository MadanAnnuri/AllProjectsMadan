package programs;

public class FactorialofNum {
    public static void main(String[] args) {
        int num=1;
        int fact=1;
        for (int i =1;i<=num;i++) {
            fact = fact * i;
        }

        System.out.println(fact);
    }
}
