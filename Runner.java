package Double_inheritance;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Administrator admin = new Administrator();
        Faculty faculty = new Faculty();
        Student stu1 = new Student("Areesha", 2005, 3);
        stu1.addstudent(stu1);
        Student stu2 = new Student("Bahauddin", 2003, 3);
        stu2.addstudent(stu2);
        while (true) {
            System.out.println("""
                    Open:
                    a) Student
                    b) Admin
                    c) Teacher
                    d) Exit""");
            String choice = sc.nextLine();
            switch (choice) {
                case "a":
                    System.out.println("""
                            1) Register student
                            2) Display student""");
                    int op1 = sc.nextInt();
                    switch (op1) {
                        case 1:
                            System.out.print("Enter the name: ");
                            sc.nextLine(); // Consume the newline character
                            String n = sc.nextLine();
                            System.out.print("Enter the birth year: ");
                            int by = sc.nextInt();
                            sc.nextLine(); // Consume the newline character
                            System.out.println();
                            System.out.print("Enter the enrolled semester: ");
                            int es = sc.nextInt();
                            sc.nextLine(); // Consume the newline character
                            Student stu3 = new Student(n, by, es);
                            stu3.addstudent(stu3);
                            break;
                        case 2:
                            System.out.print("Enter the Student id: ");
                            sc.nextLine(); // Consume the newline character
                            String id = sc.nextLine();
                            stu1.display(id);
                            break;
                        default:
                            System.out.println("Invalid option choosen.");
                            break;
                    }
                    break;
                case "b":
                    System.out.println("""
                            1) Register Admin
                            2) Set job tittle
                            3) Get job tittle
                            4) Get Pay""");
                    int op2 = sc.nextInt();
                    switch (op2) {
                        case 1:
                            System.out.print("Enter the name: ");
                            sc.nextLine(); // Consume the newline character
                            String name = sc.nextLine();
                            System.out.print("Enter the birth year: ");
                            int bir = sc.nextInt();
                            sc.nextLine(); // Consume the newline character
                            System.out.print("Enter the year of joining: ");
                            int jy = sc.nextInt();
                            sc.nextLine(); // Consume the newline character
                            System.out.print("Enter the job title: ");
                            String jt = sc.nextLine();
                            Administrator admin1 = new Administrator(name, bir, jy, jt);
                            admin1.addadmin(admin1);
                            break;
                        case 2:
                            System.out.print("Enter the name: ");
                            sc.nextLine(); // Consume the newline character
                            String name1 = sc.nextLine();
                            System.out.print("Enter the job title: ");
                            String jobTitle = sc.nextLine();
                            admin.setjobtittle(name1, jobTitle);
                            break;
                        case 3:
                            System.out.print("Enter the name: ");
                            sc.nextLine();
                            String name2 = sc.nextLine();
                            System.out.println("Job tittle = " + admin.getjobtittle(name2));
                            break;
                        case 4:
                            System.out.print("Enter the name: ");
                            sc.nextLine();
                            String name3 = sc.nextLine();
                            admin.CalcPay(name3);
                            break;
                        default:
                            System.out.println("Invalid option choosen.");
                            break;
                    }
                    break;
                case "c":
                    System.out.println("""
                            1) Register Teacher
                            2) Set subjects
                            3) Get subjects
                            4) Get Pay""");
                    int op3 = sc.nextInt();
                    switch (op3) {
                        case 1:
                            System.out.print("Enter the name: ");
                            sc.nextLine(); // Consume the newline character
                            String namee = sc.nextLine();
                            System.out.print("Enter the birth year: ");
                            int birr = sc.nextInt();
                            sc.nextLine(); // Consume the newline character
                            System.out.print("Enter the year of joining: ");
                            int jyy = sc.nextInt();
                            sc.nextLine(); // Consume the newline character
                            System.out.print("Enter the job title: ");
                            String jtt = sc.nextLine();
                            Faculty fac1 = new Faculty(namee, birr, jyy, jtt);
                            fac1.addfaculty(fac1);
                            break;
                        case 2:
                            System.out.print("Enter the name: ");
                            sc.nextLine(); // Consume the newline character
                            String namee1 = sc.nextLine();
                            System.out.print("Enter the subject: ");
                            String sub = sc.nextLine();
                            faculty.setSubjects(namee1, sub);
                            break;
                        case 3:
                            System.out.print("Enter the name: ");
                            sc.nextLine();
                            String namee2 = sc.nextLine();
                            faculty.getSubjects(namee2);
                            break;
                        case 4:
                            System.out.print("Enter the name: ");
                            sc.nextLine();
                            String namee3 = sc.nextLine();
                            faculty.CalcPay(namee3);
                            break;
                        default:
                            System.out.println("Invalid option choosen");
                            break;
                    }
                    break;
                case "d":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option choosen");
                    break;
            }
        }
    }
}

