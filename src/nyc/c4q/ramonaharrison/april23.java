package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * april23.java
 */

public class april23 {
    public static void main(String[] args) {
        System.out.println(letterGrade(105));
        System.out.println(letterGrade(100));
        System.out.println(letterGrade(98));
        System.out.println(letterGrade(81));
        System.out.println(letterGrade(70));
        System.out.println(letterGrade(69));
        System.out.println(letterGrade(30));
        System.out.println(letterGrade(-2));

    }

    public static String letterGrade(int grade) {
        if (grade > 100 || grade < 0) {
            return "Out of range";
        } else if (grade == 100) {
            return "A+";
        } else if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else if (grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
