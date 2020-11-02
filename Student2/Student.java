public class Student {
    private String Sname;
    private String RegNo;
    private String Degree;
    private String DepName;
    private double Cgpa = 0;


    public Student(String Sname, String roll, String deg, String dname, double cgpa) {
        this.Sname = Sname;
        this.RegNo = roll;
        this.Degree = deg;
        this.DepName = dname;
        this.Cgpa = cgpa;
    }
   
    public double getCgpa(){
        return Cgpa;
    }

    public void displayinfo(){
        System.out.println("\n---------Student's Information---------\n");
        System.out.printf("Student's name: %s\nRegistration Number: %s\nDegree Program: %s\n" +
                "Department Name: %s\nCGPA: %.2f",Sname, RegNo, Degree, DepName, Cgpa);
    }

    public Student compare(Student obj) {
        if(this.Cgpa > obj.getCgpa())
            return this;
        else
            return obj;

    }

}
