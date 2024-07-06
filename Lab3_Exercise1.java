import java.util.ArrayList;
import java.util.Scanner;

class Lab3_Exercise1{
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        ArrayList<Student> student = new ArrayList<Student>();

        System.out.print("Enter your name : ");
        String name = kbd.next();
        System.out.print("Enter your id : ");
        int id = kbd.nextInt();
        System.out.print("Enter your score : ");
        int score = kbd.nextInt();

        while(!name.equals("Exit")){
            Student studentX = new Student(name, id, score);
            student.add(studentX);
            System.out.print("Enter your name : ");
            name = kbd.next();
            if(name.equals("Exit")) break;
            System.out.print("Enter your id : ");
            id = kbd.nextInt();
            System.out.print("Enter your score : ");
            score = kbd.nextInt();
        }

        System.out.println("********** Summary **********");
        for(Student studentI : student){
            studentI.displayInfo();
        }

        kbd.close();
    }
}

class Student{
    private String name;
    private int id, score;

    Student(String Name, int Id, int Score){
        this.name = Name;
        this.id = Id;
        this.score = Score;
    }

    private String calGrade(int score){
        if(score >= 85){
            return "A";
        } else if (score >= 75){
            return "B";
        } else if (score >= 65){
            return "C";
        } else if (score >= 45){
            return "D";
        } else {
            return "F";
        }
    }

    public void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Grade : " + calGrade(score));
    }
}