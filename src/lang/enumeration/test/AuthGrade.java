package lang.enumeration.test;

public enum AuthGrade {
    GUEST(1,"손님"), LOGIN(2, "로그인 회원"), ADMIN(3,"관리자"), VIP(4, "우대 고객");

    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public void getInfo(AuthGrade grade){
        System.out.println("레벨: " + grade.level + ", 설명: " + grade.description);
    }
}
