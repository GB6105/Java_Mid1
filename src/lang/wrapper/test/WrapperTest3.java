package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer boxedString = Integer.valueOf(str);
        int unboxedString = boxedString.intValue();
        Integer boxedInteger = Integer.valueOf(unboxedString);

        System.out.println("boxedString = " + boxedString);
        System.out.println("unboxedString = " + unboxedString);
        System.out.println("boxedInteger = " + boxedInteger);

    }
}
