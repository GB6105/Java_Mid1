package lang.nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        //먼저 바깥 인스턴스 부터 생성하고
        OuterClass2 obj = new OuterClass2();

        // 받은 참조값으로 내부 인스턴스 생성해야함
        OuterClass2.InnerClass innerClass = obj.new InnerClass();
        innerClass.hello();
    }
}
