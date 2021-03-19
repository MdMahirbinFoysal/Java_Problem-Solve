import java.util.Scanner;

class student{
    public void name_of_student(String name){

        System.out.println("Student name is:"+name);
    }
    public void grade(double point){
        System.out.println("Your grade point is:"+point);
    }
    public void university_name(String uap){
        System.out.println("Student University name is:"+uap);
    }
}
public class InstanceMethod {
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Student name:");
        String name1=scan.nextLine();
        System.out.println("Enter Student name:");
        String name2=scan.nextLine();
        System.out.println("Enter Student name:");
        String name3=scan.nextLine();
        System.out.println("Enter Student name:");
        String name4=scan.nextLine();
        System.out.println("Enter Student name:");
        String name5=scan.nextLine();
        System.out.println("Enter Student cgpa:");
        double P1=scan.nextDouble();
        System.out.println("Enter Student cgpa:");
        double P2=scan.nextDouble();
        System.out.println("Enter Student cgpa:");
        double P3=scan.nextDouble();
        System.out.println("Enter Student cgpa:");
        double P4=scan.nextDouble();
        System.out.println("Enter Student cgpa:");
        double P5=scan.nextDouble();
        student student1=new student();
        student1.name_of_student(name1);
        student1.grade(P1);
        student1.university_name("The University of Asia Pacipic ");
        student student2=new student();
        student2.name_of_student(name2);
        student2.grade(P2);
        student2.university_name("The University of Asia Pacipic ");
        student student3=new student();
        student3.name_of_student(name3);
        student3.grade(P3);
        student3.university_name("The University of Asia Pacipic ");
        student student4=new student();
        student4.name_of_student(name4);
        student4.grade(P4);
        student4.university_name("The University of Asia Pacipic ");
        student student5=new student();
        student5.name_of_student(name5);
        student5.grade(P5);
        student5.university_name("The University of Asia Pacipic ");

    }
}
