public class Date {

    public int year;
    private String month;
    public int day;

    //No Argument Constructor
    public Date(){
        day = 2;
        month = "October";
        year = 2013;
    }

    //1 Parameterized Constructor
    public Date(int day, String month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void display(){
        System.out.println(day + "/" + month + "/" + year);
    }

    public void setMonth(String month){
        this.month = month;
    }

    public String getMonth(){
        return month;
    }
}
