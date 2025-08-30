package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String subStr1 = str.substring(0,5);
        String subStr2 = str.substring(5);
        System.out.println("filename " + subStr1);
        System.out.println("extname " + subStr2);
    }
}
