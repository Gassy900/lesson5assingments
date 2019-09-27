package lesson5;


import lesson5.student;
import java.util.Scanner;


public class StudentInterface {

    public static void main(String[] args) {
        student stu1 = new student();
        student stu2 = new student();
        Scanner scan = new Scanner(System.in);
        
        String name;
        int score;
        
        System.out.print("Enter name for first student (min 1 letter): ");
        name = scan.nextLine();
        stu1.setName(name);
        for (int i = 0; i <= 3; i++) {
            System.out.format("Enter test score %d for %s> ", i, stu1.getName());
            score = scan.nextInt();
            stu1.setScore(i, score);
        }
        scan.nextLine();
        System.out.println("\n--------------------------\n");
        System.out.print("Enter name for second student: ");
        name = scan.nextLine();
        stu2.setName(name);
        for (int i = 0; i <= 3; i++) {
            System.out.format("Enter tests score %d for %s > ",i,stu2.getName());
            score = scan.nextInt();
            stu2.setScore(i, score);
        }
        System.out.println("\n-------------------------\n");
        System.out.println(stu1);
        System.out.println(stu2);
    }
    
}
