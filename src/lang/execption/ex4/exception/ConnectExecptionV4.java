package lang.execption.ex4.exception;

//연결 실패시 발생하는 예외
// 주소 저장
public class ConnectExecptionV4 extends NetworkClientExceptionV4 {
    private final String address;
    public ConnectExecptionV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
