package lang.enumeration.http;

public enum HttpStatus {
    OK(200, "OK"), BAD_REQUEST(400, "Bad Request"), NOT_FOUND(404,"Not Found"), INTERNAL_SERVER_ERROR(500,"Internal Server Error");
    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(int code){
        // 해당 메서드에서 values만 불러도 됨
        HttpStatus[] httpStatuses = HttpStatus.values();
        for(HttpStatus httpStatus : httpStatuses){
            if(httpStatus.code == code){
                return httpStatus;
            }

        }
        return null;
    }

    public boolean isSuccess(){
        return (code >= 200 && code < 300);
    }
}
