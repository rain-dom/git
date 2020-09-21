package 工厂模式;

import java.util.Random;

public class Test {
    private int id;
    private String title;
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i <10 ; i++) {
            int rand = random.nextInt(4);
            System.out.println(rand);
        }

    }
}
