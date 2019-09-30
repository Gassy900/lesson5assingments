package lesson5;

import lesson5.student;
import java.util.Scanner;

public class StudentInterface {

    public static void main(String[] args) {
        student stu1 = new student();
        student stu2 = new student();
        Scanner scan = new Scanner(System.in);

        String name;
        int score, highscore, average;
        String scorename, averagename;

        while (true) {
            System.out.print("Enter name for first student (min 1 letter): ");
            name = scan.nextLine();
            stu1.setName(name);
            for (int i = 0; i <= 3; i++) {
                System.out.format("Enter test score %d for %s> ", (i + 1), stu1.getName());
                score = scan.nextInt();
                stu1.setScore(i, score);
            }
            String errormsg = stu1.validateData();
            if (errormsg == null) {
                break;
            } else {
                System.out.println(errormsg);
                scan.nextLine();
            }
        }

        scan.nextLine();
        System.out.println("\n--------------------------\n");
        while (true) {
            System.out.print("Enter name for second student: ");
            name = scan.nextLine();
            stu2.setName(name);
            for (int i = 0; i <= 3; i++) {
                System.out.format("Enter tests score %d for %s > ", (i + 1), stu2.getName());
                score = scan.nextInt();
                stu2.setScore(i, score);
            }
            String errormsg2 = stu2.validateData();
            if (errormsg2 == null) {
                break;
            } else {
                System.out.println(errormsg2);
                scan.nextLine();
            }
        }
        System.out.println("\n-------------------------\n");
        System.out.println(stu1);
        System.out.println(stu2);

        if (stu1.getHighScore() > stu2.getHighScore()) {
            scorename = stu1.getName();
            highscore = stu1.getHighScore();
        } else {
            scorename = stu2.getName();
            highscore = stu2.getHighScore();
        }
        if (stu1.getAverage() > stu2.getAverage()) {
            averagename = stu1.getName();
            average = stu1.getAverage();
        } else {
            averagename = stu2.getName();
            average = stu2.getAverage();
        }
        System.out.println("\n-----------------------\n");
        System.out.println(scorename + " has the highest score with a score of " + highscore);
        System.out.println(averagename + " has the highest average with a average of " + average);
    }

}
