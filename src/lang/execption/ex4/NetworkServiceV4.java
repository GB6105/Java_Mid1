package lang.execption.ex4;

public class NetworkServiceV4 {
    public void sendMessage(String data)  {
        String address =  "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        try {
            client.connect(); // ConnectExceptionV3
            client.send(data);
        }
        finally{
            client.disconnect();
        }
    }
}
