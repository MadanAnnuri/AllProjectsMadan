package programs;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class RandomStringNums {
    public static void main(String[] args) {

        //Approach 1 using Random class
        Random ran=new Random();
        /*  int ran_num=ran.nextInt(10000);
        System.out.println(ran_num);*/
       /* double ran_double=ran.nextDouble(); // by default 0.0 to 1.0
        System.out.println(ran_double);

        // using Math
        System.out.println(Math.random());  // math is only for double
*/
        // using appache commons
     String ran_number=   RandomStringUtils.randomNumeric(3);
        System.out.println(ran_number);

        String ran_string =RandomStringUtils.randomAlphabetic(3);
        System.out.println(ran_string);





    }
}
