package lang.execption.ex3;

import lang.execption.ex3.exception.ConnectExecptionV3;
import lang.execption.ex3.exception.NetworkClientExceptionV3;
import lang.execption.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {
    public void sendMessage(String data)  {
        String address =  "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect(); // ConnectExceptionV3
            client.send(data);
        } catch (ConnectExecptionV3 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지 : " + e.getMessage());
        }catch (NetworkClientExceptionV3 e){
            System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
        }catch (Exception e){
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        }
        finally{
            client.disconnect();
        }
    }
}
