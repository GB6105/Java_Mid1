package lang.nested.test;

public class OuterClass3 {
    public void myMethod(){
        class LocalClass{
            public void hello(){
                System.out.println("LocalClass.hello");
            }
        }
        // 지역 클래스 만들었으니까 생성하고 호출
        LocalClass myClass = new LocalClass();
        myClass.hello();
    }
}
