package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int index = str.indexOf(ext);
        String subStr1 = str.substring(0, index);
        String subStr2 = str.substring(index, 9);
        System.out.println("filename " + subStr1);
        System.out.println("extname " + subStr2);
    }
}
