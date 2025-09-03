package lang.execption.ex3.exception;

//연결 실패시 발생하는 예외
// 주소 저장
public class ConnectExecptionV3 extends NetworkClientExceptionV3 {
    private final String address;
    public ConnectExecptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
