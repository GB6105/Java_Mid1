package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {

        String email = "hello@example.com";

        //split 메서도는 배열을 반환
        String[] parts = email.split("@");
        String id = parts[0];
        String domain = parts[1];
        System.out.println("id = " + id);
        System.out.println("domain = " + domain);

//
//        String id = email.split("@")[0];
//        String domain = email.split("@")[1];
//        System.out.println("ID :" + id);
//        System.out.println("Domain :" + domain);
    }
}
