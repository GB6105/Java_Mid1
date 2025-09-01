package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lotto = new int[6];

        for (int i = 0; i < 6; i++) {
            lotto[i] = random.nextInt(1,45);
        }
        System.out.print("로또 번호:");
        for(int l : lotto){
            System.out.print(" " + l);
        }


    }
}
