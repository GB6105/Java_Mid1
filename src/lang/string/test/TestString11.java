package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";
        String result = new StringBuilder(str).reverse().toString();
        System.out.println("result = " + result);
//        StringBuilder stringbuilder = new StringBuilder("Hello Java");
//        stringbuilder.reverse();
//        System.out.println(stringbuilder.toString());
    }
}
