package Double_inheritance;

public class Person {
    String Name;
    int Year_of_birth;
    public Person(){
        this.Name = null;
        this.Year_of_birth = 0;
    }

    public Person(String name, int year_of_birth) {
        this.Name = name;
        this.Year_of_birth = year_of_birth;
    }

    @Override
    public String toString() {
        return "Name= " + Name +
                "\nYear_of_birth= " + Year_of_birth;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getYear_of_birth() {
        return Year_of_birth;
    }

    public void setYear_of_birth(int year_of_birth) {
        Year_of_birth = year_of_birth;
    }
}
