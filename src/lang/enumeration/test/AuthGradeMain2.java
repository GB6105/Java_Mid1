package lang.enumeration.test;

import javax.lang.model.SourceVersion;
import java.util.Arrays;
import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AuthGrade[] grades = AuthGrade.values();
        System.out.print("당신의 등급을 입력하세요 " + Arrays.toString(grades) + " : ");
        String inputGrade = scanner.nextLine();
        AuthGrade grade = AuthGrade.valueOf(inputGrade);
        System.out.println("당신의 등급은 " + grade.getDescription() + "입니다.");
        printPage(grade);
    }
    private static void printPage(AuthGrade grade){
        System.out.println("==메뉴 목록==");
        if(grade.getLevel() >0){
            System.out.println("- 메인 화면");
        }
        if(grade.getLevel() >1){
            System.out.println("- 이메일 관리 화면");
        }
        if(grade.getLevel() >2){
            System.out.println("- 관리자 화면");
        }
    }
}
