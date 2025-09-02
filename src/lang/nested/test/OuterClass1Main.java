package lang.nested.test;

public class OuterClass1Main {
    public static void main(String[] args) {
        //내부 접근으로 직접 호출 할 수 있음
        OuterClass1.NestedClass nc = new OuterClass1.NestedClass();
        nc.hello();
    }
}
