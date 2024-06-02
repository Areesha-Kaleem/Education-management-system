package Double_inheritance;

import java.util.ArrayList;

public class Faculty extends Employee{
    static int currentyear = 2023;
    ArrayList<String> subjects = new ArrayList<>();
    static ArrayList<Faculty> faculty = new ArrayList<>();
    public Faculty(){
        this.Name = null;
        this.joiningYear= 0;
        this.employeeID = null;
        this.Year_of_birth= 0;
    }

    public Faculty(String name, int year_of_birth, int joiningYear, String jobTitle) {
        super(name, year_of_birth, joiningYear, jobTitle);
        System.out.println("Teacher enrolled");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public void addfaculty(Faculty f){
        faculty.add(f);
        System.out.println("Faculty list updated.");
    }
    public void setSubjects(String name, String sub){
        for (Faculty ele:faculty) {
            if (ele.Name.equals(name)) {
                ele.subjects.add(sub);
                System.out.println("Subject list updated.");
            }
        }
    }
    public void getSubjects(String name){
        for (Faculty ele:faculty) {
            if (ele.Name.equals(name)) {
                System.out.println("Following are the subjects: ");
                for (String temp : ele.subjects) {
                    System.out.println(temp);
                }
            }
        }
    }
    public void CalcPay(String name){
        for (Faculty ele:faculty) {
            if (ele.Name.equals(name)) {
                int year = currentyear - ele.joiningYear;
                int pay = year * 4000;
                System.out.println("The pay is " + pay);
            }
        }
    }
}
