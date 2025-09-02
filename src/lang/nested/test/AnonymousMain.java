package lang.nested.test;

class AnonymousMain {

    public static void main(String[] args) {
        // 바로 구현하고 만들어졌으니까 실행하기
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };
        hello.hello();
    }
}
