package Double_inheritance;

import java.util.ArrayList;

public class Administrator extends Employee{
    static int curentyear = 2023;
    static ArrayList<Administrator> admins = new ArrayList<>();
    public Administrator(){
        this.Name = null;
        this.joiningYear= 0;
        this.jobTitle = null;
        this.employeeID = null;
        this.Year_of_birth = 0;
    }
    public Administrator(String name, int year_of_birth, int joiningYear, String jobTitle) {
        super(name, year_of_birth, joiningYear, jobTitle);
        System.out.println("Admin enrolled");
    }
    public void setjobtittle(String name,String jt){

        for (Administrator ele:admins) {
            if (ele.Name.equals(name)) {
                ele.jobTitle = jt;
                System.out.println("Job tittle added.");
            }
        }
    }
    public String getjobtittle(String name){
        for (Administrator ele:admins) {
            if (ele.Name.equals(name)) {
                return ele.jobTitle;
            }
        }
        return null;
    }
    public void addadmin(Administrator ad){
        admins.add(ad);
        System.out.println("Admins list updated.");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void CalcPay(String name){
        for (Administrator ele:admins) {
            if (ele.Name.equals(name)) {
                int year = curentyear - ele.joiningYear;
                int pay = year * 5000;
                System.out.println("The pay is " + pay);
            }
        }
    }
}
