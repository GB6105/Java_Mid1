package lang.string.test;

import javax.sound.midi.Soundbank;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] fruitsArray = fruits.split(",");
        for(String fruit : fruitsArray){
            System.out.println("fruit = " + fruit);
        }
//        String joinedString = "".join("->", fruitsArray);
        String joinedString = String.join("->", fruitsArray);
        System.out.println("joinedString = " + joinedString);
    }
}
