package lang.enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {
//        printGrade(AuthGrade.GUEST);
//        printGrade(AuthGrade.LOGIN);
//        printGrade(AuthGrade.ADMIN);
        AuthGrade[] grades = AuthGrade.values();
        for (AuthGrade grade : grades) {
            printGrade(grade);
        }
    }
    private static void printGrade(AuthGrade grade) {
        System.out.println("grade = " + grade.name() + ", level = " + grade.getLevel() + ", 설명 = " + grade.getDescription());
    }
}
