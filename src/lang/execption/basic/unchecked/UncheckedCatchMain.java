package lang.execption.basic.unchecked;

public class UncheckedCatchMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();
//        service.callThrow();
        System.out.println("정상 종료");
    }
}
