package Double_inheritance;

public abstract class Employee extends Person{
    static int idno = 0;
    String employeeID;
    int joiningYear;
    String jobTitle;
    public Employee(){
        this.jobTitle = null;
        this.joiningYear = 0;
    }

    public Employee(String name, int year_of_birth,int joiningYear, String jobTitle) {
        super(name, year_of_birth);
        this.employeeID = "emp"+idno;
        this.joiningYear = joiningYear;
        this.jobTitle = jobTitle;
        System.out.println("Employee id = "+this.employeeID);
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nEmployee ID= " + employeeID +
                "\nJoining Year= " + joiningYear +
                "\nJob Title='" + jobTitle;
    }
    public abstract void CalcPay(String name);
}
