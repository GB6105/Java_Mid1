package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) throws Exception {
        String str = "100";
        // String -> Integer 형변환은 valueOf 메서드를 사용해야함
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        int intValue = integer1;
        System.out.println("intValue = " + intValue);
        Integer integer3 = intValue;
        System.out.println("integer3 = " + integer3);


    }
}
