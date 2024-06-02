package Double_inheritance;

import java.util.ArrayList;

public class Student extends Person{
    static int id= 0;
    String studentID;
    int enrolledSemester;
    static ArrayList<Student> students = new ArrayList<>();

    public Student(String name, int year_of_birth, int enrolledSemester) {
        super(name, year_of_birth);
        this.studentID = "Stu"+id;
        id++;
        this.enrolledSemester = enrolledSemester;
        System.out.println("Student id = "+ this.studentID);
        System.out.println("Student enrolled");
    }
    public void addstudent(Student s){
        students.add(s);
        System.out.println("Students list updated.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nStudent ID= " + studentID +
                "\nEnrolled Semester= " + enrolledSemester ;
    }
    public void display(String id){
        for (Student ele:students) {
            if(ele.studentID.equals(id)){
                System.out.println("Name= "+ele.Name+"\nYear of birth= "+ele.Year_of_birth+"\nStudent ID= "+
                        ele.studentID+"\nEnrolled Semester= "+ele.enrolledSemester);
            }
        }
    }
}
