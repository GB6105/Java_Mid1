package lang.execption.ex3;

import lang.execption.ex3.exception.ConnectExecptionV3;
import lang.execption.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {
    public void sendMessage(String data)  {
        String address =  "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExecptionV3 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지 : " + e.getMessage());
        }catch (SendExceptionV3 e){
            System.out.println("[전송 오류] 전송 데이터: " + e.getMessage() + ", 메시지 : "  + e.getMessage());
        }finally{
            client.disconnect();
        }
    }
}
