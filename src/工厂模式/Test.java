package 工厂模式;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i <10 ; i++) {
            int rand = random.nextInt(4);
            System.out.println(rand);
        }

    }
}
