package lesson5;


public class studenttestser {

    public static void main(String[] args) {
        student s = new student();
        student s2 = new student("Mitchell", 21, 45,1);
        s.setName("Bob smith");
        System.out.println("Student name is " + s.getName());
        s.setScore(1, 76);
        s.setScore(2, 85);
        s.setScore(3, 99);
        System.out.println("Here are " + s.getName() + "'s scores");
        for (int i = 0; i < 3; i++) {
            System.out.println(s.getScore(i + 1));
        }

        System.out.format("Top score for %s is %d\n", s.getName(), s.getHighScore());
        System.out.format("The aver for %s is %d\n", s.getName(), s.getAverage());
        
        System.out.println(s);
        System.out.println(s2);
        
        student s3 = new student(s);
        System.out.println(s3);
        
        //4th student??
        
        student s4 = s;
    }

}
